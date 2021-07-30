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

public val LineAwesomeIcons.SolarPanelSolid: ImageVector
    get() {
        if (_solarPanelSolid != null) {
            return _solarPanelSolid!!
        }
        _solarPanelSolid = Builder(name = "SolarPanelSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                lineTo(15.0f, 6.5938f)
                lineTo(13.1875f, 4.8125f)
                lineTo(11.8125f, 6.1875f)
                lineTo(13.5938f, 8.0f)
                lineTo(11.0f, 8.0f)
                lineTo(11.0f, 10.0f)
                lineTo(13.5938f, 10.0f)
                lineTo(11.8125f, 11.8125f)
                lineTo(13.1875f, 13.1875f)
                lineTo(15.0f, 11.4063f)
                lineTo(15.0f, 14.0f)
                lineTo(17.0f, 14.0f)
                lineTo(17.0f, 11.4063f)
                lineTo(18.8125f, 13.1875f)
                lineTo(20.1875f, 11.8125f)
                lineTo(18.4063f, 10.0f)
                lineTo(21.0f, 10.0f)
                lineTo(21.0f, 8.0f)
                lineTo(18.4063f, 8.0f)
                lineTo(20.1875f, 6.1875f)
                lineTo(18.8125f, 4.8125f)
                lineTo(17.0f, 6.5938f)
                lineTo(17.0f, 4.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(17.1016f, 7.0f, 18.0f, 7.8984f, 18.0f, 9.0f)
                curveTo(18.0f, 10.1016f, 17.1016f, 11.0f, 16.0f, 11.0f)
                curveTo(14.8984f, 11.0f, 14.0f, 10.1016f, 14.0f, 9.0f)
                curveTo(14.0f, 7.8984f, 14.8984f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(6.2188f, 16.0f)
                lineTo(4.0f, 24.875f)
                lineTo(4.0f, 28.0f)
                lineTo(28.0f, 28.0f)
                lineTo(28.0f, 24.875f)
                lineTo(25.7813f, 16.0f)
                close()
                moveTo(7.7813f, 18.0f)
                lineTo(24.2188f, 18.0f)
                lineTo(26.0f, 25.125f)
                lineTo(26.0f, 26.0f)
                lineTo(6.0f, 26.0f)
                lineTo(6.0f, 25.125f)
                close()
                moveTo(9.0f, 19.0f)
                lineTo(8.5938f, 20.8125f)
                lineTo(10.6875f, 20.8125f)
                lineTo(11.0f, 19.0f)
                close()
                moveTo(13.0f, 19.0f)
                lineTo(12.8125f, 20.8125f)
                lineTo(14.9063f, 20.8125f)
                lineTo(15.0f, 19.0f)
                close()
                moveTo(17.0f, 19.0f)
                lineTo(17.0938f, 20.8125f)
                lineTo(19.1875f, 20.8125f)
                lineTo(19.0f, 19.0f)
                close()
                moveTo(21.0f, 19.0f)
                lineTo(21.3125f, 20.8125f)
                lineTo(23.4063f, 20.8125f)
                lineTo(23.0f, 19.0f)
                close()
                moveTo(8.1875f, 22.8125f)
                lineTo(7.8125f, 25.0f)
                lineTo(10.0938f, 25.0f)
                lineTo(10.4063f, 22.8125f)
                close()
                moveTo(12.6875f, 22.8125f)
                lineTo(12.5f, 25.0f)
                lineTo(14.8125f, 25.0f)
                lineTo(14.9063f, 22.8125f)
                close()
                moveTo(17.0938f, 22.8125f)
                lineTo(17.1875f, 25.0f)
                lineTo(19.5f, 25.0f)
                lineTo(19.3125f, 22.8125f)
                close()
                moveTo(21.5938f, 22.8125f)
                lineTo(21.9063f, 25.0f)
                lineTo(24.1875f, 25.0f)
                lineTo(23.8125f, 22.8125f)
                close()
            }
        }
        .build()
        return _solarPanelSolid!!
    }

private var _solarPanelSolid: ImageVector? = null
