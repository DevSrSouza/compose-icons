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

public val IonIcons.RoseSharp: ImageVector
    get() {
        if (_roseSharp != null) {
            return _roseSharp!!
        }
        _roseSharp = Builder(name = "RoseSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 112.0f)
                reflectiveCurveToRelative(-17.62f, 0.0f, -30.51f, 1.39f)
                curveToRelative(-19.0f, 2.0f, -42.06f, 8.0f, -59.73f, 13.22f)
                curveTo(322.7f, 137.0f, 288.43f, 150.53f, 249.91f, 169.2f)
                curveToRelative(-18.62f, 9.05f, -26.0f, 13.35f, -48.0f, 26.13f)
                lineTo(197.41f, 198.0f)
                curveToRelative(-32.95f, 19.0f, -57.09f, 40.0f, -73.79f, 64.3f)
                curveTo(105.29f, 288.89f, 96.0f, 320.0f, 96.0f, 354.64f)
                curveToRelative(0.0f, 40.74f, 15.71f, 77.1f, 44.24f, 102.37f)
                curveTo(169.0f, 482.52f, 209.06f, 496.0f, 256.0f, 496.0f)
                curveToRelative(46.76f, 0.0f, 86.89f, -14.32f, 116.0f, -41.43f)
                curveToRelative(28.35f, -26.35f, 44.0f, -63.39f, 44.0f, -104.29f)
                curveToRelative(0.0f, -25.0f, -6.19f, -47.0f, -12.17f, -68.22f)
                curveToRelative(-12.59f, -44.69f, -23.46f, -83.29f, 24.71f, -144.13f)
                curveTo(432.75f, 132.62f, 448.0f, 112.0f, 448.0f, 112.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.0f, 119.55f)
                curveTo(168.47f, 92.08f, 104.72f, 80.0f, 80.0f, 80.0f)
                curveToRelative(0.0f, 0.0f, 23.23f, 28.19f, 29.15f, 55.4f)
                reflectiveCurveToRelative(6.54f, 48.61f, 2.91f, 88.6f)
                curveToRelative(17.94f, -20.48f, 40.59f, -37.15f, 69.32f, -53.73f)
                lineToRelative(4.48f, -2.6f)
                curveTo(208.0f, 154.8f, 216.23f, 150.0f, 236.0f, 140.41f)
                curveToRelative(2.88f, -1.4f, 5.74f, -2.76f, 8.58f, -4.11f)
                arcTo(170.77f, 170.77f, 0.0f, false, false, 219.0f, 119.55f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(345.25f, 48.0f)
                reflectiveCurveToRelative(-42.53f, 0.36f, -86.12f, 21.3f)
                arcToRelative(280.36f, 280.36f, 0.0f, false, false, -32.27f, 18.27f)
                quadToRelative(3.73f, 1.89f, 7.4f, 3.88f)
                curveToRelative(3.44f, 1.87f, 7.09f, 4.0f, 10.9f, 6.29f)
                arcToRelative(189.7f, 189.7f, 0.0f, false, true, 31.46f, 24.16f)
                curveToRelative(24.57f, -10.41f, 73.0f, -26.1f, 90.77f, -31.28f)
                curveTo(359.39f, 71.47f, 345.25f, 48.0f, 345.25f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 16.0f)
                curveToRelative(-16.0f, 10.83f, -33.24f, 41.1f, -33.24f, 41.1f)
                arcToRelative(494.22f, 494.22f, 0.0f, false, true, 48.92f, 15.25f)
                lineToRelative(17.65f, -11.56f)
                curveToRelative(8.18f, -5.35f, 16.55f, -10.29f, 25.0f, -14.77f)
                curveTo(234.31f, 46.0f, 202.59f, 24.17f, 176.0f, 16.0f)
                close()
            }
        }
        .build()
        return _roseSharp!!
    }

private var _roseSharp: ImageVector? = null
