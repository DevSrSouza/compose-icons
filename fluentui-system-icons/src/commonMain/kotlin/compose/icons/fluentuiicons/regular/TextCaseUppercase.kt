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

public val RegularGroup.TextCaseUppercase: ImageVector
    get() {
        if (_textCaseUppercase != null) {
            return _textCaseUppercase!!
        }
        _textCaseUppercase = Builder(name = "TextCaseUppercase", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.707f, 3.4992f)
                curveTo(7.6021f, 3.2036f, 7.3244f, 3.0045f, 7.0108f, 3.0001f)
                curveTo(6.6972f, 2.9956f, 6.414f, 3.1868f, 6.3008f, 3.4792f)
                lineTo(0.3008f, 18.9793f)
                curveTo(0.1512f, 19.3655f, 0.3432f, 19.7999f, 0.7295f, 19.9494f)
                curveTo(1.1157f, 20.099f, 1.5501f, 19.907f, 1.6996f, 19.5207f)
                lineTo(3.2561f, 15.5f)
                lineTo(10.3737f, 15.5f)
                lineTo(11.7934f, 19.5008f)
                curveTo(11.9319f, 19.8912f, 12.3606f, 20.0953f, 12.751f, 19.9568f)
                curveTo(13.1414f, 19.8183f, 13.3455f, 19.3896f, 13.207f, 18.9992f)
                lineTo(7.707f, 3.4992f)
                close()
                moveTo(3.8367f, 14.0f)
                lineTo(6.9696f, 5.9066f)
                lineTo(9.8415f, 14.0f)
                lineTo(3.8367f, 14.0f)
                close()
                moveTo(14.75f, 3.25f)
                curveTo(14.3358f, 3.25f, 14.0f, 3.5858f, 14.0f, 4.0f)
                verticalLineTo(19.25f)
                curveTo(14.0f, 19.6642f, 14.3358f, 20.0f, 14.75f, 20.0f)
                horizontalLineTo(18.875f)
                curveTo(21.4293f, 20.0f, 23.5f, 17.9293f, 23.5f, 15.375f)
                curveTo(23.5f, 13.5396f, 22.4309f, 11.9539f, 20.8814f, 11.2067f)
                curveTo(21.8706f, 10.3812f, 22.5f, 9.1391f, 22.5f, 7.75f)
                curveTo(22.5f, 5.2647f, 20.4853f, 3.25f, 18.0f, 3.25f)
                horizontalLineTo(14.75f)
                close()
                moveTo(21.0f, 7.75f)
                curveTo(21.0f, 9.4068f, 19.6569f, 10.75f, 18.0f, 10.75f)
                horizontalLineTo(15.5f)
                verticalLineTo(4.75f)
                horizontalLineTo(18.0f)
                curveTo(19.6569f, 4.75f, 21.0f, 6.0932f, 21.0f, 7.75f)
                close()
                moveTo(18.875f, 18.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(12.25f)
                horizontalLineTo(18.875f)
                curveTo(20.6009f, 12.25f, 22.0f, 13.6491f, 22.0f, 15.375f)
                curveTo(22.0f, 17.1009f, 20.6009f, 18.5f, 18.875f, 18.5f)
                close()
            }
        }
        .build()
        return _textCaseUppercase!!
    }

private var _textCaseUppercase: ImageVector? = null
