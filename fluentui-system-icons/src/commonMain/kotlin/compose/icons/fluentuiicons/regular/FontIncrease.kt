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

public val RegularGroup.FontIncrease: ImageVector
    get() {
        if (_fontIncrease != null) {
            return _fontIncrease!!
        }
        _fontIncrease = Builder(name = "FontIncrease", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.1951f, 5.7545f)
                curveTo(15.4738f, 6.0609f, 15.9481f, 6.0835f, 16.2546f, 5.8049f)
                lineTo(18.5f, 3.7636f)
                lineTo(20.7455f, 5.8049f)
                curveTo(21.052f, 6.0835f, 21.5263f, 6.0609f, 21.805f, 5.7545f)
                curveTo(22.0836f, 5.448f, 22.061f, 4.9736f, 21.7545f, 4.695f)
                lineTo(19.0045f, 2.195f)
                curveTo(18.7185f, 1.935f, 18.2816f, 1.935f, 17.9956f, 2.195f)
                lineTo(15.2456f, 4.695f)
                curveTo(14.9391f, 4.9736f, 14.9165f, 5.448f, 15.1951f, 5.7545f)
                close()
                moveTo(12.0001f, 4.0f)
                curveTo(12.3076f, 4.0f, 12.5839f, 4.1877f, 12.6973f, 4.4735f)
                lineTo(18.4472f, 18.9733f)
                curveTo(18.5999f, 19.3584f, 18.4115f, 19.7943f, 18.0265f, 19.947f)
                curveTo(17.6414f, 20.0997f, 17.2055f, 19.9113f, 17.0528f, 19.5263f)
                lineTo(15.2579f, 14.9999f)
                horizontalLineTo(8.7423f)
                lineTo(6.9474f, 19.5263f)
                curveTo(6.7947f, 19.9113f, 6.3588f, 20.0997f, 5.9737f, 19.947f)
                curveTo(5.5887f, 19.7943f, 5.4003f, 19.3584f, 5.553f, 18.9733f)
                lineTo(11.3029f, 4.4735f)
                curveTo(11.4163f, 4.1877f, 11.6926f, 4.0f, 12.0001f, 4.0f)
                close()
                moveTo(9.3371f, 13.4999f)
                horizontalLineTo(14.6631f)
                lineTo(12.0001f, 6.7845f)
                lineTo(9.3371f, 13.4999f)
                close()
            }
        }
        .build()
        return _fontIncrease!!
    }

private var _fontIncrease: ImageVector? = null
