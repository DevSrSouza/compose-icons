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

public val LineAwesomeIcons.HardHatSolid: ImageVector
    get() {
        if (_hardHatSolid != null) {
            return _hardHatSolid!!
        }
        _hardHatSolid = Builder(name = "HardHatSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 7.0f)
                lineTo(13.0f, 8.4063f)
                curveTo(8.0352f, 9.6875f, 4.4102f, 14.082f, 4.125f, 19.375f)
                curveTo(2.9531f, 19.7852f, 2.0f, 20.6953f, 2.0f, 22.0f)
                lineTo(2.0f, 25.0f)
                lineTo(30.0f, 25.0f)
                lineTo(30.0f, 22.0f)
                curveTo(30.0f, 20.6953f, 29.0469f, 19.7852f, 27.875f, 19.375f)
                curveTo(27.5898f, 14.082f, 23.9648f, 9.6875f, 19.0f, 8.4063f)
                lineTo(19.0f, 7.0f)
                close()
                moveTo(15.0313f, 9.0f)
                lineTo(17.0f, 9.0f)
                curveTo(16.9805f, 9.1133f, 16.9805f, 9.2305f, 17.0f, 9.3438f)
                lineTo(17.0f, 15.0f)
                lineTo(19.0f, 15.0f)
                lineTo(19.0f, 10.5f)
                curveTo(22.7383f, 11.6797f, 25.5664f, 14.9727f, 25.9688f, 19.0f)
                lineTo(24.0f, 19.0f)
                lineTo(24.0f, 21.0f)
                lineTo(27.0f, 21.0f)
                curveTo(27.5664f, 21.0f, 28.0f, 21.4336f, 28.0f, 22.0f)
                lineTo(28.0f, 23.0f)
                lineTo(4.0f, 23.0f)
                lineTo(4.0f, 22.0f)
                curveTo(4.0f, 21.4336f, 4.4336f, 21.0f, 5.0f, 21.0f)
                lineTo(8.0f, 21.0f)
                lineTo(8.0f, 19.0f)
                lineTo(6.0313f, 19.0f)
                curveTo(6.4336f, 14.9727f, 9.2617f, 11.6797f, 13.0f, 10.5f)
                lineTo(13.0f, 15.0f)
                lineTo(15.0f, 15.0f)
                lineTo(15.0f, 9.5f)
                curveTo(15.0508f, 9.3398f, 15.0625f, 9.168f, 15.0313f, 9.0f)
                close()
            }
        }
        .build()
        return _hardHatSolid!!
    }

private var _hardHatSolid: ImageVector? = null
