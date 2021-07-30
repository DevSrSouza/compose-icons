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

public val SolidGroup.Ruler: ImageVector
    get() {
        if (_ruler != null) {
            return _ruler!!
        }
        _ruler = Builder(name = "Ruler", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(635.7f, 167.2f)
                lineTo(556.1f, 31.7f)
                curveToRelative(-8.8f, -15.0f, -28.3f, -20.1f, -43.5f, -11.5f)
                lineToRelative(-69.0f, 39.1f)
                lineTo(503.3f, 161.0f)
                curveToRelative(2.2f, 3.8f, 0.9f, 8.5f, -2.9f, 10.7f)
                lineToRelative(-13.8f, 7.8f)
                curveToRelative(-3.8f, 2.2f, -8.7f, 0.9f, -10.9f, -2.9f)
                lineTo(416.0f, 75.0f)
                lineToRelative(-55.2f, 31.3f)
                lineToRelative(27.9f, 47.4f)
                curveToRelative(2.2f, 3.8f, 0.9f, 8.5f, -2.9f, 10.7f)
                lineToRelative(-13.8f, 7.8f)
                curveToRelative(-3.8f, 2.2f, -8.7f, 0.9f, -10.9f, -2.9f)
                lineTo(333.2f, 122.0f)
                lineTo(278.0f, 153.3f)
                lineTo(337.8f, 255.0f)
                curveToRelative(2.2f, 3.7f, 0.9f, 8.5f, -2.9f, 10.7f)
                lineToRelative(-13.8f, 7.8f)
                curveToRelative(-3.8f, 2.2f, -8.7f, 0.9f, -10.9f, -2.9f)
                lineToRelative(-59.7f, -101.7f)
                lineToRelative(-55.2f, 31.3f)
                lineToRelative(27.9f, 47.4f)
                curveToRelative(2.2f, 3.8f, 0.9f, 8.5f, -2.9f, 10.7f)
                lineToRelative(-13.8f, 7.8f)
                curveToRelative(-3.8f, 2.2f, -8.7f, 0.9f, -10.9f, -2.9f)
                lineToRelative(-27.9f, -47.5f)
                lineToRelative(-55.2f, 31.3f)
                lineToRelative(59.7f, 101.7f)
                curveToRelative(2.2f, 3.7f, 0.9f, 8.5f, -2.9f, 10.7f)
                lineToRelative(-13.8f, 7.8f)
                curveToRelative(-3.8f, 2.2f, -8.7f, 0.9f, -10.9f, -2.9f)
                lineTo(84.9f, 262.9f)
                lineToRelative(-69.0f, 39.1f)
                curveTo(0.7f, 310.7f, -4.6f, 329.8f, 4.2f, 344.8f)
                lineToRelative(79.6f, 135.6f)
                curveToRelative(8.8f, 15.0f, 28.3f, 20.1f, 43.5f, 11.5f)
                lineTo(624.1f, 210.0f)
                curveToRelative(15.2f, -8.6f, 20.4f, -27.8f, 11.6f, -42.8f)
                close()
            }
        }
        .build()
        return _ruler!!
    }

private var _ruler: ImageVector? = null
