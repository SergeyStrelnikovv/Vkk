package domain;

import javax.swing.text.View;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private Copyright copyright;
    private int date;
    private String text;
    private Banner banner;
    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private Repost repost;
    private View view;
    private int canDelete;
    private Geo geo;
    private int signerId;
    private int canPin;
    private int canEdit;
    private int isPinned;
    private int postponedId;
}
