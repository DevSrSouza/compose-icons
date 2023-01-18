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

public val FilledGroup.ArrowUndo: ImageVector
    get() {
        if (_arrowUndo != null) {
            return _arrowUndo!!
        }
        _arrowUndo = Builder(name = "ArrowUndo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.9074f, 6.6796f)
                lineTo(9.6411f, 3.9509f)
                curveTo(12.2423f, 1.3497f, 16.4597f, 1.3497f, 19.0609f, 3.9509f)
                curveTo(21.6621f, 6.5521f, 21.6621f, 10.7695f, 19.0609f, 13.3708f)
                lineTo(10.7225f, 21.7078f)
                curveTo(10.3319f, 22.0982f, 9.6988f, 22.098f, 9.3083f, 21.7075f)
                curveTo(8.9177f, 21.317f, 8.9179f, 20.6838f, 9.3085f, 20.2933f)
                lineTo(17.6467f, 11.9565f)
                curveTo(19.4669f, 10.1364f, 19.4669f, 7.1853f, 17.6467f, 5.3651f)
                curveTo(15.8834f, 3.6018f, 13.0588f, 3.5467f, 11.2286f, 5.2004f)
                lineTo(11.0546f, 5.3658f)
                lineTo(7.414f, 8.999f)
                lineTo(12.0f, 8.9995f)
                curveTo(12.5128f, 8.9995f, 12.9355f, 9.3856f, 12.9933f, 9.8829f)
                lineTo(13.0f, 9.9995f)
                curveTo(13.0f, 10.5124f, 12.614f, 10.935f, 12.1166f, 10.9928f)
                lineTo(12.0f, 10.9995f)
                lineTo(4.9404f, 10.9978f)
                lineTo(4.845f, 10.9876f)
                lineTo(4.7332f, 10.9635f)
                lineTo(4.6016f, 10.9171f)
                lineTo(4.5197f, 10.8769f)
                lineTo(4.4178f, 10.8127f)
                curveTo(4.3741f, 10.7814f, 4.3321f, 10.7459f, 4.2927f, 10.7064f)
                lineTo(4.201f, 10.601f)
                lineTo(4.1266f, 10.487f)
                lineTo(4.0809f, 10.3943f)
                lineTo(4.0425f, 10.2886f)
                lineTo(4.027f, 10.2313f)
                lineTo(4.0113f, 10.1497f)
                lineTo(4.0039f, 10.0885f)
                lineTo(4.0f, 9.9995f)
                verticalLineTo(3.0024f)
                curveTo(4.0f, 2.4501f, 4.4477f, 2.0024f, 5.0f, 2.0024f)
                curveTo(5.5128f, 2.0024f, 5.9355f, 2.3884f, 5.9933f, 2.8857f)
                lineTo(6.0f, 3.0024f)
                verticalLineTo(7.586f)
                lineTo(9.6411f, 3.9509f)
                lineTo(6.9074f, 6.6796f)
                close()
            }
        }
        .build()
        return _arrowUndo!!
    }

private var _arrowUndo: ImageVector? = null
