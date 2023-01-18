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

public val RemixIcons.DragMoveFill: ImageVector
    get() {
        if (_dragMoveFill != null) {
            return _dragMoveFill!!
        }
        _dragMoveFill = Builder(name = "DragMoveFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                lineToRelative(-4.0f, -4.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(-4.0f, 4.0f)
                close()
                moveTo(12.0f, 2.0f)
                lineToRelative(4.0f, 4.0f)
                lineTo(8.0f, 6.0f)
                lineToRelative(4.0f, -4.0f)
                close()
                moveTo(12.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                close()
                moveTo(2.0f, 12.0f)
                lineToRelative(4.0f, -4.0f)
                verticalLineToRelative(8.0f)
                lineToRelative(-4.0f, -4.0f)
                close()
                moveTo(22.0f, 12.0f)
                lineToRelative(-4.0f, 4.0f)
                lineTo(18.0f, 8.0f)
                lineToRelative(4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _dragMoveFill!!
    }

private var _dragMoveFill: ImageVector? = null
