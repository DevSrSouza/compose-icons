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

public val BoldGroup.Users: ImageVector
    get() {
        if (_users != null) {
            return _users!!
        }
        _users = Builder(name = "Users", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(129.2f, 156.9f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -82.4f, 0.0f)
                arcTo(100.1f, 100.1f, 0.0f, false, false, 6.2f, 190.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.9f, 16.7f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 6.9f, 2.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 9.8f, -5.1f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, 124.4f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 19.6f, -13.8f)
                arcTo(100.1f, 100.1f, 0.0f, false, false, 129.2f, 156.9f)
                close()
                moveTo(48.0f, 108.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 48.0f, 108.0f)
                close()
                moveTo(248.4f, 207.2f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, -6.9f, 2.2f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -9.8f, -5.1f)
                arcTo(76.2f, 76.2f, 0.0f, false, false, 169.5f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, -80.0f)
                arcToRelative(39.1f, 39.1f, 0.0f, false, false, -10.8f, 1.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -6.5f, -23.1f)
                arcTo(62.8f, 62.8f, 0.0f, false, true, 169.5f, 44.0f)
                arcToRelative(63.9f, 63.9f, 0.0f, false, true, 41.2f, 112.9f)
                arcToRelative(100.1f, 100.1f, 0.0f, false, true, 40.6f, 33.6f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 248.4f, 207.2f)
                close()
            }
        }
        .build()
        return _users!!
    }

private var _users: ImageVector? = null
