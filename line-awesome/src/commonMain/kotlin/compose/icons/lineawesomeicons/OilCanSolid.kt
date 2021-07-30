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

public val LineAwesomeIcons.OilCanSolid: ImageVector
    get() {
        if (_oilCanSolid != null) {
            return _oilCanSolid!!
        }
        _oilCanSolid = Builder(name = "OilCanSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 9.0f)
                lineTo(11.0f, 11.0f)
                lineTo(13.0f, 11.0f)
                lineTo(13.0f, 13.0f)
                lineTo(7.5625f, 13.0f)
                lineTo(5.8438f, 10.4375f)
                lineTo(5.5313f, 10.0f)
                lineTo(1.0f, 10.0f)
                lineTo(1.0f, 15.6875f)
                lineTo(6.0f, 17.6875f)
                lineTo(6.0f, 25.0f)
                lineTo(20.5313f, 25.0f)
                lineTo(20.8125f, 24.5625f)
                lineTo(29.5f, 12.0f)
                lineTo(31.0f, 12.0f)
                lineTo(31.0f, 10.0f)
                lineTo(27.6563f, 10.0f)
                lineTo(27.4063f, 10.1875f)
                lineTo(21.0f, 15.0f)
                lineTo(21.0f, 13.0f)
                lineTo(15.0f, 13.0f)
                lineTo(15.0f, 11.0f)
                lineTo(17.0f, 11.0f)
                lineTo(17.0f, 9.0f)
                close()
                moveTo(3.0f, 12.0f)
                lineTo(4.4375f, 12.0f)
                lineTo(6.0f, 14.3438f)
                lineTo(6.0f, 15.5f)
                lineTo(3.0f, 14.3125f)
                close()
                moveTo(25.7813f, 13.9375f)
                lineTo(19.5f, 23.0f)
                lineTo(8.0f, 23.0f)
                lineTo(8.0f, 15.0f)
                lineTo(19.0f, 15.0f)
                lineTo(19.0f, 19.0f)
                lineTo(20.5938f, 17.8125f)
                close()
                moveTo(29.5f, 16.0f)
                curveTo(29.5f, 16.0f, 28.0f, 18.6719f, 28.0f, 19.5f)
                curveTo(28.0f, 20.3281f, 28.6719f, 21.0f, 29.5f, 21.0f)
                curveTo(30.3281f, 21.0f, 31.0f, 20.3281f, 31.0f, 19.5f)
                curveTo(31.0f, 18.6719f, 29.5f, 16.0f, 29.5f, 16.0f)
                close()
            }
        }
        .build()
        return _oilCanSolid!!
    }

private var _oilCanSolid: ImageVector? = null
