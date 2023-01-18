package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.UserList: ImageVector
    get() {
        if (_userList != null) {
            return _userList!!
        }
        _userList = Builder(name = "UserList", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(149.7f, 190.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -1.4f, 6.9f)
                arcTo(7.8f, 7.8f, 0.0f, false, true, 142.0f, 200.0f)
                lineTo(18.0f, 200.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -6.3f, -3.1f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -1.4f, -6.9f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, 40.6f, -47.9f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 58.2f, 0.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, true, 149.7f, 190.0f)
                close()
                moveTo(152.0f, 88.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(152.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(248.0f, 168.0f)
                lineTo(176.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(248.0f, 120.0f)
                lineTo(152.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _userList!!
    }

private var _userList: ImageVector? = null
