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

public val LightGroup.Book: ImageVector
    get() {
        if (_book != null) {
            return _book!!
        }
        _book = Builder(name = "Book", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 26.0f)
                lineTo(72.0f, 26.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, false, 42.0f, 56.0f)
                lineTo(42.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(192.0f, 230.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(54.0f, 218.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, true, 18.0f, -18.0f)
                lineTo(208.0f, 198.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(214.0f, 32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 208.0f, 26.0f)
                close()
                moveTo(202.0f, 186.0f)
                lineTo(72.0f, 186.0f)
                arcToRelative(29.7f, 29.7f, 0.0f, false, false, -18.0f, 6.0f)
                lineTo(54.0f, 56.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 72.0f, 38.0f)
                lineTo(202.0f, 38.0f)
                close()
            }
        }
        .build()
        return _book!!
    }

private var _book: ImageVector? = null
