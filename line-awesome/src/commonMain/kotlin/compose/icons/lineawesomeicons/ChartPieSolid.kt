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

public val LineAwesomeIcons.ChartPieSolid: ImageVector
    get() {
        if (_chartPieSolid != null) {
            return _chartPieSolid!!
        }
        _chartPieSolid = Builder(name = "ChartPieSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(14.875f, 5.0625f)
                curveTo(14.918f, 5.0586f, 14.957f, 5.0664f, 15.0f, 5.0625f)
                lineTo(15.0f, 16.4063f)
                lineTo(15.2813f, 16.7188f)
                lineTo(23.0625f, 24.4688f)
                curveTo(21.1563f, 26.0625f, 18.6875f, 27.0f, 16.0f, 27.0f)
                curveTo(9.9141f, 27.0f, 5.0f, 22.0859f, 5.0f, 16.0f)
                curveTo(5.0f, 10.293f, 9.3203f, 5.625f, 14.875f, 5.0625f)
                close()
                moveTo(17.0f, 5.0625f)
                curveTo(22.2852f, 5.5391f, 26.4609f, 9.7148f, 26.9375f, 15.0f)
                lineTo(17.0f, 15.0f)
                close()
                moveTo(18.4375f, 17.0f)
                lineTo(26.9375f, 17.0f)
                curveTo(26.7305f, 19.293f, 25.8633f, 21.3945f, 24.4688f, 23.0625f)
                close()
            }
        }
        .build()
        return _chartPieSolid!!
    }

private var _chartPieSolid: ImageVector? = null
