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

public val LightGroup.Users: ImageVector
    get() {
        if (_users != null) {
            return _users!!
        }
        _users = Builder(name = "Users", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.5f, 158.5f)
                arcToRelative(58.0f, 58.0f, 0.0f, true, false, -57.0f, 0.0f)
                arcToRelative(93.6f, 93.6f, 0.0f, false, false, -48.4f, 35.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.4f, 8.4f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, false, 3.5f, 1.1f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 4.9f, -2.5f)
                arcToRelative(82.0f, 82.0f, 0.0f, false, true, 134.2f, -0.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.4f, 1.5f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 1.4f, -8.4f)
                arcTo(94.4f, 94.4f, 0.0f, false, false, 116.5f, 158.5f)
                close()
                moveTo(42.0f, 108.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, true, 46.0f, 46.0f)
                arcTo(46.0f, 46.0f, 0.0f, false, true, 42.0f, 108.0f)
                close()
                moveTo(245.0f, 202.3f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, true, -3.5f, 1.1f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -4.9f, -2.6f)
                arcTo(82.0f, 82.0f, 0.0f, false, false, 169.5f, 166.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 0.0f, -92.0f)
                arcTo(48.3f, 48.3f, 0.0f, false, false, 157.0f, 63.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -3.2f, -11.5f)
                arcTo(55.6f, 55.6f, 0.0f, false, true, 169.5f, 50.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, true, 28.6f, 108.5f)
                arcToRelative(93.8f, 93.8f, 0.0f, false, true, 48.3f, 35.4f)
                arcTo(6.1f, 6.1f, 0.0f, false, true, 245.0f, 202.3f)
                close()
            }
        }
        .build()
        return _users!!
    }

private var _users: ImageVector? = null
