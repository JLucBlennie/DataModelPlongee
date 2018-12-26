package org.jlb.plongee.datamodel.tests;

import java.text.MessageFormat;
import java.util.Map;

import org.jlb.plongee.datamodel.table.haldane.OrdiTableMN90;

/**
 * Classe de test de l'ordinateur Haldane.
 * 
 * @author JLuc
 *
 */
public class DebugHaldane {

    /**
     * Constructeur.
     */
    public DebugHaldane() {

    }

    /**
     * Test avec les tables MN90.
     */
    public void testPlongeesSimplesHaldane() {
        // 6m
        testPlongeeHaldane(6, 15, 0, 0, 0, 0, 0, 1, "A");
        testPlongeeHaldane(6, 30, 0, 0, 0, 0, 0, 1, "B");
        testPlongeeHaldane(6, 45, 0, 0, 0, 0, 0, 1, "C");
        testPlongeeHaldane(6, 60 + 15, 0, 0, 0, 0, 0, 1, "D");
        testPlongeeHaldane(6, 60 + 45, 0, 0, 0, 0, 0, 1, "E");
        testPlongeeHaldane(6, 2 * 60 + 15, 0, 0, 0, 0, 0, 1, "F");
        testPlongeeHaldane(6, 3 * 60, 0, 0, 0, 0, 0, 1, "G");
        testPlongeeHaldane(6, 4 * 60, 0, 0, 0, 0, 0, 1, "H");
        testPlongeeHaldane(6, 5 * 60 + 15, 0, 0, 0, 0, 0, 1, "I");
        testPlongeeHaldane(6, 6 * 60, 0, 0, 0, 0, 0, 1, "J");
        // 8m
        testPlongeeHaldane(8, 15, 0, 0, 0, 0, 0, 1, "B");
        testPlongeeHaldane(8, 30, 0, 0, 0, 0, 0, 1, "C");
        testPlongeeHaldane(8, 45, 0, 0, 0, 0, 0, 1, "D");
        testPlongeeHaldane(8, 60, 0, 0, 0, 0, 0, 1, "E");
        testPlongeeHaldane(8, 60 + 30, 0, 0, 0, 0, 0, 1, "F");
        testPlongeeHaldane(8, 60 + 45, 0, 0, 0, 0, 0, 1, "G");
        testPlongeeHaldane(8, 2 * 60 + 15, 0, 0, 0, 0, 0, 1, "H");
        testPlongeeHaldane(8, 2 * 60 + 45, 0, 0, 0, 0, 0, 1, "I");
        testPlongeeHaldane(8, 3 * 60 + 15, 0, 0, 0, 0, 0, 1, "J");
        testPlongeeHaldane(8, 4 * 60 + 15, 0, 0, 0, 0, 0, 1, "K");
        testPlongeeHaldane(8, 5 * 60, 0, 0, 0, 0, 0, 1, "L");
        testPlongeeHaldane(8, 6 * 60, 0, 0, 0, 0, 0, 1, "M");
        // 10m
        testPlongeeHaldane(10, 15, 0, 0, 0, 0, 0, 1, "B");
        testPlongeeHaldane(10, 30, 0, 0, 0, 0, 0, 1, "C");
        testPlongeeHaldane(10, 45, 0, 0, 0, 0, 0, 1, "D");
        testPlongeeHaldane(10, 60, 0, 0, 0, 0, 0, 1, "F");
        testPlongeeHaldane(10, 60 + 15, 0, 0, 0, 0, 0, 1, "G");
        testPlongeeHaldane(10, 60 + 45, 0, 0, 0, 0, 0, 1, "H");
        testPlongeeHaldane(10, 2 * 60, 0, 0, 0, 0, 0, 1, "I");
        testPlongeeHaldane(10, 2 * 60 + 15, 0, 0, 0, 0, 0, 1, "J");
        testPlongeeHaldane(10, 2 * 60 + 45, 0, 0, 0, 0, 0, 1, "K");
        testPlongeeHaldane(10, 3 * 60, 0, 0, 0, 0, 0, 1, "L");
        testPlongeeHaldane(10, 4 * 60, 0, 0, 0, 0, 0, 1, "M");
        testPlongeeHaldane(10, 4 * 60 + 15, 0, 0, 0, 0, 0, 1, "N");
        testPlongeeHaldane(10, 5 * 60 + 15, 0, 0, 0, 0, 0, 1, "O");
        testPlongeeHaldane(10, 5 * 60 + 30, 0, 0, 0, 0, 0, 1, "P");
        testPlongeeHaldane(10, 6 * 60, 0, 0, 0, 0, 1, 2, "P");
        // 12m
        testPlongeeHaldane(12, 5, 0, 0, 0, 0, 0, 1, "A");
        testPlongeeHaldane(12, 10, 0, 0, 0, 0, 0, 1, "B");
        testPlongeeHaldane(12, 15, 0, 0, 0, 0, 0, 1, "B");
        testPlongeeHaldane(12, 20, 0, 0, 0, 0, 0, 1, "C");
        testPlongeeHaldane(12, 25, 0, 0, 0, 0, 0, 1, "C");
        testPlongeeHaldane(12, 30, 0, 0, 0, 0, 0, 1, "D");
        testPlongeeHaldane(12, 35, 0, 0, 0, 0, 0, 1, "D");
        testPlongeeHaldane(12, 40, 0, 0, 0, 0, 0, 1, "E");
        testPlongeeHaldane(12, 45, 0, 0, 0, 0, 0, 1, "E");
        testPlongeeHaldane(12, 50, 0, 0, 0, 0, 0, 1, "F");
        testPlongeeHaldane(12, 55, 0, 0, 0, 0, 0, 1, "F");
        testPlongeeHaldane(12, 60, 0, 0, 0, 0, 0, 1, "G");
        testPlongeeHaldane(12, 60 + 5, 0, 0, 0, 0, 0, 1, "G");
        testPlongeeHaldane(12, 60 + 10, 0, 0, 0, 0, 0, 1, "H");
        testPlongeeHaldane(12, 60 + 15, 0, 0, 0, 0, 0, 1, "H");
        testPlongeeHaldane(12, 60 + 20, 0, 0, 0, 0, 0, 1, "H");
        testPlongeeHaldane(12, 60 + 25, 0, 0, 0, 0, 0, 1, "I");
        testPlongeeHaldane(12, 60 + 30, 0, 0, 0, 0, 0, 1, "I");
        testPlongeeHaldane(12, 60 + 35, 0, 0, 0, 0, 0, 1, "J");
        testPlongeeHaldane(12, 60 + 40, 0, 0, 0, 0, 0, 1, "J");
        testPlongeeHaldane(12, 60 + 45, 0, 0, 0, 0, 0, 1, "J");
        testPlongeeHaldane(12, 60 + 50, 0, 0, 0, 0, 0, 1, "K");
        testPlongeeHaldane(12, 60 + 55, 0, 0, 0, 0, 0, 1, "K");
        testPlongeeHaldane(12, 2 * 60, 0, 0, 0, 0, 0, 1, "K");
        testPlongeeHaldane(12, 2 * 60 + 10, 0, 0, 0, 0, 0, 1, "L");
        testPlongeeHaldane(12, 2 * 60 + 15, 0, 0, 0, 0, 0, 1, "L");
        testPlongeeHaldane(12, 2 * 60 + 20, 0, 0, 0, 0, 2, 4, "L");
        testPlongeeHaldane(12, 2 * 60 + 30, 0, 0, 0, 0, 4, 6, "M");
        testPlongeeHaldane(12, 2 * 60 + 40, 0, 0, 0, 0, 6, 8, "M");
        testPlongeeHaldane(12, 2 * 60 + 50, 0, 0, 0, 0, 7, 9, "N");
        testPlongeeHaldane(12, 3 * 60, 0, 0, 0, 0, 9, 11, "N");
        testPlongeeHaldane(12, 3 * 60 + 10, 0, 0, 0, 0, 11, 13, "N");
        testPlongeeHaldane(12, 3 * 60 + 20, 0, 0, 0, 0, 13, 15, "O");
        testPlongeeHaldane(12, 3 * 60 + 30, 0, 0, 0, 0, 14, 16, "O");
        testPlongeeHaldane(12, 3 * 60 + 40, 0, 0, 0, 0, 15, 17, "O");
        testPlongeeHaldane(12, 3 * 60 + 50, 0, 0, 0, 0, 16, 18, "O");
        testPlongeeHaldane(12, 4 * 60, 0, 0, 0, 0, 17, 19, "O");
        testPlongeeHaldane(12, 4 * 60 + 10, 0, 0, 0, 0, 18, 20, "P");
        testPlongeeHaldane(12, 4 * 60 + 15, 0, 0, 0, 0, 19, 21, "P");
        testPlongeeHaldane(12, 4 * 60 + 30, 0, 0, 0, 0, 22, 24, "P");
        // 15m
        testPlongeeHaldane(15, 5, 0, 0, 0, 0, 0, 1, "A");
        testPlongeeHaldane(15, 10, 0, 0, 0, 0, 0, 1, "B");
        testPlongeeHaldane(15, 15, 0, 0, 0, 0, 0, 1, "C");
        testPlongeeHaldane(15, 20, 0, 0, 0, 0, 0, 1, "C");
        testPlongeeHaldane(15, 25, 0, 0, 0, 0, 0, 1, "D");
        testPlongeeHaldane(15, 30, 0, 0, 0, 0, 0, 1, "E");
        testPlongeeHaldane(15, 35, 0, 0, 0, 0, 0, 1, "E");
        testPlongeeHaldane(15, 40, 0, 0, 0, 0, 0, 1, "F");
        testPlongeeHaldane(15, 45, 0, 0, 0, 0, 0, 1, "G");
        testPlongeeHaldane(15, 50, 0, 0, 0, 0, 0, 1, "G");
        testPlongeeHaldane(15, 55, 0, 0, 0, 0, 0, 1, "H");
        testPlongeeHaldane(15, 60, 0, 0, 0, 0, 0, 1, "H");
        testPlongeeHaldane(15, 60 + 5, 0, 0, 0, 0, 0, 1, "I");
        testPlongeeHaldane(15, 60 + 10, 0, 0, 0, 0, 0, 1, "I");
        testPlongeeHaldane(15, 60 + 15, 0, 0, 0, 0, 0, 1, "J");
        testPlongeeHaldane(15, 60 + 20, 0, 0, 0, 0, 2, 4, "J");
        testPlongeeHaldane(15, 60 + 25, 0, 0, 0, 0, 4, 6, "K");
        testPlongeeHaldane(15, 60 + 30, 0, 0, 0, 0, 6, 8, "K");
        testPlongeeHaldane(15, 60 + 35, 0, 0, 0, 0, 8, 10, "L");
        testPlongeeHaldane(15, 60 + 40, 0, 0, 0, 0, 11, 13, "L");
        testPlongeeHaldane(15, 60 + 45, 0, 0, 0, 0, 13, 15, "L");
        testPlongeeHaldane(15, 60 + 50, 0, 0, 0, 0, 15, 17, "M");
        testPlongeeHaldane(15, 60 + 55, 0, 0, 0, 0, 17, 19, "M");
        testPlongeeHaldane(15, 2 * 60, 0, 0, 0, 0, 18, 20, "M");
        // 18m
        testPlongeeHaldane(18, 5, 0, 0, 0, 0, 0, 2, "B");
        testPlongeeHaldane(18, 10, 0, 0, 0, 0, 0, 2, "B");
        testPlongeeHaldane(18, 15, 0, 0, 0, 0, 0, 2, "C");
        testPlongeeHaldane(18, 20, 0, 0, 0, 0, 0, 2, "D");
        testPlongeeHaldane(18, 25, 0, 0, 0, 0, 0, 2, "E");
        testPlongeeHaldane(18, 30, 0, 0, 0, 0, 0, 2, "F");
        testPlongeeHaldane(18, 35, 0, 0, 0, 0, 0, 2, "F");
        testPlongeeHaldane(18, 40, 0, 0, 0, 0, 0, 2, "G");
        testPlongeeHaldane(18, 45, 0, 0, 0, 0, 0, 2, "H");
        testPlongeeHaldane(18, 50, 0, 0, 0, 0, 0, 2, "H");
        testPlongeeHaldane(18, 55, 0, 0, 0, 0, 1, 3, "I");
        testPlongeeHaldane(18, 60, 0, 0, 0, 0, 5, 7, "J");
        testPlongeeHaldane(18, 60 + 5, 0, 0, 0, 0, 8, 10, "J");
        testPlongeeHaldane(18, 60 + 10, 0, 0, 0, 0, 11, 13, "K");
        testPlongeeHaldane(18, 60 + 15, 0, 0, 0, 0, 14, 16, "K");
        testPlongeeHaldane(18, 60 + 20, 0, 0, 0, 0, 17, 19, "L");
        testPlongeeHaldane(18, 60 + 25, 0, 0, 0, 0, 21, 23, "L");
        testPlongeeHaldane(18, 60 + 30, 0, 0, 0, 0, 23, 25, "M");
        testPlongeeHaldane(18, 60 + 35, 0, 0, 0, 0, 26, 28, "M");
        testPlongeeHaldane(18, 60 + 40, 0, 0, 0, 0, 28, 30, "M");
        testPlongeeHaldane(18, 60 + 45, 0, 0, 0, 0, 31, 33, "N");
        testPlongeeHaldane(18, 60 + 50, 0, 0, 0, 0, 34, 36, "N");
        testPlongeeHaldane(18, 60 + 55, 0, 0, 0, 0, 36, 38, "N");
        testPlongeeHaldane(18, 2 * 60, 0, 0, 0, 0, 38, 40, "O");
        // 20m
        testPlongeeHaldane(20, 5, 0, 0, 0, 0, 0, 2, "B");
        testPlongeeHaldane(20, 10, 0, 0, 0, 0, 0, 2, "B");
        testPlongeeHaldane(20, 15, 0, 0, 0, 0, 0, 2, "D");
        testPlongeeHaldane(20, 20, 0, 0, 0, 0, 0, 2, "D");
        testPlongeeHaldane(20, 25, 0, 0, 0, 0, 0, 2, "E");
        testPlongeeHaldane(20, 30, 0, 0, 0, 0, 0, 2, "F");
        testPlongeeHaldane(20, 35, 0, 0, 0, 0, 0, 2, "G");
        testPlongeeHaldane(20, 40, 0, 0, 0, 0, 0, 2, "H");
        testPlongeeHaldane(20, 45, 0, 0, 0, 0, 1, 3, "I");
        testPlongeeHaldane(20, 50, 0, 0, 0, 0, 4, 6, "I");
        testPlongeeHaldane(20, 55, 0, 0, 0, 0, 9, 11, "J");
        testPlongeeHaldane(20, 60, 0, 0, 0, 0, 13, 15, "K");
        testPlongeeHaldane(20, 60 + 5, 0, 0, 0, 0, 16, 18, "K");
        testPlongeeHaldane(20, 60 + 10, 0, 0, 0, 0, 20, 22, "L");
        testPlongeeHaldane(20, 60 + 15, 0, 0, 0, 0, 24, 26, "L");
        testPlongeeHaldane(20, 60 + 20, 0, 0, 0, 0, 27, 29, "M");
        testPlongeeHaldane(20, 60 + 25, 0, 0, 0, 0, 30, 32, "M");
        testPlongeeHaldane(20, 60 + 30, 0, 0, 0, 0, 34, 36, "M");
        // 22m
        testPlongeeHaldane(22, 5, 0, 0, 0, 0, 0, 2, "B");
        testPlongeeHaldane(22, 10, 0, 0, 0, 0, 0, 2, "C");
        testPlongeeHaldane(22, 15, 0, 0, 0, 0, 0, 2, "D");
        testPlongeeHaldane(22, 20, 0, 0, 0, 0, 0, 2, "E");
        testPlongeeHaldane(22, 25, 0, 0, 0, 0, 0, 2, "F");
        testPlongeeHaldane(22, 30, 0, 0, 0, 0, 0, 2, "G");
        testPlongeeHaldane(22, 35, 0, 0, 0, 0, 0, 2, "H");
        testPlongeeHaldane(22, 40, 0, 0, 0, 0, 2, 4, "I");
        testPlongeeHaldane(22, 45, 0, 0, 0, 0, 7, 9, "I");
        testPlongeeHaldane(22, 50, 0, 0, 0, 0, 12, 14, "J");
        testPlongeeHaldane(22, 55, 0, 0, 0, 0, 16, 18, "K");
        testPlongeeHaldane(22, 60, 0, 0, 0, 0, 20, 22, "K");
        testPlongeeHaldane(22, 60 + 5, 0, 0, 0, 0, 25, 27, "L");
        testPlongeeHaldane(22, 60 + 10, 0, 0, 0, 0, 29, 31, "L");
        testPlongeeHaldane(22, 60 + 15, 0, 0, 0, 0, 33, 35, "M");
        testPlongeeHaldane(22, 60 + 20, 0, 0, 0, 0, 37, 39, "M");
        testPlongeeHaldane(22, 60 + 25, 0, 0, 0, 0, 41, 43, "N");
        testPlongeeHaldane(22, 60 + 30, 0, 0, 0, 0, 44, 46, "N");
        // 25m
        testPlongeeHaldane(25, 5, 0, 0, 0, 0, 0, 2, "B");
        testPlongeeHaldane(25, 10, 0, 0, 0, 0, 0, 2, "C");
        testPlongeeHaldane(25, 15, 0, 0, 0, 0, 0, 2, "D");
        testPlongeeHaldane(25, 20, 0, 0, 0, 0, 0, 2, "E");
        testPlongeeHaldane(25, 25, 0, 0, 0, 0, 1, 3, "F");
        testPlongeeHaldane(25, 30, 0, 0, 0, 0, 2, 4, "H");
        testPlongeeHaldane(25, 35, 0, 0, 0, 0, 5, 7, "I");
        testPlongeeHaldane(25, 40, 0, 0, 0, 0, 10, 12, "J");
        testPlongeeHaldane(25, 45, 0, 0, 0, 0, 16, 18, "J");
        testPlongeeHaldane(25, 50, 0, 0, 0, 0, 21, 23, "K");
        testPlongeeHaldane(25, 55, 0, 0, 0, 0, 27, 29, "L");
        testPlongeeHaldane(25, 60, 0, 0, 0, 0, 32, 34, "L");
        testPlongeeHaldane(25, 60 + 5, 0, 0, 0, 0, 37, 39, "M");
        testPlongeeHaldane(25, 60 + 10, 0, 0, 0, 1, 41, 45, "M");
        testPlongeeHaldane(25, 60 + 15, 0, 0, 0, 4, 43, 50, "N");
        testPlongeeHaldane(25, 60 + 20, 0, 0, 0, 7, 45, 55, "N");
        testPlongeeHaldane(25, 60 + 25, 0, 0, 0, 9, 48, 60, "O");
        testPlongeeHaldane(25, 60 + 30, 0, 0, 0, 11, 50, 64, "O");
        // 28m
        testPlongeeHaldane(28, 5, 0, 0, 0, 0, 0, 2, "B");
        testPlongeeHaldane(28, 10, 0, 0, 0, 0, 0, 2, "D");
        testPlongeeHaldane(28, 15, 0, 0, 0, 0, 0, 2, "E");
        testPlongeeHaldane(28, 20, 0, 0, 0, 0, 1, 4, "F");
        testPlongeeHaldane(28, 25, 0, 0, 0, 0, 2, 5, "G");
        testPlongeeHaldane(28, 30, 0, 0, 0, 0, 6, 9, "H");
        testPlongeeHaldane(28, 35, 0, 0, 0, 0, 12, 15, "I");
        testPlongeeHaldane(28, 40, 0, 0, 0, 0, 19, 22, "J");
        testPlongeeHaldane(28, 45, 0, 0, 0, 0, 25, 28, "K");
        testPlongeeHaldane(28, 50, 0, 0, 0, 0, 32, 35, "L");
        testPlongeeHaldane(28, 55, 0, 0, 0, 2, 36, 41, "M");
        testPlongeeHaldane(28, 60, 0, 0, 0, 4, 40, 47, "M");
        testPlongeeHaldane(28, 60 + 5, 0, 0, 0, 8, 43, 54, "N");
        testPlongeeHaldane(28, 60 + 10, 0, 0, 0, 11, 46, 60, "N");
        testPlongeeHaldane(28, 60 + 15, 0, 0, 0, 14, 48, 65, "O");
        testPlongeeHaldane(28, 60 + 20, 0, 0, 0, 17, 50, 70, "O");
        testPlongeeHaldane(28, 60 + 25, 0, 0, 0, 20, 53, 76, "O");
        testPlongeeHaldane(28, 60 + 30, 0, 0, 0, 23, 56, 82, "P");
        // 30m
        testPlongeeHaldane(30, 5, 0, 0, 0, 0, 0, 2, "B");
        testPlongeeHaldane(30, 10, 0, 0, 0, 0, 0, 2, "D");
        testPlongeeHaldane(30, 15, 0, 0, 0, 0, 1, 4, "E");
        testPlongeeHaldane(30, 20, 0, 0, 0, 0, 2, 5, "F");
        testPlongeeHaldane(30, 25, 0, 0, 0, 0, 4, 7, "H");
        testPlongeeHaldane(30, 30, 0, 0, 0, 0, 9, 12, "I");
        testPlongeeHaldane(30, 35, 0, 0, 0, 0, 17, 20, "J");
        testPlongeeHaldane(30, 40, 0, 0, 0, 0, 24, 27, "K");
        testPlongeeHaldane(30, 45, 0, 0, 0, 1, 31, 35, "L");
        testPlongeeHaldane(30, 50, 0, 0, 0, 3, 36, 42, "M");
        testPlongeeHaldane(30, 55, 0, 0, 0, 6, 39, 48, "M");
        testPlongeeHaldane(30, 60, 0, 0, 0, 10, 43, 56, "N");
        testPlongeeHaldane(30, 60 + 5, 0, 0, 0, 14, 46, 63, "N");
        testPlongeeHaldane(30, 60 + 10, 0, 0, 0, 17, 48, 68, "O");
        // 32m
        testPlongeeHaldane(32, 5, 0, 0, 0, 0, 0, 3, "B");
        testPlongeeHaldane(32, 10, 0, 0, 0, 0, 0, 3, "D");
        testPlongeeHaldane(32, 15, 0, 0, 0, 0, 1, 4, "E");
        testPlongeeHaldane(32, 20, 0, 0, 0, 0, 3, 6, "G");
        testPlongeeHaldane(32, 25, 0, 0, 0, 0, 6, 9, "H");
        testPlongeeHaldane(32, 30, 0, 0, 0, 0, 14, 17, "I");
        testPlongeeHaldane(32, 35, 0, 0, 0, 0, 22, 25, "K");
        testPlongeeHaldane(32, 40, 0, 0, 0, 1, 29, 33, "K");
        testPlongeeHaldane(32, 45, 0, 0, 0, 4, 34, 41, "L");
        testPlongeeHaldane(32, 50, 0, 0, 0, 7, 39, 49, "M");
        testPlongeeHaldane(32, 55, 0, 0, 0, 11, 43, 57, "N");
        testPlongeeHaldane(32, 60, 0, 0, 0, 15, 46, 64, "N");
        testPlongeeHaldane(32, 60 + 5, 0, 0, 0, 19, 48, 70, "O");
        testPlongeeHaldane(32, 60 + 10, 0, 0, 0, 23, 50, 76, "O");
        // 35m
        testPlongeeHaldane(35, 5, 0, 0, 0, 0, 0, 3, "C");
        testPlongeeHaldane(35, 10, 0, 0, 0, 0, 0, 3, "D");
        testPlongeeHaldane(35, 15, 0, 0, 0, 0, 2, 5, "F");
        testPlongeeHaldane(35, 20, 0, 0, 0, 0, 5, 8, "H");
        testPlongeeHaldane(35, 25, 0, 0, 0, 0, 11, 14, "I");
        testPlongeeHaldane(35, 30, 0, 0, 0, 1, 20, 24, "J");
        testPlongeeHaldane(35, 35, 0, 0, 0, 2, 27, 32, "K");
        testPlongeeHaldane(35, 40, 0, 0, 0, 5, 34, 42, "L");
        testPlongeeHaldane(35, 45, 0, 0, 0, 9, 39, 51, "M");
        testPlongeeHaldane(35, 50, 0, 0, 0, 14, 43, 60, "N");
        testPlongeeHaldane(35, 55, 0, 0, 0, 18, 47, 68, "N");
        testPlongeeHaldane(35, 60, 0, 0, 0, 22, 50, 75, "O");
        testPlongeeHaldane(35, 60 + 5, 0, 0, 2, 26, 52, 84, "*");
        testPlongeeHaldane(35, 60 + 10, 0, 0, 4, 28, 57, 93, "*");
        // 38m
        testPlongeeHaldane(38, 5, 0, 0, 0, 0, 0, 3, "C");
        testPlongeeHaldane(38, 10, 0, 0, 0, 0, 1, 4, "E");
        testPlongeeHaldane(38, 15, 0, 0, 0, 0, 4, 7, "F");
        testPlongeeHaldane(38, 20, 0, 0, 0, 0, 8, 11, "H");
        testPlongeeHaldane(38, 25, 0, 0, 0, 1, 16, 21, "J");
        testPlongeeHaldane(38, 30, 0, 0, 0, 3, 24, 31, "K");
        testPlongeeHaldane(38, 35, 0, 0, 0, 5, 33, 42, "L");
        testPlongeeHaldane(38, 40, 0, 0, 0, 10, 38, 52, "M");
        testPlongeeHaldane(38, 45, 0, 0, 0, 15, 43, 62, "N");
        testPlongeeHaldane(38, 50, 0, 0, 0, 20, 47, 71, "N");
        testPlongeeHaldane(38, 55, 0, 0, 2, 23, 50, 79, "O");
        testPlongeeHaldane(38, 60, 0, 0, 5, 27, 53, 89, "P");
        testPlongeeHaldane(38, 60 + 5, 0, 0, 8, 29, 58, 99, "*");
        testPlongeeHaldane(38, 60 + 10, 0, 0, 11, 31, 62, 108, "*");
        // 40m
        testPlongeeHaldane(40, 5, 0, 0, 0, 0, 0, 3, "C");
        testPlongeeHaldane(40, 10, 0, 0, 0, 0, 2, 5, "E");
        testPlongeeHaldane(40, 15, 0, 0, 0, 0, 4, 7, "G");
        testPlongeeHaldane(40, 20, 0, 0, 0, 1, 9, 14, "H");
        testPlongeeHaldane(40, 25, 0, 0, 0, 2, 19, 25, "J");
        testPlongeeHaldane(40, 30, 0, 0, 0, 4, 28, 36, "K");
        testPlongeeHaldane(40, 35, 0, 0, 0, 8, 35, 47, "L");
        testPlongeeHaldane(40, 40, 0, 0, 0, 13, 40, 57, "M");
        testPlongeeHaldane(40, 45, 0, 0, 1, 18, 45, 68, "N");
        testPlongeeHaldane(40, 50, 0, 0, 2, 23, 48, 77, "O");
        testPlongeeHaldane(40, 55, 0, 0, 5, 26, 52, 87, "O");
        testPlongeeHaldane(40, 60, 0, 0, 8, 29, 57, 98, "P");
        testPlongeeHaldane(40, 60 + 5, 0, 0, 12, 31, 61, 108, "*");
        testPlongeeHaldane(40, 60 + 10, 0, 0, 15, 33, 66, 118, "*");
        // 42m
        testPlongeeHaldane(42, 5, 0, 0, 0, 0, 0, 3, "C");
        testPlongeeHaldane(42, 10, 0, 0, 0, 0, 2, 6, "E");
        testPlongeeHaldane(42, 15, 0, 0, 0, 0, 5, 9, "G");
        testPlongeeHaldane(42, 20, 0, 0, 0, 1, 12, 17, "I");
        testPlongeeHaldane(42, 25, 0, 0, 0, 3, 22, 29, "J");
        testPlongeeHaldane(42, 30, 0, 0, 0, 6, 31, 41, "L");
        testPlongeeHaldane(42, 35, 0, 0, 0, 11, 37, 52, "M");
        testPlongeeHaldane(42, 40, 0, 0, 1, 16, 43, 64, "N");
        testPlongeeHaldane(42, 45, 0, 0, 3, 21, 47, 75, "*");
        testPlongeeHaldane(42, 50, 0, 0, 6, 24, 50, 84, "*");
        testPlongeeHaldane(42, 55, 0, 0, 8, 29, 55, 96, "*");
        testPlongeeHaldane(42, 60, 0, 0, 13, 30, 60, 107, "*");
        // 45m
        testPlongeeHaldane(45, 5, 0, 0, 0, 0, 0, 3, "C");
        testPlongeeHaldane(45, 10, 0, 0, 0, 0, 3, 7, "F");
        testPlongeeHaldane(45, 15, 0, 0, 0, 1, 6, 11, "H");
        testPlongeeHaldane(45, 20, 0, 0, 0, 3, 15, 22, "I");
        testPlongeeHaldane(45, 25, 0, 0, 0, 5, 25, 34, "K");
        testPlongeeHaldane(45, 30, 0, 0, 0, 9, 35, 48, "L");
        testPlongeeHaldane(45, 35, 0, 0, 1, 15, 40, 60, "M");
        testPlongeeHaldane(45, 40, 0, 0, 3, 20, 46, 73, "N");
        testPlongeeHaldane(45, 45, 0, 0, 6, 24, 50, 84, "*");
        testPlongeeHaldane(45, 50, 0, 0, 10, 28, 54, 96, "*");
        testPlongeeHaldane(45, 55, 0, 0, 14, 30, 60, 108, "*");
        testPlongeeHaldane(45, 60, 0, 1, 18, 32, 65, 121, "*");
        // 48m
        testPlongeeHaldane(48, 5, 0, 0, 0, 0, 0, 4, "D");
        testPlongeeHaldane(48, 10, 0, 0, 0, 0, 4, 8, "F");
        testPlongeeHaldane(48, 15, 0, 0, 0, 2, 7, 13, "H");
        testPlongeeHaldane(48, 20, 0, 0, 0, 4, 19, 27, "J");
        testPlongeeHaldane(48, 25, 0, 0, 0, 7, 30, 41, "K");
        testPlongeeHaldane(48, 30, 0, 0, 1, 12, 37, 55, "M");
        testPlongeeHaldane(48, 35, 0, 0, 3, 18, 44, 70, "N");
        testPlongeeHaldane(48, 40, 0, 0, 6, 23, 48, 82, "O");
        testPlongeeHaldane(48, 45, 0, 0, 10, 27, 53, 95, "*");
        testPlongeeHaldane(48, 50, 0, 1, 14, 30, 59, 109, "*");
        testPlongeeHaldane(48, 55, 0, 2, 18, 32, 64, 121, "*");
        testPlongeeHaldane(48, 60, 0, 5, 19, 36, 70, 135, "*");
        // 50m
        testPlongeeHaldane(50, 5, 0, 0, 0, 0, 1, 5, "D");
        testPlongeeHaldane(50, 10, 0, 0, 0, 0, 4, 8, "F");
        testPlongeeHaldane(50, 15, 0, 0, 0, 2, 9, 15, "H");
        testPlongeeHaldane(50, 20, 0, 0, 0, 4, 22, 30, "J");
        testPlongeeHaldane(50, 25, 0, 0, 1, 8, 32, 46, "L");
        testPlongeeHaldane(50, 30, 0, 0, 2, 14, 39, 60, "M");
        testPlongeeHaldane(50, 35, 0, 0, 5, 20, 45, 75, "N");
        testPlongeeHaldane(50, 40, 0, 0, 9, 24, 50, 88, "O");
        testPlongeeHaldane(50, 45, 0, 1, 12, 29, 55, 102, "*");
        testPlongeeHaldane(50, 50, 0, 2, 17, 30, 62, 116, "*");
        testPlongeeHaldane(50, 55, 0, 5, 19, 34, 67, 130, "*");
        // 52m
        testPlongeeHaldane(52, 5, 0, 0, 0, 0, 1, 5, "D");
        testPlongeeHaldane(52, 10, 0, 0, 0, 1, 4, 10, "F");
        testPlongeeHaldane(52, 15, 0, 0, 0, 3, 10, 18, "I");
        testPlongeeHaldane(52, 20, 0, 0, 1, 5, 23, 34, "K");
        testPlongeeHaldane(52, 25, 0, 0, 2, 9, 34, 50, "L");
        testPlongeeHaldane(52, 30, 0, 0, 4, 15, 41, 65, "M");
        testPlongeeHaldane(52, 35, 0, 0, 6, 22, 47, 80, "O");
        testPlongeeHaldane(52, 40, 0, 1, 10, 26, 52, 94, "O");
        testPlongeeHaldane(52, 45, 0, 2, 15, 29, 59, 110, "*");
        testPlongeeHaldane(52, 50, 0, 5, 17, 32, 64, 123, "*");
        testPlongeeHaldane(52, 55, 0, 8, 19, 36, 71, 139, "*");
        // 55m
        testPlongeeHaldane(55, 5, 0, 0, 0, 0, 1, 5, "D");
        testPlongeeHaldane(55, 10, 0, 0, 0, 1, 5, 11, "G");
        testPlongeeHaldane(55, 15, 0, 0, 0, 4, 13, 22, "I");
        testPlongeeHaldane(55, 20, 0, 0, 1, 6, 27, 39, "K");
        testPlongeeHaldane(55, 25, 0, 0, 3, 11, 37, 56, "M");
        testPlongeeHaldane(55, 30, 0, 0, 6, 18, 44, 73, "N");
        testPlongeeHaldane(55, 35, 0, 1, 9, 23, 50, 88, "O");
        testPlongeeHaldane(55, 40, 0, 3, 12, 29, 55, 104, "P");
        testPlongeeHaldane(55, 45, 0, 5, 17, 31, 62, 120, "*");
        testPlongeeHaldane(55, 50, 0, 8, 19, 35, 69, 136, "*");
        testPlongeeHaldane(55, 55, 0, 12, 22, 37, 76, 152, "*");
        // 58m
        testPlongeeHaldane(58, 5, 0, 0, 0, 0, 2, 7, "D");
        testPlongeeHaldane(58, 10, 0, 0, 0, 2, 5, 12, "G");
        testPlongeeHaldane(58, 15, 0, 0, 1, 4, 16, 26, "J");
        testPlongeeHaldane(58, 20, 0, 0, 2, 7, 30, 44, "K");
        testPlongeeHaldane(58, 25, 0, 0, 4, 13, 40, 62, "M");
        testPlongeeHaldane(58, 30, 0, 1, 7, 21, 46, 81, "N");
        testPlongeeHaldane(58, 35, 0, 2, 11, 26, 52, 97, "O");
        testPlongeeHaldane(58, 40, 0, 5, 15, 30, 59, 115, "P");
        testPlongeeHaldane(58, 45, 0, 8, 18, 33, 66, 131, "*");
        testPlongeeHaldane(58, 50, 1, 11, 21, 37, 74, 150, "*");
        testPlongeeHaldane(58, 55, 3, 14, 23, 39, 83, 168, "*");
        // 60m
        testPlongeeHaldane(60, 5, 0, 0, 0, 0, 2, 7, "D");
        testPlongeeHaldane(60, 10, 0, 0, 0, 2, 6, 13, "G");
        testPlongeeHaldane(60, 15, 0, 0, 1, 4, 19, 29, "J");
        testPlongeeHaldane(60, 20, 0, 0, 3, 8, 32, 48, "L");
        testPlongeeHaldane(60, 25, 0, 0, 5, 15, 41, 66, "M");
        testPlongeeHaldane(60, 30, 0, 1, 8, 22, 48, 85, "O");
        testPlongeeHaldane(60, 35, 0, 4, 11, 28, 54, 103, "P");
        testPlongeeHaldane(60, 40, 0, 6, 17, 30, 62, 121, "P");
        testPlongeeHaldane(60, 45, 1, 9, 19, 35, 69, 139, "*");
        testPlongeeHaldane(60, 50, 2, 13, 22, 37, 78, 158, "*");
        testPlongeeHaldane(60, 55, 5, 15, 24, 40, 88, 178, "*");
        // 62m
        testPlongeeHaldane(62, 5, 0, 0, 0, 0, 2, 7, "*");
        testPlongeeHaldane(62, 10, 0, 0, 0, 2, 7, 14, "*");
        testPlongeeHaldane(62, 15, 0, 0, 1, 5, 21, 33, "*");
        // 65m
        testPlongeeHaldane(65, 5, 0, 0, 0, 0, 3, 8, "*");
        testPlongeeHaldane(65, 10, 0, 0, 0, 3, 8, 16, "*");
        testPlongeeHaldane(65, 15, 0, 0, 2, 5, 24, 37, "*");
    }

