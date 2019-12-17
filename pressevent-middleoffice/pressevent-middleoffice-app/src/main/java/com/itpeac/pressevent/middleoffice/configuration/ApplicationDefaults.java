package com.itpeac.pressevent.middleoffice.configuration;

public interface ApplicationDefaults {
	interface Project {
		String applicationName = "API Dalkia";
		String applicationVersion = "V0";
		String environnement = "development";
	}

	interface Http {
		interface Cache {
			int timeToLiveInDays = 1461; // 4 years (including leap day)
		}
	}

	interface Swagger {
		String title = "Application API Dalkia";
		String description = "API documentation";
		String version = "0.0.1";
		String termsOfServiceUrl = null;
		String contactName = null;
		String contactUrl = null;
		String contactEmail = null;
		String license = null;
		String licenseUrl = null;
		String defaultIncludePattern = "/api/.*";
	}
}
