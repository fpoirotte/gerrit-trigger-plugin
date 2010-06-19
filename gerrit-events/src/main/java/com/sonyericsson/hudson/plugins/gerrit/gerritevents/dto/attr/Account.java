/*
 *  The MIT License
 *
 *  Copyright 2010 Sony Ericsson Mobile Communications.
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */
package com.sonyericsson.hudson.plugins.gerrit.gerritevents.dto.attr;

import com.sonyericsson.hudson.plugins.gerrit.gerritevents.dto.GerritJsonDTO;
import static com.sonyericsson.hudson.plugins.gerrit.gerritevents.GerritJsonEventFactory.getString;
import net.sf.json.JSONObject;

import static com.sonyericsson.hudson.plugins.gerrit.gerritevents.dto.GerritEventKeys.NAME;
import static com.sonyericsson.hudson.plugins.gerrit.gerritevents.dto.GerritEventKeys.EMAIL;

/**
 * Represents a Gerrit JSON Account DTO.
 * An account that is related to an event or attribute.
 * @author Robert Sandell &lt;robert.sandell@sonyericsson.com&gt;
 */
public class Account implements GerritJsonDTO {

    /**
     * Account user's full name.
     */
    private String name;
    /**
     * Account user's preferred email.
     */
    private String email;

    /**
     * Default constructor.
     */
    public Account() {
    }

    /**
     * Constructor that fills with data directly.
     * @see #fromJson(net.sf.json.JSONObject)
     * @param json the JSON Object with data.
     */
    public Account(JSONObject json) {
        this.fromJson(json);
    }

    @Override
    public void fromJson(JSONObject json) {
        name = getString(json, NAME);
        email = getString(json, EMAIL);
    }

    /**
     * Account user's preferred email.
     * @return the email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Account user's preferred email.
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Account user's full name.
     * @return the name.
     */
    public String getName() {
        return name;
    }

    /**
     * Account user's full name.
     * @param name the full name
     */
    public void setName(String name) {
        this.name = name;
    }
}