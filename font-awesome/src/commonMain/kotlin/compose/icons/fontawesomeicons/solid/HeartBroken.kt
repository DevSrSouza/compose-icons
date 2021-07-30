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

public val SolidGroup.HeartBroken: ImageVector
    get() {
        if (_heartBroken != null) {
            return _heartBroken!!
        }
        _heartBroken = Builder(name = "HeartBroken", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(473.7f, 73.8f)
                lineToRelative(-2.4f, -2.5f)
                curveToRelative(-46.0f, -47.0f, -118.0f, -51.7f, -169.6f, -14.8f)
                lineTo(336.0f, 159.9f)
                lineToRelative(-96.0f, 64.0f)
                lineToRelative(48.0f, 128.0f)
                lineToRelative(-144.0f, -144.0f)
                lineToRelative(96.0f, -64.0f)
                lineToRelative(-28.6f, -86.5f)
                curveTo(159.7f, 19.6f, 87.0f, 24.0f, 40.7f, 71.4f)
                lineToRelative(-2.4f, 2.4f)
                curveTo(-10.4f, 123.6f, -12.5f, 202.9f, 31.0f, 256.0f)
                lineToRelative(212.1f, 218.6f)
                curveToRelative(7.1f, 7.3f, 18.6f, 7.3f, 25.7f, 0.0f)
                lineTo(481.0f, 255.9f)
                curveToRelative(43.5f, -53.0f, 41.4f, -132.3f, -7.3f, -182.1f)
                close()
            }
        }
        .build()
        return _heartBroken!!
    }

private var _heartBroken: ImageVector? = null
