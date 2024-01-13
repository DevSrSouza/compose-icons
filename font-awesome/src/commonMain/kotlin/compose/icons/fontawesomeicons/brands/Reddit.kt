package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Reddit: ImageVector
    get() {
        if (_reddit != null) {
            return _reddit!!
        }
        _reddit = Builder(name = "Reddit", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 256.0f)
                curveTo(0.0f, 114.6f, 114.6f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveTo(512.0f, 114.6f, 512.0f, 256.0f)
                reflectiveCurveToRelative(-114.6f, 256.0f, -256.0f, 256.0f)
                lineTo(37.1f, 512.0f)
                curveToRelative(-13.7f, 0.0f, -20.5f, -16.5f, -10.9f, -26.2f)
                lineTo(75.0f, 437.0f)
                curveTo(28.7f, 390.7f, 0.0f, 326.7f, 0.0f, 256.0f)
                close()
                moveTo(349.6f, 153.6f)
                curveToRelative(23.6f, 0.0f, 42.7f, -19.1f, 42.7f, -42.7f)
                reflectiveCurveToRelative(-19.1f, -42.7f, -42.7f, -42.7f)
                curveToRelative(-20.6f, 0.0f, -37.8f, 14.6f, -41.8f, 34.0f)
                curveToRelative(-34.5f, 3.7f, -61.4f, 33.0f, -61.4f, 68.4f)
                lineToRelative(0.0f, 0.2f)
                curveToRelative(-37.5f, 1.6f, -71.8f, 12.3f, -99.0f, 29.1f)
                curveToRelative(-10.1f, -7.8f, -22.8f, -12.5f, -36.5f, -12.5f)
                curveToRelative(-33.0f, 0.0f, -59.8f, 26.8f, -59.8f, 59.8f)
                curveToRelative(0.0f, 24.0f, 14.1f, 44.6f, 34.4f, 54.1f)
                curveToRelative(2.0f, 69.4f, 77.6f, 125.2f, 170.6f, 125.2f)
                reflectiveCurveToRelative(168.7f, -55.9f, 170.6f, -125.3f)
                curveToRelative(20.2f, -9.6f, 34.1f, -30.2f, 34.1f, -54.0f)
                curveToRelative(0.0f, -33.0f, -26.8f, -59.8f, -59.8f, -59.8f)
                curveToRelative(-13.7f, 0.0f, -26.3f, 4.6f, -36.4f, 12.4f)
                curveToRelative(-27.4f, -17.0f, -62.1f, -27.7f, -100.0f, -29.1f)
                lineToRelative(0.0f, -0.2f)
                curveToRelative(0.0f, -25.4f, 18.9f, -46.5f, 43.4f, -49.9f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(4.4f, 18.8f, 21.3f, 32.8f, 41.5f, 32.8f)
                close()
                moveTo(177.1f, 246.9f)
                curveToRelative(16.7f, 0.0f, 29.5f, 17.6f, 28.5f, 39.3f)
                reflectiveCurveToRelative(-13.5f, 29.6f, -30.3f, 29.6f)
                reflectiveCurveToRelative(-31.4f, -8.8f, -30.4f, -30.5f)
                reflectiveCurveToRelative(15.4f, -38.3f, 32.1f, -38.3f)
                close()
                moveTo(367.2f, 285.2f)
                curveToRelative(1.0f, 21.7f, -13.7f, 30.5f, -30.4f, 30.5f)
                reflectiveCurveToRelative(-29.3f, -7.9f, -30.3f, -29.6f)
                curveToRelative(-1.0f, -21.7f, 11.8f, -39.3f, 28.5f, -39.3f)
                reflectiveCurveToRelative(31.2f, 16.6f, 32.1f, 38.3f)
                close()
                moveTo(319.1f, 341.9f)
                curveToRelative(-10.3f, 24.6f, -34.6f, 41.9f, -63.0f, 41.9f)
                reflectiveCurveToRelative(-52.7f, -17.3f, -63.0f, -41.9f)
                curveToRelative(-1.2f, -2.9f, 0.8f, -6.2f, 3.9f, -6.5f)
                curveToRelative(18.4f, -1.9f, 38.3f, -2.9f, 59.1f, -2.9f)
                reflectiveCurveToRelative(40.7f, 1.0f, 59.1f, 2.9f)
                curveToRelative(3.1f, 0.3f, 5.1f, 3.6f, 3.9f, 6.5f)
                close()
            }
        }
        .build()
        return _reddit!!
    }

private var _reddit: ImageVector? = null
