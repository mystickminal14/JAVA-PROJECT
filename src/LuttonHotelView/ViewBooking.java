package LuttonHotelView;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import HotelLutonModel.ForeignkeyTester;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ViewBooking implements ActionListener, Runnable {
	// ------------------------------------
	private JFrame viewWindow;
	private JPanel viewTitlePanel;
	private JPanel leftPanelview;
	private JPanel rightPanelView;
	private JButton edit;
	private JButton cancel;
	private JButton exit;
	private JTable bookingTable;
	private JTable servicesTablel;
	JDateChooser checkOutDate;
	private JButton edit2;
	private JButton cancel3;
	JTextField bidid;
	Thread thread = null;
	int hours = 0, minutes = 0, seconds = 0;
	String timeString = "";
	JComboBox roomCategories;
	JButton digitalClock2;
	// JComboBox roomPrice;
	JTextField roomPrice;
	JDateChooser checkInDate;
	String[] customerViewColumn = { "BookingID", "RoomType", "Arrival Date", "Departure Date","RoomPrice","status",
			};
	DefaultTableModel viewModel;
	JScrollPane viewScroll;

	// ---------------------------------------------------------------------------
	ViewBooking() {
		viewWindow = new JFrame();
		thread = new Thread(this);
		thread.start();
		Border clockBorder = BorderFactory.createLineBorder(Color.white, 3);
		digitalClock2 = new JButton();
		digitalClock2.setFont(new Font("times new roman", Font.BOLD, 18));
		digitalClock2.setFocusPainted(false);
		digitalClock2.setBorder(clockBorder);
		digitalClock2.setBackground(Color.darkGray);
		digitalClock2.setForeground(Color.white);
		digitalClock2.setBounds(15, 40, 80, 30);
		viewWindow.add(digitalClock2);
		// viewWindow.getContentPane().setBackground(Color.decode("#6B5454"));

		// viewWindow.getContentPane().setBackground(Color.decode("#FF5757"));
		viewWindow.getContentPane().setBackground(Color.lightGray);
		// ----------------------------------------------------------------------
		viewTitlePanel = new JPanel();
		JLabel viewLabel = new JLabel("MY BOOKINGS ");
		viewLabel.setFont(new Font("Times new roman", Font.BOLD, 60));
		viewLabel.setForeground(Color.white);
		viewTitlePanel.add(viewLabel);
		viewTitlePanel.setBackground(Color.DARK_GRAY);
		viewTitlePanel.setBounds(0, 0, 1200, 80);
		viewWindow.add(viewTitlePanel);
		Border guiborder = BorderFactory.createLineBorder(Color.white, 3);
		// ----------------------------------------------------------------------
		leftPanelview = new JPanel();

		Border borderDate = BorderFactory.createLineBorder(Color.BLACK, 4);

		// ----------------------------------------------------------------------
		JLabel arrivalDate = new JLabel("Check-In-DATE:");
		arrivalDate.setForeground(Color.white);
		arrivalDate.setBounds(20, 10, 150, 40);
		arrivalDate.setFont(new Font("Times new roman", Font.BOLD, 17));
		leftPanelview.add(arrivalDate);
		// ----------------------------------------------------------------------
		checkInDate = new JDateChooser();
		checkInDate.setBounds(165, 10, 180, 40);
		checkInDate.setBackground(Color.gray);
		checkInDate.setForeground(Color.white);
		checkInDate.setBorder(borderDate);
		leftPanelview.add(checkInDate);
		// ----------------------------------------------------------------------
		// ----------------------------------------------------------------------
		JLabel DepartureDate = new JLabel("Check-Out-DATE:");
		DepartureDate.setForeground(Color.white);
		DepartureDate.setBounds(20, 70, 150, 40);
		DepartureDate.setFont(new Font("Times new roman", Font.BOLD, 17));
		leftPanelview.add(DepartureDate);
		// ----------------------------------------------------------------------
		checkOutDate = new JDateChooser();
		checkOutDate.setBounds(165, 70, 180, 40);
		checkOutDate.setBackground(Color.gray);
		checkOutDate.setForeground(Color.white);
		checkOutDate.setBorder(borderDate);
		leftPanelview.add(checkOutDate);

		Border overcombo = BorderFactory.createLineBorder(Color.BLACK, 4);
		String[] selectAroom = { "Single Room", "Double Room", "Twin Room" };
		roomCategories = new JComboBox(selectAroom);
		roomCategories.setBounds(460, 10, 220, 40);
		roomCategories.setBackground(Color.gray);
		roomCategories.setBorder(overcombo);
		roomCategories.setForeground(Color.black);
		roomCategories.setEditable(true);
		roomCategories.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					String combox = (String) roomCategories.getSelectedItem();
					if (combox.equals("Single Room")) {
						roomPrice.setText("3500");
					} else if (combox.equals("Double Room")) {
						roomPrice.setText("5500");
					} else if (combox.equals("Twin Room")) {
						roomPrice.setText("8500");
					}
				}
			}
		});
		leftPanelview.add(roomCategories);

		roomPrice = new JTextField("3500");
		roomPrice.setBounds(460, 70, 150, 40);
		roomPrice.setBackground(Color.WHITE);
		roomPrice.setFont(new Font("times new roman", Font.BOLD, 16));

		roomPrice.setDisabledTextColor(Color.black);
		roomPrice.setBorder(overcombo);
		roomPrice.setEnabled(false);
		leftPanelview.add(roomPrice);

		// ----------------------------------------------------------------------
		Border buttonbord = BorderFactory.createLineBorder(Color.white, 3);
		edit = new JButton("EDIT");
		edit.setBounds(120, 130, 120, 30);
		edit.setBackground(Color.gray);
		edit.setBorder(buttonbord);
		edit.addActionListener(this);
		edit.setFont(new Font("times new roman", Font.BOLD, 18));
		edit.setForeground(Color.white);
		leftPanelview.add(edit);
		// ----------------------------------------------------------------------
		// ----------------------------------------------------------------------

		cancel = new JButton("CANCEL");
		cancel.setBounds(300, 130, 120, 30);
		cancel.setBackground(Color.gray);
		cancel.setFocusPainted(false);
		cancel.addActionListener(this);
		cancel.setBorder(buttonbord);
		cancel.setFont(new Font("times new roman", Font.BOLD, 18));
		cancel.setForeground(Color.white);
		leftPanelview.add(cancel);
		// ----------------------------------------------------------------------
