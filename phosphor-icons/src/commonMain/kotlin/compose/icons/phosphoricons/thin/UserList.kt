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

public val ThinGroup.UserList: ImageVector
    get() {
        if (_userList != null) {
            return _userList!!
        }
        _userList = Builder(name = "UserList", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(152.0f, 84.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 148.0f, 80.0f)
                close()
                moveTo(248.0f, 124.0f)
                lineTo(152.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(248.0f, 172.0f)
                lineTo(176.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(145.9f, 191.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -2.9f, 4.9f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.9f, -3.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -116.2f, 0.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -4.9f, 2.9f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -2.9f, -4.9f)
                arcToRelative(67.7f, 67.7f, 0.0f, false, true, 45.7f, -47.9f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 40.4f, 0.0f)
                arcTo(67.7f, 67.7f, 0.0f, false, true, 145.9f, 191.0f)
                close()
                moveTo(80.0f, 140.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 80.0f, 140.0f)
                close()
            }
        }
        .build()
        return _userList!!
    }

private var _userList: ImageVector? = null
