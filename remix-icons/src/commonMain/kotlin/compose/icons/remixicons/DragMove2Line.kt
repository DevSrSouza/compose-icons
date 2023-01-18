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

public val RemixIcons.DragMove2Line: ImageVector
    get() {
        if (_dragMove2Line != null) {
            return _dragMove2Line!!
        }
        _dragMove2Line = Builder(name = "DragMove2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 11.0f)
                verticalLineTo(5.828f)
                lineTo(9.172f, 7.657f)
                lineTo(7.757f, 6.243f)
                lineTo(12.0f, 2.0f)
                lineToRelative(4.243f, 4.243f)
                lineToRelative(-1.415f, 1.414f)
                lineTo(13.0f, 5.828f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(5.172f)
                lineToRelative(-1.829f, -1.828f)
                lineToRelative(1.414f, -1.415f)
                lineTo(22.0f, 12.0f)
                lineToRelative(-4.243f, 4.243f)
                lineToRelative(-1.414f, -1.415f)
                lineTo(18.172f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(5.172f)
                lineToRelative(1.828f, -1.829f)
                lineToRelative(1.415f, 1.414f)
                lineTo(12.0f, 22.0f)
                lineToRelative(-4.243f, -4.243f)
                lineToRelative(1.415f, -1.414f)
                lineTo(11.0f, 18.172f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.828f)
                lineToRelative(1.829f, 1.828f)
                lineToRelative(-1.414f, 1.415f)
                lineTo(2.0f, 12.0f)
                lineToRelative(4.243f, -4.243f)
                lineToRelative(1.414f, 1.415f)
                lineTo(5.828f, 11.0f)
                close()
            }
        }
        .build()
        return _dragMove2Line!!
    }

private var _dragMove2Line: ImageVector? = null
