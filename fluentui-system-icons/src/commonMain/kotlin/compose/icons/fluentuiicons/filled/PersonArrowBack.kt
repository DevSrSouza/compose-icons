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

public val FilledGroup.PersonArrowBack: ImageVector
    get() {
        if (_personArrowBack != null) {
            return _personArrowBack!!
        }
        _personArrowBack = Builder(name = "PersonArrowBack", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 17.5f)
                curveTo(11.0f, 16.211f, 11.3752f, 15.0097f, 12.0223f, 13.9992f)
                horizontalLineTo(4.2528f)
                curveTo(3.0108f, 13.9992f, 2.0039f, 15.0061f, 2.0039f, 16.2481f)
                verticalLineTo(17.1681f)
                curveTo(2.0039f, 17.7401f, 2.1823f, 18.298f, 2.5143f, 18.7639f)
                curveTo(4.0564f, 20.9282f, 6.5794f, 22.0004f, 10.0004f, 22.0004f)
                curveTo(10.9312f, 22.0004f, 11.7956f, 21.921f, 12.592f, 21.7618f)
                curveTo(11.6003f, 20.6208f, 11.0f, 19.1305f, 11.0f, 17.5f)
                close()
                moveTo(10.0004f, 2.0039f)
                curveTo(12.7618f, 2.0039f, 15.0004f, 4.2425f, 15.0004f, 7.0039f)
                curveTo(15.0004f, 9.7653f, 12.7618f, 12.0039f, 10.0004f, 12.0039f)
                curveTo(7.2389f, 12.0039f, 5.0004f, 9.7653f, 5.0004f, 7.0039f)
                curveTo(5.0004f, 4.2425f, 7.2389f, 2.0039f, 10.0004f, 2.0039f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
                close()
                moveTo(16.3536f, 15.3536f)
                curveTo(16.5488f, 15.1583f, 16.5488f, 14.8417f, 16.3536f, 14.6464f)
                curveTo(16.1583f, 14.4512f, 15.8417f, 14.4512f, 15.6464f, 14.6464f)
                lineTo(14.1464f, 16.1464f)
                curveTo(13.9512f, 16.3417f, 13.9512f, 16.6583f, 14.1464f, 16.8536f)
                lineTo(15.6464f, 18.3536f)
                curveTo(15.8417f, 18.5488f, 16.1583f, 18.5488f, 16.3536f, 18.3536f)
                curveTo(16.5488f, 18.1583f, 16.5488f, 17.8417f, 16.3536f, 17.6464f)
                lineTo(15.7071f, 17.0f)
                horizontalLineTo(17.75f)
                curveTo(18.9926f, 17.0f, 20.0f, 18.0074f, 20.0f, 19.25f)
                verticalLineTo(19.5f)
                curveTo(20.0f, 19.7761f, 20.2239f, 20.0f, 20.5f, 20.0f)
                curveTo(20.7761f, 20.0f, 21.0f, 19.7761f, 21.0f, 19.5f)
                verticalLineTo(19.25f)
                curveTo(21.0f, 17.4551f, 19.5449f, 16.0f, 17.75f, 16.0f)
                horizontalLineTo(15.7071f)
                lineTo(16.3536f, 15.3536f)
                close()
            }
        }
        .build()
        return _personArrowBack!!
    }

private var _personArrowBack: ImageVector? = null