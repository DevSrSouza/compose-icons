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

public val FilledGroup.Diagram: ImageVector
    get() {
        if (_diagram != null) {
            return _diagram!!
        }
        _diagram = Builder(name = "Diagram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.25f)
                curveTo(2.0f, 3.4551f, 3.4551f, 2.0f, 5.25f, 2.0f)
                horizontalLineTo(15.75f)
                curveTo(17.5449f, 2.0f, 19.0f, 3.4551f, 19.0f, 5.25f)
                verticalLineTo(11.2831f)
                curveTo(18.6263f, 11.099f, 18.2113f, 11.0f, 17.7848f, 11.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(5.25f)
                curveTo(17.5f, 4.2835f, 16.7165f, 3.5f, 15.75f, 3.5f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 3.5f, 3.5f, 4.2835f, 3.5f, 5.25f)
                verticalLineTo(16.75f)
                curveTo(3.5f, 17.7165f, 4.2835f, 18.5f, 5.25f, 18.5f)
                horizontalLineTo(8.6201f)
                lineTo(7.3569f, 20.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 20.0f, 2.0f, 18.5449f, 2.0f, 16.75f)
                verticalLineTo(5.25f)
                close()
                moveTo(6.75f, 6.0f)
                curveTo(6.3358f, 6.0f, 6.0f, 6.3358f, 6.0f, 6.75f)
                curveTo(6.0f, 7.1642f, 6.3358f, 7.5f, 6.75f, 7.5f)
                horizontalLineTo(14.25f)
                curveTo(14.6642f, 7.5f, 15.0f, 7.1642f, 15.0f, 6.75f)
                curveTo(15.0f, 6.3358f, 14.6642f, 6.0f, 14.25f, 6.0f)
                horizontalLineTo(6.75f)
                close()
                moveTo(7.07f, 12.4336f)
                curveTo(7.193f, 12.1691f, 7.4583f, 12.0f, 7.75f, 12.0f)
                horizontalLineTo(17.7848f)
                curveTo(18.301f, 12.0f, 18.7909f, 12.2279f, 19.1234f, 12.6228f)
                lineTo(22.8237f, 17.0169f)
                curveTo(23.0588f, 17.2961f, 23.0588f, 17.7039f, 22.8237f, 17.9831f)
                lineTo(19.1234f, 22.3772f)
                curveTo(18.7909f, 22.7721f, 18.301f, 23.0f, 17.7848f, 23.0f)
                horizontalLineTo(7.75f)
                curveTo(7.4583f, 23.0f, 7.193f, 22.8309f, 7.07f, 22.5664f)
                curveTo(6.9469f, 22.3019f, 6.9884f, 21.99f, 7.1763f, 21.7669f)
                lineTo(10.7695f, 17.5f)
                lineTo(7.1763f, 13.2331f)
                curveTo(6.9884f, 13.01f, 6.9469f, 12.6981f, 7.07f, 12.4336f)
                close()
                moveTo(6.75f, 9.0f)
                curveTo(6.3358f, 9.0f, 6.0f, 9.3358f, 6.0f, 9.75f)
                curveTo(6.0f, 10.1642f, 6.3358f, 10.5f, 6.75f, 10.5f)
                horizontalLineTo(11.25f)
                curveTo(11.6642f, 10.5f, 12.0f, 10.1642f, 12.0f, 9.75f)
                curveTo(12.0f, 9.3358f, 11.6642f, 9.0f, 11.25f, 9.0f)
                horizontalLineTo(6.75f)
                close()
            }
        }
        .build()
        return _diagram!!
    }

private var _diagram: ImageVector? = null
