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

public val LineAwesomeIcons.WineBottleSolid: ImageVector
    get() {
        if (_wineBottleSolid != null) {
            return _wineBottleSolid!!
        }
        _wineBottleSolid = Builder(name = "WineBottleSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                curveTo(13.906f, 3.0f, 13.0f, 3.906f, 13.0f, 5.0f)
                lineTo(13.0f, 6.688f)
                curveTo(12.941f, 6.883f, 12.941f, 7.086f, 13.0f, 7.281f)
                lineTo(13.0f, 10.438f)
                lineTo(12.219f, 10.969f)
                curveTo(10.828f, 11.895f, 10.0f, 13.484f, 10.0f, 15.156f)
                lineTo(10.0f, 15.688f)
                curveTo(9.941f, 15.883f, 9.941f, 16.086f, 10.0f, 16.281f)
                lineTo(10.0f, 22.688f)
                curveTo(9.941f, 22.883f, 9.941f, 23.086f, 10.0f, 23.281f)
                lineTo(10.0f, 29.0f)
                lineTo(22.0f, 29.0f)
                lineTo(22.0f, 23.188f)
                curveTo(22.027f, 23.055f, 22.027f, 22.914f, 22.0f, 22.781f)
                lineTo(22.0f, 16.188f)
                curveTo(22.027f, 16.055f, 22.027f, 15.914f, 22.0f, 15.781f)
                lineTo(22.0f, 15.156f)
                curveTo(22.0f, 13.484f, 21.172f, 11.895f, 19.781f, 10.969f)
                lineTo(19.0f, 10.438f)
                lineTo(19.0f, 7.188f)
                curveTo(19.027f, 7.055f, 19.027f, 6.914f, 19.0f, 6.781f)
                lineTo(19.0f, 5.0f)
                curveTo(19.0f, 3.906f, 18.094f, 3.0f, 17.0f, 3.0f)
                close()
                moveTo(15.0f, 5.0f)
                lineTo(17.0f, 5.0f)
                lineTo(17.0f, 6.0f)
                lineTo(15.0f, 6.0f)
                close()
                moveTo(15.0f, 8.0f)
                lineTo(17.0f, 8.0f)
                lineTo(17.0f, 11.531f)
                lineTo(17.438f, 11.844f)
                lineTo(18.656f, 12.656f)
                curveTo(19.449f, 13.184f, 19.918f, 14.055f, 19.969f, 15.0f)
                lineTo(12.031f, 15.0f)
                curveTo(12.082f, 14.055f, 12.551f, 13.184f, 13.344f, 12.656f)
                lineTo(14.563f, 11.844f)
                lineTo(15.0f, 11.531f)
                close()
                moveTo(12.0f, 17.0f)
                lineTo(20.0f, 17.0f)
                lineTo(20.0f, 22.0f)
                lineTo(12.0f, 22.0f)
                close()
                moveTo(12.0f, 24.0f)
                lineTo(20.0f, 24.0f)
                lineTo(20.0f, 27.0f)
                lineTo(12.0f, 27.0f)
                close()
            }
        }
        .build()
        return _wineBottleSolid!!
    }

private var _wineBottleSolid: ImageVector? = null
