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
                curveTo(13.9063f, 3.0f, 13.0f, 3.9063f, 13.0f, 5.0f)
                lineTo(13.0f, 6.6875f)
                curveTo(12.9414f, 6.8828f, 12.9414f, 7.0859f, 13.0f, 7.2813f)
                lineTo(13.0f, 10.4375f)
                lineTo(12.2188f, 10.9688f)
                curveTo(10.8281f, 11.8945f, 10.0f, 13.4844f, 10.0f, 15.1563f)
                lineTo(10.0f, 15.6875f)
                curveTo(9.9414f, 15.8828f, 9.9414f, 16.0859f, 10.0f, 16.2813f)
                lineTo(10.0f, 22.6875f)
                curveTo(9.9414f, 22.8828f, 9.9414f, 23.0859f, 10.0f, 23.2813f)
                lineTo(10.0f, 29.0f)
                lineTo(22.0f, 29.0f)
                lineTo(22.0f, 23.1875f)
                curveTo(22.0273f, 23.0547f, 22.0273f, 22.9141f, 22.0f, 22.7813f)
                lineTo(22.0f, 16.1875f)
                curveTo(22.0273f, 16.0547f, 22.0273f, 15.9141f, 22.0f, 15.7813f)
                lineTo(22.0f, 15.1563f)
                curveTo(22.0f, 13.4844f, 21.1719f, 11.8945f, 19.7813f, 10.9688f)
                lineTo(19.0f, 10.4375f)
                lineTo(19.0f, 7.1875f)
                curveTo(19.0273f, 7.0547f, 19.0273f, 6.9141f, 19.0f, 6.7813f)
                lineTo(19.0f, 5.0f)
                curveTo(19.0f, 3.9063f, 18.0938f, 3.0f, 17.0f, 3.0f)
                close()
                moveTo(15.0f, 5.0f)
                lineTo(17.0f, 5.0f)
                lineTo(17.0f, 6.0f)
                lineTo(15.0f, 6.0f)
                close()
                moveTo(15.0f, 8.0f)
                lineTo(17.0f, 8.0f)
                lineTo(17.0f, 11.5313f)
                lineTo(17.4375f, 11.8438f)
                lineTo(18.6563f, 12.6563f)
                curveTo(19.4492f, 13.1836f, 19.918f, 14.0547f, 19.9688f, 15.0f)
                lineTo(12.0313f, 15.0f)
                curveTo(12.082f, 14.0547f, 12.5508f, 13.1836f, 13.3438f, 12.6563f)
                lineTo(14.5625f, 11.8438f)
                lineTo(15.0f, 11.5313f)
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
