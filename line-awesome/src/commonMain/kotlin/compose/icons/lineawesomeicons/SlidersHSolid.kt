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

public val LineAwesomeIcons.SlidersHSolid: ImageVector
    get() {
        if (_slidersHSolid != null) {
            return _slidersHSolid!!
        }
        _slidersHSolid = Builder(name = "SlidersHSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 5.0f)
                curveTo(13.707f, 5.0f, 12.6055f, 5.8438f, 12.1875f, 7.0f)
                lineTo(4.0f, 7.0f)
                lineTo(4.0f, 9.0f)
                lineTo(12.1875f, 9.0f)
                curveTo(12.6055f, 10.1563f, 13.707f, 11.0f, 15.0f, 11.0f)
                curveTo(16.293f, 11.0f, 17.3945f, 10.1563f, 17.8125f, 9.0f)
                lineTo(28.0f, 9.0f)
                lineTo(28.0f, 7.0f)
                lineTo(17.8125f, 7.0f)
                curveTo(17.3945f, 5.8438f, 16.293f, 5.0f, 15.0f, 5.0f)
                close()
                moveTo(15.0f, 7.0f)
                curveTo(15.5625f, 7.0f, 16.0f, 7.4375f, 16.0f, 8.0f)
                curveTo(16.0f, 8.5625f, 15.5625f, 9.0f, 15.0f, 9.0f)
                curveTo(14.4375f, 9.0f, 14.0f, 8.5625f, 14.0f, 8.0f)
                curveTo(14.0f, 7.4375f, 14.4375f, 7.0f, 15.0f, 7.0f)
                close()
                moveTo(22.0f, 13.0f)
                curveTo(20.707f, 13.0f, 19.6055f, 13.8438f, 19.1875f, 15.0f)
                lineTo(4.0f, 15.0f)
                lineTo(4.0f, 17.0f)
                lineTo(19.1875f, 17.0f)
                curveTo(19.6055f, 18.1563f, 20.707f, 19.0f, 22.0f, 19.0f)
                curveTo(23.293f, 19.0f, 24.3945f, 18.1563f, 24.8125f, 17.0f)
                lineTo(28.0f, 17.0f)
                lineTo(28.0f, 15.0f)
                lineTo(24.8125f, 15.0f)
                curveTo(24.3945f, 13.8438f, 23.293f, 13.0f, 22.0f, 13.0f)
                close()
                moveTo(22.0f, 15.0f)
                curveTo(22.5625f, 15.0f, 23.0f, 15.4375f, 23.0f, 16.0f)
                curveTo(23.0f, 16.5625f, 22.5625f, 17.0f, 22.0f, 17.0f)
                curveTo(21.4375f, 17.0f, 21.0f, 16.5625f, 21.0f, 16.0f)
                curveTo(21.0f, 15.4375f, 21.4375f, 15.0f, 22.0f, 15.0f)
                close()
                moveTo(11.0f, 21.0f)
                curveTo(9.707f, 21.0f, 8.6055f, 21.8438f, 8.1875f, 23.0f)
                lineTo(4.0f, 23.0f)
                lineTo(4.0f, 25.0f)
                lineTo(8.1875f, 25.0f)
                curveTo(8.6055f, 26.1563f, 9.707f, 27.0f, 11.0f, 27.0f)
                curveTo(12.293f, 27.0f, 13.3945f, 26.1563f, 13.8125f, 25.0f)
                lineTo(28.0f, 25.0f)
                lineTo(28.0f, 23.0f)
                lineTo(13.8125f, 23.0f)
                curveTo(13.3945f, 21.8438f, 12.293f, 21.0f, 11.0f, 21.0f)
                close()
                moveTo(11.0f, 23.0f)
                curveTo(11.5625f, 23.0f, 12.0f, 23.4375f, 12.0f, 24.0f)
                curveTo(12.0f, 24.5625f, 11.5625f, 25.0f, 11.0f, 25.0f)
                curveTo(10.4375f, 25.0f, 10.0f, 24.5625f, 10.0f, 24.0f)
                curveTo(10.0f, 23.4375f, 10.4375f, 23.0f, 11.0f, 23.0f)
                close()
            }
        }
        .build()
        return _slidersHSolid!!
    }

private var _slidersHSolid: ImageVector? = null
