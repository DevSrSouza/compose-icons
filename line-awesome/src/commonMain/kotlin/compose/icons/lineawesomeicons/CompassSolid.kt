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

public val LineAwesomeIcons.CompassSolid: ImageVector
    get() {
        if (_compassSolid != null) {
            return _compassSolid!!
        }
        _compassSolid = Builder(name = "CompassSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.3828f, 4.0f, 4.0f, 9.3828f, 4.0f, 16.0f)
                curveTo(4.0f, 22.6172f, 9.3828f, 28.0f, 16.0f, 28.0f)
                curveTo(22.6172f, 28.0f, 28.0f, 22.6172f, 28.0f, 16.0f)
                curveTo(28.0f, 9.3828f, 22.6172f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(14.9688f, 6.0625f)
                curveTo(14.9805f, 6.0625f, 14.9883f, 6.0625f, 15.0f, 6.0625f)
                lineTo(15.0f, 7.0f)
                lineTo(17.0f, 7.0f)
                lineTo(17.0f, 6.0625f)
                curveTo(21.7383f, 6.5273f, 25.4727f, 10.2617f, 25.9375f, 15.0f)
                lineTo(25.0f, 15.0f)
                lineTo(25.0f, 17.0f)
                lineTo(25.9375f, 17.0f)
                curveTo(25.4727f, 21.7383f, 21.7383f, 25.4727f, 17.0f, 25.9375f)
                lineTo(17.0f, 25.0f)
                lineTo(15.0f, 25.0f)
                lineTo(15.0f, 25.9375f)
                curveTo(10.2617f, 25.4727f, 6.5273f, 21.7383f, 6.0625f, 17.0f)
                lineTo(7.0f, 17.0f)
                lineTo(7.0f, 15.0f)
                lineTo(6.0625f, 15.0f)
                curveTo(6.5273f, 10.2695f, 10.2461f, 6.5391f, 14.9688f, 6.0625f)
                close()
                moveTo(22.5f, 9.5f)
                lineTo(14.1563f, 14.1563f)
                lineTo(9.5f, 22.5f)
                lineTo(17.8438f, 17.8438f)
                close()
                moveTo(16.0f, 14.5f)
                curveTo(16.8281f, 14.5f, 17.5f, 15.1719f, 17.5f, 16.0f)
                curveTo(17.5f, 16.8281f, 16.8281f, 17.5f, 16.0f, 17.5f)
                curveTo(15.1719f, 17.5f, 14.5f, 16.8281f, 14.5f, 16.0f)
                curveTo(14.5f, 15.1719f, 15.1719f, 14.5f, 16.0f, 14.5f)
                close()
            }
        }
        .build()
        return _compassSolid!!
    }

private var _compassSolid: ImageVector? = null
