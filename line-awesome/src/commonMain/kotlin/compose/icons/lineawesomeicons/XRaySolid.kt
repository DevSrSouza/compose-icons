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

public val LineAwesomeIcons.XRaySolid: ImageVector
    get() {
        if (_xRaySolid != null) {
            return _xRaySolid!!
        }
        _xRaySolid = Builder(name = "XRaySolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                close()
                moveTo(15.0f, 8.0f)
                lineTo(15.0f, 9.0f)
                lineTo(12.0f, 9.0f)
                lineTo(12.0f, 11.0f)
                lineTo(15.0f, 11.0f)
                lineTo(15.0f, 12.0f)
                lineTo(10.0f, 12.0f)
                lineTo(10.0f, 14.0f)
                lineTo(15.0f, 14.0f)
                lineTo(15.0f, 15.0f)
                lineTo(11.0f, 15.0f)
                lineTo(11.0f, 17.0f)
                lineTo(15.0f, 17.0f)
                lineTo(15.0f, 19.5625f)
                curveTo(14.4766f, 19.293f, 13.8867f, 19.0f, 13.5f, 19.0f)
                curveTo(12.6719f, 19.0f, 12.0f, 19.6719f, 12.0f, 20.5f)
                curveTo(12.0f, 21.3281f, 12.6719f, 22.0f, 13.5f, 22.0f)
                curveTo(13.8789f, 22.0f, 15.1719f, 23.0f, 16.0f, 23.0f)
                curveTo(16.8281f, 23.0f, 18.1211f, 22.0f, 18.5f, 22.0f)
                curveTo(19.3281f, 22.0f, 20.0f, 21.3281f, 20.0f, 20.5f)
                curveTo(20.0f, 19.6719f, 19.3281f, 19.0f, 18.5f, 19.0f)
                curveTo(18.1133f, 19.0f, 17.5234f, 19.293f, 17.0f, 19.5625f)
                lineTo(17.0f, 8.0f)
                close()
                moveTo(18.0f, 9.0f)
                lineTo(18.0f, 11.0f)
                lineTo(20.0f, 11.0f)
                lineTo(20.0f, 9.0f)
                close()
                moveTo(18.0f, 12.0f)
                lineTo(18.0f, 14.0f)
                lineTo(22.0f, 14.0f)
                lineTo(22.0f, 12.0f)
                close()
                moveTo(18.0f, 15.0f)
                lineTo(18.0f, 17.0f)
                lineTo(21.0f, 17.0f)
                lineTo(21.0f, 15.0f)
                close()
            }
        }
        .build()
        return _xRaySolid!!
    }

private var _xRaySolid: ImageVector? = null
