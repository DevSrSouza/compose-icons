package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Stack: ImageVector
    get() {
        if (_stack != null) {
            return _stack!!
        }
        _stack = Builder(name = "Stack", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.9f, 172.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.9f, 10.9f)
                lineToRelative(-96.0f, 56.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -8.0f, 0.0f)
                lineToRelative(-96.0f, -56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -13.8f)
                lineToRelative(92.0f, 53.6f)
                lineToRelative(92.0f, -53.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 230.9f, 172.0f)
                close()
                moveTo(220.0f, 121.1f)
                lineToRelative(-92.0f, 53.6f)
                lineTo(36.0f, 121.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 13.8f)
                lineToRelative(96.0f, 56.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 8.0f, 0.0f)
                lineToRelative(96.0f, -56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, -13.8f)
                close()
                moveTo(24.0f, 80.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 4.0f, -6.9f)
                lineToRelative(96.0f, -56.0f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, 8.0f, 0.0f)
                lineToRelative(96.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 13.8f)
                lineToRelative(-96.0f, 56.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -8.0f, 0.0f)
                lineToRelative(-96.0f, -56.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 24.0f, 80.0f)
                close()
                moveTo(47.9f, 80.0f)
                lineTo(128.0f, 126.7f)
                lineTo(208.1f, 80.0f)
                lineTo(128.0f, 33.3f)
                close()
            }
        }
        .build()
        return _stack!!
    }

private var _stack: ImageVector? = null
