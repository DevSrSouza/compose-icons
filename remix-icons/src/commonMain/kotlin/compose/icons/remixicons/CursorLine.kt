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

public val RemixIcons.CursorLine: ImageVector
    get() {
        if (_cursorLine != null) {
            return _cursorLine!!
        }
        _cursorLine = Builder(name = "CursorLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.388f, 13.498f)
                lineToRelative(2.552f, 7.014f)
                lineToRelative(-4.698f, 1.71f)
                lineToRelative(-2.553f, -7.014f)
                lineToRelative(-3.899f, 2.445f)
                lineTo(8.41f, 1.633f)
                lineToRelative(11.537f, 11.232f)
                lineToRelative(-4.558f, 0.633f)
                close()
                moveTo(15.377f, 19.316f)
                lineToRelative(-2.715f, -7.46f)
                lineToRelative(2.96f, -0.41f)
                lineToRelative(-5.64f, -5.49f)
                lineToRelative(-0.79f, 7.83f)
                lineToRelative(2.53f, -1.587f)
                lineToRelative(2.715f, 7.46f)
                lineToRelative(0.94f, -0.343f)
                close()
            }
        }
        .build()
        return _cursorLine!!
    }

private var _cursorLine: ImageVector? = null
