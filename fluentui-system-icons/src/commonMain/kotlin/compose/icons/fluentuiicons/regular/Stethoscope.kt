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

public val RegularGroup.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) {
            return _stethoscope!!
        }
        _stethoscope = Builder(name = "Stethoscope", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 2.5f)
                curveTo(2.3358f, 2.5f, 2.0f, 2.8358f, 2.0f, 3.25f)
                verticalLineTo(9.0001f)
                curveTo(2.0f, 12.0598f, 4.2903f, 14.5846f, 7.25f, 14.9537f)
                verticalLineTo(15.7502f)
                curveTo(7.25f, 19.0639f, 9.9363f, 21.7502f, 13.25f, 21.7502f)
                curveTo(16.5637f, 21.7502f, 19.25f, 19.0639f, 19.25f, 15.7502f)
                verticalLineTo(14.9056f)
                curveTo(20.5439f, 14.5726f, 21.5f, 13.398f, 21.5f, 12.0001f)
                curveTo(21.5f, 10.3433f, 20.1569f, 9.0001f, 18.5f, 9.0001f)
                curveTo(16.8431f, 9.0001f, 15.5f, 10.3433f, 15.5f, 12.0001f)
                curveTo(15.5f, 13.398f, 16.4561f, 14.5726f, 17.75f, 14.9056f)
                verticalLineTo(15.7502f)
                curveTo(17.75f, 18.2354f, 15.7353f, 20.2502f, 13.25f, 20.2502f)
                curveTo(10.7647f, 20.2502f, 8.75f, 18.2354f, 8.75f, 15.7502f)
                verticalLineTo(14.9537f)
                curveTo(11.7097f, 14.5846f, 14.0f, 12.0598f, 14.0f, 9.0001f)
                verticalLineTo(3.25f)
                curveTo(14.0f, 2.8358f, 13.6642f, 2.5f, 13.25f, 2.5f)
                horizontalLineTo(10.75f)
                curveTo(10.3358f, 2.5f, 10.0f, 2.8358f, 10.0f, 3.25f)
                curveTo(10.0f, 3.6642f, 10.3358f, 4.0f, 10.75f, 4.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(9.0001f)
                curveTo(12.5f, 11.4854f, 10.4853f, 13.5001f, 8.0f, 13.5001f)
                curveTo(5.5147f, 13.5001f, 3.5f, 11.4854f, 3.5f, 9.0001f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.25f)
                curveTo(5.6642f, 4.0f, 6.0f, 3.6642f, 6.0f, 3.25f)
                curveTo(6.0f, 2.8358f, 5.6642f, 2.5f, 5.25f, 2.5f)
                horizontalLineTo(2.75f)
                close()
                moveTo(18.5f, 10.5001f)
                curveTo(19.3284f, 10.5001f, 20.0f, 11.1717f, 20.0f, 12.0001f)
                curveTo(20.0f, 12.8285f, 19.3284f, 13.5001f, 18.5f, 13.5001f)
                curveTo(17.6716f, 13.5001f, 17.0f, 12.8285f, 17.0f, 12.0001f)
                curveTo(17.0f, 11.1717f, 17.6716f, 10.5001f, 18.5f, 10.5001f)
                close()
            }
        }
        .build()
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
