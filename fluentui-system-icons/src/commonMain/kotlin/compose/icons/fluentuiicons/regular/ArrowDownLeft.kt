package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ArrowDownLeft: ImageVector
    get() {
        if (_arrowDownLeft != null) {
            return _arrowDownLeft!!
        }
        _arrowDownLeft = Builder(name = "ArrowDownLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2461f, 21.0049f)
                curveTo(13.6603f, 21.0049f, 13.9961f, 20.6692f, 13.9961f, 20.2549f)
                curveTo(13.9961f, 19.8407f, 13.6603f, 19.5049f, 13.2461f, 19.5049f)
                horizontalLineTo(5.577f)
                lineTo(20.7768f, 4.3052f)
                curveTo(21.0753f, 4.0066f, 21.0753f, 3.5225f, 20.7768f, 3.2239f)
                curveTo(20.4782f, 2.9254f, 19.9941f, 2.9254f, 19.6955f, 3.2239f)
                lineTo(4.4961f, 18.4234f)
                verticalLineTo(10.7549f)
                curveTo(4.4961f, 10.3407f, 4.1603f, 10.0049f, 3.7461f, 10.0049f)
                curveTo(3.3319f, 10.0049f, 2.9961f, 10.3407f, 2.9961f, 10.7549f)
                verticalLineTo(20.2549f)
                curveTo(2.9961f, 20.6692f, 3.3319f, 21.0049f, 3.7461f, 21.0049f)
                horizontalLineTo(13.2461f)
                close()
            }
        }
        .build()
        return _arrowDownLeft!!
    }

private var _arrowDownLeft: ImageVector? = null
