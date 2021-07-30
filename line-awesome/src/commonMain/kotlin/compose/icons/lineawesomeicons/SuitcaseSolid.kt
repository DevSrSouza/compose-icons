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

public val LineAwesomeIcons.SuitcaseSolid: ImageVector
    get() {
        if (_suitcaseSolid != null) {
            return _suitcaseSolid!!
        }
        _suitcaseSolid = Builder(name = "SuitcaseSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.0f)
                curveTo(12.9063f, 3.0f, 12.0f, 3.9063f, 12.0f, 5.0f)
                lineTo(12.0f, 6.0f)
                lineTo(9.0f, 6.0f)
                lineTo(9.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                lineTo(7.0f, 6.0f)
                lineTo(5.0f, 6.0f)
                curveTo(3.9063f, 6.0f, 3.0f, 6.9063f, 3.0f, 8.0f)
                lineTo(3.0f, 24.0f)
                curveTo(3.0f, 25.0938f, 3.9063f, 26.0f, 5.0f, 26.0f)
                lineTo(27.0f, 26.0f)
                curveTo(28.0938f, 26.0f, 29.0f, 25.0938f, 29.0f, 24.0f)
                lineTo(29.0f, 8.0f)
                curveTo(29.0f, 6.9063f, 28.0938f, 6.0f, 27.0f, 6.0f)
                lineTo(25.0f, 6.0f)
                lineTo(25.0f, 5.0f)
                lineTo(23.0f, 5.0f)
                lineTo(23.0f, 6.0f)
                lineTo(20.0f, 6.0f)
                lineTo(20.0f, 5.0f)
                curveTo(20.0f, 3.9063f, 19.0938f, 3.0f, 18.0f, 3.0f)
                close()
                moveTo(14.0f, 5.0f)
                lineTo(18.0f, 5.0f)
                lineTo(18.0f, 6.0f)
                lineTo(14.0f, 6.0f)
                close()
                moveTo(5.0f, 8.0f)
                lineTo(27.0f, 8.0f)
                lineTo(27.0f, 24.0f)
                lineTo(25.0f, 24.0f)
                lineTo(25.0f, 9.0f)
                lineTo(23.0f, 9.0f)
                lineTo(23.0f, 24.0f)
                lineTo(9.0f, 24.0f)
                lineTo(9.0f, 9.0f)
                lineTo(7.0f, 9.0f)
                lineTo(7.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                close()
            }
        }
        .build()
        return _suitcaseSolid!!
    }

private var _suitcaseSolid: ImageVector? = null
