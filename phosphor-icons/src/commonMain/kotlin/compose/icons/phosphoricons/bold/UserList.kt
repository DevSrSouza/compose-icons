package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.UserList: ImageVector
    get() {
        if (_userList != null) {
            return _userList!!
        }
        _userList = Builder(name = "UserList", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(152.0f, 92.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 80.0f)
                close()
                moveTo(244.0f, 116.0f)
                lineTo(152.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(244.0f, 164.0f)
                lineTo(176.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(153.6f, 189.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -8.6f, 14.6f)
                arcToRelative(10.3f, 10.3f, 0.0f, false, true, -3.0f, 0.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.6f, -9.0f)
                arcToRelative(52.1f, 52.1f, 0.0f, false, false, -100.8f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -23.2f, -6.0f)
                arcToRelative(75.7f, 75.7f, 0.0f, false, true, 37.3f, -47.8f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 72.6f, 0.0f)
                arcTo(75.7f, 75.7f, 0.0f, false, true, 153.6f, 189.0f)
                close()
                moveTo(80.0f, 132.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 80.0f, 132.0f)
                close()
            }
        }
        .build()
        return _userList!!
    }

private var _userList: ImageVector? = null
