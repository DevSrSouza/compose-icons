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

public val RemixIcons.ServiceLine: ImageVector
    get() {
        if (_serviceLine != null) {
            return _serviceLine!!
        }
        _serviceLine = Builder(name = "ServiceLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.161f, 4.469f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 8.84f, -0.328f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 9.178f, 9.154f)
                lineToRelative(-7.765f, 7.79f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.719f, 0.102f)
                lineToRelative(-0.11f, -0.101f)
                lineToRelative(-7.764f, -7.791f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 0.34f, -8.826f)
                close()
                moveTo(4.575f, 5.883f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -0.146f, 6.21f)
                lineToRelative(0.146f, 0.154f)
                lineTo(12.0f, 19.672f)
                lineToRelative(5.303f, -5.304f)
                lineToRelative(-3.535f, -3.535f)
                lineToRelative(-1.06f, 1.06f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -4.244f, -4.242f)
                lineToRelative(2.102f, -2.103f)
                arcToRelative(4.501f, 4.501f, 0.0f, false, false, -5.837f, 0.189f)
                lineToRelative(-0.154f, 0.146f)
                close()
                moveTo(13.061f, 8.711f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                lineToRelative(4.242f, 4.242f)
                lineToRelative(0.708f, -0.706f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -6.211f, -6.51f)
                lineToRelative(-0.153f, 0.146f)
                lineToRelative(-3.182f, 3.182f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.078f, 1.327f)
                lineToRelative(0.078f, 0.087f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.327f, 0.078f)
                lineToRelative(0.087f, -0.078f)
                lineToRelative(1.768f, -1.768f)
                close()
            }
        }
        .build()
        return _serviceLine!!
    }

private var _serviceLine: ImageVector? = null
