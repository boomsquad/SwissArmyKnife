class Help {
	public static void printHelp() {
		System.out.println("");
		System.out.println("----------------------------");
		System.out.println("Below are some options that will read and write JSON files into the command line.");
		System.out.println("----------------------------");
		System.out.println("\nHttpRequest [URL] examples:");
		System.out.println("java sak -HttpRequest https://thunderbird-index.azurewebsites.net/w0a6zk195e.json");
		System.out.println("java sak -HttpRequest https://thunderbird-index.azurewebsites.net/w0a6zk195f.json");
		System.out.println("java sak -HttpRequest https://thunderbird-index.azurewebsites.net/no-last-name.json");
		System.out.println("java sak -HttpRequest https://thunderbird-index.azurewebsites.net/too-short-a-last-name.json");
		System.out.println("\nHttpRequestIndex [URL] example:");
		System.out.println("java sak -HttpRequestIndex https://thunderbird-index.azurewebsites.net/w0a6zk195d.json");
	}
}