package com.jeffcaijf.ibm.odm.rest.restapi.client;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jeff on 2/27/17.
 */
public class RuleAppClient {

    /**
     * Get the highest version of the specified ruleapp
     *
     * @param ruleApp, ruleapp name
     * @return the highest version
     */
    public static double getHighestVersion(String ruleApp) {
        return 1.0;
    }

    public static List<String> getAllRuleApps() {
        return new ArrayList<String>();
    }

}
