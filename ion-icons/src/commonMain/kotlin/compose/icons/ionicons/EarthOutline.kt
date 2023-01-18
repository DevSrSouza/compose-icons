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

public val IonIcons.EarthOutline: ImageVector
    get() {
        if (_earthOutline != null) {
            return _earthOutline!!
        }
        _earthOutline = Builder(name = "EarthOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(464.0f, 256.0f)
                curveToRelative(0.0f, -114.87f, -93.13f, -208.0f, -208.0f, -208.0f)
                reflectiveCurveTo(48.0f, 141.13f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.13f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveTo(464.0f, 370.87f, 464.0f, 256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(445.57f, 172.14f)
                curveToRelative(-16.06f, 0.1f, -14.48f, 29.73f, -34.49f, 15.75f)
                curveToRelative(-7.43f, -5.18f, -12.0f, -12.71f, -21.33f, -15.0f)
                curveToRelative(-8.15f, -2.0f, -16.5f, 0.08f, -24.55f, 1.47f)
                curveToRelative(-9.15f, 1.58f, -20.0f, 2.29f, -26.94f, 9.22f)
                curveToRelative(-6.71f, 6.67f, -10.26f, 15.62f, -17.4f, 22.33f)
                curveToRelative(-13.81f, 13.0f, -19.64f, 27.19f, -10.7f, 45.57f)
                curveToRelative(8.6f, 17.67f, 26.59f, 27.26f, 46.0f, 26.0f)
                curveToRelative(19.07f, -1.27f, 38.88f, -12.33f, 38.33f, 15.38f)
                curveToRelative(-0.2f, 9.8f, 1.85f, 16.6f, 4.86f, 25.71f)
                curveToRelative(2.79f, 8.4f, 2.6f, 16.54f, 3.24f, 25.21f)
                curveToRelative(1.18f, 16.2f, 4.16f, 34.36f, 12.2f, 48.67f)
                lineToRelative(15.0f, -21.16f)
                curveToRelative(1.85f, -2.62f, 5.72f, -6.29f, 6.64f, -9.38f)
                curveToRelative(1.63f, -5.47f, -1.58f, -14.87f, -1.95f, -21.0f)
                reflectiveCurveToRelative(-0.19f, -12.34f, -1.13f, -18.47f)
                curveToRelative(-1.32f, -8.59f, -6.4f, -16.64f, -7.1f, -25.13f)
                curveToRelative(-1.29f, -15.81f, 1.6f, -28.43f, -10.58f, -41.65f)
                curveToRelative(-11.76f, -12.75f, -29.0f, -15.81f, -45.47f, -13.22f)
                curveToRelative(-8.3f, 1.3f, -41.71f, 6.64f, -28.3f, -12.33f)
                curveToRelative(2.65f, -3.73f, 7.28f, -6.79f, 10.26f, -10.34f)
                curveToRelative(2.59f, -3.09f, 4.84f, -8.77f, 7.88f, -11.18f)
                reflectiveCurveToRelative(17.0f, -5.18f, 21.0f, -3.95f)
                reflectiveCurveToRelative(8.17f, 7.0f, 11.64f, 9.56f)
                arcToRelative(49.89f, 49.89f, 0.0f, false, false, 21.81f, 9.36f)
                curveToRelative(13.66f, 2.0f, 42.22f, -5.94f, 42.0f, -23.46f)
                curveTo(456.45f, 191.7f, 448.65f, 180.0f, 445.57f, 172.14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(287.45f, 316.3f)
                curveToRelative(-5.33f, -22.44f, -35.82f, -29.94f, -52.26f, -42.11f)
                curveToRelative(-9.45f, -7.0f, -17.86f, -17.81f, -30.27f, -18.69f)
                curveToRelative(-5.72f, -0.41f, -10.51f, 0.83f, -16.18f, -0.64f)
                curveToRelative(-5.2f, -1.34f, -9.28f, -4.14f, -14.82f, -3.41f)
                curveToRelative(-10.35f, 1.36f, -16.88f, 12.42f, -28.0f, 10.92f)
                curveToRelative(-10.55f, -1.42f, -21.42f, -13.76f, -23.82f, -23.81f)
                curveToRelative(-3.08f, -12.92f, 7.14f, -17.11f, 18.09f, -18.26f)
                curveToRelative(4.57f, -0.48f, 9.7f, -1.0f, 14.09f, 0.67f)
                curveToRelative(5.78f, 2.15f, 8.51f, 7.81f, 13.7f, 10.67f)
                curveToRelative(9.73f, 5.33f, 11.7f, -3.19f, 10.21f, -11.83f)
                curveToRelative(-2.23f, -12.94f, -4.83f, -18.22f, 6.71f, -27.12f)
                curveToRelative(8.0f, -6.14f, 14.84f, -10.58f, 13.56f, -21.61f)
                curveToRelative(-0.76f, -6.48f, -4.31f, -9.41f, -1.0f, -15.86f)
                curveToRelative(2.51f, -4.91f, 9.4f, -9.34f, 13.89f, -12.27f)
                curveToRelative(11.59f, -7.56f, 49.65f, -7.0f, 34.1f, -28.16f)
                curveToRelative(-4.57f, -6.21f, -13.0f, -17.31f, -21.0f, -18.83f)
                curveToRelative(-10.0f, -1.89f, -14.44f, 9.27f, -21.41f, 14.19f)
                curveToRelative(-7.2f, 5.09f, -21.22f, 10.87f, -28.43f, 3.0f)
                curveToRelative(-9.7f, -10.59f, 6.43f, -14.07f, 10.0f, -21.46f)
                reflectiveCurveTo(176.34f, 70.33f, 170.0f, 66.79f)
                lineToRelative(-29.81f, 33.43f)
                arcToRelative(41.52f, 41.52f, 0.0f, false, false, 8.34f, 31.86f)
                curveToRelative(5.93f, 7.63f, 15.37f, 10.08f, 15.8f, 20.5f)
                curveToRelative(0.42f, 10.0f, -1.14f, 15.12f, -7.68f, 22.15f)
                curveToRelative(-2.83f, 3.0f, -4.83f, 7.26f, -7.71f, 10.07f)
                curveToRelative(-3.53f, 3.43f, -2.22f, 2.38f, -7.73f, 3.32f)
                curveToRelative(-10.36f, 1.75f, -19.18f, 4.45f, -29.19f, 7.21f)
                curveTo(95.34f, 199.94f, 93.8f, 172.69f, 86.2f, 162.0f)
                lineToRelative(-25.0f, 20.19f)
                curveToRelative(-0.27f, 3.31f, 4.1f, 9.4f, 5.29f, 13.0f)
                curveTo(73.32f, 215.76f, 87.1f, 231.67f, 96.0f, 251.35f)
                curveToRelative(9.37f, 20.84f, 34.53f, 15.06f, 45.64f, 33.32f)
                curveToRelative(9.86f, 16.2f, -0.67f, 36.71f, 6.71f, 53.67f)
                curveToRelative(5.36f, 12.31f, 18.0f, 15.0f, 26.72f, 24.0f)
                curveToRelative(8.91f, 9.09f, 8.72f, 21.53f, 10.08f, 33.36f)
                arcToRelative(305.22f, 305.22f, 0.0f, false, false, 7.45f, 41.28f)
                curveToRelative(1.21f, 4.69f, 2.32f, 10.89f, 5.53f, 14.76f)
                curveToRelative(2.2f, 2.66f, 9.75f, 4.95f, 6.7f, 5.83f)
                curveToRelative(4.26f, 0.7f, 11.85f, 4.68f, 15.4f, 1.76f)
                curveToRelative(4.68f, -3.84f, 3.43f, -15.66f, 4.24f, -21.0f)
                curveToRelative(2.43f, -15.9f, 10.39f, -31.45f, 21.13f, -43.35f)
                curveToRelative(10.61f, -11.74f, 25.15f, -19.69f, 34.11f, -33.0f)
                curveTo(288.44f, 349.0f, 291.07f, 331.49f, 287.45f, 316.3f)
                close()
                moveTo(254.06f, 342.62f)
                curveToRelative(-6.0f, 10.71f, -19.36f, 17.88f, -27.95f, 26.39f)
                curveToRelative(-2.33f, 2.31f, -7.29f, 10.31f, -10.21f, 8.58f)
                curveToRelative(-2.09f, -1.24f, -2.8f, -11.62f, -3.57f, -14.0f)
                arcToRelative(61.17f, 61.17f, 0.0f, false, false, -21.71f, -29.95f)
                curveToRelative(-3.13f, -2.37f, -10.89f, -5.45f, -12.68f, -8.7f)
                curveToRelative(-2.0f, -3.53f, -0.2f, -11.86f, -0.13f, -15.7f)
                curveToRelative(0.11f, -5.6f, -2.44f, -14.91f, -1.06f, -20.0f)
                curveToRelative(1.6f, -5.87f, -1.48f, -2.33f, 3.77f, -3.49f)
                curveToRelative(2.77f, -0.62f, 14.21f, 1.39f, 17.66f, 2.11f)
                curveToRelative(5.48f, 1.14f, 8.5f, 4.55f, 12.82f, 8.0f)
                curveToRelative(11.36f, 9.11f, 23.87f, 16.16f, 36.6f, 23.14f)
                curveTo(257.46f, 324.46f, 260.36f, 331.37f, 254.06f, 342.62f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.46f, 67.09f)
                curveToRelative(4.74f, 4.63f, 9.2f, 10.11f, 16.27f, 10.57f)
                curveToRelative(6.69f, 0.45f, 13.0f, -3.17f, 18.84f, 1.38f)
                curveToRelative(6.48f, 5.0f, 11.15f, 11.33f, 19.75f, 12.89f)
                curveToRelative(8.32f, 1.51f, 17.13f, -3.35f, 19.19f, -11.86f)
                curveToRelative(2.0f, -8.11f, -2.31f, -16.93f, -2.57f, -25.07f)
                curveToRelative(0.0f, -1.13f, 0.61f, -6.15f, -0.17f, -7.0f)
                curveToRelative(-0.58f, -0.64f, -5.42f, 0.08f, -6.16f, 0.1f)
                quadToRelative(-8.13f, 0.24f, -16.22f, 1.12f)
                arcToRelative(207.1f, 207.1f, 0.0f, false, false, -57.18f, 14.65f)
                curveTo(178.64f, 65.55f, 181.69f, 66.22f, 184.46f, 67.09f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(356.4f, 123.27f)
                curveToRelative(8.49f, 0.0f, 17.11f, -3.8f, 14.37f, -13.62f)
                curveToRelative(-2.3f, -8.23f, -6.22f, -17.16f, -15.76f, -12.72f)
                curveToRelative(-6.07f, 2.82f, -14.67f, 10.0f, -15.38f, 17.12f)
                curveTo(338.82f, 122.13f, 350.74f, 123.27f, 356.4f, 123.27f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(349.62f, 166.24f)
                curveToRelative(8.67f, 5.19f, 21.53f, 2.75f, 28.07f, -4.66f)
                curveToRelative(5.11f, -5.8f, 8.12f, -15.87f, 17.31f, -15.86f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, true, 10.82f, 4.41f)
                curveToRelative(3.8f, 3.93f, 3.05f, 7.62f, 3.86f, 12.54f)
                curveToRelative(1.81f, 11.05f, 13.66f, 0.63f, 16.75f, -3.65f)
                curveToRelative(2.0f, -2.79f, 4.71f, -6.93f, 3.8f, -10.56f)
                curveToRelative(-0.84f, -3.39f, -4.8f, -7.0f, -6.56f, -10.11f)
                curveToRelative(-5.14f, -9.0f, -9.37f, -19.47f, -17.07f, -26.74f)
                curveToRelative(-7.41f, -7.0f, -16.52f, -6.19f, -23.55f, 1.08f)
                curveToRelative(-5.76f, 6.0f, -12.45f, 10.75f, -16.39f, 18.05f)
                curveToRelative(-2.78f, 5.13f, -5.91f, 7.58f, -11.54f, 8.91f)
                curveToRelative(-3.1f, 0.73f, -6.64f, 1.0f, -9.24f, 3.08f)
                curveTo(338.64f, 148.43f, 342.76f, 162.12f, 349.62f, 166.24f)
                close()
            }
        }
        .build()
        return _earthOutline!!
    }

private var _earthOutline: ImageVector? = null
