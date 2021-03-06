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
 * Message to return all the User's informations Summary: This message is intended for returning all
 * the informations stored for a specific User entity. Attributes: id = Datastore id of the User
 * entity email = User's email name = User's first name surname = User's last name birth = User's
 * birth pic = URL to User's profile pic sex = User's gender city = User's city address = User's
 * address personal_num = User's personal phone number relatives = List of UserMainInfoMessage
 * containing User's relatives main informations pc_physician = UserMainInfoMessage containing
 * User's PC Physician main informations visiting_nurse = UserMainInfoMessage containing Visiting
 * nurse main informations caregivers = List of UserMainInfoMessage containing User's generic
 * caregivers main informations field = Caregiver's field of specialization [REQUIRED] years_exp =
 * Caregiver's years of experience place = Caregiver's place of work business_num = Caregivers'
 * business phone number bio = Caregiver short biography available = Caregiver's available days of
 * the week patients = List of UserMainInfoMessage containing Caregiver's patients main informations
 * calendarId = Id of the User's Google Calendar used by the mobile application response =
 * DefaultResponseMessage containing the response
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the recipexServerApi. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MainUserInfoMessage extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String address;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String available;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bio;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String birth;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("business_num")
  private java.lang.String businessNum;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String calendarId;

  /**
   * Message to return User's main informations Summary: This message class is intended to return
   * the most important informations of a specific User entity. Attributes: id = Datastore id of the
   * User entity caregiver_id = Datastore id of the corresponding Caregiver entity [IF PRESENT] name
   * = Name of the User entity surname = Surname of the User entity email = Email of the User entity
   * pic = Profile pic of the User entity field = Field of specialization of the Caregiver entity
   * [IF PRESENT] calendarid = Google Calendar id of the User's calendar
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MainUserMainInfoMessage> caregivers;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String city;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String field;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Message to return User's main informations Summary: This message class is intended to return
   * the most important informations of a specific User entity. Attributes: id = Datastore id of the
   * User entity caregiver_id = Datastore id of the corresponding Caregiver entity [IF PRESENT] name
   * = Name of the User entity surname = Surname of the User entity email = Email of the User entity
   * pic = Profile pic of the User entity field = Field of specialization of the Caregiver entity
   * [IF PRESENT] calendarid = Google Calendar id of the User's calendar
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MainUserMainInfoMessage> patients;

  /**
   * Message to return User's main informations Summary: This message class is intended to return
   * the most important informations of a specific User entity. Attributes: id = Datastore id of the
   * User entity caregiver_id = Datastore id of the corresponding Caregiver entity [IF PRESENT] name
   * = Name of the User entity surname = Surname of the User entity email = Email of the User entity
   * pic = Profile pic of the User entity field = Field of specialization of the Caregiver entity
   * [IF PRESENT] calendarid = Google Calendar id of the User's calendar
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("pc_physician")
  private MainUserMainInfoMessage pcPhysician;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("personal_num")
  private java.lang.String personalNum;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pic;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String place;

  /**
   * Message to return User's main informations Summary: This message class is intended to return
   * the most important informations of a specific User entity. Attributes: id = Datastore id of the
   * User entity caregiver_id = Datastore id of the corresponding Caregiver entity [IF PRESENT] name
   * = Name of the User entity surname = Surname of the User entity email = Email of the User entity
   * pic = Profile pic of the User entity field = Field of specialization of the Caregiver entity
   * [IF PRESENT] calendarid = Google Calendar id of the User's calendar
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MainUserMainInfoMessage> relatives;

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
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sex;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String surname;

  /**
   * Message to return User's main informations Summary: This message class is intended to return
   * the most important informations of a specific User entity. Attributes: id = Datastore id of the
   * User entity caregiver_id = Datastore id of the corresponding Caregiver entity [IF PRESENT] name
   * = Name of the User entity surname = Surname of the User entity email = Email of the User entity
   * pic = Profile pic of the User entity field = Field of specialization of the Caregiver entity
   * [IF PRESENT] calendarid = Google Calendar id of the User's calendar
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("visiting_nurse")
  private MainUserMainInfoMessage visitingNurse;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("years_exp") @com.google.api.client.json.JsonString
  private java.lang.Long yearsExp;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAddress() {
    return address;
  }

  /**
   * @param address address or {@code null} for none
   */
  public MainUserInfoMessage setAddress(java.lang.String address) {
    this.address = address;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAvailable() {
    return available;
  }

  /**
   * @param available available or {@code null} for none
   */
  public MainUserInfoMessage setAvailable(java.lang.String available) {
    this.available = available;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getBio() {
    return bio;
  }

  /**
   * @param bio bio or {@code null} for none
   */
  public MainUserInfoMessage setBio(java.lang.String bio) {
    this.bio = bio;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getBirth() {
    return birth;
  }

  /**
   * @param birth birth or {@code null} for none
   */
  public MainUserInfoMessage setBirth(java.lang.String birth) {
    this.birth = birth;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getBusinessNum() {
    return businessNum;
  }

  /**
   * @param businessNum businessNum or {@code null} for none
   */
  public MainUserInfoMessage setBusinessNum(java.lang.String businessNum) {
    this.businessNum = businessNum;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCalendarId() {
    return calendarId;
  }

  /**
   * @param calendarId calendarId or {@code null} for none
   */
  public MainUserInfoMessage setCalendarId(java.lang.String calendarId) {
    this.calendarId = calendarId;
    return this;
  }

  /**
   * Message to return User's main informations Summary: This message class is intended to return
   * the most important informations of a specific User entity. Attributes: id = Datastore id of the
   * User entity caregiver_id = Datastore id of the corresponding Caregiver entity [IF PRESENT] name
   * = Name of the User entity surname = Surname of the User entity email = Email of the User entity
   * pic = Profile pic of the User entity field = Field of specialization of the Caregiver entity
   * [IF PRESENT] calendarid = Google Calendar id of the User's calendar
   * @return value or {@code null} for none
   */
  public java.util.List<MainUserMainInfoMessage> getCaregivers() {
    return caregivers;
  }

  /**
   * Message to return User's main informations Summary: This message class is intended to return
   * the most important informations of a specific User entity. Attributes: id = Datastore id of the
   * User entity caregiver_id = Datastore id of the corresponding Caregiver entity [IF PRESENT] name
   * = Name of the User entity surname = Surname of the User entity email = Email of the User entity
   * pic = Profile pic of the User entity field = Field of specialization of the Caregiver entity
   * [IF PRESENT] calendarid = Google Calendar id of the User's calendar
   * @param caregivers caregivers or {@code null} for none
   */
  public MainUserInfoMessage setCaregivers(java.util.List<MainUserMainInfoMessage> caregivers) {
    this.caregivers = caregivers;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCity() {
    return city;
  }

  /**
   * @param city city or {@code null} for none
   */
  public MainUserInfoMessage setCity(java.lang.String city) {
    this.city = city;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * @param email email or {@code null} for none
   */
  public MainUserInfoMessage setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getField() {
    return field;
  }

  /**
   * @param field field or {@code null} for none
   */
  public MainUserInfoMessage setField(java.lang.String field) {
    this.field = field;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public MainUserInfoMessage setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public MainUserInfoMessage setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Message to return User's main informations Summary: This message class is intended to return
   * the most important informations of a specific User entity. Attributes: id = Datastore id of the
   * User entity caregiver_id = Datastore id of the corresponding Caregiver entity [IF PRESENT] name
   * = Name of the User entity surname = Surname of the User entity email = Email of the User entity
   * pic = Profile pic of the User entity field = Field of specialization of the Caregiver entity
   * [IF PRESENT] calendarid = Google Calendar id of the User's calendar
   * @return value or {@code null} for none
   */
  public java.util.List<MainUserMainInfoMessage> getPatients() {
    return patients;
  }

  /**
   * Message to return User's main informations Summary: This message class is intended to return
   * the most important informations of a specific User entity. Attributes: id = Datastore id of the
   * User entity caregiver_id = Datastore id of the corresponding Caregiver entity [IF PRESENT] name
   * = Name of the User entity surname = Surname of the User entity email = Email of the User entity
   * pic = Profile pic of the User entity field = Field of specialization of the Caregiver entity
   * [IF PRESENT] calendarid = Google Calendar id of the User's calendar
   * @param patients patients or {@code null} for none
   */
  public MainUserInfoMessage setPatients(java.util.List<MainUserMainInfoMessage> patients) {
    this.patients = patients;
    return this;
  }

  /**
   * Message to return User's main informations Summary: This message class is intended to return
   * the most important informations of a specific User entity. Attributes: id = Datastore id of the
   * User entity caregiver_id = Datastore id of the corresponding Caregiver entity [IF PRESENT] name
   * = Name of the User entity surname = Surname of the User entity email = Email of the User entity
   * pic = Profile pic of the User entity field = Field of specialization of the Caregiver entity
   * [IF PRESENT] calendarid = Google Calendar id of the User's calendar
   * @return value or {@code null} for none
   */
  public MainUserMainInfoMessage getPcPhysician() {
    return pcPhysician;
  }

  /**
   * Message to return User's main informations Summary: This message class is intended to return
   * the most important informations of a specific User entity. Attributes: id = Datastore id of the
   * User entity caregiver_id = Datastore id of the corresponding Caregiver entity [IF PRESENT] name
   * = Name of the User entity surname = Surname of the User entity email = Email of the User entity
   * pic = Profile pic of the User entity field = Field of specialization of the Caregiver entity
   * [IF PRESENT] calendarid = Google Calendar id of the User's calendar
   * @param pcPhysician pcPhysician or {@code null} for none
   */
  public MainUserInfoMessage setPcPhysician(MainUserMainInfoMessage pcPhysician) {
    this.pcPhysician = pcPhysician;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPersonalNum() {
    return personalNum;
  }

  /**
   * @param personalNum personalNum or {@code null} for none
   */
  public MainUserInfoMessage setPersonalNum(java.lang.String personalNum) {
    this.personalNum = personalNum;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPic() {
    return pic;
  }

  /**
   * @param pic pic or {@code null} for none
   */
  public MainUserInfoMessage setPic(java.lang.String pic) {
    this.pic = pic;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPlace() {
    return place;
  }

  /**
   * @param place place or {@code null} for none
   */
  public MainUserInfoMessage setPlace(java.lang.String place) {
    this.place = place;
    return this;
  }

  /**
   * Message to return User's main informations Summary: This message class is intended to return
   * the most important informations of a specific User entity. Attributes: id = Datastore id of the
   * User entity caregiver_id = Datastore id of the corresponding Caregiver entity [IF PRESENT] name
   * = Name of the User entity surname = Surname of the User entity email = Email of the User entity
   * pic = Profile pic of the User entity field = Field of specialization of the Caregiver entity
   * [IF PRESENT] calendarid = Google Calendar id of the User's calendar
   * @return value or {@code null} for none
   */
  public java.util.List<MainUserMainInfoMessage> getRelatives() {
    return relatives;
  }

  /**
   * Message to return User's main informations Summary: This message class is intended to return
   * the most important informations of a specific User entity. Attributes: id = Datastore id of the
   * User entity caregiver_id = Datastore id of the corresponding Caregiver entity [IF PRESENT] name
   * = Name of the User entity surname = Surname of the User entity email = Email of the User entity
   * pic = Profile pic of the User entity field = Field of specialization of the Caregiver entity
   * [IF PRESENT] calendarid = Google Calendar id of the User's calendar
   * @param relatives relatives or {@code null} for none
   */
  public MainUserInfoMessage setRelatives(java.util.List<MainUserMainInfoMessage> relatives) {
    this.relatives = relatives;
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
  public MainUserInfoMessage setResponse(MainDefaultResponseMessage response) {
    this.response = response;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSex() {
    return sex;
  }

  /**
   * @param sex sex or {@code null} for none
   */
  public MainUserInfoMessage setSex(java.lang.String sex) {
    this.sex = sex;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSurname() {
    return surname;
  }

  /**
   * @param surname surname or {@code null} for none
   */
  public MainUserInfoMessage setSurname(java.lang.String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Message to return User's main informations Summary: This message class is intended to return
   * the most important informations of a specific User entity. Attributes: id = Datastore id of the
   * User entity caregiver_id = Datastore id of the corresponding Caregiver entity [IF PRESENT] name
   * = Name of the User entity surname = Surname of the User entity email = Email of the User entity
   * pic = Profile pic of the User entity field = Field of specialization of the Caregiver entity
   * [IF PRESENT] calendarid = Google Calendar id of the User's calendar
   * @return value or {@code null} for none
   */
  public MainUserMainInfoMessage getVisitingNurse() {
    return visitingNurse;
  }

  /**
   * Message to return User's main informations Summary: This message class is intended to return
   * the most important informations of a specific User entity. Attributes: id = Datastore id of the
   * User entity caregiver_id = Datastore id of the corresponding Caregiver entity [IF PRESENT] name
   * = Name of the User entity surname = Surname of the User entity email = Email of the User entity
   * pic = Profile pic of the User entity field = Field of specialization of the Caregiver entity
   * [IF PRESENT] calendarid = Google Calendar id of the User's calendar
   * @param visitingNurse visitingNurse or {@code null} for none
   */
  public MainUserInfoMessage setVisitingNurse(MainUserMainInfoMessage visitingNurse) {
    this.visitingNurse = visitingNurse;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getYearsExp() {
    return yearsExp;
  }

  /**
   * @param yearsExp yearsExp or {@code null} for none
   */
  public MainUserInfoMessage setYearsExp(java.lang.Long yearsExp) {
    this.yearsExp = yearsExp;
    return this;
  }

  @Override
  public MainUserInfoMessage set(String fieldName, Object value) {
    return (MainUserInfoMessage) super.set(fieldName, value);
  }

  @Override
  public MainUserInfoMessage clone() {
    return (MainUserInfoMessage) super.clone();
  }

}
