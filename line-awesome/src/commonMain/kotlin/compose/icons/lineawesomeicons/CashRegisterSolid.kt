package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.CashRegisterSolid: ImageVector
    get() {
        if (_cashRegisterSolid != null) {
            return _cashRegisterSolid!!
        }
        _cashRegisterSolid = Builder(name = "CashRegisterSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.0f)
                lineTo(22.0f, 7.0f)
                curveTo(20.1523f, 7.0f, 18.3867f, 7.332f, 16.7344f, 7.9102f)
                lineTo(16.207f, 6.7617f)
                lineTo(17.1094f, 6.3594f)
                lineTo(16.2969f, 4.5313f)
                lineTo(12.6445f, 6.1563f)
                lineTo(13.457f, 7.9844f)
                lineTo(14.3789f, 7.5742f)
                lineTo(14.8906f, 8.6797f)
                curveTo(13.7969f, 9.2266f, 12.7813f, 9.8984f, 11.8477f, 10.668f)
                lineTo(11.0625f, 9.832f)
                lineTo(11.7891f, 9.1641f)
                lineTo(10.4375f, 7.6875f)
                lineTo(7.4922f, 10.3945f)
                lineTo(8.8438f, 11.8711f)
                lineTo(9.5859f, 11.1875f)
                lineTo(10.3906f, 12.0352f)
                curveTo(9.4336f, 13.0508f, 8.6094f, 14.1914f, 7.9453f, 15.4297f)
                lineTo(6.8633f, 14.8945f)
                lineTo(7.3125f, 14.0117f)
                lineTo(5.5313f, 13.1055f)
                lineTo(3.7188f, 16.6719f)
                lineTo(5.5f, 17.5781f)
                lineTo(5.957f, 16.6758f)
                lineTo(7.1016f, 17.2461f)
                curveTo(6.5234f, 18.7383f, 6.1563f, 20.332f, 6.0508f, 22.0f)
                lineTo(4.0f, 22.0f)
                lineTo(4.0f, 28.0f)
                lineTo(28.0f, 28.0f)
                lineTo(28.0f, 3.0f)
                close()
                moveTo(24.0f, 5.0f)
                lineTo(26.0f, 5.0f)
                lineTo(26.0f, 22.0f)
                lineTo(8.0508f, 22.0f)
                curveTo(8.5625f, 14.7266f, 14.5938f, 9.0f, 22.0f, 9.0f)
                lineTo(24.0f, 9.0f)
                close()
                moveTo(18.0f, 11.9531f)
                curveTo(16.8945f, 11.9531f, 16.0f, 12.8516f, 16.0f, 13.9531f)
                curveTo(16.0f, 14.668f, 16.3828f, 15.3281f, 17.0f, 15.6875f)
                lineTo(17.0f, 20.0f)
                lineTo(22.0f, 20.0f)
                lineTo(22.0f, 18.0f)
                lineTo(19.0f, 18.0f)
                lineTo(19.0f, 15.6836f)
                curveTo(19.6172f, 15.3281f, 20.0f, 14.668f, 20.0f, 13.9531f)
                curveTo(20.0f, 12.8516f, 19.1055f, 11.9531f, 18.0f, 11.9531f)
                close()
                moveTo(6.0f, 24.0f)
                lineTo(26.0f, 24.0f)
                lineTo(26.0f, 26.0f)
                lineTo(6.0f, 26.0f)
                close()
            }
        }
        .build()
        return _cashRegisterSolid!!
    }

private var _cashRegisterSolid: ImageVector? = null
