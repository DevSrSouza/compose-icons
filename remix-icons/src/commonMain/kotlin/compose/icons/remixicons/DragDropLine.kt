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

public val RemixIcons.DragDropLine: ImageVector
    get() {
        if (_dragDropLine != null) {
            return _dragDropLine!!
        }
        _dragDropLine = Builder(name = "DragDropLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 13.0f)
                lineToRelative(6.964f, 4.062f)
                lineToRelative(-2.973f, 0.85f)
                lineToRelative(2.125f, 3.681f)
                lineToRelative(-1.732f, 1.0f)
                lineToRelative(-2.125f, -3.68f)
                lineToRelative(-2.223f, 2.15f)
                lineTo(16.0f, 13.0f)
                close()
                moveTo(14.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                lineTo(10.0f, 10.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                lineTo(6.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(8.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(5.0f)
                lineTo(14.0f, 6.0f)
                close()
                moveTo(4.0f, 14.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(4.0f, 10.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(4.0f, 6.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 8.0f)
                lineTo(2.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(4.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 4.0f)
                lineTo(2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 4.0f)
                lineTo(6.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(10.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(16.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(14.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _dragDropLine!!
    }

private var _dragDropLine: ImageVector? = null
