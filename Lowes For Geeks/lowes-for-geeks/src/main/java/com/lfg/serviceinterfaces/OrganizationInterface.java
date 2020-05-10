package com.lfg.serviceinterfaces;

import java.util.List;

import com.lfg.entities.Event;
import com.lfg.entities.Member;
import com.lfg.entities.MemberActivity;
import com.lfg.entities.Team;

public interface OrganizationInterface {
	void addMemberToOrganization(Member member);
	void addTeamToOrganization(Team team);
	boolean findMemberWithIdExists(int memberId);
	boolean findTeamWithIdExists(int teamId);
	void deleteMemberFromOrganization(Member member);
	void deleteTeamFromOrganization(Team team);
	void updateMemberInOrganization(Member member);
	void updateTeamInOrganization(Team team);
	Member getMemberWithId(int memberId);
	Team getTeamWithId(int teamId);
	List<Member> getAllMembersInOrganization();
	List<Team> getAllTeamsInOrganization();
	void obtainTheExistingMembers(List<Member> membersGroup);
	void obtainTheExistingTeams(List<Team> presentTeams);
	void obtainTheExistingEvents(List<Event> currentEvents);
	Event addEventToOrganization(int memberId,Event event);
	void deleteEventFromOrganization(Event event);
	boolean findEventWithIdExists(int eventId);
	Event getEventWithId(int eventId);
	List<Event> getAllEventsInOrganization();
	void updateEventInOrganization(Event event);
	void obtainTheMemberActivities(List<MemberActivity> allmemberActivities);
	void loadTheOrganizationAdmins();
	MemberActivity addMemberActivityToOrganization(int memberId);
	void deleteMemberActivityFromOrganization(int memberId);
	boolean isOrganizationAdmin(int memberId);
	MemberActivity theInitialAdminActivity();
	Member createTheOrganizationAdmin();
	boolean isMemberPartOfATeam(int memberId);
	MemberActivity mapTheMemberActivityToTeamAsAdmin(int memberId,int teamId);
	MemberActivity mapTheMemberActivityToTeamAsMember(int memberId,int teamId);
	MemberActivity getMemberActivityWithId(int memberId);
	void deleteExistingAndAddUpdatedActivity(int memberId, MemberActivity memberActivity);
	void addMemberActivityToOrganizationWithObject(MemberActivity memberActivity);
	boolean isMemberExistsInTeam(int memberId, int teamId);
	boolean isTeamAdmin(int memberId, int teamId);
	void removeMemberActivityFromTeam(int targetMemberId);
	List<MemberActivity> removeAllActivitiesInTeam(int teamId);
	boolean isOrganizationEvent(Event event);
	boolean isTeamEvent(Event event);
	boolean isPrivateEvent(Event event);
	boolean isMemberATeamAdmin(int memberId);
	void addAsOrganizationAdmin(int newMemberId);
	void removeAsOrganizationAdmin(Integer targetMemberId);
	boolean isInitialState();
	List<Event> markTheNonRecurringExpiredEvents();
	Event markEventExpired(Event currentEvent);
	boolean checkExpired(Event currentEvent);
	MemberActivity deleteFromParticipatedEventsOfMember(int memberId, int eventId);
	boolean AuthenticateEventCreation(Event event);
	boolean AuthenticateEventUpdation(Event currentEvent);
	boolean AuthenticateEventDeletion(Event event);
	Event incrementViews(int eventId);
	List<Event> getTrendingEvents();
	boolean isTrendingEvent(Event event);
	List<Event> getPopularEvents();
	boolean ispopularEvent(Event event);
	List<Event> getUpcomingEvents();
	boolean isUpcomingEvent(Event event);
	boolean didMemberLikeEvent(int memberId, int eventId);
	Event incrementLikes(int eventId);
	MemberActivity addToLikedEventsOfMember(int memberId, int eventId);
	Event decrementLikes(int eventId);
	MemberActivity deleteFromLikedEventsOfMember(int memberId, int eventId);
	boolean isMemberWatchingEvent(int memberId, int eventId);
	Event incrementWatches(int eventId);
	MemberActivity addToWatchedEventsOfMember(int memberId, int eventId);
	Event decrementWatches(int eventId);
	MemberActivity deleteFromWatchedEventsOfMember(int memberId, int eventId);
	boolean isMemberParticipatingInEvent(int memberId, int eventId);
	Event incrementParticipants(int eventId);
	MemberActivity addToPartcipatingEventsOfMember(int memberId, int eventId);
	Event decrementParticipants(int eventId);
	List<MemberActivity> filterOutActivitiesUponEventDeletion(int eventId);
	boolean AuthenticateTheMemberForTeamUpdate(int memberId, int teamId);
}