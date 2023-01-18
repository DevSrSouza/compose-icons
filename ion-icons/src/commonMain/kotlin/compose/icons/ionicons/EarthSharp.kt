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

public val IonIcons.EarthSharp: ImageVector
    get() {
        if (_earthSharp != null) {
            return _earthSharp!!
        }
        _earthSharp = Builder(name = "EarthSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(267.0f, 474.0f)
                lineToRelative(-0.8f, -0.13f)
                arcTo(0.85f, 0.85f, 0.0f, false, false, 267.0f, 474.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.9f, 187.78f)
                arcToRelative(5.51f, 5.51f, 0.0f, false, false, -10.67f, -0.63f)
                horizontalLineToRelative(0.0f)
                arcTo(5.52f, 5.52f, 0.0f, false, true, 433.0f, 191.0f)
                horizontalLineTo(417.53f)
                arcToRelative(5.48f, 5.48f, 0.0f, false, true, -2.84f, -0.79f)
                lineToRelative(-22.38f, -13.42f)
                arcToRelative(5.48f, 5.48f, 0.0f, false, false, -2.84f, -0.79f)
                horizontalLineToRelative(-35.8f)
                arcToRelative(5.48f, 5.48f, 0.0f, false, false, -3.06f, 0.93f)
                lineToRelative(-44.15f, 29.43f)
                arcTo(5.52f, 5.52f, 0.0f, false, false, 304.0f, 211.0f)
                verticalLineToRelative(41.74f)
                arcToRelative(5.51f, 5.51f, 0.0f, false, false, 2.92f, 4.87f)
                lineToRelative(57.89f, 30.9f)
                arcToRelative(5.55f, 5.55f, 0.0f, false, true, 2.92f, 4.8f)
                lineTo(368.0f, 316.8f)
                arcToRelative(5.53f, 5.53f, 0.0f, false, false, 2.85f, 4.75f)
                lineToRelative(23.26f, 12.87f)
                arcToRelative(5.54f, 5.54f, 0.0f, false, true, 2.85f, 4.83f)
                verticalLineToRelative(48.6f)
                arcToRelative(5.52f, 5.52f, 0.0f, false, false, 9.17f, 4.14f)
                curveToRelative(9.38f, -8.26f, 22.83f, -20.32f, 24.62f, -23.08f)
                quadToRelative(4.44f, -6.87f, 8.33f, -14.07f)
                arcToRelative(207.39f, 207.39f, 0.0f, false, false, 13.6f, -31.0f)
                curveTo(465.36f, 287.13f, 455.34f, 221.14f, 448.9f, 187.78f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(286.4f, 302.8f)
                lineToRelative(-61.33f, -46.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.4f, -0.8f)
                horizontalLineToRelative(-29.1f)
                arcToRelative(3.78f, 3.78f, 0.0f, false, true, -2.68f, -1.11f)
                lineToRelative(-13.72f, -13.72f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.83f, -1.17f)
                horizontalLineTo(121.15f)
                arcToRelative(3.79f, 3.79f, 0.0f, false, true, -2.68f, -6.47f)
                lineToRelative(8.42f, -8.42f)
                arcToRelative(3.78f, 3.78f, 0.0f, false, true, 2.68f, -1.11f)
                horizontalLineToRelative(32.37f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.7f, -5.83f)
                lineToRelative(6.89f, -24.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.0f, -2.47f)
                lineTo(206.0f, 177.06f)
                arcToRelative(3.79f, 3.79f, 0.0f, false, false, 2.05f, -3.37f)
                verticalLineToRelative(-12.5f)
                arcToRelative(3.82f, 3.82f, 0.0f, false, true, 0.68f, -2.17f)
                lineTo(223.33f, 138.0f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, 1.78f, -1.38f)
                lineToRelative(20.43f, -7.67f)
                arcToRelative(3.79f, 3.79f, 0.0f, false, false, 2.46f, -3.55f)
                verticalLineTo(114.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -1.69f, -3.16f)
                lineTo(225.83f, 97.22f)
                arcTo(3.83f, 3.83f, 0.0f, false, false, 222.0f, 97.0f)
                lineToRelative(-27.88f, 13.94f)
                arcToRelative(3.78f, 3.78f, 0.0f, false, true, -4.0f, -0.41f)
                lineTo(176.9f, 100.08f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 0.1f, -6.0f)
                lineToRelative(10.74f, -7.91f)
                arcToRelative(3.78f, 3.78f, 0.0f, false, false, -0.09f, -6.16f)
                lineTo(170.92f, 68.34f)
                arcToRelative(3.78f, 3.78f, 0.0f, false, false, -4.0f, -0.22f)
                curveToRelative(-6.05f, 3.31f, -23.8f, 13.11f, -30.1f, 17.52f)
                arcToRelative(209.48f, 209.48f, 0.0f, false, false, -68.16f, 80.0f)
                curveToRelative(-1.82f, 3.76f, -4.07f, 7.59f, -4.29f, 11.72f)
                reflectiveCurveToRelative(-3.46f, 13.35f, -4.81f, 17.08f)
                arcToRelative(3.78f, 3.78f, 0.0f, false, false, 0.24f, 3.1f)
                lineToRelative(35.69f, 65.58f)
                arcToRelative(3.74f, 3.74f, 0.0f, false, false, 1.38f, 1.44f)
                lineToRelative(37.55f, 22.54f)
                arcToRelative(3.78f, 3.78f, 0.0f, false, true, 1.81f, 2.73f)
                lineToRelative(7.52f, 54.54f)
                arcToRelative(3.82f, 3.82f, 0.0f, false, false, 1.61f, 2.61f)
                lineToRelative(29.3f, 20.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.65f, 2.48f)
                lineToRelative(15.54f, 73.8f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, 0.49f, 1.22f)
                curveToRelative(1.46f, 2.36f, 7.28f, 11.0f, 14.3f, 12.28f)
                curveToRelative(-0.65f, 0.18f, -1.23f, 0.59f, -1.88f, 0.78f)
                arcToRelative(47.63f, 47.63f, 0.0f, false, true, 5.0f, 1.16f)
                curveToRelative(2.0f, 0.54f, 4.0f, 1.0f, 6.0f, 1.43f)
                curveToRelative(3.13f, 0.62f, 3.44f, 1.1f, 4.94f, -1.68f)
                curveToRelative(2.0f, -3.72f, 4.29f, -5.0f, 6.0f, -5.46f)
                arcToRelative(3.85f, 3.85f, 0.0f, false, false, 2.89f, -2.9f)
                lineToRelative(10.07f, -46.68f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.6f, -2.42f)
                lineToRelative(45.0f, -31.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.69f, -3.27f)
                verticalLineTo(306.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 286.4f, 302.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(262.0f, 48.0f)
                reflectiveCurveToRelative(-3.65f, 0.21f, -4.39f, 0.23f)
                quadToRelative(-8.13f, 0.24f, -16.22f, 1.12f)
                arcTo(207.45f, 207.45f, 0.0f, false, false, 184.21f, 64.0f)
                curveToRelative(2.43f, 1.68f, -1.75f, 3.22f, -1.75f, 3.22f)
                lineTo(189.0f, 80.0f)
                horizontalLineToRelative(35.0f)
                lineToRelative(24.0f, 12.0f)
                lineToRelative(21.0f, -12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(354.23f, 120.06f)
                lineToRelative(16.11f, -14.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.94f, -6.65f)
                lineToRelative(-18.81f, -8.73f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.3f, 1.9f)
                lineToRelative(-7.75f, 16.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.49f, 5.11f)
                lineToRelative(10.46f, 6.54f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 354.23f, 120.06f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(429.64f, 140.67f)
                lineToRelative(-5.83f, -9.0f)
                curveToRelative(-0.09f, -0.14f, -0.17f, -0.28f, -0.25f, -0.43f)
                curveToRelative(-1.05f, -2.15f, -9.74f, -19.7f, -17.0f, -26.51f)
                curveToRelative(-5.45f, -5.15f, -7.0f, -3.67f, -7.43f, -2.53f)
                arcToRelative(3.77f, 3.77f, 0.0f, false, true, -1.19f, 1.6f)
                lineTo(369.1f, 127.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.51f, 0.89f)
                horizontalLineTo(351.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.83f, 1.17f)
                lineToRelative(-12.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.66f)
                lineToRelative(12.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.83f, 1.17f)
                horizontalLineToRelative(75.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.17f)
                lineToRelative(-0.55f, -13.15f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 429.64f, 140.67f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 72.0f)
                arcToRelative(184.0f, 184.0f, 0.0f, true, true, -130.1f, 53.9f)
                arcTo(182.77f, 182.77f, 0.0f, false, true, 256.0f, 72.0f)
                moveToRelative(0.0f, -40.0f)
                curveTo(132.3f, 32.0f, 32.0f, 132.3f, 32.0f, 256.0f)
                reflectiveCurveTo(132.3f, 480.0f, 256.0f, 480.0f)
                reflectiveCurveTo(480.0f, 379.7f, 480.0f, 256.0f)
                reflectiveCurveTo(379.7f, 32.0f, 256.0f, 32.0f)
                close()
            }
        }
        .build()
        return _earthSharp!!
    }

private var _earthSharp: ImageVector? = null
