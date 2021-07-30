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

public val SolidGroup.Heartbeat: ImageVector
    get() {
        if (_heartbeat != null) {
            return _heartbeat!!
        }
        _heartbeat = Builder(name = "Heartbeat", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.2f, 243.8f)
                lineToRelative(-49.7f, 99.4f)
                curveToRelative(-6.0f, 12.1f, -23.4f, 11.7f, -28.9f, -0.6f)
                lineToRelative(-56.9f, -126.3f)
                lineToRelative(-30.0f, 71.7f)
                horizontalLineTo(60.6f)
                lineToRelative(182.5f, 186.5f)
                curveToRelative(7.1f, 7.3f, 18.6f, 7.3f, 25.7f, 0.0f)
                lineTo(451.4f, 288.0f)
                horizontalLineTo(342.3f)
                lineToRelative(-22.1f, -44.2f)
                close()
                moveTo(473.7f, 73.9f)
                lineToRelative(-2.4f, -2.5f)
                curveToRelative(-51.5f, -52.6f, -135.8f, -52.6f, -187.4f, 0.0f)
                lineTo(256.0f, 100.0f)
                lineToRelative(-27.9f, -28.5f)
                curveToRelative(-51.5f, -52.7f, -135.9f, -52.7f, -187.4f, 0.0f)
                lineToRelative(-2.4f, 2.4f)
                curveTo(-10.4f, 123.7f, -12.5f, 203.0f, 31.0f, 256.0f)
                horizontalLineToRelative(102.4f)
                lineToRelative(35.9f, -86.2f)
                curveToRelative(5.4f, -12.9f, 23.6f, -13.2f, 29.4f, -0.4f)
                lineToRelative(58.2f, 129.3f)
                lineToRelative(49.0f, -97.9f)
                curveToRelative(5.9f, -11.8f, 22.7f, -11.8f, 28.6f, 0.0f)
                lineToRelative(27.6f, 55.2f)
                horizontalLineTo(481.0f)
                curveToRelative(43.5f, -53.0f, 41.4f, -132.3f, -7.3f, -182.1f)
                close()
            }
        }
        .build()
        return _heartbeat!!
    }

private var _heartbeat: ImageVector? = null
