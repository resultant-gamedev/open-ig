/*
 * Copyright 2008-2012, David Karnok 
 * The file is part of the Open Imperium Galactica project.
 * 
 * The code should be distributed under the LGPL license.
 * See http://www.gnu.org/licenses/lgpl.html for details.
 */

package hu.openig.scripting;

import hu.openig.model.BattleInfo;
import hu.openig.model.Building;
import hu.openig.model.Chats.Chat;
import hu.openig.model.Chats.Node;
import hu.openig.model.Fleet;
import hu.openig.model.GameScripting;
import hu.openig.model.GroundwarWorld;
import hu.openig.model.InventoryItem;
import hu.openig.model.Objective;
import hu.openig.model.Planet;
import hu.openig.model.Player;
import hu.openig.model.ResearchType;
import hu.openig.model.SpacewarScriptResult;
import hu.openig.model.SpacewarWorld;
import hu.openig.model.VideoMessage;
import hu.openig.model.World;
import hu.openig.utils.XElement;

import java.util.List;

/**
 * The scripting supervising a skirmish game.
 * @author akarnokd, 2012.08.22.
 */
public class SkirmishScripting implements GameScripting {
	/** The world object. */
	protected World world;
	/** The player object. */
	protected Player player;
	@Override
	public void onResearched(Player player, ResearchType rt) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onProduced(Player player, ResearchType rt) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onDestroyed(Fleet winner, Fleet loser) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onColonized(Planet planet) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onConquered(Planet planet, Player previousOwner) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPlayerBeaten(Player player) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onDiscovered(Player player, Planet planet) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onDiscovered(Player player, Player other) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onDiscovered(Player player, Fleet fleet) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onLostSight(Player player, Fleet fleet) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFleetAt(Fleet fleet, double x, double y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFleetAt(Fleet fleet, Fleet other) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFleetAt(Fleet fleet, Planet planet) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStance(Player first, Player second) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onAllyAgainst(Player first, Player second, Player commonEnemy) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onBattleComplete(Player player, BattleInfo battle) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTime() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onBuildingComplete(Planet planet, Building building) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onRepairComplete(Planet planet, Building building) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onUpgrading(Planet planet, Building building, int newLevel) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onInventoryAdd(Planet planet, InventoryItem item) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onInventoryRemove(Planet planet, InventoryItem item) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onLost(Planet planet) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onLost(Fleet fleet) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onVideoComplete(String video) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onSoundComplete(String audio) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPlanetInfected(Planet planet) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPlanetCured(Planet planet) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onMessageSeen(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onNewGame() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onLevelChanged() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onSpacewarStart(SpacewarWorld war) {
		// TODO Auto-generated method stub

	}

	@Override
	public SpacewarScriptResult onSpacewarStep(SpacewarWorld war) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onSpacewarFinish(SpacewarWorld war) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onGroundwarStart(GroundwarWorld war) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onGroundwarStep(GroundwarWorld war) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onGroundwarFinish(GroundwarWorld war) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onAutobattleStart(BattleInfo battle) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onAutobattleFinish(BattleInfo battle) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTalkCompleted() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onDeploySatellite(Planet target, Player player,
			ResearchType satellite) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean fleetBlink(Fleet f) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onFleetsMoved() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onSpaceChat(SpacewarWorld world, Chat chat, Node node) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onRecordMessage() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<VideoMessage> getSendMessages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Objective> currentObjectives() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(Player player, XElement in) {
		this.player = player;
		this.world = player.world;
	}

	@Override
	public void done() {
		// TODO Auto-generated method stub

	}

	@Override
	public void load(XElement in) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(XElement out) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean mayControlFleet(Fleet f) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mayAutoSave() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void debug() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean mayPlayerAttack(Player player) {
		// TODO Auto-generated method stub
		return false;
	}

}