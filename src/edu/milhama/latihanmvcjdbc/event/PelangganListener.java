/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.milhama.latihanmvcjdbc.event;

import edu.milhama.latihanmvcjdbc.entity.Pelanggan;
import edu.milhama.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * Nama : Muhammad Ilham Apriyadi
 * Kelas : IF2
 * NIM : 10118045
 */
public interface PelangganListener {
    public void onChange(PelangganModel model);
    
    public void onInsert(Pelanggan pelanggan);
    
    public void onUpdate(Pelanggan pelanggan);

    public void onDelete();
}
