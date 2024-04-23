import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PizzaHouse {
    private JLabel Hellolabel;
    private JTextField textField1;
    private JButton hellobutton;
    private JLabel hellolabel;
    private JPanel rootpanel;
    private JComboBox<String> ComboBoxPizza;
    private JLabel sizelabel;
    private JComboBox<String> ComboBoxSize;
    private JButton checkOutButton;
    private JLabel Order;
    private JSpinner spinner1;
    private JOptionPane Pane;

    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloWorld");
        frame.setContentPane(new PizzaHouse().rootpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }


    public PizzaHouse() {

        hellobutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hellolabel.setText("HelloWolrd");
                String greeting = "Hello " + textField1.getText() + " ! What you would like to order ?";
                hellolabel.setText(greeting);

            }

        });
        checkOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double price = 0;
                if (ComboBoxSize.getSelectedItem() == "20") {
                    price = 5.99;
                } else if (ComboBoxSize.getSelectedItem() == "30") {
                    price = 7.99;
                } else if (ComboBoxSize.getSelectedItem() == "50") {
                    price = 9.99;
                }
                int count = (int) spinner1.getValue();
                String order = textField1.getText() + ", here is price for your order - " + price * count + "$. " + "You can pick up your order in 10-15 min.";
                Order.setText(order);


            }

        });


        checkOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String flavor = (String) ComboBoxPizza.getSelectedItem();
                int size = Integer.parseInt((String) ComboBoxSize.getSelectedItem());
                int count = (int) (spinner1.getValue());
                Pizza vk = new Pizza(flavor, size, count);
                System.out.println(vk.PrintInfo());
                vk.writeFile();
            }
        });
    }

    private void createUIComponents() {
        ComboBoxPizza = new JComboBox<>();
        ComboBoxPizza.addItem("Cheese Pizza");
        ComboBoxPizza.addItem("Veggie Pizza");
        ComboBoxPizza.addItem("Pepperoni Pizza");
        ComboBoxPizza.addItem("Meat Pizza");
        ComboBoxPizza.addItem("Margherita Pizza");
        ComboBoxPizza.addItem("BBQ Chicken Pizza");
        ComboBoxPizza.addItem("Hawaiian Pizza");
        ComboBoxPizza.addItem("Buffalo Pizza");
        ComboBoxPizza.addItem("Supreme Pizza");
        ComboBoxSize = new JComboBox<>();
        ComboBoxSize.addItem("20");
        ComboBoxSize.addItem("30");
        ComboBoxSize.addItem("50");
    }

}