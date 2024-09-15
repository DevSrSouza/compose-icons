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

public val LineAwesomeIcons.Servicestack: ImageVector
    get() {
        if (_servicestack != null) {
            return _servicestack!!
        }
        _servicestack = Builder(name = "Servicestack", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 6.0f)
                curveTo(11.544f, 7.76f, 12.276f, 10.149f, 12.217f, 12.609f)
                curveTo(16.185f, 14.279f, 22.141f, 18.73f, 23.398f, 25.0f)
                lineTo(28.0f, 25.0f)
                curveTo(26.051f, 14.31f, 14.918f, 6.77f, 10.0f, 6.0f)
                close()
                moveTo(8.0f, 13.0f)
                curveTo(12.67f, 17.913f, 8.81f, 24.582f, 4.0f, 25.0f)
                lineTo(22.971f, 25.0f)
                curveTo(21.501f, 18.289f, 11.95f, 13.533f, 8.0f, 13.0f)
                close()
            }
        }
        .build()
        return _servicestack!!
    }

private var _servicestack: ImageVector? = null
