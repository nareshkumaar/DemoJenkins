package demoJenkins;

import org.testng.annotations.Test;

public class AnotherTest {

	@Test
	public void testJenkins() {
		System.out.println("Running the 2nd Class Test");
	}
}


/*

public void validateDatabaseWithActivityId() throws Exception {

        Map<String, List<Object>> list = responseOfId.as(LinkedHashMap.class);
        Map<String, List<Object>> dbValues = new LinkedHashMap<String, List<Object>>();
                dbValues =DBMethods.getValuesFromDB(
                String.format(SQLQueriesWsm.ACTIVITY_BY_ACTIVITY_ID, activityId), WsmConstants.SCHEMA);
        for (Map.Entry<String, List<Object>> entry : list.entrySet()) {
            System.out.println("Response "+entry.getKey() + " = " + entry.getValue());
        }
        for (Map.Entry<String, List<Object>> entry : dbValues.entrySet()) {
            System.out.println("DB "+entry.getKey() + " = " + entry.getValue());
        }

        Boolean Result = CommonUtil.equalMaps(list,dbValues);
         log.info("Good to go "+Result);
    }

public static Map<String, List<Object>> getValuesFromDB(String sql,
                                                            String schema) throws Exception {
        ResultSet rs = dbResultSet(sql, schema);
        Map<String, List<Object>> map = new LinkedHashMap<String, List<Object>>();
                map = CommonUtil.resultSetToMap(rs);
        rs.close();
        getSqlStatement().close();
        return map;
    }

public static boolean equalMaps(Map<?, ?> map, Map<?, ?> map2) {
		if (map.size() != map2.size())
			return false;
		for (Object key : map.keySet()) {
			if (!map.get(key).equals(map2.get(key)))
				return false;
		}
		return true;
	}

{
    "id": 101,
    "type": "SPLIT",
    "qty": 6,
    "status": "OPEN",
    "attributes": {
        "SUBTYPE": "PUT_TO_STORE"
    },
    "containerId": "P001",
    "containerType": "Tote",
    "locnNbr": 12,
    "upc": 234134,
    "updatedTime": "2019-02-26T08:39:36.000",
    "updatedBy": "user123",
    "createdTime": "2019-02-21T02:52:31.000",
    "createdBy": "User123",
    "parentId": 0
}


101	SPLIT	6	OPEN	SUBTYPE:PUT_TO_STORE	P001	Tote	12	234134	2019-02-26 13:39:36	user123	2019-02-21 07:52:31	User123

*/
