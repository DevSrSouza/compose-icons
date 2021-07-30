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

public val LineAwesomeIcons.TruckLoadingSolid: ImageVector
    get() {
        if (_truckLoadingSolid != null) {
            return _truckLoadingSolid!!
        }
        _truckLoadingSolid = Builder(name = "TruckLoadingSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 5.0f)
                lineTo(17.0f, 21.0742f)
                lineTo(2.7324f, 25.0352f)
                lineTo(3.2676f, 26.9629f)
                lineTo(20.0156f, 22.3145f)
                curveTo(20.1794f, 24.9246f, 22.3493f, 27.0f, 25.0f, 27.0f)
                curveTo(27.757f, 27.0f, 30.0f, 24.757f, 30.0f, 22.0f)
                curveTo(30.0f, 19.243f, 27.757f, 17.0f, 25.0f, 17.0f)
                curveTo(22.9015f, 17.0f, 21.1077f, 18.3021f, 20.3672f, 20.1387f)
                lineTo(19.0f, 20.5176f)
                lineTo(19.0f, 7.0f)
                lineTo(30.0f, 7.0f)
                lineTo(30.0f, 5.0f)
                lineTo(17.0f, 5.0f)
                close()
                moveTo(12.4609f, 9.7637f)
                lineTo(1.916f, 12.7871f)
                lineTo(4.6914f, 22.4707f)
                lineTo(15.2363f, 19.4453f)
                lineTo(12.4609f, 9.7637f)
                close()
                moveTo(11.0898f, 12.2363f)
                lineTo(12.7637f, 18.0742f)
                lineTo(6.0645f, 19.9941f)
                lineTo(4.3906f, 14.1582f)
                lineTo(11.0898f, 12.2363f)
                close()
                moveTo(25.0f, 19.0f)
                curveTo(26.654f, 19.0f, 28.0f, 20.346f, 28.0f, 22.0f)
                curveTo(28.0f, 23.654f, 26.654f, 25.0f, 25.0f, 25.0f)
                curveTo(23.346f, 25.0f, 22.0f, 23.654f, 22.0f, 22.0f)
                curveTo(22.0f, 20.346f, 23.346f, 19.0f, 25.0f, 19.0f)
                close()
            }
        }
        .build()
        return _truckLoadingSolid!!
    }

private var _truckLoadingSolid: ImageVector? = null
