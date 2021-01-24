package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Code: ImageVector
    get() {
        if (_code != null) {
            return _code!!
        }
        _code = Builder(name = "Code", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(278.9f, 511.5f)
                lineToRelative(-61.0f, -17.7f)
                curveToRelative(-6.4f, -1.8f, -10.0f, -8.5f, -8.2f, -14.9f)
                lineTo(346.2f, 8.7f)
                curveToRelative(1.8f, -6.4f, 8.5f, -10.0f, 14.9f, -8.2f)
                lineToRelative(61.0f, 17.7f)
                curveToRelative(6.4f, 1.8f, 10.0f, 8.5f, 8.2f, 14.9f)
                lineTo(293.8f, 503.3f)
                curveToRelative(-1.9f, 6.4f, -8.5f, 10.1f, -14.9f, 8.2f)
                close()
                moveTo(164.9f, 399.3f)
                lineToRelative(43.5f, -46.4f)
                curveToRelative(4.6f, -4.9f, 4.3f, -12.7f, -0.8f, -17.2f)
                lineTo(117.0f, 256.0f)
                lineToRelative(90.6f, -79.7f)
                curveToRelative(5.1f, -4.5f, 5.5f, -12.3f, 0.8f, -17.2f)
                lineToRelative(-43.5f, -46.4f)
                curveToRelative(-4.5f, -4.8f, -12.1f, -5.1f, -17.0f, -0.5f)
                lineTo(3.8f, 247.2f)
                curveToRelative(-5.1f, 4.7f, -5.1f, 12.8f, 0.0f, 17.5f)
                lineToRelative(144.1f, 135.1f)
                curveToRelative(4.9f, 4.6f, 12.5f, 4.4f, 17.0f, -0.5f)
                close()
                moveTo(492.1f, 399.9f)
                lineToRelative(144.1f, -135.1f)
                curveToRelative(5.1f, -4.7f, 5.1f, -12.8f, 0.0f, -17.5f)
                lineTo(492.1f, 112.1f)
                curveToRelative(-4.8f, -4.5f, -12.4f, -4.3f, -17.0f, 0.5f)
                lineTo(431.6f, 159.0f)
                curveToRelative(-4.6f, 4.9f, -4.3f, 12.7f, 0.8f, 17.2f)
                lineTo(523.0f, 256.0f)
                lineToRelative(-90.6f, 79.7f)
                curveToRelative(-5.1f, 4.5f, -5.5f, 12.3f, -0.8f, 17.2f)
                lineToRelative(43.5f, 46.4f)
                curveToRelative(4.5f, 4.9f, 12.1f, 5.1f, 17.0f, 0.6f)
                close()
            }
        }
        .build()
        return _code!!
    }

private var _code: ImageVector? = null
