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

public val FilledGroup.BookToolbox: ImageVector
    get() {
        if (_bookToolbox != null) {
            return _bookToolbox!!
        }
        _bookToolbox = Builder(name = "BookToolbox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.0f)
                horizontalLineTo(13.5f)
                curveTo(12.6716f, 4.0f, 12.0f, 4.6716f, 12.0f, 5.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(6.75f)
                curveTo(14.5f, 6.3358f, 14.8358f, 6.0f, 15.25f, 6.0f)
                curveTo(15.6642f, 6.0f, 16.0f, 6.3358f, 16.0f, 6.75f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(6.75f)
                curveTo(19.0f, 6.3358f, 19.3358f, 6.0f, 19.75f, 6.0f)
                curveTo(20.1642f, 6.0f, 20.5f, 6.3358f, 20.5f, 6.75f)
                verticalLineTo(7.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(5.5f)
                curveTo(23.0f, 4.6716f, 22.3284f, 4.0f, 21.5f, 4.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(3.0f)
                curveTo(21.0f, 2.0335f, 20.2165f, 1.25f, 19.25f, 1.25f)
                horizontalLineTo(15.75f)
                curveTo(14.7835f, 1.25f, 14.0f, 2.0335f, 14.0f, 3.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(15.5f, 3.0f)
                curveTo(15.5f, 2.8619f, 15.6119f, 2.75f, 15.75f, 2.75f)
                horizontalLineTo(19.25f)
                curveTo(19.3881f, 2.75f, 19.5f, 2.8619f, 19.5f, 3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(3.0f)
                close()
                moveTo(12.0f, 10.5f)
                verticalLineTo(8.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(9.25f)
                curveTo(14.5f, 9.6642f, 14.8358f, 10.0f, 15.25f, 10.0f)
                curveTo(15.6642f, 10.0f, 16.0f, 9.6642f, 16.0f, 9.25f)
                verticalLineTo(8.5f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.25f)
                curveTo(19.0f, 9.6642f, 19.3358f, 10.0f, 19.75f, 10.0f)
                curveTo(20.1642f, 10.0f, 20.5f, 9.6642f, 20.5f, 9.25f)
                verticalLineTo(8.5f)
                horizontalLineTo(23.0f)
                verticalLineTo(10.5f)
                curveTo(23.0f, 11.3284f, 22.3284f, 12.0f, 21.5f, 12.0f)
                horizontalLineTo(13.5f)
                curveTo(12.6716f, 12.0f, 12.0f, 11.3284f, 12.0f, 10.5f)
                close()
                moveTo(13.0f, 3.05f)
                curveTo(11.8589f, 3.2816f, 11.0f, 4.2905f, 11.0f, 5.5f)
                verticalLineTo(10.5f)
                curveTo(11.0f, 11.8807f, 12.1193f, 13.0f, 13.5f, 13.0f)
                horizontalLineTo(20.5f)
                verticalLineTo(18.75f)
                curveTo(20.5f, 19.1642f, 20.1642f, 19.5f, 19.75f, 19.5f)
                horizontalLineTo(5.5f)
                curveTo(5.5f, 20.0523f, 5.9477f, 20.5f, 6.5f, 20.5f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 20.5f, 20.5f, 20.8358f, 20.5f, 21.25f)
                curveTo(20.5f, 21.6642f, 20.1642f, 22.0f, 19.75f, 22.0f)
                horizontalLineTo(6.5f)
                curveTo(5.1193f, 22.0f, 4.0f, 20.8807f, 4.0f, 19.5f)
                verticalLineTo(4.5f)
                curveTo(4.0f, 3.1193f, 5.1193f, 2.0f, 6.5f, 2.0f)
                horizontalLineTo(13.1875f)
                curveTo(13.0664f, 2.3099f, 13.0f, 2.6472f, 13.0f, 3.0f)
                verticalLineTo(3.05f)
                close()
            }
        }
        .build()
        return _bookToolbox!!
    }

private var _bookToolbox: ImageVector? = null
