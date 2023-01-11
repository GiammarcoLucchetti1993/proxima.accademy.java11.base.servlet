package esempio;

import java.io.IOException;

public class PropertiesManagerSingleton {
	
	private static java.util.Properties p;

    private final static String DEFAULT_PROPERTIES_FILE = "application_giammarco.properties";

	private static PropertiesManagerSingleton instance;

	private PropertiesManagerSingleton() throws IOException {
		p = new java.util.Properties();
        p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(DEFAULT_PROPERTIES_FILE));
        System.out.println("Instanziato Costruttore Privato Database Manager Singleton");
	}

	public static PropertiesManagerSingleton getInstance() throws IOException {
		if (instance == null) {
			instance = new PropertiesManagerSingleton();
		}
		return instance;
	}
	
	public String getProperty(String key) {
		String value = "";
		value = p.getProperty(key);
		return value;
	}

}