    /**
     * test des paliers.
     * 
     * @param profondeur
     * @param temps
     * @param tpsP15M
     * @param tpsP12M
     * @param tpsP9M
     * @param tpsP6M
     * @param tpsP3M
     * @param dtr
     * @param GPS
     */
    private void testPlongeeHaldane(int profondeur, int temps, int tpsP15M, int tpsP12M, int tpsP9M, int tpsP6M,
            int tpsP3M, int dtr, String GPS) {
        OrdiTableMN90 ordi = new OrdiTableMN90();
        Map<Integer, Long> paliers = ordi.calculPlongee(profondeur, temps, 0.8f);

        if (paliers.size() > 0) {
            for (int profPalier : paliers.keySet()) {
                // Test des paliers
                switch (profPalier) {
                    case 3:

                        assertEquals("Test P3M -> " + profondeur + " m - " + temps + " min", tpsP3M,
                                paliers.get(profPalier).longValue());
                        break;
                    case 6:
                        assertEquals("Test P6M -> " + profondeur + " m - " + temps + " min", tpsP6M,
                                paliers.get(profPalier).longValue());
                        break;
                    case 9:
                        assertEquals("Test P9M -> " + profondeur + " m - " + temps + " min", tpsP9M,
                                paliers.get(profPalier).longValue());
                        break;
                    case 12:
                        assertEquals("Test P12M -> " + profondeur + " m - " + temps + " min", tpsP12M,
                                paliers.get(profPalier).longValue());
                        break;
                    case 15:
                        assertEquals("Test P15M -> " + profondeur + " m - " + temps + " min", tpsP15M,
                                paliers.get(profPalier).longValue());
                        break;
                    case 18:
                    default:
                        System.out.println("Palier non pris en charge -> " + profondeur + " m - " + temps + " min");
                        break;
                }
            }
        } else {
            boolean pasDePalier = paliers.size() == 0 && tpsP3M == 0 && tpsP6M == 0 && tpsP9M == 0 && tpsP12M == 0
                    && tpsP15M == 0;
            assertTrue("Test pas de palier -> " + profondeur + " m - " + temps + " min", pasDePalier);
        }
    }

    private void assertEquals(String msg, long expectedValue, long calculatedValue) {
        if (expectedValue != calculatedValue) {
            System.out.println(msg + " : " + MessageFormat.format("valeur visee {0} - valeur calculee {1} ...",
                    expectedValue, calculatedValue));
        }
    }

    private void assertTrue(String msg, boolean test) {
        if (!test) {
            System.out.println(msg + " : faux...");
        }
    }

    public static void main(String[] args) {
        DebugHaldane dbg = new DebugHaldane();
        dbg.testPlongeesSimplesHaldane();
    }
}
