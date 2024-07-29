package Project_Development;
import java.lang.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;
public class trybro03_me_UI extends Frame
{
    public trybro03_me_UI()
    {
        this.setVisible(true);
        this.setTitle("User Management System Itself !!! ");
        this.setBackground(new Color(0,0,30));
        this.setResizable(true);
        this.setLayout(null);
        this.setSize(1000,600);

        this.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.out.println("Windows is Close Now !!!");
                System.exit(0);
            }
        });

        Font fnt_Title = new Font("consolas",Font.BOLD,20);

        Label lbl_Title = new Label();
        lbl_Title.setBounds(370,50,200,50);
        lbl_Title.setText("Welcome to Registration Processes");
        lbl_Title.setSize(400,100);
        lbl_Title.setForeground(Color.WHITE);
        lbl_Title.setFont(fnt_Title);
        add(lbl_Title);

        Font fnt_lbl = new Font("consolas",Font.BOLD,20);
        Font fnt_txt = new Font("consolas",Font.BOLD,20);
        Font fnt_btn = new Font("consolas",Font.BOLD,20);

        Label lbl_Id = new Label("ID");
        lbl_Id.setBounds(200,150,100,50);
        lbl_Id.setFont(fnt_lbl);
        lbl_Id.setForeground(Color.yellow);
        add(lbl_Id);

        Label lbl_Name = new Label("Name");
        lbl_Name.setBounds(200,200,100,50);
        lbl_Name.setFont(fnt_lbl);
        lbl_Name.setForeground(Color.yellow);
        add(lbl_Name);

        Label lbl_age = new Label("Age");
        lbl_age.setBounds(200,250,100,50);
        lbl_age.setFont(fnt_lbl);
        lbl_age.setForeground(Color.yellow);
        add(lbl_age);

        Label lbl_city = new Label("City");
        lbl_city.setBounds(200,300,100,50);
        lbl_city.setFont(fnt_lbl);
        lbl_city.setForeground(Color.yellow);
        add(lbl_city);

        Label lbl_password = new Label("Password");
        lbl_password.setBounds(200,350,100,50);
        lbl_password.setFont(fnt_lbl);
        lbl_password.setForeground(Color.yellow);
        add(lbl_password);

        TextField txt_ID = new TextField();
        txt_ID.setBounds(330,160,400,30);
        txt_ID.setFont(fnt_txt);
        txt_ID.setForeground(Color.black);
        add(txt_ID);

        TextField txt_Name = new TextField();
        txt_Name.setBounds(330,210,400,30);
        txt_Name.setFont(fnt_txt);
        txt_Name.setForeground(Color.black);
        add(txt_Name);

        TextField txt_age = new TextField();
        txt_age.setBounds(330,260,400,30);
        txt_age.setFont(fnt_txt);
        txt_age.setForeground(Color.black);
        add(txt_age);

        TextField txt_city = new TextField();
        txt_city.setBounds(330,310,400,30);
        txt_city.setFont(fnt_txt);
        txt_city.setForeground(Color.black);
        add(txt_city);

        TextField txt_password = new TextField();
        txt_password.setBounds(330,360,400,30);
        txt_password.setFont(fnt_txt);
        txt_password.setEchoChar('*');
        txt_password.setForeground(Color.black);
        add(txt_password);

        Button btn_clear = new Button("Clear");
        btn_clear.setBounds(160,450,120,30);
        btn_clear.setBackground(Color.orange);
        btn_clear.setFont(fnt_btn);
        btn_clear.setForeground(Color.black);
        add(btn_clear);

        Button btn_delete = new Button("Delete");
        btn_delete.setBounds(360,450,120,30);
        btn_delete.setBackground(Color.ORANGE);
        btn_delete.setFont(fnt_btn);
        btn_delete.setForeground(Color.black);
        add(btn_delete);

        Button btn_update = new Button("Update");
        btn_update.setBounds(560,450,120,30);
        btn_update.setBackground(Color.ORANGE);
        btn_update.setFont(fnt_btn);
        btn_update.setForeground(Color.black);
        add(btn_update);

        Button btn_save = new Button("Save");
        btn_save.setBounds(760,450,120,30);
        btn_save.setBackground(Color.ORANGE);
        btn_save.setFont(fnt_btn);
        btn_save.setForeground(Color.black);
        add(btn_save);

        Label txtfld_current_status = new Label();
        txtfld_current_status.setBounds(450,520,200,30);
        txtfld_current_status.setText("Current Status");
        txtfld_current_status.setForeground(Color.ORANGE);
        txtfld_current_status.setFont(fnt_txt);
        add(txtfld_current_status);
    }
    public static void main(String args[])
    {
        System.out.println("User Management System !!!");
        new trybro03_me_UI();
    }
}







