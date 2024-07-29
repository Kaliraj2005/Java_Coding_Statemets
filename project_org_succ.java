package Project_Development;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class project_org_suc extends JFrame
{
    private JTextField txt_ID, txt_Name, txt_age, txt_city;
    private JPasswordField txt_password;
    private JLabel lbl_current_status;
    private static final String DB_URL = "jdbc:postgresql://localhost:64321/cse";
    private static final String USER = "postgres";
    private static final String PASSWORD = "kaliraj";
    private Connection conn;
    private PreparedStatement pstmt;
    public project_org_suc()
    {
        initializeUI();
        initializeDB();
    }
    private void initializeUI()
    {
        setTitle("User Management System Itself !!!");
        setSize(1000, 600);
        setResizable(true);
        getContentPane().setBackground(new Color(0,0,30));
        setLayout(null);

        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.out.println("Windows is Close Now !!!");
                System.exit(0);
            }
        });

        Font font = new Font("consolas", Font.BOLD, 20);

        Label lbl_Title = new Label("Welcome to Registration Processes");
        lbl_Title.setBounds(370, 50, 400, 100);
        lbl_Title.setForeground(Color.WHITE);
        lbl_Title.setFont(font);
        add(lbl_Title);

        JLabel lbl_Id = new JLabel("ID");
        lbl_Id.setBounds(200, 150, 100, 50);
        lbl_Id.setFont(font);
        lbl_Id.setForeground(Color.YELLOW);
        add(lbl_Id);

        JLabel lbl_Name = new JLabel("Name");
        lbl_Name.setBounds(200, 200, 100, 50);
        lbl_Name.setFont(font);
        lbl_Name.setForeground(Color.YELLOW);
        add(lbl_Name);

        JLabel lbl_age = new JLabel("Age");
        lbl_age.setBounds(200, 250, 100, 50);
        lbl_age.setFont(font);
        lbl_age.setForeground(Color.YELLOW);
        add(lbl_age);

        JLabel lbl_city = new JLabel("City");
        lbl_city.setBounds(200, 300, 100, 50);
        lbl_city.setFont(font);
        lbl_city.setForeground(Color.YELLOW);
        add(lbl_city);

        JLabel lbl_password = new JLabel("Password");
        lbl_password.setBounds(200, 350, 100, 50);
        lbl_password.setFont(font);
//        lbl_password.setEchoChar('*');

        lbl_password.setForeground(Color.YELLOW);
        add(lbl_password);

        txt_ID = new JTextField();
        txt_ID.setBounds(330, 160, 400, 30);
        add(txt_ID);

        txt_Name = new JTextField();
        txt_Name.setBounds(330, 210, 400, 30);
        add(txt_Name);

        txt_age = new JTextField();
        txt_age.setBounds(330, 260, 400, 30);
        add(txt_age);

        txt_city = new JTextField();
        txt_city.setBounds(330, 310, 400, 30);
        add(txt_city);

        txt_password = new JPasswordField();
        txt_password.setBounds(330, 360, 400, 30);
        txt_password.setEchoChar('*');
        add(txt_password);


        Button btn_clear = new Button("Clear");
        btn_clear.setBounds(160, 450, 120, 30);
        btn_clear.setBackground(Color.orange);
        btn_clear.setFont(font);
        btn_clear.setForeground(Color.black);
        btn_clear.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                clearData();
            }
        });
        add(btn_clear);

        Button btn_delete = new Button("Delete");
        btn_delete.setBounds(360, 450, 120, 30);
        btn_delete.setBackground(Color.ORANGE);
        btn_delete.setFont(font);
        btn_delete.setForeground(Color.black);
        btn_delete.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                deleteData();
            }
        });
        add(btn_delete);

        Button btn_update = new Button("Update");
        btn_update.setBounds(560, 450, 120, 30);
        btn_update.setBackground(Color.ORANGE);
        btn_update.setFont(font);
        btn_update.setForeground(Color.black);
        btn_update.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                updateData();
            }
        });
        add(btn_update);

        Button btn_save = new Button("Save");
        btn_save.setBounds(760, 450, 120, 30);
        btn_save.setBackground(Color.ORANGE);
        btn_save.setFont(font);
        btn_save.setForeground(Color.black);
        btn_save.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                saveData();
            }
        });
        add(btn_save);

        lbl_current_status = new JLabel("Current Status");
        lbl_current_status.setBounds(450, 520, 300, 30);
        lbl_current_status.setForeground(Color.ORANGE);
        lbl_current_status.setFont(font);
        add(lbl_current_status);

        setVisible(true);
    }
    private void initializeDB()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            conn.setAutoCommit(false);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.exit(1);
        }
    }
    private void saveData()
    {
        try
        {
            int age = Integer.parseInt(txt_age.getText());
            pstmt = conn.prepareStatement("INSERT INTO users (name, age, city, password) VALUES (?, ?, ?, ?)");
            pstmt.setString(1, txt_Name.getText());
            pstmt.setInt(2, age);
            pstmt.setString(3, txt_city.getText());
            pstmt.setString(4, txt_password.getText());

            pstmt.executeUpdate();
            conn.commit();
            lbl_current_status.setText("Data saved successfully.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            try
            {
                conn.rollback(); // Roll back the transaction if an exception occurs
            }
            catch (SQLException ex)
            {
                ex.printStackTrace();
            }
        }
    }
    private void updateData()
    {
        try
        {
            int id = Integer.parseInt(txt_ID.getText());
            int age = Integer.parseInt(txt_age.getText());
            pstmt = conn.prepareStatement("UPDATE users SET name=?, age=?, city=?, password=? WHERE id=?");
            pstmt.setString(1, txt_Name.getText());
            pstmt.setInt(2, age);
            pstmt.setString(3, txt_city.getText());
            pstmt.setString(4, txt_password.getText());
            pstmt.setInt(5, id);

            // Print the SQL statement for debugging
            System.out.println("Executing SQL: " + pstmt.toString());

            pstmt.executeUpdate();
            conn.commit();
            lbl_current_status.setText("Data updated successfully.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            try
            {
                conn.rollback(); // Roll back the transaction if an exception occurs
            } catch (SQLException ex)
            {
                ex.printStackTrace();
            }
        }
    }
    private void deleteData()
    {
        try
        {
            int id = Integer.parseInt(txt_ID.getText());
            pstmt = conn.prepareStatement("DELETE FROM users WHERE id=?");
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            conn.commit();
            lbl_current_status.setText("Data deleted successfully.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            try
            {
                conn.rollback(); // Roll back the transaction if an exception occurs
            } catch (SQLException ex)
            {
                ex.printStackTrace();
            }
        }
    }
    private void clearData()
    {
        txt_ID.setText("");
        txt_Name.setText("");
        txt_age.setText("");
        txt_city.setText("");
        txt_password.setText("");
        lbl_current_status.setText("");
    }
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new project_org_suc();
            }
        });
    }
}

