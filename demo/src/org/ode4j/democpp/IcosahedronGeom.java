package org.ode4j.democpp;

//<---- Icosahedron ---->
/**
 * This is a description of a convex icosahedron, to test
 * the convex collision detection.
 */
public class IcosahedronGeom {
	//unsigned 
	static final int Sphere_pointcount = 42;
	//unsigned 
	static final int Sphere_planecount = 80;
	static final double[] Sphere_points = { //[126]={
			0.000000,0.000000,-0.300000,
			0.217080,-0.157716,-0.134164,
			-0.082915,-0.255192,-0.134164,
			-0.268327,0.000000,-0.134164,
			-0.082915,0.255192,-0.134164,
			0.217080,0.157716,-0.134164,
			0.082915,-0.255192,0.134164,
			-0.217080,-0.157716,0.134164,
			-0.217080,0.157716,0.134164,
			0.082915,0.255192,0.134164,
			0.268327,0.000000,0.134164,
			0.000000,0.000000,0.300000,
			0.127597,-0.092703,-0.255196,
			-0.048737,-0.149999,-0.255196,
			0.078861,-0.242703,-0.157721,
			0.127597,0.092703,-0.255196,
			0.255194,0.000000,-0.157721,
			-0.157719,0.000000,-0.255195,
			-0.206457,-0.149999,-0.157721,
			-0.048737,0.149999,-0.255196,
			-0.206457,0.149999,-0.157721,
			0.078861,0.242703,-0.157721,
			0.285317,0.092704,0.000000,
			0.285317,-0.092704,0.000000,
			0.176336,-0.242705,0.000000,
			0.000000,-0.300000,0.000000,
			-0.176336,-0.242705,0.000000,
			-0.285317,-0.092704,0.000000,
			-0.285317,0.092704,0.000000,
			-0.176336,0.242705,0.000000,
			0.000000,0.300000,0.000000,
			0.176336,0.242705,0.000000,
			0.206457,-0.149999,0.157721,
			-0.078861,-0.242703,0.157721,
			-0.255194,0.000000,0.157721,
			-0.078861,0.242703,0.157721,
			0.206457,0.149999,0.157721,
			0.157719,0.000000,0.255195,
			0.048737,-0.149999,0.255196,
			-0.127597,-0.092703,0.255196,
			-0.127597,0.092703,0.255196,
			0.048737,0.149999,0.255196
	};
	//unsigned 
	static final int[] Sphere_polygons={
			3,14,12,1,
			3,12,14,13,
			3,2,13,14,
			3,13,0,12,
			3,16,1,12,
			3,12,15,16,
			3,5,16,15,
			3,12,0,15,
			3,18,13,2,
			3,13,18,17,
			3,3,17,18,
			3,17,0,13,
			3,20,17,3,
			3,17,20,19,
			3,4,19,20,
			3,19,0,17,
			3,21,19,4,
			3,19,21,15,
			3,5,15,21,
			3,15,0,19,
			3,23,1,16,
			3,16,22,23,
			3,10,23,22,
			3,22,16,5,
			3,25,2,14,
			3,14,24,25,
			3,6,25,24,
			3,24,14,1,
			3,27,3,18,
			3,18,26,27,
			3,7,27,26,
			3,26,18,2,
			3,29,4,20,
			3,20,28,29,
			3,8,29,28,
			3,28,20,3,
			3,31,5,21,
			3,21,30,31,
			3,9,31,30,
			3,30,21,4,
			3,32,23,10,
			3,23,32,24,
			3,6,24,32,
			3,24,1,23,
			3,33,25,6,
			3,25,33,26,
			3,7,26,33,
			3,26,2,25,
			3,34,27,7,
			3,27,34,28,
			3,8,28,34,
			3,28,3,27,
			3,35,29,8,
			3,29,35,30,
			3,9,30,35,
			3,30,4,29,
			3,36,31,9,
			3,31,36,22,
			3,10,22,36,
			3,22,5,31,
			3,38,6,32,
			3,32,37,38,
			3,11,38,37,
			3,37,32,10,
			3,39,7,33,
			3,33,38,39,
			3,11,39,38,
			3,38,33,6,
			3,40,8,34,
			3,34,39,40,
			3,11,40,39,
			3,39,34,7,
			3,41,9,35,
			3,35,40,41,
			3,11,41,40,
			3,40,35,8,
			3,37,10,36,
			3,36,41,37,
			3,11,37,41,
			3,41,36,9,
	};
	static final double[] Sphere_planes={
			0.471317,-0.583121,-0.661687,0.283056,
			0.187594,-0.577345,-0.794658,0.280252,
			-0.038547,-0.748789,-0.661687,0.283056,
			0.102381,-0.315090,-0.943523,0.283057,
			0.700228,-0.268049,-0.661688,0.283056,
			0.607060,0.000000,-0.794656,0.280252,
			0.700228,0.268049,-0.661688,0.283056,
			0.331305,0.000000,-0.943524,0.283057,
			-0.408939,-0.628443,-0.661686,0.283056,
			-0.491119,-0.356821,-0.794657,0.280252,
			-0.724044,-0.194735,-0.661694,0.283057,
			-0.268034,-0.194737,-0.943523,0.283057,
			-0.724044,0.194735,-0.661694,0.283057,
			-0.491119,0.356821,-0.794657,0.280252,
			-0.408939,0.628443,-0.661686,0.283056,
			-0.268034,0.194737,-0.943523,0.283057,
			-0.038547,0.748789,-0.661687,0.283056,
			0.187594,0.577345,-0.794658,0.280252,
			0.471317,0.583121,-0.661687,0.283056,
			0.102381,0.315090,-0.943523,0.283057,
			0.904981,-0.268049,-0.330393,0.283056,
			0.982246,0.000000,-0.187599,0.280252,
			0.992077,0.000000,0.125631,0.283057,
			0.904981,0.268049,-0.330393,0.283056,
			0.024726,-0.943519,-0.330396,0.283056,
			0.303531,-0.934171,-0.187598,0.280251,
			0.306568,-0.943519,0.125651,0.283056,
			0.534590,-0.777851,-0.330395,0.283056,
			-0.889698,-0.315092,-0.330386,0.283056,
			-0.794656,-0.577348,-0.187595,0.280251,
			-0.802607,-0.583125,0.125648,0.283055,
			-0.574584,-0.748793,-0.330397,0.283055,
			-0.574584,0.748793,-0.330397,0.283055,
			-0.794656,0.577348,-0.187595,0.280251,
			-0.802607,0.583125,0.125648,0.283055,
			-0.889698,0.315092,-0.330386,0.283056,
			0.534590,0.777851,-0.330395,0.283056,
			0.303531,0.934171,-0.187598,0.280251,
			0.306568,0.943519,0.125651,0.283056,
			0.024726,0.943519,-0.330396,0.283056,
			0.889698,-0.315092,0.330386,0.283056,
			0.794656,-0.577348,0.187595,0.280251,
			0.574584,-0.748793,0.330397,0.283055,
			0.802607,-0.583125,-0.125648,0.283055,
			-0.024726,-0.943519,0.330396,0.283055,
			-0.303531,-0.934171,0.187598,0.280251,
			-0.534590,-0.777851,0.330395,0.283056,
			-0.306568,-0.943519,-0.125651,0.283056,
			-0.904981,-0.268049,0.330393,0.283056,
			-0.982246,0.000000,0.187599,0.280252,
			-0.904981,0.268049,0.330393,0.283056,
			-0.992077,0.000000,-0.125631,0.283057,
			-0.534590,0.777851,0.330395,0.283056,
			-0.303531,0.934171,0.187598,0.280251,
			-0.024726,0.943519,0.330396,0.283055,
			-0.306568,0.943519,-0.125651,0.283056,
			0.574584,0.748793,0.330397,0.283055,
			0.794656,0.577348,0.187595,0.280251,
			0.889698,0.315092,0.330386,0.283056,
			0.802607,0.583125,-0.125648,0.283055,
			0.408939,-0.628443,0.661686,0.283056,
			0.491119,-0.356821,0.794657,0.280252,
			0.268034,-0.194737,0.943523,0.283057,
			0.724044,-0.194735,0.661694,0.283057,
			-0.471317,-0.583121,0.661687,0.283056,
			-0.187594,-0.577345,0.794658,0.280252,
			-0.102381,-0.315090,0.943523,0.283057,
			0.038547,-0.748789,0.661687,0.283056,
			-0.700228,0.268049,0.661688,0.283056,
			-0.607060,0.000000,0.794656,0.280252,
			-0.331305,0.000000,0.943524,0.283057,
			-0.700228,-0.268049,0.661688,0.283056,
			0.038547,0.748789,0.661687,0.283056,
			-0.187594,0.577345,0.794658,0.280252,
			-0.102381,0.315090,0.943523,0.283057,
			-0.471317,0.583121,0.661687,0.283056,
			0.724044,0.194735,0.661694,0.283057,
			0.491119,0.356821,0.794657,0.280252,
			0.268034,0.194737,0.943523,0.283057,
			0.408939,0.628443,0.661686,0.283056,
	};
}