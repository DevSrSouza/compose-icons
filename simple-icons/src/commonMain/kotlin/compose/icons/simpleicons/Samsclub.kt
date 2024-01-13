package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Samsclub: ImageVector
    get() {
        if (_samsclub != null) {
            return _samsclub!!
        }
        _samsclub = Builder(name = "Samsclub", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.275f, 1.71f)
                lineToRelative(9.403f, 9.504f)
                arcToRelative(1.119f, 1.119f, 0.0f, false, true, 0.001f, 1.569f)
                lineToRelative(-9.401f, 9.507f)
                lineToRelative(-1.624f, -1.64f)
                arcToRelative(1.136f, 1.136f, 0.0f, false, true, 0.0f, -1.596f)
                lineTo(19.631f, 12.0f)
                lineToRelative(-6.917f, -6.99f)
                arcToRelative(1.225f, 1.225f, 0.0f, false, true, 0.0f, -1.72f)
                lineToRelative(1.56f, -1.579f)
                close()
                moveTo(11.249f, 3.282f)
                lineTo(9.695f, 1.71f)
                lineTo(0.34f, 11.17f)
                arcToRelative(1.186f, 1.186f, 0.0f, false, false, 0.0f, 1.663f)
                lineToRelative(9.356f, 9.457f)
                lineToRelative(1.553f, -1.57f)
                arcToRelative(1.237f, 1.237f, 0.0f, false, false, 0.0f, -1.737f)
                lineTo(4.341f, 12.0f)
                lineToRelative(6.909f, -6.985f)
                arcToRelative(1.235f, 1.235f, 0.0f, false, false, -0.001f, -1.734f)
                close()
            }
        }
        .build()
        return _samsclub!!
    }

private var _samsclub: ImageVector? = null
