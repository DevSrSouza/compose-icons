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

public val LightGroup.Stack: ImageVector
    get() {
        if (_stack != null) {
            return _stack!!
        }
        _stack = Builder(name = "Stack", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.2f, 173.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.2f, 8.2f)
                lineToRelative(-96.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 0.0f)
                lineToRelative(-96.0f, -56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 6.0f, -10.4f)
                lineToRelative(93.0f, 54.3f)
                lineToRelative(93.0f, -54.3f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 229.2f, 173.0f)
                close()
                moveTo(221.0f, 122.8f)
                lineToRelative(-93.0f, 54.3f)
                lineTo(35.0f, 122.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -6.0f, 10.4f)
                lineToRelative(96.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 0.0f)
                lineToRelative(96.0f, -56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -10.4f)
                close()
                moveTo(26.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.0f, -5.2f)
                lineToRelative(96.0f, -56.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 6.0f, 0.0f)
                lineToRelative(96.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 10.4f)
                lineToRelative(-96.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 0.0f)
                lineToRelative(-96.0f, -56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 26.0f, 80.0f)
                close()
                moveTo(43.9f, 80.0f)
                lineTo(128.0f, 129.1f)
                lineTo(212.1f, 80.0f)
                lineTo(128.0f, 30.9f)
                close()
            }
        }
        .build()
        return _stack!!
    }

private var _stack: ImageVector? = null
