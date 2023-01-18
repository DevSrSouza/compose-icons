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

public val FilledGroup.Airplane: ImageVector
    get() {
        if (_airplane != null) {
            return _airplane!!
        }
        _airplane = Builder(name = "Airplane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9889f, 11.9463f)
                curveTo(21.9889f, 13.0461f, 21.0974f, 13.9376f, 19.9976f, 13.9376f)
                curveTo(19.9782f, 13.9376f, 19.9588f, 13.9373f, 19.9394f, 13.9367f)
                lineTo(15.2006f, 13.7972f)
                lineTo(11.7473f, 20.9398f)
                curveTo(11.4695f, 21.5144f, 10.8875f, 21.8794f, 10.2493f, 21.8794f)
                curveTo(9.7379f, 21.8794f, 9.3233f, 21.4648f, 9.3233f, 20.9534f)
                curveTo(9.3233f, 20.9166f, 9.3255f, 20.8798f, 9.3299f, 20.8432f)
                lineTo(10.1921f, 13.6505f)
                lineTo(6.4266f, 13.5406f)
                lineTo(5.9365f, 14.8813f)
                curveTo(5.7507f, 15.3896f, 5.2671f, 15.7277f, 4.7258f, 15.7277f)
                curveTo(4.2281f, 15.7277f, 3.8246f, 15.3242f, 3.8246f, 14.8265f)
                lineTo(3.8253f, 13.3498f)
                lineTo(3.0145f, 13.181f)
                curveTo(2.4299f, 13.059f, 2.011f, 12.5436f, 2.011f, 11.9463f)
                curveTo(2.011f, 11.3492f, 2.4301f, 10.834f, 3.0147f, 10.7124f)
                lineTo(3.8253f, 10.5437f)
                lineTo(3.8246f, 9.0662f)
                curveTo(3.8246f, 8.6067f, 4.1684f, 8.2276f, 4.6128f, 8.172f)
                lineTo(4.7258f, 8.1649f)
                curveTo(5.2671f, 8.1649f, 5.7507f, 8.503f, 5.9365f, 9.0114f)
                lineTo(6.4276f, 10.3518f)
                lineTo(10.1792f, 10.2418f)
                lineTo(9.3299f, 3.1574f)
                curveTo(9.3277f, 3.1391f, 9.3261f, 3.1207f, 9.325f, 3.1023f)
                lineTo(9.3233f, 3.0471f)
                curveTo(9.3233f, 2.5357f, 9.7379f, 2.1211f, 10.2493f, 2.1211f)
                curveTo(10.8344f, 2.1211f, 11.3721f, 2.4278f, 11.6716f, 2.9215f)
                lineTo(11.7473f, 3.0607f)
                lineTo(15.1499f, 10.0963f)
                lineTo(19.9394f, 9.9561f)
                curveTo(21.0386f, 9.9239f, 21.9558f, 10.7887f, 21.9881f, 11.8879f)
                lineTo(21.9889f, 11.9463f)
                close()
            }
        }
        .build()
        return _airplane!!
    }

private var _airplane: ImageVector? = null
