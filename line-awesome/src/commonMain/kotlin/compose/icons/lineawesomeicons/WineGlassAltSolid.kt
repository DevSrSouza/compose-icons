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

public val LineAwesomeIcons.WineGlassAltSolid: ImageVector
    get() {
        if (_wineGlassAltSolid != null) {
            return _wineGlassAltSolid!!
        }
        _wineGlassAltSolid = Builder(name = "WineGlassAltSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.1875f, 5.0f)
                lineTo(8.0313f, 5.7813f)
                curveTo(8.0313f, 5.7813f, 7.0f, 10.4883f, 7.0f, 13.0f)
                curveTo(7.0f, 17.6172f, 10.5156f, 21.4297f, 15.0f, 21.9375f)
                lineTo(15.0f, 26.0f)
                lineTo(10.0f, 26.0f)
                lineTo(10.0f, 28.0f)
                lineTo(22.0f, 28.0f)
                lineTo(22.0f, 26.0f)
                lineTo(17.0f, 26.0f)
                lineTo(17.0f, 21.9375f)
                curveTo(21.4844f, 21.4297f, 25.0f, 17.6172f, 25.0f, 13.0f)
                curveTo(25.0f, 10.4844f, 23.9688f, 5.7813f, 23.9688f, 5.7813f)
                lineTo(23.8125f, 5.0f)
                close()
                moveTo(9.8438f, 7.0f)
                lineTo(22.1563f, 7.0f)
                curveTo(22.25f, 7.4883f, 22.4883f, 8.7188f, 22.6875f, 10.0f)
                lineTo(11.0f, 10.0f)
                lineTo(11.0f, 12.0f)
                lineTo(22.9375f, 12.0f)
                curveTo(22.9688f, 12.3477f, 23.0f, 12.7227f, 23.0f, 13.0f)
                curveTo(23.0f, 16.8789f, 19.8789f, 20.0f, 16.0f, 20.0f)
                curveTo(12.1211f, 20.0f, 9.0f, 16.8789f, 9.0f, 13.0f)
                curveTo(9.0f, 11.3125f, 9.668f, 7.9063f, 9.8438f, 7.0f)
                close()
            }
        }
        .build()
        return _wineGlassAltSolid!!
    }

private var _wineGlassAltSolid: ImageVector? = null
