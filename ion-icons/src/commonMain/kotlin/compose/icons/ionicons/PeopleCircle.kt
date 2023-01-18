package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PeopleCircle: ImageVector
    get() {
        if (_peopleCircle != null) {
            return _peopleCircle!!
        }
        _peopleCircle = Builder(name = "PeopleCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(258.9f, 48.0f)
                curveTo(141.92f, 46.42f, 46.42f, 141.92f, 48.0f, 258.9f)
                curveTo(49.56f, 371.09f, 140.91f, 462.44f, 253.1f, 464.0f)
                curveToRelative(117.0f, 1.6f, 212.48f, -93.9f, 210.88f, -210.88f)
                curveTo(462.44f, 140.91f, 371.09f, 49.56f, 258.9f, 48.0f)
                close()
                moveTo(255.22f, 200.11f)
                curveToRelative(0.21f, -1.2f, 0.44f, -2.4f, 0.71f, -3.59f)
                arcToRelative(66.46f, 66.46f, 0.0f, false, true, 16.29f, -31.21f)
                curveTo(285.11f, 151.58f, 303.38f, 144.0f, 323.67f, 144.0f)
                arcToRelative(74.05f, 74.05f, 0.0f, false, true, 25.06f, 4.26f)
                arcTo(66.69f, 66.69f, 0.0f, false, true, 375.0f, 165.46f)
                arcToRelative(68.15f, 68.15f, 0.0f, false, true, 18.0f, 42.14f)
                arcTo(78.46f, 78.46f, 0.0f, false, true, 393.0f, 219.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(86.19f, 86.19f, 0.0f, false, true, -8.2f, 31.0f)
                quadToRelative(-0.76f, 1.59f, -1.59f, 3.15f)
                curveToRelative(-1.11f, 2.07f, -2.3f, 4.1f, -3.58f, 6.06f)
                arcToRelative(79.47f, 79.47f, 0.0f, false, true, -8.63f, 11.0f)
                curveToRelative(-13.12f, 14.0f, -29.92f, 21.73f, -47.31f, 21.73f)
                arcToRelative(59.61f, 59.61f, 0.0f, false, true, -19.17f, -3.18f)
                arcToRelative(63.47f, 63.47f, 0.0f, false, true, -6.1f, -2.43f)
                arcToRelative(70.76f, 70.76f, 0.0f, false, true, -22.07f, -16.12f)
                arcToRelative(83.76f, 83.76f, 0.0f, false, true, -22.0f, -51.32f)
                quadToRelative(-0.27f, -3.88f, -0.18f, -7.68f)
                arcTo(75.62f, 75.62f, 0.0f, false, true, 255.22f, 200.13f)
                close()
                moveTo(105.49f, 224.45f)
                arcToRelative(59.87f, 59.87f, 0.0f, false, true, 5.2f, -20.64f)
                arcToRelative(56.76f, 56.76f, 0.0f, false, true, 2.78f, -5.3f)
                arcToRelative(54.49f, 54.49f, 0.0f, false, true, 7.19f, -9.56f)
                arcToRelative(55.62f, 55.62f, 0.0f, false, true, 14.0f, -10.82f)
                arcToRelative(56.84f, 56.84f, 0.0f, false, true, 8.11f, -3.64f)
                arcToRelative(63.85f, 63.85f, 0.0f, false, true, 33.35f, -2.39f)
                arcToRelative(57.0f, 57.0f, 0.0f, false, true, 30.78f, 17.0f)
                arcToRelative(57.86f, 57.86f, 0.0f, false, true, 15.41f, 38.62f)
                curveToRelative(0.05f, 2.11f, 0.0f, 4.23f, -0.15f, 6.38f)
                arcToRelative(71.58f, 71.58f, 0.0f, false, true, -6.0f, 23.84f)
                arcToRelative(69.49f, 69.49f, 0.0f, false, true, -5.73f, 10.42f)
                arcToRelative(65.39f, 65.39f, 0.0f, false, true, -15.76f, 16.57f)
                curveTo(193.17f, 286.0f, 191.61f, 287.0f, 190.0f, 288.0f)
                arcToRelative(54.21f, 54.21f, 0.0f, false, true, -10.0f, 4.65f)
                arcToRelative(49.31f, 49.31f, 0.0f, false, true, -16.2f, 2.76f)
                curveToRelative(-0.93f, 0.0f, -1.86f, 0.0f, -2.78f, -0.08f)
                arcToRelative(47.6f, 47.6f, 0.0f, false, true, -5.48f, -0.62f)
                arcToRelative(51.19f, 51.19f, 0.0f, false, true, -5.35f, -1.23f)
                arcToRelative(53.54f, 53.54f, 0.0f, false, true, -7.72f, -2.89f)
                curveToRelative(-0.84f, -0.39f, -1.66f, -0.8f, -2.48f, -1.23f)
                curveToRelative(-18.0f, -9.49f, -31.57f, -29.16f, -34.23f, -52.12f)
                curveToRelative(-0.12f, -1.05f, -0.22f, -2.1f, -0.29f, -3.16f)
                arcTo(66.59f, 66.59f, 0.0f, false, true, 105.49f, 224.45f)
                close()
                moveTo(159.41f, 403.05f)
                arcTo(177.27f, 177.27f, 0.0f, false, true, 97.47f, 332.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.62f, -5.26f)
                curveTo(117.67f, 316.69f, 141.4f, 311.0f, 163.82f, 311.0f)
                curveToRelative(17.0f, 0.0f, 30.7f, 2.0f, 42.69f, 5.88f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.59f, 13.77f)
                curveToRelative(-23.35f, 19.0f, -38.4f, 42.54f, -45.47f, 70.75f)
                verticalLineToRelative(0.0f)
                arcTo(2.77f, 2.77f, 0.0f, false, true, 159.41f, 403.05f)
                close()
                moveTo(256.0f, 432.0f)
                arcToRelative(175.12f, 175.12f, 0.0f, false, true, -65.7f, -12.72f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.4f, -4.46f)
                curveToRelative(0.4f, -2.05f, 0.84f, -3.92f, 1.23f, -5.48f)
                curveToRelative(7.12f, -28.43f, 24.76f, -52.0f, 51.0f, -68.18f)
                curveToRelative(23.29f, -14.35f, 53.0f, -22.25f, 83.52f, -22.25f)
                curveToRelative(31.16f, 0.0f, 60.0f, 7.58f, 83.48f, 21.91f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.72f, 2.72f, 0.0f, false, true, 0.91f, 3.67f)
                arcTo(176.1f, 176.1f, 0.0f, false, true, 256.0f, 432.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(161.0f, 295.28f)
                arcToRelative(47.6f, 47.6f, 0.0f, false, true, -5.48f, -0.62f)
                arcTo(47.6f, 47.6f, 0.0f, false, false, 161.0f, 295.28f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.64f, 178.13f)
                arcToRelative(55.62f, 55.62f, 0.0f, false, false, -14.0f, 10.82f)
                arcToRelative(54.49f, 54.49f, 0.0f, false, false, -7.19f, 9.56f)
                arcToRelative(54.49f, 54.49f, 0.0f, false, true, 7.19f, -9.56f)
                arcTo(55.62f, 55.62f, 0.0f, false, true, 134.64f, 178.13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.17f, 257.89f)
                arcToRelative(71.58f, 71.58f, 0.0f, false, false, 6.0f, -23.84f)
                curveToRelative(0.15f, -2.15f, 0.2f, -4.27f, 0.15f, -6.38f)
                quadToRelative(0.08f, 3.15f, -0.15f, 6.38f)
                arcTo(71.58f, 71.58f, 0.0f, false, true, 216.17f, 257.89f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.64f, 178.13f)
                arcToRelative(56.84f, 56.84f, 0.0f, false, true, 8.11f, -3.64f)
                arcTo(56.84f, 56.84f, 0.0f, false, false, 134.64f, 178.13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(150.21f, 293.43f)
                arcToRelative(53.54f, 53.54f, 0.0f, false, true, -7.72f, -2.89f)
                arcTo(53.54f, 53.54f, 0.0f, false, false, 150.21f, 293.43f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(105.78f, 237.19f)
                curveToRelative(2.66f, 23.0f, 16.26f, 42.63f, 34.23f, 52.12f)
                curveTo(122.0f, 279.82f, 108.44f, 260.15f, 105.78f, 237.19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(254.34f, 219.0f)
                arcToRelative(83.76f, 83.76f, 0.0f, false, false, 22.0f, 51.32f)
                arcToRelative(70.76f, 70.76f, 0.0f, false, false, 22.07f, 16.12f)
                arcToRelative(70.76f, 70.76f, 0.0f, false, true, -22.07f, -16.12f)
                arcToRelative(83.76f, 83.76f, 0.0f, false, true, -22.0f, -51.32f)
                quadToRelative(-0.27f, -3.88f, -0.18f, -7.68f)
                quadTo(254.07f, 215.07f, 254.34f, 219.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(304.5f, 288.82f)
                arcToRelative(63.47f, 63.47f, 0.0f, false, true, -6.1f, -2.43f)
                arcTo(63.47f, 63.47f, 0.0f, false, false, 304.5f, 288.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.93f, 196.54f)
                arcToRelative(66.46f, 66.46f, 0.0f, false, true, 16.29f, -31.21f)
                arcTo(66.46f, 66.46f, 0.0f, false, false, 255.93f, 196.54f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(375.0f, 165.46f)
                arcToRelative(68.15f, 68.15f, 0.0f, false, true, 18.0f, 42.14f)
                arcToRelative(68.15f, 68.15f, 0.0f, false, false, -18.0f, -42.14f)
                arcToRelative(66.69f, 66.69f, 0.0f, false, false, -26.27f, -17.2f)
                arcTo(66.69f, 66.69f, 0.0f, false, true, 375.0f, 165.46f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(393.0f, 219.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(86.19f, 86.19f, 0.0f, false, true, -8.2f, 31.0f)
                arcTo(86.19f, 86.19f, 0.0f, false, false, 393.0f, 219.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(254.16f, 211.27f)
                arcToRelative(75.62f, 75.62f, 0.0f, false, true, 1.06f, -11.14f)
                arcTo(75.62f, 75.62f, 0.0f, false, false, 254.16f, 211.27f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(383.19f, 253.16f)
                curveToRelative(-1.11f, 2.07f, -2.3f, 4.1f, -3.58f, 6.06f)
                curveTo(380.89f, 257.26f, 382.08f, 255.23f, 383.19f, 253.16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.88f, 189.05f)
                arcToRelative(57.86f, 57.86f, 0.0f, false, true, 15.41f, 38.62f)
                arcToRelative(57.86f, 57.86f, 0.0f, false, false, -15.41f, -38.62f)
                arcToRelative(57.0f, 57.0f, 0.0f, false, false, -30.78f, -17.0f)
                arcTo(57.0f, 57.0f, 0.0f, false, true, 206.88f, 189.05f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(190.0f, 288.0f)
                arcToRelative(54.21f, 54.21f, 0.0f, false, true, -10.0f, 4.65f)
                arcTo(54.21f, 54.21f, 0.0f, false, false, 190.0f, 288.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(105.49f, 224.45f)
                arcToRelative(59.87f, 59.87f, 0.0f, false, true, 5.2f, -20.64f)
                arcTo(59.87f, 59.87f, 0.0f, false, false, 105.49f, 224.45f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(194.68f, 284.88f)
                curveTo(193.17f, 286.0f, 191.61f, 287.0f, 190.0f, 288.0f)
                curveTo(191.61f, 287.0f, 193.17f, 286.0f, 194.68f, 284.88f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.17f, 257.89f)
                arcToRelative(69.49f, 69.49f, 0.0f, false, true, -5.73f, 10.42f)
                arcTo(69.49f, 69.49f, 0.0f, false, false, 216.17f, 257.89f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(110.69f, 203.81f)
                arcToRelative(56.76f, 56.76f, 0.0f, false, true, 2.78f, -5.3f)
                arcTo(56.76f, 56.76f, 0.0f, false, false, 110.69f, 203.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(194.68f, 284.88f)
                arcToRelative(65.39f, 65.39f, 0.0f, false, false, 15.76f, -16.57f)
                arcTo(65.39f, 65.39f, 0.0f, false, true, 194.68f, 284.88f)
                close()
            }
        }
        .build()
        return _peopleCircle!!
    }

private var _peopleCircle: ImageVector? = null
