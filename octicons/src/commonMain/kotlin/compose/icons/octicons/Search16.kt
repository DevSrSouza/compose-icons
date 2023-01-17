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

public val Octicons.Search16: ImageVector
    get() {
        if (_search16 != null) {
            return _search16!!
        }
        _search16 = Builder(name = "Search16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.68f, 11.74f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -7.922f, -8.982f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.982f, 7.922f)
                lineToRelative(3.04f, 3.04f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.326f, 1.275f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.734f, -0.215f)
                close()
                moveTo(11.5f, 7.0f)
                arcToRelative(4.499f, 4.499f, 0.0f, true, false, -8.997f, 0.0f)
                arcTo(4.499f, 4.499f, 0.0f, false, false, 11.5f, 7.0f)
                close()
            }
        }
        .build()
        return _search16!!
    }

private var _search16: ImageVector? = null
