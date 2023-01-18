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

public val FilledGroup.ViewDesktop: ImageVector
    get() {
        if (_viewDesktop != null) {
            return _viewDesktop!!
        }
        _viewDesktop = Builder(name = "ViewDesktop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7488f, 3.0f)
                curveTo(20.9397f, 3.0f, 21.9145f, 3.9252f, 21.9936f, 5.096f)
                lineTo(21.9988f, 5.25f)
                verticalLineTo(15.7523f)
                curveTo(21.9988f, 16.9431f, 21.0737f, 17.9179f, 19.9029f, 17.9971f)
                lineTo(19.7488f, 18.0023f)
                lineTo(15.499f, 18.002f)
                verticalLineTo(20.5f)
                lineTo(17.25f, 20.5004f)
                curveTo(17.6642f, 20.5004f, 18.0f, 20.8362f, 18.0f, 21.2504f)
                curveTo(18.0f, 21.6301f, 17.7178f, 21.9439f, 17.3518f, 21.9936f)
                lineTo(17.25f, 22.0004f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 22.0004f, 6.0f, 21.6647f, 6.0f, 21.2504f)
                curveTo(6.0f, 20.8707f, 6.2821f, 20.5569f, 6.6482f, 20.5073f)
                lineTo(6.75f, 20.5004f)
                lineTo(8.499f, 20.5f)
                verticalLineTo(18.002f)
                lineTo(4.25f, 18.0023f)
                curveTo(3.0591f, 18.0023f, 2.0844f, 17.0771f, 2.0052f, 15.9063f)
                lineTo(2.0f, 15.7523f)
                verticalLineTo(5.25f)
                curveTo(2.0f, 4.0591f, 2.9252f, 3.0844f, 4.096f, 3.0052f)
                lineTo(4.25f, 3.0f)
                horizontalLineTo(19.7488f)
                close()
                moveTo(13.998f, 18.002f)
                horizontalLineTo(9.998f)
                lineTo(9.999f, 20.5004f)
                horizontalLineTo(13.999f)
                lineTo(13.998f, 18.002f)
                close()
                moveTo(18.5043f, 6.0f)
                horizontalLineTo(9.5f)
                curveTo(9.2239f, 6.0f, 9.0f, 6.2239f, 9.0f, 6.5f)
                verticalLineTo(14.5024f)
                curveTo(9.0f, 14.7786f, 9.2239f, 15.0024f, 9.5f, 15.0024f)
                horizontalLineTo(18.5043f)
                curveTo(18.7804f, 15.0024f, 19.0043f, 14.7786f, 19.0043f, 14.5024f)
                verticalLineTo(6.5f)
                curveTo(19.0043f, 6.2239f, 18.7804f, 6.0f, 18.5043f, 6.0f)
                close()
                moveTo(7.4994f, 6.0f)
                horizontalLineTo(5.4994f)
                curveTo(5.2233f, 6.0f, 4.9994f, 6.2239f, 4.9994f, 6.5f)
                verticalLineTo(14.5024f)
                curveTo(4.9994f, 14.7786f, 5.2233f, 15.0024f, 5.4994f, 15.0024f)
                horizontalLineTo(7.4994f)
                curveTo(7.7755f, 15.0024f, 7.9994f, 14.7786f, 7.9994f, 14.5024f)
                verticalLineTo(6.5f)
                curveTo(7.9994f, 6.2239f, 7.7755f, 6.0f, 7.4994f, 6.0f)
                close()
            }
        }
        .build()
        return _viewDesktop!!
    }

private var _viewDesktop: ImageVector? = null
