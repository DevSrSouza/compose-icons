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

public val LineAwesomeIcons.PrintSolid: ImageVector
    get() {
        if (_printSolid != null) {
            return _printSolid!!
        }
        _printSolid = Builder(name = "PrintSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                lineTo(9.0f, 11.0f)
                lineTo(7.0f, 11.0f)
                curveTo(5.3555f, 11.0f, 4.0f, 12.3555f, 4.0f, 14.0f)
                lineTo(4.0f, 24.0f)
                lineTo(9.0f, 24.0f)
                lineTo(9.0f, 28.0f)
                lineTo(23.0f, 28.0f)
                lineTo(23.0f, 24.0f)
                lineTo(28.0f, 24.0f)
                lineTo(28.0f, 14.0f)
                curveTo(28.0f, 12.3555f, 26.6445f, 11.0f, 25.0f, 11.0f)
                lineTo(23.0f, 11.0f)
                lineTo(23.0f, 4.0f)
                close()
                moveTo(11.0f, 6.0f)
                lineTo(21.0f, 6.0f)
                lineTo(21.0f, 11.0f)
                lineTo(11.0f, 11.0f)
                close()
                moveTo(7.0f, 13.0f)
                lineTo(25.0f, 13.0f)
                curveTo(25.5664f, 13.0f, 26.0f, 13.4336f, 26.0f, 14.0f)
                lineTo(26.0f, 22.0f)
                lineTo(23.0f, 22.0f)
                lineTo(23.0f, 18.0f)
                lineTo(9.0f, 18.0f)
                lineTo(9.0f, 22.0f)
                lineTo(6.0f, 22.0f)
                lineTo(6.0f, 14.0f)
                curveTo(6.0f, 13.4336f, 6.4336f, 13.0f, 7.0f, 13.0f)
                close()
                moveTo(8.0f, 14.0f)
                curveTo(7.4492f, 14.0f, 7.0f, 14.4492f, 7.0f, 15.0f)
                curveTo(7.0f, 15.5508f, 7.4492f, 16.0f, 8.0f, 16.0f)
                curveTo(8.5508f, 16.0f, 9.0f, 15.5508f, 9.0f, 15.0f)
                curveTo(9.0f, 14.4492f, 8.5508f, 14.0f, 8.0f, 14.0f)
                close()
                moveTo(11.0f, 20.0f)
                lineTo(21.0f, 20.0f)
                lineTo(21.0f, 26.0f)
                lineTo(11.0f, 26.0f)
                close()
            }
        }
        .build()
        return _printSolid!!
    }

private var _printSolid: ImageVector? = null
