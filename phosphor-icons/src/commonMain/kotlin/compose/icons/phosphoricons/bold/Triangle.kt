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

public val BoldGroup.Triangle: ImageVector
    get() {
        if (_triangle != null) {
            return _triangle!!
        }
        _triangle = Builder(name = "Triangle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 228.0f)
                horizontalLineTo(40.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -24.2f, -42.0f)
                lineToRelative(88.0f, -152.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(27.9f, 27.9f, 0.0f, false, true, 48.4f, 0.0f)
                lineToRelative(88.0f, 152.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 216.0f, 228.0f)
                close()
                moveTo(124.5f, 46.0f)
                lineTo(36.6f, 198.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 0.0f, 4.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 3.4f, 2.0f)
                horizontalLineTo(216.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 3.4f, -2.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 0.0f, -4.0f)
                lineTo(131.5f, 46.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -7.0f, 0.0f)
                close()
            }
        }
        .build()
        return _triangle!!
    }

private var _triangle: ImageVector? = null
