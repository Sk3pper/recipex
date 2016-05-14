/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-05-04 15:59:39 UTC)
 * on 2016-05-14 at 00:09:07 UTC 
 * Modify at your own risk.
 */

package com.appspot.recipex_1281.recipexServerApi.model;

/**
 * Model definition for MainUserMessagesMessage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the recipexServerApi. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MainUserMessagesMessage extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MainDefaultResponseMessage response;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("user_messages")
  private java.util.List<MainMessageInfoMessage> userMessages;

  /**
   * @return value or {@code null} for none
   */
  public MainDefaultResponseMessage getResponse() {
    return response;
  }

  /**
   * @param response response or {@code null} for none
   */
  public MainUserMessagesMessage setResponse(MainDefaultResponseMessage response) {
    this.response = response;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<MainMessageInfoMessage> getUserMessages() {
    return userMessages;
  }

  /**
   * @param userMessages userMessages or {@code null} for none
   */
  public MainUserMessagesMessage setUserMessages(java.util.List<MainMessageInfoMessage> userMessages) {
    this.userMessages = userMessages;
    return this;
  }

  @Override
  public MainUserMessagesMessage set(String fieldName, Object value) {
    return (MainUserMessagesMessage) super.set(fieldName, value);
  }

  @Override
  public MainUserMessagesMessage clone() {
    return (MainUserMessagesMessage) super.clone();
  }

}
