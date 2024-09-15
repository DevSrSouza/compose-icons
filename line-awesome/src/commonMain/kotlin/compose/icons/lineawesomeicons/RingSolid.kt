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

public val LineAwesomeIcons.RingSolid: ImageVector
    get() {
        if (_ringSolid != null) {
            return _ringSolid!!
        }
        _ringSolid = Builder(name = "RingSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.0f, 7.0f)
                lineTo(25.699f, 6.699f)
                curveTo(24.0f, 4.801f, 21.5f, 4.199f, 21.5f, 4.199f)
                curveTo(18.5f, 3.301f, 13.801f, 5.301f, 9.602f, 9.398f)
                curveTo(6.102f, 12.699f, 4.0f, 16.699f, 4.0f, 19.699f)
                curveTo(4.0f, 20.102f, 4.102f, 20.5f, 4.102f, 20.898f)
                curveTo(4.301f, 22.898f, 5.602f, 25.0f, 6.699f, 26.0f)
                curveTo(8.102f, 27.398f, 9.898f, 28.102f, 11.898f, 28.102f)
                curveTo(15.199f, 28.102f, 19.102f, 26.199f, 22.699f, 22.801f)
                curveTo(28.301f, 17.301f, 29.699f, 10.801f, 26.0f, 7.0f)
                close()
                moveTo(10.0f, 21.699f)
                curveTo(10.0f, 20.398f, 11.398f, 17.699f, 14.398f, 14.699f)
                curveTo(17.301f, 11.801f, 20.301f, 11.0f, 21.699f, 10.699f)
                curveTo(21.0f, 12.602f, 19.5f, 14.898f, 17.301f, 17.102f)
                curveTo(15.199f, 19.102f, 12.801f, 20.699f, 10.699f, 21.5f)
                curveTo(10.5f, 21.602f, 10.199f, 21.602f, 10.0f, 21.699f)
                close()
                moveTo(11.0f, 10.801f)
                curveTo(14.301f, 7.5f, 17.801f, 5.898f, 20.0f, 5.898f)
                curveTo(20.699f, 5.898f, 21.301f, 6.102f, 21.699f, 6.5f)
                curveTo(22.102f, 6.898f, 22.301f, 7.699f, 22.199f, 8.602f)
                curveTo(21.0f, 8.699f, 16.898f, 9.398f, 13.0f, 13.301f)
                curveTo(10.5f, 15.801f, 7.898f, 19.398f, 8.102f, 21.898f)
                curveTo(7.5f, 21.898f, 6.898f, 21.699f, 6.602f, 21.398f)
                curveTo(6.398f, 21.199f, 6.199f, 20.898f, 6.102f, 20.5f)
                curveTo(6.102f, 20.5f, 6.0f, 20.0f, 6.0f, 19.699f)
                curveTo(6.102f, 17.199f, 8.0f, 13.699f, 11.0f, 10.801f)
                close()
                moveTo(21.301f, 21.301f)
                curveTo(16.5f, 26.102f, 11.0f, 27.398f, 8.102f, 24.602f)
                curveTo(7.898f, 24.398f, 7.699f, 24.199f, 7.5f, 23.898f)
                curveTo(7.699f, 24.0f, 8.0f, 24.0f, 8.301f, 24.0f)
                curveTo(9.199f, 24.0f, 10.301f, 23.801f, 11.398f, 23.398f)
                curveTo(13.801f, 22.5f, 16.398f, 20.801f, 18.699f, 18.5f)
                curveTo(22.199f, 15.0f, 24.199f, 11.0f, 24.199f, 8.102f)
                lineTo(24.301f, 8.199f)
                lineTo(24.602f, 8.398f)
                curveTo(27.398f, 11.301f, 26.0f, 16.699f, 21.301f, 21.301f)
                close()
            }
        }
        .build()
        return _ringSolid!!
    }

private var _ringSolid: ImageVector? = null
