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
 * (build: 2016-05-27 16:00:31 UTC)
 * on 2016-07-06 at 19:30:55 UTC 
 * Modify at your own risk.
 */

package com.appspot.recipex_1281.recipexServerApi.model;

/**
 * Message to return a list of Requests Summary: This message class is intended to be a wrapper for
 * a response message which returns as additional payload a list of RequestInfoMessage. Attributes:
 * requests = List of RequestInfoMessage to be returned response = DefaultResponseMessage containing
 * the response
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the recipexServerApi. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MainUserRequestsMessage extends com.google.api.client.json.GenericJson {

  /**
   * Message to return all Request's informations Summary: This message class is intended to return
   * all the informations stored for a specific Request entity. Attributes: id = Datastore id of the
   * Request entity sender = Datastore id of the User sender entity of the Request receiver =
   * Datastore id of the User reveier entity of the Request kind = Request's kind role = Role of the
   * sender User's entity in the request [PRESENT IF KIND != RELATIVE] caregiver = Datastore id of
   * the Caregiver's entity [PRESENT IF KIND != RELATIVE] message = Text message of the Request
   * pending = Boolean value to track if the request is pending or not sender_pic = URL of the
   * sender User profile pic sender_name = Name of the sender User sender_surname = Surname of the
   * sender User sender_mail = E-Mail of the sender User calendarId = Google Calendar id of the
   * Sender User's Calendar [REQUIRED] response = DefaultREsponseMessage containing the response
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MainRequestInfoMessage> requests;

  /**
   * A generic response message Summary: This message class is intended for returning a generic
   * response. Attributes: code = HTTP code of the response [REQUIRED] message = Text message of the
   * response [REQUIRED] doOperation = Boolean value to determine if there's an operation to do
   * according to the response payload = Optional textual payload of the response user =
   * RegisterUserMessage of a related invocation
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MainDefaultResponseMessage response;

  /**
   * Message to return all Request's informations Summary: This message class is intended to return
   * all the informations stored for a specific Request entity. Attributes: id = Datastore id of the
   * Request entity sender = Datastore id of the User sender entity of the Request receiver =
   * Datastore id of the User reveier entity of the Request kind = Request's kind role = Role of the
   * sender User's entity in the request [PRESENT IF KIND != RELATIVE] caregiver = Datastore id of
   * the Caregiver's entity [PRESENT IF KIND != RELATIVE] message = Text message of the Request
   * pending = Boolean value to track if the request is pending or not sender_pic = URL of the
   * sender User profile pic sender_name = Name of the sender User sender_surname = Surname of the
   * sender User sender_mail = E-Mail of the sender User calendarId = Google Calendar id of the
   * Sender User's Calendar [REQUIRED] response = DefaultREsponseMessage containing the response
   * @return value or {@code null} for none
   */
  public java.util.List<MainRequestInfoMessage> getRequests() {
    return requests;
  }

  /**
   * Message to return all Request's informations Summary: This message class is intended to return
   * all the informations stored for a specific Request entity. Attributes: id = Datastore id of the
   * Request entity sender = Datastore id of the User sender entity of the Request receiver =
   * Datastore id of the User reveier entity of the Request kind = Request's kind role = Role of the
   * sender User's entity in the request [PRESENT IF KIND != RELATIVE] caregiver = Datastore id of
   * the Caregiver's entity [PRESENT IF KIND != RELATIVE] message = Text message of the Request
   * pending = Boolean value to track if the request is pending or not sender_pic = URL of the
   * sender User profile pic sender_name = Name of the sender User sender_surname = Surname of the
   * sender User sender_mail = E-Mail of the sender User calendarId = Google Calendar id of the
   * Sender User's Calendar [REQUIRED] response = DefaultREsponseMessage containing the response
   * @param requests requests or {@code null} for none
   */
  public MainUserRequestsMessage setRequests(java.util.List<MainRequestInfoMessage> requests) {
    this.requests = requests;
    return this;
  }

  /**
   * A generic response message Summary: This message class is intended for returning a generic
   * response. Attributes: code = HTTP code of the response [REQUIRED] message = Text message of the
   * response [REQUIRED] doOperation = Boolean value to determine if there's an operation to do
   * according to the response payload = Optional textual payload of the response user =
   * RegisterUserMessage of a related invocation
   * @return value or {@code null} for none
   */
  public MainDefaultResponseMessage getResponse() {
    return response;
  }

  /**
   * A generic response message Summary: This message class is intended for returning a generic
   * response. Attributes: code = HTTP code of the response [REQUIRED] message = Text message of the
   * response [REQUIRED] doOperation = Boolean value to determine if there's an operation to do
   * according to the response payload = Optional textual payload of the response user =
   * RegisterUserMessage of a related invocation
   * @param response response or {@code null} for none
   */
  public MainUserRequestsMessage setResponse(MainDefaultResponseMessage response) {
    this.response = response;
    return this;
  }

  @Override
  public MainUserRequestsMessage set(String fieldName, Object value) {
    return (MainUserRequestsMessage) super.set(fieldName, value);
  }

  @Override
  public MainUserRequestsMessage clone() {
    return (MainUserRequestsMessage) super.clone();
  }

}
