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

public val ThinGroup.UserCirclePlus: ImageVector
    get() {
        if (_userCirclePlus != null) {
            return _userCirclePlus!!
        }
        _userCirclePlus = Builder(name = "UserCirclePlus", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(20.0f)
                lineTo(196.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(204.0f, 52.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(204.0f, 60.0f)
                lineTo(204.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(196.0f, 60.0f)
                lineTo(176.0f, 60.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 172.0f, 56.0f)
                close()
                moveTo(226.8f, 112.2f)
                arcTo(104.1f, 104.1f, 0.0f, false, true, 228.0f, 128.0f)
                arcToRelative(99.6f, 99.6f, 0.0f, false, true, -32.7f, 73.9f)
                lineToRelative(-0.8f, 0.8f)
                arcToRelative(99.9f, 99.9f, 0.0f, false, true, -132.9f, 0.0f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, -0.9f, -0.8f)
                arcTo(100.0f, 100.0f, 0.0f, false, true, 128.0f, 28.0f)
                arcToRelative(104.1f, 104.1f, 0.0f, false, true, 15.8f, 1.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.3f, 4.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.6f, 3.3f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 128.0f, 36.0f)
                arcTo(92.0f, 92.0f, 0.0f, false, false, 62.8f, 192.9f)
                arcToRelative(75.8f, 75.8f, 0.0f, false, true, 44.5f, -34.1f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 41.4f, 0.0f)
                arcToRelative(75.8f, 75.8f, 0.0f, false, true, 44.5f, 34.1f)
                arcTo(92.1f, 92.1f, 0.0f, false, false, 220.0f, 128.0f)
                arcToRelative(99.0f, 99.0f, 0.0f, false, false, -1.1f, -14.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.3f, -4.6f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 226.8f, 112.2f)
                close()
                moveTo(128.0f, 156.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 128.0f, 156.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(91.3f, 91.3f, 0.0f, false, false, 59.1f, -21.6f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -118.2f, 0.0f)
                arcTo(91.3f, 91.3f, 0.0f, false, false, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return _userCirclePlus!!
    }

private var _userCirclePlus: ImageVector? = null
