package ebookstore;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class MainDashboard extends Frame implements ActionListener {
    
    Frame b_frame = new Frame();
    Frame a_frame = new Frame();
    Frame p_frame = new Frame();
    
    Button con = new Button ("Connect");
    Button dcon = new Button ("Disconnect");
    Button exit = new Button ("Exit");
    
    Button book = new Button ("Book Control Panel");
    Button b_insert = new Button ("Insert");
    Button b_update = new Button ("Update");
    Button b_delete = new Button ("Delete");
    Button b_search = new Button ("Search");
    Button b_back = new Button ("Back");
    Button b_exit = new Button ("Exit");
    TextField ISBN = new TextField();
    TextField title = new TextField();
    TextField type = new TextField();
    TextField page_c = new TextField();
    TextField price = new TextField();
    TextField pubcode = new TextField();
    Label b_id = new Label("ISBN");
    Label name = new Label("Title");
    Label typee = new Label("Type");
    Label pgc = new Label("Page Count");
    Label pricee = new Label("Price");
    Label pcode = new Label("Publisher code");
    
    Button author = new Button ("Author Control Panel");
    Button a_insert = new Button("Insert");
    Button a_update = new Button("Update");
    Button a_delete = new Button("Delete");
    Button a_search = new Button("Search");
    Button a_back = new Button ("Back");
    Button a_exit = new Button ("Exit");
    TextField authid_field = new TextField();
    TextField fname_field = new TextField();
    TextField lname_field = new TextField();
    Label lbl_authid = new Label("Author ID");
    Label lbl_fname = new Label("First Name");
    Label lbl_lname = new Label("Last Name");

    
    Button publisher = new Button ("Publisher Control Panel");
    Button p_insert = new Button("Insert");
    Button p_update = new Button("Update");
    Button p_delete = new Button("Delete");
    Button p_search = new Button("Search");
    Button p_back = new Button ("Back");
    TextField pubcode_field = new TextField();
    TextField namee_field = new TextField();
    TextField city_field = new TextField();
    TextField phone_field = new TextField();
    Label lbl_pubcode = new Label("Publisher Code");
    Label lbl_namee = new Label("Name");
    Label lbl_city = new Label("City");
    Label lbl_phone = new Label("Phone");
    Button p_exit = new Button ("Exit");
    
    
    
    
    MainDashboard(){
        //Frame 1 (Main Control Panel)
        setBounds(50,50,400,300);
        setTitle("Main Dashboard");
        setBackground(Color.DARK_GRAY.darker());
        setLayout(null);
        setVisible(true);
        con.setBounds(65,50,80,30);
        con.setForeground(Color.GREEN);
        con.addActionListener(this);
        add(con);
        dcon.setBounds(250,50,80,30);
        dcon.setForeground(Color.RED);
        dcon.addActionListener(this);
        add(dcon);
        book.setBounds(120,100,150,30);
        book.setForeground(Color.WHITE);
        book.addActionListener(this);
        add(book);
        author.setBounds(120,150,150,30);
        author.setForeground(Color.WHITE);
        author.addActionListener(this);
        add(author);
        publisher.setBounds(120,200,150,30);
        publisher.setForeground(Color.WHITE);
        publisher.addActionListener(this);
        add(publisher);
        exit.setBounds(165,250,50,30);
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);
        
        //Frame 2 (Book Control Panel)
        b_frame.setBounds(50,50,400,300);
        b_frame.setTitle("Book Dashboard");
        b_frame.setBackground(Color.DARK_GRAY.darker());
        b_frame.setLayout(null);
        b_frame.setVisible(false);
        b_insert.setBounds(60,200,50,30);
        b_insert.addActionListener(this);
        b_frame.add(b_insert);
        b_update.setBounds(135,200,50,30);
        b_update.addActionListener(this);
        b_frame.add(b_update);
        b_delete.setBounds(210,200,50,30);
        b_delete.addActionListener(this);
        b_frame.add(b_delete);
        b_search.setBounds(285,200,50,30);
        b_search.addActionListener(this);
        b_frame.add(b_search);
        b_back.setBounds(100,250,50,30);
        b_back.addActionListener(this);
        b_frame.add(b_back);
        b_exit.setBounds(250,250,50,30);
        b_exit.addActionListener(this);
        b_frame.add(b_exit);
        ISBN.setBounds(120,40,150,20);
        ISBN.setForeground(Color.RED.darker());
        b_frame.add(ISBN);
        b_id.setBounds(30,40,100,20);
        b_id.setForeground(Color.white);
        b_frame.add(b_id);
        title.setBounds(120,65,150,20);
        b_frame.add(title);
        name.setBounds(30,65,100,20);
        name.setForeground(Color.white);
        b_frame.add(name);
        type.setBounds(120,90,150,20);
        b_frame.add(type);
        typee.setBounds(30,90,100,20);
        typee.setForeground(Color.white);
        b_frame.add(typee);
        page_c.setBounds(120,115,150,20);
        b_frame.add(page_c);
        pgc.setBounds(30,115,100,20);
        pgc.setForeground(Color.white);
        b_frame.add(pgc);
        price.setBounds(120,140,150,20);
        b_frame.add(price);
        pricee.setBounds(30,140,100,20);
        pricee.setForeground(Color.white);
        b_frame.add(pricee);
        pubcode.setBounds(120,165,150,20);
        pubcode.setForeground(Color.BLUE);
        b_frame.add(pubcode);
        pcode.setBounds(30,165,100,20);
        pcode.setForeground(Color.white);
        b_frame.add(pcode);
        
        //Frame 3 (Publisher Control Panel)
        p_frame.setBounds(50,50,400,300);
        p_frame.setTitle("Publisher Dashboard");
        p_frame.setBackground(Color.DARK_GRAY.darker());
        p_frame.setLayout(null);
        p_frame.setVisible(false);
        lbl_pubcode.setBounds(30,40,100,20);
        lbl_pubcode.setForeground(Color.white);
        p_frame.add(lbl_pubcode);
        pubcode_field.setBounds(130,40,150,20);
        pubcode_field.setForeground(Color.BLUE);
        p_frame.add(pubcode_field);
        lbl_namee.setBounds(30,75,100,20);
        lbl_namee.setForeground(Color.white);
        p_frame.add(lbl_namee);
        namee_field.setBounds(130,75,150,20);
        p_frame.add(namee_field);
        lbl_city.setBounds(30,110,100,20);
        lbl_city.setForeground(Color.white);
        p_frame.add(lbl_city);
        city_field.setBounds(130,110,150,20);
        p_frame.add(city_field);
        lbl_phone.setBounds(30,145,100,20);
        lbl_phone.setForeground(Color.white);
        p_frame.add(lbl_phone);
        phone_field.setBounds(130,145,150,20);
        p_frame.add(phone_field);
        p_insert.setBounds(60,200,50,30);
        p_insert.addActionListener(this);
        p_frame.add(p_insert);
        p_update.setBounds(135,200,50,30);
        p_update.addActionListener(this);
        p_frame.add(p_update);
        p_delete.setBounds(210,200,50,30);
        p_delete.addActionListener(this);
        p_frame.add(p_delete);
        p_search.setBounds(285,200,50,30);
        p_search.addActionListener(this);
        p_frame.add(p_search);
        p_back.setBounds(100,250,50,30);
        p_back.addActionListener(this);
        p_frame.add(p_back);
        p_exit.setBounds(250,250,50,30);
        p_exit.addActionListener(this);
        p_frame.add(p_exit);
        
        //Frame 4 (Author Control Panel)
        a_frame.setBounds(50,50,400,300);
        a_frame.setTitle("Author Dashboard");
        a_frame.setBackground(Color.DARK_GRAY.darker());
        a_frame.setLayout(null);
        a_frame.setVisible(false);
        lbl_authid.setBounds(30,40,100,20);
        lbl_authid.setForeground(Color.white);
        a_frame.add(lbl_authid);
        authid_field.setBounds(130,40,150,20);
        authid_field.setForeground(Color.GREEN.darker());
        a_frame.add(authid_field);
        lbl_fname.setBounds(30,80,100,20);
        lbl_fname.setForeground(Color.white);
        a_frame.add(lbl_fname);
        fname_field.setBounds(130,80,150,20);
        a_frame.add(fname_field);
        lbl_lname.setBounds(30,120,100,20);
        lbl_lname.setForeground(Color.white);
        a_frame.add(lbl_lname);
        lname_field.setBounds(130,120,150,20);
        a_frame.add(lname_field);
        a_insert.setBounds(60,200,50,30);
        a_insert.addActionListener(this);
        a_frame.add(a_insert);
        a_update.setBounds(135,200,50,30);
        a_update.addActionListener(this);
        a_frame.add(a_update);
        a_delete.setBounds(210,200,50,30);
        a_delete.addActionListener(this);
        a_frame.add(a_delete);
        a_search.setBounds(285,200,50,30);
        a_search.addActionListener(this);
        a_frame.add(a_search);
        a_back.setBounds(100,250,50,30);
        a_back.addActionListener(this);
        a_frame.add(a_back);
        a_exit.setBounds(250,250,50,30);
        a_exit.addActionListener(this);
        a_frame.add(a_exit);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getSource()==con) {
            DBConnection.ConnectToSQL();
        }
        if (ae.getSource()==dcon) {
            DBConnection.Close();
        }
        if (ae.getSource()==book) {
            setVisible(false);
            b_frame.setVisible(true);
        }
        if (ae.getSource()==author) {
            setVisible(false);
            a_frame.setVisible(true);
        }
        if (ae.getSource()==publisher) {
            setVisible(false);
            p_frame.setVisible(true);
        }
        if (ae.getSource()==exit) {
            System.exit(0);
        }
        if (ae.getSource()==b_insert) {
            DBConnection.Execute("insert into Book values ('"+ISBN.getText()+"','"+title.getText()+"','"+type.getText()+"',"+page_c.getText()+","+price.getText()+",'"+pubcode.getText()+"')");
            System.out.println("INSERTED");
        }
        if (ae.getSource()==b_update) {
            DBConnection.Execute("update Book set title ='"+title.getText()+"', typee='" + type.getText() + "',page_count='"+page_c.getText()+"',price='"+price.getText()+"',pubcode='"+pubcode.getText()+"' where ISBN ="+ISBN.getText());
            System.out.println("UPDATED");
        }
        if (ae.getSource()==b_delete) {
            DBConnection.Execute("delete from Book where ISBN = "+ISBN.getText());
            System.out.println("DELETED");
        }
        if (ae.getSource() == b_search) {
            try {
                String query = "select * from Book where ISBN = '" + ISBN.getText() + "'";
                ResultSet rs = DBConnection.GetData(query);
                if (rs.next()) {
                    title.setText(rs.getString("title"));
                    type.setText(rs.getString("typee"));
                    page_c.setText(String.valueOf(rs.getInt("page_count")));
                    price.setText(String.valueOf(rs.getFloat("price")));
                    pubcode.setText(rs.getString("pubcode"));
                    System.out.println("Book Found");
                } else {
                    System.out.println("Book Not Found");
                }
                rs.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (ae.getSource()==b_back) {
            b_frame.setVisible(false);
            setVisible(true);
        }
        if (ae.getSource()==b_exit) {
            System.exit(0);
        }
        if (ae.getSource() == p_insert) {
            DBConnection.Execute("insert into Publisher values ('"+pubcode_field.getText()+"','"+namee_field.getText()+"','"+city_field.getText()+"','"+phone_field.getText()+"')");
            System.out.println("INSERTED");
        }

        if (ae.getSource() == p_update) {
            DBConnection.Execute("update Publisher set namee='" + namee_field.getText() + "',city='"+city_field.getText()+"',phone='"+phone_field.getText()+"' where pubcode ="+pubcode_field.getText());
            System.out.println("UPDATED");
        }

        if (ae.getSource() == p_delete) {
            DBConnection.Execute("delete from Publisher where pubcode = "+pubcode_field.getText());
            System.out.println("DELETED");
        }

        if (ae.getSource() == p_search) {try {
                String query = "select * from Publisher Where pubcode = '" + pubcode_field.getText() + "'";
                ResultSet rs = DBConnection.GetData(query);
                if (rs.next()) {
                    namee_field.setText(rs.getString("namee"));
                    city_field.setText(rs.getString("city"));
                    phone_field.setText(rs.getString("phone"));
                    System.out.println("Publisher Found");
                } else {
                    System.out.println("Publisher Not Found");
                }
                rs.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        if (ae.getSource() == p_back) {
            p_frame.setVisible(false);
            setVisible(true);
        }

        if (ae.getSource() == p_exit) {
            System.exit(0);
        }
        if (ae.getSource() == a_insert) {
        DBConnection.Execute("insert into Author values ('"+authid_field.getText()+"','"+fname_field.getText()+"','"+lname_field.getText()+"')");
        System.out.println("INSERTED");
        }
        if (ae.getSource() == a_update) {
            DBConnection.Execute("update Author set f_name='" + fname_field.getText() + "',l_name='"+lname_field.getText()+"' where authid ="+authid_field.getText());
            System.out.println("UPDATED");
        }
        if (ae.getSource() == a_delete) {
            DBConnection.Execute("delete from Author where authid = "+authid_field.getText());
            System.out.println("DELETED");
        }
        if (ae.getSource() == a_search) {try {
                String query = "select * from Author where authid = "+ authid_field.getText();
                ResultSet rs = DBConnection.GetData(query);
                if (rs.next()) {
                    fname_field.setText(rs.getString("f_name"));
                    lname_field.setText(rs.getString("l_name"));
                    System.out.println("Author Found");
                } else {
                    System.out.println("Author Not Found");
                }
                rs.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (ae.getSource() == a_back) {
            a_frame.setVisible(false);
            setVisible(true);
        }
        if (ae.getSource() == a_exit) {
            System.exit(0);
        }
    }
}