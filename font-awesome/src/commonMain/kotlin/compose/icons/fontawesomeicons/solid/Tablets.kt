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

public val SolidGroup.Tablets: ImageVector
    get() {
        if (_tablets != null) {
            return _tablets!!
        }
        _tablets = Builder(name = "Tablets", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(614.3f, 247.0f)
                curveToRelative(16.3f, -25.0f, 25.7f, -54.9f, 25.7f, -87.0f)
                curveTo(640.0f, 71.6f, 568.4f, 0.0f, 480.0f, 0.0f)
                curveToRelative(-32.1f, 0.0f, -61.9f, 9.4f, -87.0f, 25.7f)
                curveToRelative(-7.9f, 5.2f, -8.5f, 16.2f, -1.8f, 22.9f)
                lineTo(591.4f, 248.8f)
                curveToRelative(6.7f, 6.7f, 17.8f, 6.2f, 22.9f, -1.8f)
                close()
                moveTo(567.0f, 294.3f)
                curveToRelative(7.9f, -5.2f, 8.5f, -16.2f, 1.8f, -22.9f)
                lineTo(368.6f, 71.2f)
                curveToRelative(-6.7f, -6.7f, -17.8f, -6.2f, -22.9f, 1.8f)
                curveToRelative(-16.3f, 25.0f, -25.7f, 54.9f, -25.7f, 87.0f)
                curveToRelative(0.0f, 88.4f, 71.6f, 160.0f, 160.0f, 160.0f)
                curveToRelative(32.1f, 0.0f, 61.9f, -9.4f, 87.0f, -25.7f)
                close()
                moveTo(301.5f, 368.0f)
                lineTo(18.5f, 368.0f)
                curveToRelative(-9.5f, 0.0f, -16.9f, 8.2f, -15.0f, 17.5f)
                curveTo(18.9f, 457.8f, 83.1f, 512.0f, 160.0f, 512.0f)
                reflectiveCurveToRelative(141.1f, -54.2f, 156.5f, -126.5f)
                curveToRelative(2.0f, -9.3f, -5.5f, -17.5f, -15.0f, -17.5f)
                close()
                moveTo(301.5f, 336.0f)
                curveToRelative(9.5f, 0.0f, 16.9f, -8.2f, 15.0f, -17.5f)
                curveTo(301.1f, 246.2f, 236.9f, 192.0f, 160.0f, 192.0f)
                reflectiveCurveTo(18.9f, 246.2f, 3.5f, 318.5f)
                curveToRelative(-2.0f, 9.3f, 5.5f, 17.5f, 15.0f, 17.5f)
                lineTo(301.5f, 336.0f)
                close()
            }
        }
        .build()
        return _tablets!!
    }

private var _tablets: ImageVector? = null
