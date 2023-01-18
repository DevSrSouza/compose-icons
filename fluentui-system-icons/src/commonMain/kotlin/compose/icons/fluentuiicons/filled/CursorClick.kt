package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.CursorClick: ImageVector
    get() {
        if (_cursorClick != null) {
            return _cursorClick!!
        }
        _cursorClick = Builder(name = "CursorClick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.25f, 2.0f)
                curveTo(9.6642f, 2.0f, 10.0f, 2.3358f, 10.0f, 2.75f)
                verticalLineTo(5.25f)
                curveTo(10.0f, 5.6642f, 9.6642f, 6.0f, 9.25f, 6.0f)
                curveTo(8.8358f, 6.0f, 8.5f, 5.6642f, 8.5f, 5.25f)
                verticalLineTo(2.75f)
                curveTo(8.5f, 2.3358f, 8.8358f, 2.0f, 9.25f, 2.0f)
                close()
                moveTo(4.4696f, 3.9698f)
                curveTo(4.7625f, 3.6769f, 5.2374f, 3.6769f, 5.5303f, 3.9698f)
                lineTo(7.2803f, 5.7196f)
                curveTo(7.5732f, 6.0125f, 7.5732f, 6.4874f, 7.2804f, 6.7803f)
                curveTo(6.9875f, 7.0732f, 6.5126f, 7.0732f, 6.2197f, 6.7804f)
                lineTo(4.4697f, 5.0305f)
                curveTo(4.1768f, 4.7376f, 4.1768f, 4.2627f, 4.4696f, 3.9698f)
                close()
                moveTo(14.0303f, 3.9698f)
                curveTo(14.3232f, 4.2627f, 14.3232f, 4.7376f, 14.0303f, 5.0304f)
                lineTo(12.2803f, 6.7804f)
                curveTo(11.9874f, 7.0733f, 11.5126f, 7.0733f, 11.2197f, 6.7804f)
                curveTo(10.9268f, 6.4876f, 10.9268f, 6.0127f, 11.2197f, 5.7198f)
                lineTo(12.9697f, 3.9698f)
                curveTo(13.2626f, 3.6769f, 13.7374f, 3.6769f, 14.0303f, 3.9698f)
                close()
                moveTo(2.5f, 8.75f)
                curveTo(2.5f, 8.3358f, 2.8358f, 8.0f, 3.25f, 8.0f)
                horizontalLineTo(5.75f)
                curveTo(6.1642f, 8.0f, 6.5f, 8.3358f, 6.5f, 8.75f)
                curveTo(6.5f, 9.1642f, 6.1642f, 9.5f, 5.75f, 9.5f)
                horizontalLineTo(3.25f)
                curveTo(2.8358f, 9.5f, 2.5f, 9.1642f, 2.5f, 8.75f)
                close()
                moveTo(8.5f, 9.4871f)
                curveTo(8.5f, 8.3602f, 9.8218f, 7.7523f, 10.6773f, 8.4856f)
                lineTo(19.1384f, 15.7379f)
                curveTo(20.0484f, 16.518f, 19.5304f, 18.0094f, 18.3327f, 18.0573f)
                lineTo(14.4927f, 18.2109f)
                curveTo(14.0801f, 18.2274f, 13.6918f, 18.4104f, 13.4165f, 18.7181f)
                lineTo(10.8019f, 21.6403f)
                curveTo(9.9946f, 22.5426f, 8.5f, 21.9715f, 8.5f, 20.7608f)
                verticalLineTo(9.4871f)
                close()
            }
        }
        .build()
        return _cursorClick!!
    }

private var _cursorClick: ImageVector? = null
