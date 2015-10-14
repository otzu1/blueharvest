/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blueharvest.geocaching.objects;

/**
 *
 * @author jmb
 * @since 2015-10-13
 */
public class image {

    private final java.net.URI uri;
    private final int rank;
    private final java.io.File file;

    public image(java.net.URI uri, int rank, java.io.File file) {
        this.uri = uri;
        this.rank = rank;
        this.file = file;
    }

    public java.net.URI getUri() {
        return uri;
    }

    public int getRank() {
        return rank;
    }

    public java.io.File getFile() {
        return file;
    }

}
