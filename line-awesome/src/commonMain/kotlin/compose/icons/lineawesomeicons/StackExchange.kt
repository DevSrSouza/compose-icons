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

public val LineAwesomeIcons.StackExchange: ImageVector
    get() {
        if (_stackExchange != null) {
            return _stackExchange!!
        }
        _stackExchange = Builder(name = "StackExchange", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                curveTo(6.801f, 4.0f, 5.0f, 5.801f, 5.0f, 8.0f)
                lineTo(5.0f, 22.0f)
                curveTo(5.0f, 24.199f, 6.801f, 26.0f, 9.0f, 26.0f)
                lineTo(17.0f, 26.0f)
                lineTo(17.0f, 30.219f)
                lineTo(18.563f, 30.219f)
                lineTo(18.875f, 29.906f)
                lineTo(22.563f, 26.0f)
                lineTo(23.0f, 26.0f)
                curveTo(25.199f, 26.0f, 27.0f, 24.199f, 27.0f, 22.0f)
                lineTo(27.0f, 8.0f)
                curveTo(27.0f, 5.801f, 25.199f, 4.0f, 23.0f, 4.0f)
                close()
                moveTo(9.0f, 6.0f)
                lineTo(23.0f, 6.0f)
                curveTo(24.117f, 6.0f, 25.0f, 6.883f, 25.0f, 8.0f)
                lineTo(25.0f, 9.0f)
                lineTo(7.0f, 9.0f)
                lineTo(7.0f, 8.0f)
                curveTo(7.0f, 6.883f, 7.883f, 6.0f, 9.0f, 6.0f)
                close()
                moveTo(7.0f, 11.0f)
                lineTo(25.0f, 11.0f)
                lineTo(25.0f, 14.0f)
                lineTo(7.0f, 14.0f)
                close()
                moveTo(7.0f, 16.0f)
                lineTo(25.0f, 16.0f)
                lineTo(25.0f, 19.0f)
                lineTo(7.0f, 19.0f)
                close()
                moveTo(7.0f, 21.0f)
                lineTo(25.0f, 21.0f)
                lineTo(25.0f, 22.0f)
                curveTo(25.0f, 23.117f, 24.117f, 24.0f, 23.0f, 24.0f)
                lineTo(21.688f, 24.0f)
                lineTo(21.406f, 24.313f)
                lineTo(19.0f, 26.844f)
                lineTo(19.0f, 24.0f)
                lineTo(9.0f, 24.0f)
                curveTo(7.883f, 24.0f, 7.0f, 23.117f, 7.0f, 22.0f)
                close()
            }
        }
        .build()
        return _stackExchange!!
    }

private var _stackExchange: ImageVector? = null
