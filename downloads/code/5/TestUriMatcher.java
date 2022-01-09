public class TestUriMatcher extends AndroidTestCase {
    private static final String LOCATION_QUERY = "Seoul,kr";
    private static final long TEST_DATE = 1485700000L; // 2017 - 01 - 29
    private static final long TEST_LOCATION_ID = 10L;

    // content://com.study.sunshine.app/weather"
    private static final Uri TEST_WEATHER_DIR = WeatherContract.WeatherEntry.CONTENT_URI;
    private static final Uri TEST_WEATHER_WITH_LOCATION_DIR = WeatherContract.WeatherEntry.buildWeatherLocation(LOCATION_QUERY);
    private static final Uri TEST_WEATHER_WITH_LOCATION_AND_DATE_DIR = WeatherContract.WeatherEntry.buildWeatherLocationWithDate(LOCATION_QUERY, TEST_DATE);
    // content://com.study.sunshine.app/location"
    private static final Uri TEST_LOCATION_DIR = WeatherContract.LocationEntry.CONTENT_URI;


//    public void testUriMatcher() {
//        UriMatcher testMatcher = WeatherProvider.buildUriMatcher();
//
//        assertEquals("Error: The WEATHER URI was matched incorrectly.",
//                testMatcher.match(TEST_WEATHER_DIR), WeatherProvider.WEATHER);
//        assertEquals("Error: The WEATHER WITH LOCATION URI was matched incorrectly.",
//                testMatcher.match(TEST_WEATHER_WITH_LOCATION_DIR), WeatherProvider.WEATHER_WITH_LOCATION);
//        assertEquals("Error: The WEATHER WITH LOCATION AND DATE URI was matched incorrectly.",
//                testMatcher.match(TEST_WEATHER_WITH_LOCATION_AND_DATE_DIR), WeatherProvider.WEATHER_WITH_LOCATION_AND_DATE);
//        assertEquals("Error: The LOCATION URI was matched incorrectly.",
//                testMatcher.match(TEST_LOCATION_DIR), WeatherProvider.LOCATION);
//    }
}
