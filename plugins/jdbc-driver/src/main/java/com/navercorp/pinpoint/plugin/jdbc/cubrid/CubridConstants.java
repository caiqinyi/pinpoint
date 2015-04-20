/**
 * Copyright 2014 NAVER Corp.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.navercorp.pinpoint.plugin.jdbc.cubrid;

import static com.navercorp.pinpoint.common.HistogramSchema.*;
import static com.navercorp.pinpoint.common.ServiceTypeProperty.*;

import com.navercorp.pinpoint.common.ServiceType;

/**
 * @author Jongho Moon
 *
 */
public interface CubridConstants {
    public static final String GROUP_CUBRID = "GROUP_CUBRID";
    
    public static final ServiceType CUBRID = ServiceType.of(2400, "CUBRID", NORMAL_SCHEMA, TERMINAL, INCLUDE_DESTINATION_ID);
    public static final ServiceType CUBRID_EXECUTE_QUERY = ServiceType.of(2401, "CUBRID_EXECUTE_QUERY", "CUBRID", NORMAL_SCHEMA, TERMINAL, RECORD_STATISTICS, INCLUDE_DESTINATION_ID);
}