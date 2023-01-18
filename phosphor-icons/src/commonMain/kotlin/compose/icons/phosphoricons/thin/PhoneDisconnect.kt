package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.PhoneDisconnect: ImageVector
    get() {
        if (_phoneDisconnect != null) {
            return _phoneDisconnect!!
        }
        _phoneDisconnect = Builder(name = "PhoneDisconnect", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.0f, 93.0f)
                curveTo(172.4f, 38.4f, 83.6f, 38.4f, 29.0f, 93.0f)
                arcToRelative(52.1f, 52.1f, 0.0f, false, false, -4.4f, 68.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.0f, 3.7f)
                lineToRelative(47.3f, -18.9f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 7.3f, -8.8f)
                lineToRelative(5.9f, -29.5f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, 2.5f, -2.9f)
                arcToRelative(80.7f, 80.7f, 0.0f, false, true, 52.5f, -0.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 2.5f, 3.0f)
                lineToRelative(6.2f, 29.7f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 7.3f, 8.7f)
                lineToRelative(47.3f, 18.9f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 14.0f, -3.7f)
                arcTo(52.1f, 52.1f, 0.0f, false, false, 227.0f, 93.0f)
                close()
                moveTo(225.0f, 156.7f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -4.6f, 1.2f)
                lineTo(173.1f, 139.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -2.5f, -2.9f)
                lineToRelative(-6.2f, -29.8f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, -7.7f, -8.8f)
                horizontalLineToRelative(0.0f)
                arcToRelative(88.7f, 88.7f, 0.0f, false, false, -57.8f, 0.1f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -7.7f, 8.9f)
                lineToRelative(-5.9f, 29.6f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -2.4f, 2.9f)
                lineTo(35.6f, 157.9f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -4.6f, -1.2f)
                arcToRelative(43.9f, 43.9f, 0.0f, false, true, 3.7f, -58.0f)
                arcToRelative(132.1f, 132.1f, 0.0f, false, true, 186.6f, 0.0f)
                arcTo(43.9f, 43.9f, 0.0f, false, true, 225.0f, 156.7f)
                close()
                moveTo(220.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(40.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(216.0f, 196.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 200.0f)
                close()
            }
        }
        .build()
        return _phoneDisconnect!!
    }

private var _phoneDisconnect: ImageVector? = null