//----------------------------------------------------------------------
		exit = new JButton("EXIT");
		exit.setBounds(460, 130, 110, 30);
		exit.setBackground(Color.gray);
		exit.setFocusPainted(false);
		exit.setBorder(buttonbord);
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				CustomerDashboard bbbb= new CustomerDashboard();
				viewWindow.dispose();
			}
			
		});
		exit.setFont(new Font("times new roman", Font.BOLD, 18));
		exit.setForeground(Color.white);
		leftPanelview.add(exit);
		// ---------------------------------------------------------------------
		bidid= new JTextField();
		bidid.setBounds(0,50,150,40);
		viewWindow.add(bidid);
		bidid.setVisible(false);
		
		/////---------------------------------------------------------
		Border tableBorder = BorderFactory.createLineBorder(Color.black, 2);
		// ---------------------------------------------------------------------------------------------------------

		viewModel = new DefaultTableModel();
		viewModel.setColumnIdentifiers(customerViewColumn);
		bookingTable = new JTable(viewModel);
		bookingTable.setSelectionBackground(Color.darkGray);
		bookingTable.setSelectionForeground(Color.LIGHT_GRAY);
		bookingTable.addMouseListener( new MouseAdapter() {
		        public void mouseClicked(MouseEvent arg0) {
		        int index = bookingTable.getSelectedRow();
		        
		        bidid.setText(bookingTable.getValueAt(index,0).toString());
		        roomCategories.setSelectedItem(bookingTable.getValueAt(index,1).toString());
		        ((JTextField)checkInDate.getDateEditor().getUiComponent()).setText(bookingTable.getValueAt(index,2).toString());
		        ((JTextField)checkOutDate.getDateEditor().getUiComponent()).setText(bookingTable.getValueAt(index,3).toString());
		       
		        roomPrice.setText(bookingTable.getValueAt(index,4).toString());



		        }});
		
		viewScroll = new JScrollPane(bookingTable);
		// -----------------------------------------------------------------------------------------------------------
		bookingTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		bookingTable.setFillsViewportHeight(true);
		viewScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		viewScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		viewScroll.setBounds(25, 175, 650, 400);
		bookingTable.setBorder(tableBorder);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/onlinehotelbookingsystem", "root",
					"");
			String sql = "SELECT booking_id,room_type,check_inDate,checkOutDate,roomTotalCost,bookingStatus FROM bookingtable WHERE userid=?";
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, ForeignkeyTester.userid);
			ResultSet rs = pstat.executeQuery();
			while (rs.next()) {
				
				int bid = rs.getInt("booking_id");
				String roomCate = rs.getString("room_type");
				String checkin = rs.getString("check_inDate");
				String checkOut = rs.getString("checkOutDate");
			
				int price = rs.getInt("roomTotalCost");
				String stas= rs.getString("bookingStatus");
				viewModel.addRow(new Object[] { bid, roomCate, checkin, checkOut, price ,stas});
			}
			rs.close();
			pstat.close();
			conn.close();
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}

		leftPanelview.add(viewScroll);

		leftPanelview.add(viewScroll);
		leftPanelview.setLayout(null);
		leftPanelview.setBounds(10, 92, 710, 580);
		leftPanelview.setBackground(Color.darkGray);
		viewWindow.add(leftPanelview);
		// ----------------------------------------------------------------------
		// ---------------------RIGHT SIDE
		// PANEL-------------------------------------------------
		rightPanelView = new JPanel();

		// ---------label++++++++++++
		JLabel newServicesLabel = new JLabel("AMENITIES");
		newServicesLabel.setFont(new Font("times new roman", Font.BOLD, 50));
		newServicesLabel.setForeground(Color.white);
		newServicesLabel.setBounds(80, 20, 400, 50);
		rightPanelView.add(newServicesLabel);
		// ---------------------------------------------------------------------
		String[] servicesColumn = { "ID", "restaurant", "minibar", "Charges" };
		DefaultTableModel serivecesmodelTable = new DefaultTableModel();
		serivecesmodelTable.setColumnIdentifiers(servicesColumn);
		servicesTablel = new JTable(serivecesmodelTable);
		JScrollPane scrollServices = new JScrollPane(servicesTablel);
		// -----------------------------------------------------------------------------------------------------------
		servicesTablel.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		servicesTablel.setFillsViewportHeight(true);
		scrollServices.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollServices.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollServices.setBounds(25, 155, 400, 420);
		servicesTablel.setBorder(tableBorder);
		rightPanelView.add(scrollServices);
		// -----------------------------------------------------------

		edit2 = new JButton("EDIT");
		edit2.setBounds(90, 105, 120, 30);
		edit2.setBackground(Color.gray);
		edit2.setBorder(guiborder);
		edit2.setFocusPainted(false);
		edit2.addActionListener(this);
		edit2.setFont(new Font("times new roman", Font.BOLD, 20));
		edit2.setForeground(Color.white);
		rightPanelView.add(edit2);
		// ----------------------------------------------------------------------
		// ----------------------------------------------------------------------

		cancel3 = new JButton("CANCEL");
		cancel3.setBounds(240, 105, 120, 30);
		cancel3.setBackground(Color.GRAY);
		cancel3.setBorder(guiborder);
		cancel3.addActionListener(this);
		cancel3.setFocusPainted(false);
		cancel3.setFont(new Font("times new roman", Font.BOLD, 20));
		cancel3.setForeground(Color.white);
		rightPanelView.add(cancel3);
		// ----------------------------
		rightPanelView.setLayout(null);
		rightPanelView.setBorder(guiborder);
		rightPanelView.setBounds(730, 92, 446, 580);
		rightPanelView.setBackground(Color.darkGray);
		viewWindow.add(rightPanelView);
		// ----------------------------------------------------------------------
		// ----------------------------------------------------------------------

		viewWindow.setResizable(false);
		viewWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewWindow.setSize(1200, 720);
		viewWindow.setLocationRelativeTo(null);
		viewWindow.setLayout(null);
		viewWindow.setVisible(true);
	}

	@Override
	public void run() {
		try {
			while (true) {

				Calendar cal = Calendar.getInstance();
				hours = cal.get(Calendar.HOUR_OF_DAY);
				if (hours > 12) {
					hours -= 12;
				}
				minutes = cal.get(Calendar.MINUTE);
				seconds = cal.get(Calendar.SECOND);

				SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
				Date date = cal.getTime();
				timeString = formatter.format(date);

				printTime();

				thread.sleep(1000); // in milliseconds
			}
		} catch (Exception e) {
		}
	}

	public void printTime() {
		digitalClock2.setText(timeString);
	}

	public static void main(String[] args) {
		new ViewBooking();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==edit) {

			int bookid = Integer.parseInt(bidid.getText()) ;
			String customerType = (String) roomCategories.getSelectedItem();

			String checkindate = ((JTextField)checkInDate.getDateEditor().getUiComponent()).getText();

			String checkoutdate = ((JTextField)checkOutDate.getDateEditor().getUiComponent()).getText();

			
			String price = roomPrice.getText().toString();

			int row = bookingTable.getSelectedRow();

			if(row==-1) {
				UIManager.put("OptionPane.messageForeground", Color.black);
				UIManager.put("OptionPane.background", Color.darkGray);
				UIManager.put("Panel.background", Color.yellow);
				UIManager.put("OptionPane.messageFont", new Font("Times New Roman", Font.BOLD, 14));

			JOptionPane.showMessageDialog(null, "Please select specific row!");

			}

		
			viewModel.setValueAt(checkindate,row,1);

			viewModel.setValueAt(checkoutdate,row,2);

			viewModel.setValueAt(customerType,row,3);

			viewModel.setValueAt(price,row,4);


			
			String sql ="update bookingtable set room_type=?, check_inDate=?,checkOutDate=?,roomTotalCost=? where booking_id=?;";
			try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/onlinehotelbookingsystem", "root", "");

			PreparedStatement pstat=conn.prepareStatement(sql);

			pstat.setString(1, customerType);

			pstat.setString(2, checkindate);
			
			pstat.setString(3, checkoutdate);

			pstat.setString(4, price);

			pstat.setInt(5, bookid);

			pstat.executeUpdate();

			pstat.close();

			conn.close();

			JOptionPane.showMessageDialog(null, "Update Sucess");


			}

			catch(Exception ex) {

			JOptionPane.showMessageDialog(null, "Update Unsucess");

			System.out.println("Error : "+ex.getMessage());

			}

			}

			if(e.getSource()==cancel) {

			if(bookingTable.getSelectedRow()==-1) {
				UIManager.put("OptionPane.messageForeground", Color.black);
				UIManager.put("OptionPane.background", Color.darkGray);
				UIManager.put("Panel.background", Color.yellow);
				UIManager.put("OptionPane.messageFont", new Font("Times New Roman", Font.BOLD, 14));

			JOptionPane.showMessageDialog(null, "Please select specific data to delete" , "Error", JOptionPane.ERROR_MESSAGE);

			}
			else {
			int select = JOptionPane.showConfirmDialog(null, "Do you Want to delete this row", "Confirm", JOptionPane.YES_NO_OPTION);

			if(select == JOptionPane.YES_OPTION) {

				viewModel.removeRow(bookingTable.getSelectedRow());



			String sqlq = "delete from bookingtable where booking_id=?";

			int bkingid= Integer.parseInt(bidid.getText());

			try {

			Class.forName("com.mysql.cj.jdbc.Driver");//load database driver

			Connection conne = DriverManager.getConnection("jdbc:mysql://localhost/onlinehotelbookingsystem", "root", "");

			PreparedStatement pstate=conne.prepareStatement(sqlq);

			pstate.setInt(1, bkingid);

			pstate.executeUpdate();

			pstate.close();

			conne.close();

			JOptionPane.showMessageDialog(null, "Booking Cancled");

			

			}

			catch(Exception ex) {

			JOptionPane.showMessageDialog(null, "Error");

			System.out.println("Error : "+ex.getMessage());

			}

			}

			}

			


		if (e.getSource() == exit) {
			CustomerDashboard runcustdashboard = new CustomerDashboard();
			viewWindow.dispose();

		}

	}
	}
}
