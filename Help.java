class Help {
	public static void printHelp() {
		System.out.println("\nHttpRequest [URL] examples:");
		System.out.println("java sak -HttpRequest https://thunderbird-index.azurewebsites.net/w0a6zk195e.json");
		System.out.println("java sak -HttpRequest https://thunderbird-index.azurewebsites.net/w0a6zk195f.json");
		System.out.println("java sak -HttpRequest https://thunderbird-index.azurewebsites.net/no-last-name.json");
		System.out.println("java sak -HttpRequest https://thunderbird-index.azurewebsites.net/too-short-a-last-name.json");
		System.out.println("\nHttpRequestIndex [URL] example:");
		System.out.println("java sak -HttpRequestIndex https://thunderbird-index.azurewebsites.net/w0a6zk195d.json");
	}
}