package schoolmanager.view.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class TabbedPaneWithCloseButton {

    private JTabbedPane tabbedPane;

    public TabbedPaneWithCloseButton(JTabbedPane tabbedPane) {
        this.tabbedPane = tabbedPane;
    }

    public void addTab(String title, JPanel panel) {
        int tabIndex = tabbedPane.getTabCount(); // Salva o índice atual
        tabbedPane.addTab(title, panel);

        JPanel tabPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        tabPanel.setOpaque(false);

        JLabel tabTitle = new JLabel(title);
        tabPanel.add(tabTitle);

        JButton closeButton = new JButton("x");
        closeButton.setMargin(new Insets(0, 0, 0, 0));
        closeButton.setPreferredSize(new Dimension(14, 14));
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = tabbedPane.indexOfTabComponent(tabPanel);
                if (index != -1) {
                    tabbedPane.remove(index);
                }
            }
        });

        tabPanel.add(closeButton);
        tabbedPane.setTabComponentAt(tabIndex, tabPanel);
    }
}