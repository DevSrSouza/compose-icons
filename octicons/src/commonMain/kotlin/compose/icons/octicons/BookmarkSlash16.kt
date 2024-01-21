package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.BookmarkSlash16: ImageVector
    get() {
        if (_bookmarkSlash16 != null) {
            return _bookmarkSlash16!!
        }
        _bookmarkSlash16 = Builder(name = "BookmarkSlash16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.19f, 1.143f)
                lineTo(4.182f, 3.31f)
                lineToRelative(0.014f, 0.01f)
                lineToRelative(8.486f, 6.145f)
                lineToRelative(0.014f, 0.01f)
                lineToRelative(2.994f, 2.168f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.88f, 1.214f)
                lineTo(13.0f, 11.547f)
                verticalLineToRelative(2.703f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.206f, 0.596f)
                lineTo(8.0f, 11.944f)
                lineToRelative(-3.794f, 2.902f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 3.0f, 14.25f)
                verticalLineTo(4.305f)
                lineTo(0.31f, 2.357f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.88f, -1.214f)
                close()
                moveTo(4.5f, 5.39f)
                verticalLineToRelative(7.341f)
                lineToRelative(3.044f, -2.328f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.912f, 0.0f)
                lineToRelative(3.044f, 2.328f)
                verticalLineTo(10.46f)
                close()
                moveTo(5.865f, 1.0f)
                horizontalLineToRelative(5.385f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(3.624f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(2.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineTo(5.865f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
            }
        }
        .build()
        return _bookmarkSlash16!!
    }

private var _bookmarkSlash16: ImageVector? = null
