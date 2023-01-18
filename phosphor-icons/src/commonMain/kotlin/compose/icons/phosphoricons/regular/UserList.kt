package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.UserList: ImageVector
    get() {
        if (_userList != null) {
            return _userList!!
        }
        _userList = Builder(name = "UserList", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(152.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 144.0f, 80.0f)
                close()
                moveTo(248.0f, 120.0f)
                lineTo(152.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(248.0f, 168.0f)
                lineTo(176.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(149.7f, 190.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -5.7f, 9.7f)
                lineToRelative(-2.0f, 0.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -7.8f, -6.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -108.4f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.8f, 5.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -5.7f, -9.7f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, 40.6f, -47.9f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 58.2f, 0.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, true, 149.7f, 190.0f)
                close()
                moveTo(80.0f, 136.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 80.0f, 136.0f)
                close()
            }
        }
        .build()
        return _userList!!
    }

private var _userList: ImageVector? = null
