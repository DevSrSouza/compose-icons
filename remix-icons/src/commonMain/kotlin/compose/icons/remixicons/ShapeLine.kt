package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.ShapeLine: ImageVector
    get() {
        if (_shapeLine != null) {
            return _shapeLine!!
        }
        _shapeLine = Builder(name = "ShapeLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.83f, 20.0f)
                arcTo(3.001f, 3.001f, 0.0f, true, true, 4.0f, 16.17f)
                lineTo(4.0f, 7.83f)
                arcTo(3.001f, 3.001f, 0.0f, true, true, 7.83f, 4.0f)
                horizontalLineToRelative(8.34f)
                arcTo(3.001f, 3.001f, 0.0f, true, true, 20.0f, 7.83f)
                verticalLineToRelative(8.34f)
                arcTo(3.001f, 3.001f, 0.0f, true, true, 16.17f, 20.0f)
                lineTo(7.83f, 20.0f)
                close()
                moveTo(7.83f, 18.0f)
                horizontalLineToRelative(8.34f)
                arcTo(3.008f, 3.008f, 0.0f, false, true, 18.0f, 16.17f)
                lineTo(18.0f, 7.83f)
                arcTo(3.008f, 3.008f, 0.0f, false, true, 16.17f, 6.0f)
                lineTo(7.83f, 6.0f)
                arcTo(3.008f, 3.008f, 0.0f, false, true, 6.0f, 7.83f)
                verticalLineToRelative(8.34f)
                arcTo(3.008f, 3.008f, 0.0f, false, true, 7.83f, 18.0f)
                close()
                moveTo(5.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
                moveTo(19.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
                moveTo(19.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
                moveTo(5.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _shapeLine!!
    }

private var _shapeLine: ImageVector? = null
