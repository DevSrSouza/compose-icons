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

public val Octicons.Undo16: ImageVector
    get() {
        if (_undo16 != null) {
            return _undo16!!
        }
        _undo16 = Builder(name = "Undo16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.22f, 6.28f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.0f, -1.06f)
                lineToRelative(3.5f, -3.5f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, 1.06f, 1.06f)
                lineTo(3.561f, 5.0f)
                horizontalLineToRelative(7.188f)
                lineToRelative(0.001f, 0.007f)
                lineTo(10.749f, 5.0f)
                curveToRelative(0.058f, 0.0f, 0.116f, 0.007f, 0.171f, 0.019f)
                arcTo(4.501f, 4.501f, 0.0f, false, true, 10.5f, 14.0f)
                horizontalLineTo(8.796f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineTo(10.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -6.0f)
                horizontalLineTo(3.561f)
                lineTo(5.78f, 8.72f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, -1.06f, 1.06f)
                lineToRelative(-3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _undo16!!
    }

private var _undo16: ImageVector? = null
