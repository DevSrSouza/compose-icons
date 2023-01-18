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

public val RegularGroup.Users: ImageVector
    get() {
        if (_users != null) {
            return _users!!
        }
        _users = Builder(name = "Users", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(121.2f, 157.9f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, false, -66.4f, 0.0f)
                arcTo(95.5f, 95.5f, 0.0f, false, false, 9.5f, 192.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.0f, 9.2f)
                arcToRelative(80.1f, 80.1f, 0.0f, false, true, 131.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.0f, -9.2f)
                arcTo(95.5f, 95.5f, 0.0f, false, false, 121.2f, 157.9f)
                close()
                moveTo(44.0f, 108.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 44.0f, 44.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 44.0f, 108.0f)
                close()
                moveTo(246.1f, 203.9f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 235.0f, 202.0f)
                arcToRelative(80.2f, 80.2f, 0.0f, false, false, -65.5f, -34.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 0.0f, -88.0f)
                arcToRelative(47.4f, 47.4f, 0.0f, false, false, -11.9f, 1.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.9f, -5.5f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 5.5f, -9.9f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 169.5f, 48.0f)
                arcToRelative(59.9f, 59.9f, 0.0f, false, true, 33.2f, 109.9f)
                arcToRelative(96.3f, 96.3f, 0.0f, false, true, 45.4f, 34.9f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 246.1f, 203.9f)
                close()
            }
        }
        .build()
        return _users!!
    }

private var _users: ImageVector? = null
