package bca.killteamcompanion.entities;

import javax.persistence.*;

@Entity
@Table(name = "miniatures")
public class Miniature {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    //region Properties
    private Long id;

    private String nickName;

    private String officialName;

    private int movement;

    private int actionPointLimit;

    private int groupActivation;

    private int defense;

    private int save;

    private int wounds;

    @ManyToOne
    @JoinColumn(name = "ranged_weapon_id")
    private RangedWeapon rangedWeapon;

    @ManyToOne
    @JoinColumn(name = "melee_weapon_id")
    private MeleeWeapon meleeWeapon;
    //endregion
    //region Getters and Setters
    public void setMeleeWeapon(MeleeWeapon meleeWeapon) {
        this.meleeWeapon = meleeWeapon;
    }

    public MeleeWeapon getMeleeWeapon() {
        return meleeWeapon;
    }

    public void setRangedWeapon(RangedWeapon rangedWeapon) {
        this.rangedWeapon = rangedWeapon;
    }

    public RangedWeapon getRangedWeapon() {
        return rangedWeapon;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public int getMovement() {
        return movement;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }

    public int getActionPointLimit() {
        return actionPointLimit;
    }

    public void setActionPointLimit(int actionPointLimit) {
        this.actionPointLimit = actionPointLimit;
    }

    public int getGroupActivation() {
        return groupActivation;
    }

    public void setGroupActivation(int groupActivation) {
        this.groupActivation = groupActivation;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSave() {
        return save;
    }

    public void setSave(int save) {
        this.save = save;
    }

    public int getWounds() {
        return wounds;
    }

    public void setWounds(int wounds) {
        this.wounds = wounds;
    }
    //endregion
}