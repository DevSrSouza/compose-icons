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

public val LineAwesomeIcons.SatelliteDishSolid: ImageVector
    get() {
        if (_satelliteDishSolid != null) {
            return _satelliteDishSolid!!
        }
        _satelliteDishSolid = Builder(name = "SatelliteDishSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 4.5f)
                lineTo(16.5f, 6.5f)
                curveTo(21.4844f, 6.5f, 25.5f, 10.5156f, 25.5f, 15.5f)
                lineTo(27.5f, 15.5f)
                curveTo(27.5f, 9.4375f, 22.5625f, 4.5f, 16.5f, 4.5f)
                close()
                moveTo(16.5f, 8.5f)
                lineTo(16.5f, 10.5f)
                curveTo(19.2734f, 10.5f, 21.5f, 12.7266f, 21.5f, 15.5f)
                lineTo(23.5f, 15.5f)
                curveTo(23.5f, 11.6445f, 20.3555f, 8.5f, 16.5f, 8.5f)
                close()
                moveTo(7.9063f, 8.5938f)
                lineTo(7.2188f, 9.2813f)
                curveTo(2.9492f, 13.5508f, 2.9492f, 20.5117f, 7.2188f, 24.7813f)
                curveTo(11.4883f, 29.0508f, 18.4492f, 29.0508f, 22.7188f, 24.7813f)
                lineTo(23.4063f, 24.0938f)
                lineTo(22.7188f, 23.375f)
                lineTo(17.2188f, 17.875f)
                curveTo(18.2422f, 17.5625f, 19.0f, 16.6289f, 19.0f, 15.5f)
                curveTo(19.0f, 14.1211f, 17.8789f, 13.0f, 16.5f, 13.0f)
                curveTo(15.3711f, 13.0f, 14.4375f, 13.7578f, 14.125f, 14.7813f)
                lineTo(8.625f, 9.2813f)
                close()
                moveTo(8.0625f, 11.5625f)
                lineTo(20.4375f, 23.9375f)
                curveTo(16.918f, 26.7305f, 11.8828f, 26.6328f, 8.625f, 23.375f)
                curveTo(5.3672f, 20.1172f, 5.2695f, 15.082f, 8.0625f, 11.5625f)
                close()
            }
        }
        .build()
        return _satelliteDishSolid!!
    }

private var _satelliteDishSolid: ImageVector? = null
