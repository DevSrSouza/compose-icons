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

public val Octicons.Redo16: ImageVector
    get() {
        if (_redo16 != null) {
            return _redo16!!
        }
        _redo16 = Builder(name = "Redo16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.78f, 6.28f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, 0.0f, -1.06f)
                lineToRelative(-3.5f, -3.5f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, -1.06f, 1.06f)
                lineTo(12.439f, 5.0f)
                horizontalLineTo(5.251f)
                lineToRelative(-0.001f, 0.007f)
                lineTo(5.251f, 5.0f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.171f, 0.019f)
                arcTo(4.501f, 4.501f, 0.0f, false, false, 5.5f, 14.0f)
                horizontalLineToRelative(1.704f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(5.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -6.0f)
                horizontalLineToRelative(6.939f)
                lineTo(10.22f, 8.72f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, 1.06f, 1.06f)
                lineToRelative(3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _redo16!!
    }

private var _redo16: ImageVector? = null
