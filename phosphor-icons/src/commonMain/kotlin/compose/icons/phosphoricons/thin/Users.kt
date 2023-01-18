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

public val ThinGroup.Users: ImageVector
    get() {
        if (_users != null) {
            return _users!!
        }
        _users = Builder(name = "Users", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(111.1f, 159.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, -46.2f, 0.0f)
                arcToRelative(92.2f, 92.2f, 0.0f, false, false, -52.2f, 36.1f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 1.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.3f, 0.7f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 3.3f, -1.7f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 137.4f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.6f, -4.6f)
                arcTo(92.2f, 92.2f, 0.0f, false, false, 111.1f, 159.0f)
                close()
                moveTo(40.0f, 108.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, 48.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 40.0f, 108.0f)
                close()
                moveTo(243.8f, 200.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.5f, -1.0f)
                arcTo(84.3f, 84.3f, 0.0f, false, false, 169.5f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 0.0f, -96.0f)
                arcToRelative(47.4f, 47.4f, 0.0f, false, false, -13.0f, 1.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.9f, -2.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.7f, -4.9f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 192.7f, 159.0f)
                arcToRelative(92.3f, 92.3f, 0.0f, false, true, 52.1f, 36.1f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 243.8f, 200.7f)
                close()
            }
        }
        .build()
        return _users!!
    }

private var _users: ImageVector? = null
