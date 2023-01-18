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

public val RemixIcons.Number9: ImageVector
    get() {
        if (_number9 != null) {
            return _number9!!
        }
        _number9 = Builder(name = "Number9", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 5.619f, 9.77f)
                lineToRelative(-6.196f, 10.729f)
                lineTo(9.114f, 21.999f)
                lineToRelative(4.439f, -7.686f)
                arcTo(6.5f, 6.5f, 0.0f, true, true, 12.0f, 1.5f)
                close()
                moveTo(12.0f, 3.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, 0.0f, 9.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 0.0f, -9.0f)
                close()
            }
        }
        .build()
        return _number9!!
    }

private var _number9: ImageVector? = null