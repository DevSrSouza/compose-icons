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

public val RemixIcons.DragMoveLine: ImageVector
    get() {
        if (_dragMoveLine != null) {
            return _dragMoveLine!!
        }
        _dragMoveLine = Builder(name = "DragMoveLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineToRelative(4.243f, 4.243f)
                lineToRelative(-1.415f, 1.414f)
                lineTo(12.0f, 4.828f)
                lineTo(9.172f, 7.657f)
                lineTo(7.757f, 6.243f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(2.0f, 12.0f)
                lineToRelative(4.243f, -4.243f)
                lineToRelative(1.414f, 1.415f)
                lineTo(4.828f, 12.0f)
                lineToRelative(2.829f, 2.828f)
                lineToRelative(-1.414f, 1.415f)
                lineTo(2.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                lineToRelative(-4.243f, 4.243f)
                lineToRelative(-1.414f, -1.415f)
                lineTo(19.172f, 12.0f)
                lineToRelative(-2.829f, -2.828f)
                lineToRelative(1.414f, -1.415f)
                lineTo(22.0f, 12.0f)
                close()
                moveTo(12.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                close()
                moveTo(12.0f, 22.0f)
                lineToRelative(-4.243f, -4.243f)
                lineToRelative(1.415f, -1.414f)
                lineTo(12.0f, 19.172f)
                lineToRelative(2.828f, -2.829f)
                lineToRelative(1.415f, 1.414f)
                lineTo(12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _dragMoveLine!!
    }

private var _dragMoveLine: ImageVector? = null
