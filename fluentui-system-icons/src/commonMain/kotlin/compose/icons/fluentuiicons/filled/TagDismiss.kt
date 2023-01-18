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

public val FilledGroup.TagDismiss: ImageVector
    get() {
        if (_tagDismiss != null) {
            return _tagDismiss!!
        }
        _tagDismiss = Builder(name = "TagDismiss", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7498f, 2.0f)
                curveTo(20.9925f, 2.0f, 21.9998f, 3.0074f, 21.9998f, 4.25f)
                verticalLineTo(9.712f)
                curveTo(21.9998f, 10.5738f, 21.6575f, 11.4003f, 21.0482f, 12.0098f)
                lineTo(21.0219f, 12.0361f)
                curveTo(20.007f, 11.3805f, 18.7978f, 11.0f, 17.4998f, 11.0f)
                curveTo(13.9099f, 11.0f, 10.9998f, 13.9101f, 10.9998f, 17.5f)
                curveTo(10.9998f, 18.7703f, 11.3641f, 19.9554f, 11.9941f, 20.9567f)
                curveTo(10.7371f, 21.7569f, 9.0504f, 21.6098f, 7.9508f, 20.5143f)
                lineTo(3.4891f, 16.0592f)
                curveTo(2.2186f, 14.7913f, 2.217f, 12.7334f, 3.4853f, 11.4632f)
                lineTo(11.985f, 2.9533f)
                curveTo(12.5946f, 2.343f, 13.4218f, 2.0f, 14.2845f, 2.0f)
                horizontalLineTo(19.7498f)
                close()
                moveTo(16.9998f, 5.5022f)
                curveTo(16.1714f, 5.5022f, 15.4998f, 6.1737f, 15.4998f, 7.0022f)
                curveTo(15.4998f, 7.8306f, 16.1714f, 8.5021f, 16.9998f, 8.5021f)
                curveTo(17.8282f, 8.5021f, 18.4998f, 7.8306f, 18.4998f, 7.0022f)
                curveTo(18.4998f, 6.1737f, 17.8282f, 5.5022f, 16.9998f, 5.5022f)
                close()
                moveTo(22.9998f, 17.5f)
                curveTo(22.9998f, 20.5376f, 20.5373f, 23.0f, 17.4998f, 23.0f)
                curveTo(14.4622f, 23.0f, 11.9998f, 20.5376f, 11.9998f, 17.5f)
                curveTo(11.9998f, 14.4624f, 14.4622f, 12.0f, 17.4998f, 12.0f)
                curveTo(20.5373f, 12.0f, 22.9998f, 14.4624f, 22.9998f, 17.5f)
                close()
                moveTo(15.8533f, 15.1464f)
                curveTo(15.658f, 14.9512f, 15.3415f, 14.9512f, 15.1462f, 15.1464f)
                curveTo(14.9509f, 15.3417f, 14.9509f, 15.6583f, 15.1462f, 15.8536f)
                lineTo(16.7926f, 17.5f)
                lineTo(15.1462f, 19.1464f)
                curveTo(14.9509f, 19.3417f, 14.9509f, 19.6583f, 15.1462f, 19.8536f)
                curveTo(15.3415f, 20.0488f, 15.658f, 20.0488f, 15.8533f, 19.8536f)
                lineTo(17.4998f, 18.2071f)
                lineTo(19.1462f, 19.8536f)
                curveTo(19.3415f, 20.0488f, 19.658f, 20.0488f, 19.8533f, 19.8536f)
                curveTo(20.0486f, 19.6583f, 20.0486f, 19.3417f, 19.8533f, 19.1464f)
                lineTo(18.2069f, 17.5f)
                lineTo(19.8533f, 15.8536f)
                curveTo(20.0486f, 15.6583f, 20.0486f, 15.3417f, 19.8533f, 15.1464f)
                curveTo(19.658f, 14.9512f, 19.3415f, 14.9512f, 19.1462f, 15.1464f)
                lineTo(17.4998f, 16.7929f)
                lineTo(15.8533f, 15.1464f)
                close()
            }
        }
        .build()
        return _tagDismiss!!
    }

private var _tagDismiss: ImageVector? = null
