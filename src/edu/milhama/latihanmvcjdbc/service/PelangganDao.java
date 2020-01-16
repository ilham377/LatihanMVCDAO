/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.milhama.latihanmvcjdbc.service;

import edu.milhama.latihanmvcjdbc.entity.Pelanggan;
import edu.milhama.latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
 *
  * Nama : Muhammad Ilham Apriyadi
 * Kelas : IF2
 * NIM : 10118045
 */
public interface PelangganDao {
    
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void deletePelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(String email) throws PelangganException;
    
    public List<Pelanggan> SelectAllPelanggan() throws PelangganException;

}