package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.LifeRing: ImageVector
    get() {
        if (_lifeRing != null) {
            return _lifeRing!!
        }
        _lifeRing = Builder(name = "LifeRing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(367.2f, 412.5f)
                curveTo(335.9f, 434.9f, 297.5f, 448.0f, 256.0f, 448.0f)
                reflectiveCurveToRelative(-79.9f, -13.1f, -111.2f, -35.5f)
                lineToRelative(58.0f, -58.0f)
                curveToRelative(15.8f, 8.6f, 34.0f, 13.5f, 53.3f, 13.5f)
                reflectiveCurveToRelative(37.4f, -4.9f, 53.3f, -13.5f)
                lineToRelative(58.0f, 58.0f)
                close()
                moveTo(457.9f, 413.3f)
                curveToRelative(33.8f, -43.4f, 54.0f, -98.0f, 54.0f, -157.3f)
                reflectiveCurveToRelative(-20.2f, -113.9f, -54.0f, -157.3f)
                curveToRelative(9.0f, -12.5f, 7.9f, -30.1f, -3.4f, -41.3f)
                reflectiveCurveTo(425.8f, 45.0f, 413.3f, 54.0f)
                curveTo(369.9f, 20.2f, 315.3f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveTo(142.1f, 20.2f, 98.7f, 54.0f)
                curveToRelative(-12.5f, -9.0f, -30.1f, -7.9f, -41.3f, 3.4f)
                reflectiveCurveTo(45.0f, 86.2f, 54.0f, 98.7f)
                curveTo(20.2f, 142.1f, 0.0f, 196.7f, 0.0f, 256.0f)
                reflectiveCurveToRelative(20.2f, 113.9f, 54.0f, 157.3f)
                curveToRelative(-9.0f, 12.5f, -7.9f, 30.1f, 3.4f, 41.3f)
                reflectiveCurveTo(86.2f, 467.0f, 98.7f, 458.0f)
                curveToRelative(43.4f, 33.8f, 98.0f, 54.0f, 157.3f, 54.0f)
                reflectiveCurveToRelative(113.9f, -20.2f, 157.3f, -54.0f)
                curveToRelative(12.5f, 9.0f, 30.1f, 7.9f, 41.3f, -3.4f)
                reflectiveCurveToRelative(12.4f, -28.8f, 3.4f, -41.3f)
                close()
                moveTo(412.4f, 367.2f)
                lineToRelative(-58.0f, -58.0f)
                curveToRelative(8.6f, -15.8f, 13.5f, -34.0f, 13.5f, -53.3f)
                reflectiveCurveToRelative(-4.9f, -37.4f, -13.5f, -53.3f)
                lineToRelative(58.0f, -58.0f)
                curveTo(434.9f, 176.1f, 448.0f, 214.5f, 448.0f, 256.0f)
                reflectiveCurveToRelative(-13.1f, 79.9f, -35.5f, 111.2f)
                close()
                moveTo(367.2f, 99.5f)
                lineToRelative(-58.0f, 58.0f)
                curveToRelative(-15.8f, -8.6f, -34.0f, -13.5f, -53.3f, -13.5f)
                reflectiveCurveToRelative(-37.4f, 4.9f, -53.3f, 13.5f)
                lineToRelative(-58.0f, -58.0f)
                curveTo(176.1f, 77.1f, 214.5f, 64.0f, 256.0f, 64.0f)
                reflectiveCurveToRelative(79.9f, 13.1f, 111.2f, 35.5f)
                close()
                moveTo(157.5f, 309.3f)
                lineToRelative(-58.0f, 58.0f)
                curveTo(77.1f, 335.9f, 64.0f, 297.5f, 64.0f, 256.0f)
                reflectiveCurveToRelative(13.1f, -79.9f, 35.5f, -111.2f)
                lineToRelative(58.0f, 58.0f)
                curveToRelative(-8.6f, 15.8f, -13.5f, 34.0f, -13.5f, 53.3f)
                reflectiveCurveToRelative(4.9f, 37.4f, 13.5f, 53.3f)
                close()
                moveTo(208.0f, 256.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                close()
            }
        }
        .build()
        return _lifeRing!!
    }

private var _lifeRing: ImageVector? = null
