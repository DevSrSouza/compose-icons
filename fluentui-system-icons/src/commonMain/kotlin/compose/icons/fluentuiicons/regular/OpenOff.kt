package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.OpenOff: ImageVector
    get() {
        if (_openOff != null) {
            return _openOff!!
        }
        _openOff = Builder(name = "OpenOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                lineTo(21.7801f, 20.7198f)
                curveTo(22.073f, 21.0127f, 22.073f, 21.4876f, 21.7801f, 21.7805f)
                curveTo(21.4872f, 22.0734f, 21.0123f, 22.0734f, 20.7194f, 21.7805f)
                lineTo(19.4557f, 20.5167f)
                curveTo(18.9598f, 20.8232f, 18.3754f, 21.0f, 17.7496f, 21.0f)
                horizontalLineTo(6.2499f)
                curveTo(4.455f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 5.6243f, 3.1768f, 5.0398f, 3.4833f, 4.5439f)
                lineTo(2.2197f, 3.2803f)
                curveTo(1.9268f, 2.9874f, 1.9268f, 2.5126f, 2.2197f, 2.2197f)
                curveTo(2.5126f, 1.9268f, 2.9874f, 1.9268f, 3.2803f, 2.2197f)
                close()
                moveTo(18.3377f, 19.3987f)
                lineTo(4.6012f, 5.6619f)
                curveTo(4.5357f, 5.8457f, 4.5f, 6.0437f, 4.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.7165f, 5.2834f, 19.5f, 6.2499f, 19.5f)
                horizontalLineTo(17.7496f)
                curveTo(17.956f, 19.5f, 18.1539f, 19.4643f, 18.3377f, 19.3987f)
                close()
                moveTo(13.0847f, 9.9029f)
                lineTo(14.0969f, 10.9151f)
                curveTo(14.1628f, 10.8806f, 14.2247f, 10.8357f, 14.28f, 10.7804f)
                lineTo(19.5f, 5.5608f)
                verticalLineTo(10.25f)
                curveTo(19.5f, 10.6642f, 19.8358f, 11.0f, 20.25f, 11.0f)
                curveTo(20.6642f, 11.0f, 21.0f, 10.6642f, 21.0f, 10.25f)
                verticalLineTo(3.75f)
                curveTo(21.0f, 3.3358f, 20.6642f, 3.0f, 20.25f, 3.0f)
                horizontalLineTo(13.7497f)
                curveTo(13.3355f, 3.0f, 12.9998f, 3.3358f, 12.9998f, 3.75f)
                curveTo(12.9998f, 4.1642f, 13.3355f, 4.5f, 13.7497f, 4.5f)
                horizontalLineTo(18.4395f)
                lineTo(13.2194f, 9.7196f)
                curveTo(13.1641f, 9.775f, 13.1191f, 9.8369f, 13.0847f, 9.9029f)
                close()
                moveTo(20.9989f, 17.8172f)
                lineTo(19.4996f, 16.3179f)
                verticalLineTo(13.75f)
                curveTo(19.4996f, 13.3358f, 19.8354f, 13.0f, 20.2496f, 13.0f)
                curveTo(20.6638f, 13.0f, 20.9995f, 13.3358f, 20.9995f, 13.75f)
                verticalLineTo(17.75f)
                curveTo(20.9995f, 17.7725f, 20.9993f, 17.7949f, 20.9989f, 17.8172f)
                close()
                moveTo(6.1827f, 3.0007f)
                lineTo(7.6819f, 4.5f)
                horizontalLineTo(10.2498f)
                curveTo(10.664f, 4.5f, 10.9998f, 4.1642f, 10.9998f, 3.75f)
                curveTo(10.9998f, 3.3358f, 10.664f, 3.0f, 10.2498f, 3.0f)
                horizontalLineTo(6.2499f)
                curveTo(6.2274f, 3.0f, 6.205f, 3.0002f, 6.1827f, 3.0007f)
                close()
            }
        }
        .build()
        return _openOff!!
    }

private var _openOff: ImageVector? = null
