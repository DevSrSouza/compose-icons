package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                    pathFillType = EvenOdd) {
                moveTo(1.19f, 1.143f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -0.88f, 1.214f)
                lineTo(3.0f, 4.305f)
                verticalLineToRelative(9.945f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.206f, 0.596f)
                lineTo(8.0f, 11.944f)
                lineToRelative(3.794f, 2.902f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 13.0f, 14.25f)
                verticalLineToRelative(-2.703f)
                lineToRelative(1.81f, 1.31f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.88f, -1.214f)
                lineToRelative(-2.994f, -2.168f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, false, -0.014f, -0.01f)
                lineTo(4.196f, 3.32f)
                arcToRelative(0.712f, 0.712f, 0.0f, false, false, -0.014f, -0.01f)
                lineTo(1.19f, 1.143f)
                close()
                moveTo(4.5f, 5.39f)
                verticalLineToRelative(7.341f)
                lineToRelative(3.044f, -2.328f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.912f, 0.0f)
                lineToRelative(3.044f, 2.328f)
                verticalLineTo(10.46f)
                lineToRelative(-7.0f, -5.07f)
                close()
                moveTo(5.865f, 1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(5.385f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(3.624f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineTo(2.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 11.25f, 1.0f)
                horizontalLineTo(5.865f)
                close()
            }
        }
        .build()
        return _bookmarkSlash16!!
    }

private var _bookmarkSlash16: ImageVector? = null
