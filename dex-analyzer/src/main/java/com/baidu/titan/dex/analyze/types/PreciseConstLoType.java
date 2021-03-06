/*
 * Copyright (C) Baidu Inc. All rights reserved.
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

package com.baidu.titan.dex.analyze.types;

/**
 * @author zhangdi07@baidu.com
 * @since 2017/12/27
 */
public class PreciseConstLoType extends ConstantType {

    public PreciseConstLoType(int id, int value) {
        super(id, value);
    }

    @Override
    public boolean isPreciseConstantLo() {
        return true;
    }

    @Override
    public String dump() {
        StringBuilder sb = new StringBuilder();
        int val = constantValueLo();
        sb.append("Precise ");
        if (val >= Short.MIN_VALUE && val <= Short.MAX_VALUE) {
            sb.append("Low-half Constant: " + val);
        } else {
            sb.append("Low-half Constant: " + val);
        }
        return sb.toString();
    }
}
