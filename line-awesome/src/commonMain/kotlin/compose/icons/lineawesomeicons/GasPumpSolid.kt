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

public val LineAwesomeIcons.GasPumpSolid: ImageVector
    get() {
        if (_gasPumpSolid != null) {
            return _gasPumpSolid!!
        }
        _gasPumpSolid = Builder(name = "GasPumpSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                curveTo(6.3555f, 5.0f, 5.0f, 6.3555f, 5.0f, 8.0f)
                lineTo(5.0f, 27.0f)
                lineTo(19.0f, 27.0f)
                lineTo(19.0f, 20.0f)
                lineTo(21.0f, 20.0f)
                lineTo(21.0f, 24.0f)
                curveTo(21.0f, 25.6445f, 22.3555f, 27.0f, 24.0f, 27.0f)
                curveTo(25.6445f, 27.0f, 27.0f, 25.6445f, 27.0f, 24.0f)
                lineTo(27.0f, 13.8125f)
                curveTo(27.0f, 13.0156f, 26.6875f, 12.2813f, 26.125f, 11.7188f)
                lineTo(21.4063f, 7.0f)
                lineTo(20.0f, 8.4063f)
                lineTo(22.8438f, 11.25f)
                curveTo(21.7695f, 11.707f, 21.0f, 12.7656f, 21.0f, 14.0f)
                curveTo(21.0f, 15.6445f, 22.3555f, 17.0f, 24.0f, 17.0f)
                curveTo(24.3516f, 17.0f, 24.6836f, 16.9258f, 25.0f, 16.8125f)
                lineTo(25.0f, 24.0f)
                curveTo(25.0f, 24.5664f, 24.5664f, 25.0f, 24.0f, 25.0f)
                curveTo(23.4336f, 25.0f, 23.0f, 24.5664f, 23.0f, 24.0f)
                lineTo(23.0f, 20.0f)
                curveTo(23.0f, 18.9063f, 22.0938f, 18.0f, 21.0f, 18.0f)
                lineTo(19.0f, 18.0f)
                lineTo(19.0f, 8.0f)
                curveTo(19.0f, 6.3555f, 17.6445f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(8.0f, 7.0f)
                lineTo(16.0f, 7.0f)
                curveTo(16.5664f, 7.0f, 17.0f, 7.4336f, 17.0f, 8.0f)
                lineTo(17.0f, 12.0f)
                lineTo(7.0f, 12.0f)
                lineTo(7.0f, 8.0f)
                curveTo(7.0f, 7.4336f, 7.4336f, 7.0f, 8.0f, 7.0f)
                close()
                moveTo(24.0f, 13.0f)
                curveTo(24.5625f, 13.0f, 25.0f, 13.4375f, 25.0f, 14.0f)
                curveTo(25.0f, 14.5625f, 24.5625f, 15.0f, 24.0f, 15.0f)
                curveTo(23.4375f, 15.0f, 23.0f, 14.5625f, 23.0f, 14.0f)
                curveTo(23.0f, 13.4375f, 23.4375f, 13.0f, 24.0f, 13.0f)
                close()
                moveTo(7.0f, 14.0f)
                lineTo(17.0f, 14.0f)
                lineTo(17.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                close()
            }
        }
        .build()
        return _gasPumpSolid!!
    }

private var _gasPumpSolid: ImageVector? = null
