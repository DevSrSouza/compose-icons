package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.FormatShapes: ImageVector
    get() {
        if (_formatShapes != null) {
            return _formatShapes!!
        }
        _formatShapes = Builder(name = "FormatShapes", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 7.0f)
                lineTo(23.0f, 1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 3.0f)
                lineTo(7.0f, 1.0f)
                lineTo(1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.0f)
                lineTo(1.0f, 17.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(21.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 5.0f)
                lineTo(3.0f, 3.0f)
                close()
                moveTo(5.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 19.0f)
                lineTo(7.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                lineTo(5.0f, 17.0f)
                lineTo(5.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                lineTo(7.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 5.0f)
                lineTo(19.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(13.73f, 14.0f)
                horizontalLineToRelative(-3.49f)
                lineToRelative(-0.73f, 2.0f)
                lineTo(7.89f, 16.0f)
                lineToRelative(3.4f, -9.0f)
                horizontalLineToRelative(1.4f)
                lineToRelative(3.41f, 9.0f)
                horizontalLineToRelative(-1.63f)
                lineToRelative(-0.74f, -2.0f)
                close()
                moveTo(10.69f, 12.74f)
                horizontalLineToRelative(2.61f)
                lineTo(12.0f, 8.91f)
                lineToRelative(-1.31f, 3.83f)
                close()
            }
        }
        .build()
        return _formatShapes!!
    }

private var _formatShapes: ImageVector? = null
