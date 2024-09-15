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

public val LineAwesomeIcons.CoffeeSolid: ImageVector
    get() {
        if (_coffeeSolid != null) {
            return _coffeeSolid!!
        }
        _coffeeSolid = Builder(name = "CoffeeSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 3.0f)
                lineTo(11.0f, 7.0f)
                lineTo(13.0f, 7.0f)
                lineTo(13.0f, 3.0f)
                close()
                moveTo(15.0f, 4.0f)
                lineTo(15.0f, 7.0f)
                lineTo(17.0f, 7.0f)
                lineTo(17.0f, 4.0f)
                close()
                moveTo(4.875f, 8.0f)
                lineTo(5.0f, 9.094f)
                lineTo(6.813f, 26.313f)
                curveTo(6.973f, 27.832f, 8.285f, 29.0f, 9.813f, 29.0f)
                lineTo(19.188f, 29.0f)
                curveTo(20.715f, 29.0f, 22.027f, 27.832f, 22.188f, 26.313f)
                lineTo(22.656f, 22.0f)
                lineTo(25.0f, 22.0f)
                curveTo(26.645f, 22.0f, 28.0f, 20.645f, 28.0f, 19.0f)
                lineTo(28.0f, 16.0f)
                curveTo(28.0f, 14.355f, 26.645f, 13.0f, 25.0f, 13.0f)
                lineTo(23.594f, 13.0f)
                lineTo(24.0f, 9.094f)
                lineTo(24.125f, 8.0f)
                close()
                moveTo(7.125f, 10.0f)
                lineTo(21.875f, 10.0f)
                lineTo(20.188f, 26.094f)
                curveTo(20.133f, 26.613f, 19.707f, 27.0f, 19.188f, 27.0f)
                lineTo(9.813f, 27.0f)
                curveTo(9.293f, 27.0f, 8.867f, 26.613f, 8.813f, 26.094f)
                close()
                moveTo(23.375f, 15.0f)
                lineTo(25.0f, 15.0f)
                curveTo(25.566f, 15.0f, 26.0f, 15.434f, 26.0f, 16.0f)
                lineTo(26.0f, 19.0f)
                curveTo(26.0f, 19.566f, 25.566f, 20.0f, 25.0f, 20.0f)
                lineTo(22.844f, 20.0f)
                close()
            }
        }
        .build()
        return _coffeeSolid!!
    }

private var _coffeeSolid: ImageVector? = null
