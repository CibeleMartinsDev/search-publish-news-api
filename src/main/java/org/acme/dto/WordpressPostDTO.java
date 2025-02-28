package org.acme.dto;

import java.time.LocalDateTime;
import java.util.List;

public class WordpressPostDTO {

    private LocalDateTime date;  // Data de publicação no fuso horário do site
    private LocalDateTime dateGmt;  // Data de publicação em GMT
    private String slug;  // Identificador alfanumérico único do post
    private String status;  // Status do post: publish, future, draft, pending, private
    private String password;  // Senha para proteger o acesso ao conteúdo e resumo
    private String title;  // Título do post
    private String content;  // Conteúdo do post
    private int author;  // ID do autor do post
    private String excerpt;  // Resumo do post
    private int featuredMedia;  // ID da mídia em destaque
    private String commentStatus;  // Status de comentários: open ou closed
    private String pingStatus;  // Status de ping: open ou closed
    private String format;  // Formato do post: standard, aside, chat, gallery, link, image, quote, status, video, audio
    private List<String> meta;  // Campos meta adicionais
    private boolean sticky;  // Se o post deve ser tratado como "sticky"
    private String template;  // Arquivo de tema a ser usado para exibir o post
    private List<String> categories;  // Categorias atribuídas ao post
    private List<String> tags;  // Tags atribuídas ao post

    // Getters e Setters

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public LocalDateTime getDateGmt() {
        return dateGmt;
    }

    public void setDateGmt(LocalDateTime dateGmt) {
        this.dateGmt = dateGmt;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public int getFeaturedMedia() {
        return featuredMedia;
    }

    public void setFeaturedMedia(int featuredMedia) {
        this.featuredMedia = featuredMedia;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public String getPingStatus() {
        return pingStatus;
    }

    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public List<String> getMeta() {
        return meta;
    }

    public void setMeta(List<String> meta) {
        this.meta = meta;
    }

    public boolean isSticky() {
        return sticky;
    }

    public void setSticky(boolean sticky) {
        this.sticky = sticky;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}