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

public val SolidGroup.Football: ImageVector
    get() {
        if (_football != null) {
            return _football!!
        }
        _football = Builder(name = "Football", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.5f, 25.4f)
                curveToRelative(-13.5f, 3.3f, -26.4f, 7.2f, -38.6f, 11.7f)
                curveTo(142.9f, 61.6f, 96.7f, 103.6f, 66.0f, 153.6f)
                curveToRelative(-18.3f, 29.8f, -30.9f, 62.3f, -39.2f, 95.4f)
                lineTo(264.5f, 486.6f)
                curveToRelative(13.5f, -3.3f, 26.4f, -7.2f, 38.6f, -11.7f)
                curveToRelative(66.0f, -24.5f, 112.2f, -66.5f, 142.9f, -116.5f)
                curveToRelative(18.3f, -29.8f, 30.9f, -62.3f, 39.1f, -95.3f)
                lineTo(247.5f, 25.4f)
                close()
                moveTo(495.2f, 205.3f)
                curveToRelative(6.1f, -56.8f, 1.4f, -112.2f, -7.7f, -156.4f)
                curveToRelative(-2.7f, -12.9f, -13.0f, -22.9f, -26.1f, -25.1f)
                curveToRelative(-58.2f, -9.7f, -109.9f, -12.0f, -155.6f, -7.9f)
                lineTo(495.2f, 205.3f)
                close()
                moveTo(206.1f, 496.0f)
                lineTo(16.8f, 306.7f)
                curveToRelative(-6.1f, 56.8f, -1.4f, 112.2f, 7.7f, 156.4f)
                curveToRelative(2.7f, 12.9f, 13.0f, 22.9f, 26.1f, 25.1f)
                curveToRelative(58.2f, 9.7f, 109.9f, 12.0f, 155.6f, 7.9f)
                close()
                moveTo(260.7f, 164.7f)
                curveToRelative(6.2f, -6.2f, 16.4f, -6.2f, 22.6f, 0.0f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(6.2f, 6.2f, 6.2f, 16.4f, 0.0f, 22.6f)
                reflectiveCurveToRelative(-16.4f, 6.2f, -22.6f, 0.0f)
                lineToRelative(-64.0f, -64.0f)
                curveToRelative(-6.2f, -6.2f, -6.2f, -16.4f, 0.0f, -22.6f)
                close()
                moveTo(212.7f, 212.7f)
                curveToRelative(6.2f, -6.2f, 16.4f, -6.2f, 22.6f, 0.0f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(6.2f, 6.2f, 6.2f, 16.4f, 0.0f, 22.6f)
                reflectiveCurveToRelative(-16.4f, 6.2f, -22.6f, 0.0f)
                lineToRelative(-64.0f, -64.0f)
                curveToRelative(-6.2f, -6.2f, -6.2f, -16.4f, 0.0f, -22.6f)
                close()
                moveTo(164.7f, 260.7f)
                curveToRelative(6.2f, -6.2f, 16.4f, -6.2f, 22.6f, 0.0f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(6.2f, 6.2f, 6.2f, 16.4f, 0.0f, 22.6f)
                reflectiveCurveToRelative(-16.4f, 6.2f, -22.6f, 0.0f)
                lineToRelative(-64.0f, -64.0f)
                curveToRelative(-6.2f, -6.2f, -6.2f, -16.4f, 0.0f, -22.6f)
                close()
            }
        }
        .build()
        return _football!!
    }

private var _football: ImageVector? = null
