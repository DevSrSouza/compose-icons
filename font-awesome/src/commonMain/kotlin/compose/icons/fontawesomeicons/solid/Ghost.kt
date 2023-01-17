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

public val SolidGroup.Ghost: ImageVector
    get() {
        if (_ghost != null) {
            return _ghost!!
        }
        _ghost = Builder(name = "Ghost", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(50.8f, 452.1f)
                lineTo(19.2f, 477.4f)
                curveToRelative(-2.1f, 1.7f, -4.7f, 2.6f, -7.4f, 2.6f)
                curveTo(5.3f, 480.0f, 0.0f, 474.7f, 0.0f, 468.2f)
                lineTo(0.0f, 192.0f)
                curveTo(0.0f, 86.0f, 86.0f, 0.0f, 192.0f, 0.0f)
                reflectiveCurveTo(384.0f, 86.0f, 384.0f, 192.0f)
                lineTo(384.0f, 468.2f)
                curveToRelative(0.0f, 6.5f, -5.3f, 11.8f, -11.8f, 11.8f)
                curveToRelative(-2.7f, 0.0f, -5.3f, -0.9f, -7.4f, -2.6f)
                lineToRelative(-31.6f, -25.3f)
                curveToRelative(-3.3f, -2.7f, -7.5f, -4.1f, -11.8f, -4.1f)
                curveToRelative(-5.9f, 0.0f, -11.5f, 2.8f, -15.0f, 7.5f)
                lineToRelative(-37.6f, 50.1f)
                curveToRelative(-3.0f, 4.0f, -7.8f, 6.4f, -12.8f, 6.4f)
                reflectiveCurveToRelative(-9.8f, -2.4f, -12.8f, -6.4f)
                lineToRelative(-38.4f, -51.2f)
                curveToRelative(-3.0f, -4.0f, -7.8f, -6.4f, -12.8f, -6.4f)
                reflectiveCurveToRelative(-9.8f, 2.4f, -12.8f, 6.4f)
                lineToRelative(-38.4f, 51.2f)
                curveToRelative(-3.0f, 4.0f, -7.8f, 6.4f, -12.8f, 6.4f)
                reflectiveCurveToRelative(-9.8f, -2.4f, -12.8f, -6.4f)
                lineTo(77.6f, 455.5f)
                curveToRelative(-3.6f, -4.7f, -9.1f, -7.5f, -15.0f, -7.5f)
                curveToRelative(-4.3f, 0.0f, -8.4f, 1.5f, -11.7f, 4.1f)
                close()
                moveTo(160.0f, 192.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                close()
                moveTo(256.0f, 224.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _ghost!!
    }

private var _ghost: ImageVector? = null
