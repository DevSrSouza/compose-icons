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

public val LineAwesomeIcons.BusSolid: ImageVector
    get() {
        if (_busSolid != null) {
            return _busSolid!!
        }
        _busSolid = Builder(name = "BusSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                curveTo(6.801f, 4.0f, 5.0f, 5.801f, 5.0f, 8.0f)
                lineTo(5.0f, 13.0f)
                lineTo(3.0f, 13.0f)
                lineTo(3.0f, 16.0f)
                lineTo(5.0f, 16.0f)
                lineTo(5.0f, 27.0f)
                curveTo(5.0f, 27.551f, 5.449f, 28.0f, 6.0f, 28.0f)
                lineTo(9.0f, 28.0f)
                lineTo(9.344f, 27.0f)
                lineTo(22.656f, 27.0f)
                lineTo(23.0f, 28.0f)
                lineTo(26.0f, 28.0f)
                curveTo(26.551f, 28.0f, 27.0f, 27.551f, 27.0f, 27.0f)
                lineTo(27.0f, 16.0f)
                lineTo(29.0f, 16.0f)
                lineTo(29.0f, 13.0f)
                lineTo(27.0f, 13.0f)
                lineTo(27.0f, 8.0f)
                curveTo(27.0f, 5.801f, 25.199f, 4.0f, 23.0f, 4.0f)
                close()
                moveTo(9.0f, 6.0f)
                lineTo(23.0f, 6.0f)
                curveTo(24.117f, 6.0f, 25.0f, 6.883f, 25.0f, 8.0f)
                lineTo(7.0f, 8.0f)
                curveTo(7.0f, 6.883f, 7.883f, 6.0f, 9.0f, 6.0f)
                close()
                moveTo(7.0f, 10.0f)
                lineTo(15.0f, 10.0f)
                lineTo(15.0f, 17.0f)
                lineTo(7.0f, 17.0f)
                close()
                moveTo(17.0f, 10.0f)
                lineTo(25.0f, 10.0f)
                lineTo(25.0f, 17.0f)
                lineTo(17.0f, 17.0f)
                close()
                moveTo(7.0f, 19.0f)
                lineTo(25.0f, 19.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                close()
                moveTo(8.0f, 21.0f)
                lineTo(8.0f, 23.0f)
                lineTo(12.0f, 23.0f)
                lineTo(12.0f, 21.0f)
                close()
                moveTo(20.0f, 21.0f)
                lineTo(20.0f, 23.0f)
                lineTo(24.0f, 23.0f)
                lineTo(24.0f, 21.0f)
                close()
            }
        }
        .build()
        return _busSolid!!
    }

private var _busSolid: ImageVector? = null
