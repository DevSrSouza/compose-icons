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

public val SolidGroup.HandSpock: ImageVector
    get() {
        if (_handSpock != null) {
            return _handSpock!!
        }
        _handSpock = Builder(name = "HandSpock", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.9f, 23.7f)
                curveTo(242.3f, 6.6f, 224.8f, -3.5f, 207.7f, 1.1f)
                reflectiveCurveToRelative(-27.2f, 22.1f, -22.6f, 39.2f)
                lineTo(238.0f, 237.8f)
                curveToRelative(2.5f, 9.2f, -4.5f, 18.2f, -14.0f, 18.2f)
                curveToRelative(-6.4f, 0.0f, -12.0f, -4.2f, -13.9f, -10.3f)
                lineTo(166.6f, 102.7f)
                curveToRelative(-5.1f, -16.9f, -23.0f, -26.4f, -39.9f, -21.3f)
                reflectiveCurveToRelative(-26.4f, 23.0f, -21.3f, 39.9f)
                lineToRelative(62.8f, 206.4f)
                curveToRelative(2.4f, 7.9f, -7.2f, 13.8f, -13.2f, 8.1f)
                lineTo(99.6f, 283.0f)
                curveToRelative(-16.0f, -15.2f, -41.3f, -14.6f, -56.6f, 1.4f)
                reflectiveCurveToRelative(-14.6f, 41.3f, 1.4f, 56.6f)
                lineTo(156.8f, 448.0f)
                curveToRelative(43.1f, 41.1f, 100.4f, 64.0f, 160.0f, 64.0f)
                horizontalLineToRelative(10.9f)
                horizontalLineToRelative(8.2f)
                curveToRelative(0.1f, 0.0f, 0.1f, -0.1f, 0.1f, -0.1f)
                reflectiveCurveToRelative(0.1f, -0.1f, 0.1f, -0.1f)
                curveToRelative(58.3f, -3.5f, 108.6f, -43.2f, 125.3f, -99.7f)
                lineToRelative(81.2f, -275.0f)
                curveToRelative(5.0f, -16.9f, -4.7f, -34.7f, -21.6f, -39.8f)
                reflectiveCurveToRelative(-34.7f, 4.7f, -39.8f, 21.6f)
                lineTo(443.5f, 247.1f)
                curveToRelative(-1.6f, 5.3f, -6.4f, 8.9f, -12.0f, 8.9f)
                curveToRelative(-7.9f, 0.0f, -13.8f, -7.3f, -12.2f, -15.1f)
                lineToRelative(36.0f, -170.3f)
                curveToRelative(3.7f, -17.3f, -7.4f, -34.3f, -24.7f, -37.9f)
                reflectiveCurveToRelative(-34.3f, 7.4f, -37.9f, 24.7f)
                lineTo(355.1f, 235.1f)
                curveToRelative(-2.6f, 12.2f, -13.3f, 20.9f, -25.8f, 20.9f)
                curveToRelative(-11.9f, 0.0f, -22.4f, -8.0f, -25.4f, -19.5f)
                lineToRelative(-57.0f, -212.8f)
                close()
            }
        }
        .build()
        return _handSpock!!
    }

private var _handSpock: ImageVector? = null
