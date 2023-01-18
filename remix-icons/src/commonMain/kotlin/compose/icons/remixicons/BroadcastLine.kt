package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.BroadcastLine: ImageVector
    get() {
        if (_broadcastLine != null) {
            return _broadcastLine!!
        }
        _broadcastLine = Builder(name = "BroadcastLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.929f, 2.929f)
                lineToRelative(1.414f, 1.414f)
                arcTo(7.975f, 7.975f, 0.0f, false, false, 4.0f, 10.0f)
                curveToRelative(0.0f, 2.21f, 0.895f, 4.21f, 2.343f, 5.657f)
                lineTo(4.93f, 17.07f)
                arcTo(9.969f, 9.969f, 0.0f, false, true, 2.0f, 10.0f)
                arcToRelative(9.969f, 9.969f, 0.0f, false, true, 2.929f, -7.071f)
                close()
                moveTo(19.071f, 2.929f)
                arcTo(9.969f, 9.969f, 0.0f, false, true, 22.0f, 10.0f)
                arcToRelative(9.969f, 9.969f, 0.0f, false, true, -2.929f, 7.071f)
                lineToRelative(-1.414f, -1.414f)
                arcTo(7.975f, 7.975f, 0.0f, false, false, 20.0f, 10.0f)
                curveToRelative(0.0f, -2.21f, -0.895f, -4.21f, -2.343f, -5.657f)
                lineTo(19.07f, 2.93f)
                close()
                moveTo(7.757f, 5.757f)
                lineToRelative(1.415f, 1.415f)
                arcTo(3.987f, 3.987f, 0.0f, false, false, 8.0f, 10.0f)
                curveToRelative(0.0f, 1.105f, 0.448f, 2.105f, 1.172f, 2.828f)
                lineToRelative(-1.415f, 1.415f)
                arcTo(5.981f, 5.981f, 0.0f, false, true, 6.0f, 10.0f)
                curveToRelative(0.0f, -1.657f, 0.672f, -3.157f, 1.757f, -4.243f)
                close()
                moveTo(16.243f, 5.757f)
                arcTo(5.981f, 5.981f, 0.0f, false, true, 18.0f, 10.0f)
                arcToRelative(5.981f, 5.981f, 0.0f, false, true, -1.757f, 4.243f)
                lineToRelative(-1.415f, -1.415f)
                arcTo(3.987f, 3.987f, 0.0f, false, false, 16.0f, 10.0f)
                arcToRelative(3.987f, 3.987f, 0.0f, false, false, -1.172f, -2.828f)
                lineToRelative(1.415f, -1.415f)
                close()
                moveTo(12.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                close()
                moveTo(11.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                close()
            }
        }
        .build()
        return _broadcastLine!!
    }

private var _broadcastLine: ImageVector? = null
