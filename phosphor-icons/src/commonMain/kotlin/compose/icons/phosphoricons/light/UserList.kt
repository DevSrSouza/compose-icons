package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.UserList: ImageVector
    get() {
        if (_userList != null) {
            return _userList!!
        }
        _userList = Builder(name = "UserList", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(146.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(152.0f, 86.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 146.0f, 80.0f)
                close()
                moveTo(248.0f, 122.0f)
                lineTo(152.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(248.0f, 170.0f)
                lineTo(176.0f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(147.8f, 190.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.3f, 7.3f)
                lineToRelative(-1.5f, 0.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.8f, -4.5f)
                arcToRelative(58.1f, 58.1f, 0.0f, false, false, -112.4f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.6f, -3.0f)
                arcTo(69.9f, 69.9f, 0.0f, false, true, 55.0f, 142.6f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, true, 50.0f, 0.0f)
                arcTo(69.9f, 69.9f, 0.0f, false, true, 147.8f, 190.5f)
                close()
                moveTo(80.0f, 138.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -34.0f, -34.0f)
                arcTo(34.1f, 34.1f, 0.0f, false, false, 80.0f, 138.0f)
                close()
            }
        }
        .build()
        return _userList!!
    }

private var _userList: ImageVector? = null
