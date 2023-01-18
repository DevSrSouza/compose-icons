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

public val ThinGroup.Book: ImageVector
    get() {
        if (_book != null) {
            return _book!!
        }
        _book = Builder(name = "Book", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 28.0f)
                lineTo(72.0f, 28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 44.0f, 56.0f)
                lineTo(44.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(192.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(52.0f, 220.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, -20.0f)
                lineTo(208.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(212.0f, 32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 208.0f, 28.0f)
                close()
                moveTo(204.0f, 188.0f)
                lineTo(72.0f, 188.0f)
                arcToRelative(27.9f, 27.9f, 0.0f, false, false, -20.0f, 8.4f)
                lineTo(52.0f, 56.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 72.0f, 36.0f)
                lineTo(204.0f, 36.0f)
                close()
            }
        }
        .build()
        return _book!!
    }

private var _book: ImageVector? = null