/*

package Project_Development;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class demo extends JFrame
{
    private JTextField txt_ID, txt_Name, txt_age, txt_city;
    private JPasswordField txt_password;
    private JLabel lbl_current_status;
    private static final String DB_URL = "jdbc:postgresql://localhost:64321/cse";
    private static final String USER = "postgres";
    private static final String PASSWORD = "kaliraj";
    private Connection conn;
    private PreparedStatement pstmt;

    public demo()
    {
        initializeUI();
        initializeDB();
    }

    private void initializeUI()
    {
        setTitle("User Management System Itself !!!");
        setSize(1000, 600);
        setResizable(true);
        getContentPane().setBackground(new Color(0, 0, 30));
        setLayout(null);

        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.out.println("Windows is Close Now !!!");
                System.exit(0);
            }
        });

        Font font = new Font("consolas", Font.BOLD, 20);

        Label lbl_Title = new Label("Welcome to Registration Processes");
        lbl_Title.setBounds(370, 50, 400, 100);
        lbl_Title.setForeground(Color.WHITE);
        lbl_Title.setFont(font);
        add(lbl_Title);

        JLabel lbl_Id = new JLabel("ID");
        lbl_Id.setBounds(200, 150, 100, 50);
        lbl_Id.setFont(font);
        lbl_Id.setForeground(Color.YELLOW);
        add(lbl_Id);

        JLabel lbl_Name = new JLabel("Name");
        lbl_Name.setBounds(200, 200, 100, 50);
        lbl_Name.setFont(font);
        lbl_Name.setForeground(Color.YELLOW);
        add(lbl_Name);

        JLabel lbl_age = new JLabel("Age");
        lbl_age.setBounds(200, 250, 100, 50);
        lbl_age.setFont(font);
        lbl_age.setForeground(Color.YELLOW);
        add(lbl_age);

        JLabel lbl_city = new JLabel("City");
        lbl_city.setBounds(200, 300, 100, 50);
        lbl_city.setFont(font);
        lbl_city.setForeground(Color.YELLOW);
        add(lbl_city);

        JLabel lbl_password = new JLabel("Password");
        lbl_password.setBounds(200, 350, 100, 50);
        lbl_password.setFont(font);
        lbl_password.setForeground(Color.YELLOW);
        add(lbl_password);

        txt_ID = new JTextField();
        txt_ID.setBounds(330, 160, 400, 30);
        add(txt_ID);

        txt_Name = new JTextField();
        txt_Name.setBounds(330, 210, 400, 30);
        add(txt_Name);

        txt_age = new JTextField();
        txt_age.setBounds(330, 260, 400, 30);
        add(txt_age);

        txt_city = new JTextField();
        txt_city.setBounds(330, 310, 400, 30);
        add(txt_city);

        txt_password = new JPasswordField();
        txt_password.setBounds(330, 360, 400, 30);
        txt_password.setEchoChar('*');
        add(txt_password);

        Button btn_clear = new Button("Clear");
        btn_clear.setBounds(160, 450, 120, 30);
        btn_clear.setBackground(Color.orange);
        btn_clear.setFont(font);
        btn_clear.setForeground(Color.black);
        btn_clear.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                clearData();
            }
        });
        add(btn_clear);

        Button btn_delete = new Button("Delete");
        btn_delete.setBounds(360, 450, 120, 30);
        btn_delete.setBackground(Color.ORANGE);
        btn_delete.setFont(font);
        btn_delete.setForeground(Color.black);
        btn_delete.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                deleteData();
            }
        });
        add(btn_delete);

        Button btn_update = new Button("Update");
        btn_update.setBounds(560, 450, 120, 30);
        btn_update.setBackground(Color.ORANGE);
        btn_update.setFont(font);
        btn_update.setForeground(Color.black);
        btn_update.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                updateData();
            }
        });
        add(btn_update);

        Button btn_save = new Button("Save");
        btn_save.setBounds(760, 450, 120, 30);
        btn_save.setBackground(Color.ORANGE);
        btn_save.setFont(font);
        btn_save.setForeground(Color.black);
        btn_save.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                saveData();
            }
        });
        add(btn_save);

        lbl_current_status = new JLabel("Current Status");
        lbl_current_status.setBounds(450, 520, 300, 30);
        lbl_current_status.setForeground(Color.ORANGE);
        lbl_current_status.setFont(font);
        add(lbl_current_status);

        setVisible(true);
    }

    private void initializeDB()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            conn.setAutoCommit(false);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private void saveData()
    {
        if (validateInputs()) {
            try
            {
                int age = Integer.parseInt(txt_age.getText());
                String hashedPassword = hashPassword(new String(txt_password.getPassword()));

                pstmt = conn.prepareStatement("INSERT INTO users (name, age, city, password) VALUES (?, ?, ?, ?)");
                pstmt.setString(1, txt_Name.getText());
                pstmt.setInt(2, age);
                pstmt.setString(3, txt_city.getText());
                pstmt.setString(4, hashedPassword);

                pstmt.executeUpdate();
                conn.commit();
                lbl_current_status.setText("Data saved successfully.");
            }
            catch (Exception e)
            {
                e.printStackTrace();
                try
                {
                    conn.rollback();
                }
                catch (SQLException ex)
                {
                    ex.printStackTrace();
                }
                lbl_current_status.setText("Failed to save data.");
            }
        }
    }

    private void updateData()
    {
        if (validateInputs()) {
            try
            {
                int id = Integer.parseInt(txt_ID.getText());
                int age = Integer.parseInt(txt_age.getText());
                String hashedPassword = hashPassword(new String(txt_password.getPassword()));

                pstmt = conn.prepareStatement("UPDATE users SET name=?, age=?, city=?, password=? WHERE id=?");
                pstmt.setString(1, txt_Name.getText());
                pstmt.setInt(2, age);
                pstmt.setString(3, txt_city.getText());
                pstmt.setString(4, hashedPassword);
                pstmt.setInt(5, id);

                pstmt.executeUpdate();
                conn.commit();
                lbl_current_status.setText("Data updated successfully.");
            }
            catch (Exception e)
            {
                e.printStackTrace();
                try
                {
                    conn.rollback();
                }
                catch (SQLException ex)
                {
                    ex.printStackTrace();
                }
                lbl_current_status.setText("Failed to update data.");
            }
        }
    }

    private void deleteData()
    {
        if (!txt_ID.getText().isEmpty()) {
            try
            {
                int id = Integer.parseInt(txt_ID.getText());
                pstmt = conn.prepareStatement("DELETE FROM users WHERE id=?");
                pstmt.setInt(1, id);
                pstmt.executeUpdate();
                conn.commit();
                lbl_current_status.setText("Data deleted successfully.");
            }
            catch (Exception e)
            {
                e.printStackTrace();
                try
                {
                    conn.rollback();
                }
                catch (SQLException ex)
                {
                    ex.printStackTrace();
                }
                lbl_current_status.setText("Failed to delete data.");
            }
        } else {
            lbl_current_status.setText("ID field is empty.");
        }
    }

    private void clearData()
    {
        txt_ID.setText("");
        txt_Name.setText("");
        txt_age.setText("");
        txt_city.setText("");
        txt_password.setText("");
        lbl_current_status.setText("");
    }

    private boolean validateInputs()
    {
        if (txt_Name.getText().isEmpty() || txt_age.getText().isEmpty() || txt_city.getText().isEmpty() || new String(txt_password.getPassword()).isEmpty())
        {
            lbl_current_status.setText("All fields must be filled.");
            return false;
        }
        try
        {
            Integer.parseInt(txt_age.getText());
        }
        catch (NumberFormatException e)
        {
            lbl_current_status.setText("Age must be a number.");
            return false;
        }
        return true;
    }

    private String hashPassword(String password) throws NoSuchAlgorithmException
    {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(password.getBytes());
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash)
        {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new project_org_suc();
            }
        });
    }
}

 */