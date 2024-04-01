WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
/*
 * Polyline.java  
 */

package VC.TreeDrawer;

class Polyline {
    int      dx, dy;
    Polyline link;

    Polyline(int dx, int dy, Polyline link) {
	this.dx = dx;
	this.dy = dy;
	this.link = link;
    }
};

