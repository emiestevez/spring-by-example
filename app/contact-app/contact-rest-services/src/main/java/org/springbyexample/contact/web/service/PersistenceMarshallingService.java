/*
 * Copyright 2007-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springbyexample.contact.web.service;

import org.springbyexample.schema.beans.entity.PkEntityBase;
import org.springbyexample.schema.beans.response.EntityFindResponseResult;
import org.springbyexample.schema.beans.response.EntityResponseResult;
import org.springbyexample.schema.beans.response.ResponseResult;


/**
 * Persistence find marshalling service.
 * 
 * @author David Winterfeldt
 * 
 *  @param   <R>      Generic response.
 *  @param   <FR>     Find response.
 *  @param   <S>      Save request.
 */
public interface PersistenceMarshallingService<R extends EntityResponseResult, FR extends EntityFindResponseResult, S extends PkEntityBase> 
        extends PersistenceFindMarshallingService<R, FR> {

    /**
     * Save record.
     */
    public R save(S request);
    
    /**
     * Update record.
     */
    public R update(S request);

    /**
     * Delete record.
     */
    public ResponseResult delete(long id);

    /**
     * Delete record.
     */
    public ResponseResult delete(S request);
    
}
