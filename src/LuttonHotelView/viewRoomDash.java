package LuttonHotelView;

	import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import HotelLutonModel.ForeignkeyTester;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
	public class viewRoomDash extends  JInternalFrame{
	private JFrame roomFrame;
	JTable roomTable;
	 public viewRoomDash(){
		roomFrame= new JFrame();
		roomFrame.getContentPane().setBackground(Color.GRAY);
		//----------------------------------JLABEL-------------
		JLabel roomLabel= new JLabel("ROOMS");
		roomLabel.setBounds(180,0,150,50);
		roomLabel.setForeground(Color.white);
		roomLabel.setFont(new Font("times new roman",Font.BOLD,36));
		roomFrame.add(roomLabel);
		
		//----------------------------------------------------------------------
		String[] rooms = { "ID", "Room Categories", "RoomPrice", "RoomStatus" };
		DefaultTableModel roomsmodel = new DefaultTableModel();
		roomsmodel.setColumnIdentifiers(rooms);
		roomTable = new JTable(roomsmodel);
		JScrollPane roomScroll = new JScrollPane(roomTable);
		roomTable.setFont(new Font("times new roman", Font.PLAIN, 14));
		roomTable.setCellSelectionEnabled(true);		
		roomTable.setSelectionBackground(Color.white);
		roomTable.setSelectionForeground(Color.black);
		// -----------------------------------------------------------------------------------------------------------
		roomTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		roomTable.setFillsViewportHeight(true);
		roomScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		roomScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		roomScroll.setBounds(10, 60, 465, 390);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/onlinehotelbookingsystem", "root",
					"");
			String sql = "select* from room where statusofRoom=?";
			PreparedStatement pstat = conn.prepareStatement(sql);
			//pstat.setInt(1, ForeignkeyTester.userid);
			pstat.setString(1, "available");
			ResultSet rs = pstat.executeQuery();
			while (rs.next()) {
				
				int rid = rs.getInt("RoomId");
				String roomCateg = rs.getString("roomType");
				String roomPp = rs.getString("priceOfRoom");
				String rStatus= rs.getString("statusofRoom");
				roomsmodel.addRow(new Object[] { rid, roomCateg, roomPp, rStatus});
			}
			rs.close();
			pstat.close();
			conn.close();
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
		roomFrame.add(roomScroll);


		
		roomFrame.setSize(500,500);
		roomFrame.setLocationRelativeTo(null);
		roomFrame.setResizable(false);
		roomFrame.setLayout(null);
		roomFrame.setVisible(true);
	}
	 public static void main(String[] args) {
		 new viewRoomDash();
	 }
	}


