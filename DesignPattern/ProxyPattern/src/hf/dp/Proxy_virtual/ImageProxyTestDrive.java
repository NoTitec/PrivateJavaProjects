package hf.dp.Proxy_virtual;

import java.net.*;
import javax.swing.*;
import java.util.*;

public class ImageProxyTestDrive {
	ImageComponent imageComponent;
	JFrame frame = new JFrame("Food Menu Viewer");
	JMenuBar menuBar;
	JMenu menu;
	Hashtable<String, String> cds = new Hashtable<String, String>();

	public static void main (String[] args) throws Exception {
		MyHWInfo.printInfo();
		ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
	}

	public ImageProxyTestDrive() throws Exception{
		cds.put("bachu kimchi","https://recipe1.ezmember.co.kr/cache/recipe/2022/12/04/9964f58de6491d7832e9e602e9ab21061_s.jpg");
		cds.put("meulchimuchim","https://recipe1.ezmember.co.kr/cache/recipe/2022/12/07/030b025aa53eee8a03fe71ba3c9b8b751_s.jpg");
		cds.put("kimchigukbab","https://recipe1.ezmember.co.kr/cache/recipe/2022/12/13/3f739a2a5dcdcf4709cc12ed6f4678321_s.jpg");
		cds.put("shigumchi","https://recipe1.ezmember.co.kr/cache/recipe/2022/12/15/500c8a6df29ca922d5afeda44a9d1ad11_s.jpg");
		cds.put("miyeokuk","https://recipe1.ezmember.co.kr/cache/recipe/2022/12/15/bbd1998476b9589dd597ceb1fd9177e41_s.jpg");
		cds.put("gamja","https://recipe1.ezmember.co.kr/cache/recipe/2022/12/18/2294e4a26cac6821745d003b04406df91_s.jpg");
		URL initialURL = new URL((String)cds.get("gamja"));
		menuBar = new JMenuBar();
		menu = new JMenu("Foods");
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);

		for (Enumeration<String> e = cds.keys(); e.hasMoreElements();) {
			String name = (String)e.nextElement();
			JMenuItem menuItem = new JMenuItem(name);
			menu.add(menuItem);
			menuItem.addActionListener(event -> {
				imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
				frame.repaint();
			});
		}

		// set up frame and menus

		Icon icon = new ImageProxy(initialURL);
		imageComponent = new ImageComponent(icon);
		frame.getContentPane().add(imageComponent);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setVisible(true);

	}

	URL getCDUrl(String name) {
		try {
			return new URL((String)cds.get(name));
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
