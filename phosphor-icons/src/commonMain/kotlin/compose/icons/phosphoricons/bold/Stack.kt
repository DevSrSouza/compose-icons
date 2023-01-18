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

public val BoldGroup.Stack: ImageVector
    get() {
        if (_stack != null) {
            return _stack!!
        }
        _stack = Builder(name = "Stack", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.4f, 170.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -4.4f, 16.4f)
                lineToRelative(-96.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineToRelative(-96.0f, -56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -20.8f)
                lineToRelative(90.0f, 52.5f)
                lineToRelative(90.0f, -52.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 234.4f, 170.0f)
                close()
                moveTo(218.0f, 117.6f)
                lineToRelative(-90.0f, 52.5f)
                lineTo(38.0f, 117.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 20.8f)
                lineToRelative(96.0f, 56.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 12.0f, 0.0f)
                lineToRelative(96.0f, -56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -20.8f)
                close()
                moveTo(20.0f, 80.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 6.0f, -10.4f)
                lineToRelative(96.0f, -56.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 12.0f, 0.0f)
                lineToRelative(96.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 20.8f)
                lineToRelative(-96.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineToRelative(-96.0f, -56.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 20.0f, 80.0f)
                close()
                moveTo(55.8f, 80.0f)
                lineTo(128.0f, 122.1f)
                lineTo(200.2f, 80.0f)
                lineTo(128.0f, 37.9f)
                close()
            }
        }
        .build()
        return _stack!!
    }

private var _stack: ImageVector? = null
