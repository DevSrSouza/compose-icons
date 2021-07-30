package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Thermometer: ImageVector
    get() {
        if (_thermometer != null) {
            return _thermometer!!
        }
        _thermometer = Builder(name = "Thermometer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9498f, 5.6361f)
                curveTo(17.3403f, 5.2456f, 17.9735f, 5.2456f, 18.364f, 5.6361f)
                curveTo(18.7545f, 6.0267f, 18.7545f, 6.6598f, 18.364f, 7.0504f)
                lineTo(11.2929f, 14.1214f)
                curveTo(10.9024f, 14.512f, 10.2693f, 14.512f, 9.8787f, 14.1214f)
                curveTo(9.4882f, 13.7309f, 9.4882f, 13.0977f, 9.8787f, 12.7072f)
                lineTo(16.9498f, 5.6361f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.8281f, 17.5862f)
                curveTo(9.7695f, 18.8725f, 12.4109f, 18.6603f, 14.1214f, 16.9499f)
                lineTo(21.1924f, 9.8788f)
                curveTo(23.1451f, 7.9262f, 23.1451f, 4.7604f, 21.1924f, 2.8077f)
                curveTo(19.2398f, 0.8551f, 16.074f, 0.8551f, 14.1214f, 2.8077f)
                lineTo(7.0503f, 9.8788f)
                curveTo(5.3398f, 11.5893f, 5.1277f, 14.2307f, 6.4139f, 16.172f)
                lineTo(2.8077f, 19.7783f)
                curveTo(2.4171f, 20.1688f, 2.4171f, 20.802f, 2.8077f, 21.1925f)
                curveTo(3.1982f, 21.583f, 3.8314f, 21.583f, 4.2219f, 21.1925f)
                lineTo(7.8281f, 17.5862f)
                close()
                moveTo(12.7072f, 15.5356f)
                lineTo(19.7782f, 8.4646f)
                curveTo(20.9498f, 7.293f, 20.9498f, 5.3935f, 19.7782f, 4.2219f)
                curveTo(18.6067f, 3.0504f, 16.7072f, 3.0504f, 15.5356f, 4.2219f)
                lineTo(8.4645f, 11.293f)
                curveTo(7.2929f, 12.4646f, 7.2929f, 14.3641f, 8.4645f, 15.5356f)
                curveTo(9.6361f, 16.7072f, 11.5356f, 16.7072f, 12.7072f, 15.5356f)
                close()
            }
        }
        .build()
        return _thermometer!!
    }

private var _thermometer: ImageVector? = null
