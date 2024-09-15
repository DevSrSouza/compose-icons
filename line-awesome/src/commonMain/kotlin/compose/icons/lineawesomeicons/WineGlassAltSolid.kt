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
                moveTo(8.188f, 5.0f)
                lineTo(8.031f, 5.781f)
                curveTo(8.031f, 5.781f, 7.0f, 10.488f, 7.0f, 13.0f)
                curveTo(7.0f, 17.617f, 10.516f, 21.43f, 15.0f, 21.938f)
                lineTo(15.0f, 26.0f)
                lineTo(10.0f, 26.0f)
                lineTo(10.0f, 28.0f)
                lineTo(22.0f, 28.0f)
                lineTo(22.0f, 26.0f)
                lineTo(17.0f, 26.0f)
                lineTo(17.0f, 21.938f)
                curveTo(21.484f, 21.43f, 25.0f, 17.617f, 25.0f, 13.0f)
                curveTo(25.0f, 10.484f, 23.969f, 5.781f, 23.969f, 5.781f)
                lineTo(23.813f, 5.0f)
                close()
                moveTo(9.844f, 7.0f)
                lineTo(22.156f, 7.0f)
                curveTo(22.25f, 7.488f, 22.488f, 8.719f, 22.688f, 10.0f)
                lineTo(11.0f, 10.0f)
                lineTo(11.0f, 12.0f)
                lineTo(22.938f, 12.0f)
                curveTo(22.969f, 12.348f, 23.0f, 12.723f, 23.0f, 13.0f)
                curveTo(23.0f, 16.879f, 19.879f, 20.0f, 16.0f, 20.0f)
                curveTo(12.121f, 20.0f, 9.0f, 16.879f, 9.0f, 13.0f)
                curveTo(9.0f, 11.313f, 9.668f, 7.906f, 9.844f, 7.0f)
                close()
            }
        }
        .build()
        return _wineGlassAltSolid!!
    }

private var _wineGlassAltSolid: ImageVector? = null
