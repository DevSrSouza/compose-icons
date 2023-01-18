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

public val RemixIcons.CursorFill: ImageVector
    get() {
        if (_cursorFill != null) {
            return _cursorFill!!
        }
        _cursorFill = Builder(name = "CursorFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.91f, 12.36f)
                lineTo(17.0f, 20.854f)
                lineToRelative(-2.818f, 1.026f)
                lineToRelative(-3.092f, -8.494f)
                lineToRelative(-4.172f, 3.156f)
                lineToRelative(1.49f, -14.909f)
                lineToRelative(10.726f, 10.463f)
                close()
            }
        }
        .build()
        return _cursorFill!!
    }

private var _cursorFill: ImageVector? = null
