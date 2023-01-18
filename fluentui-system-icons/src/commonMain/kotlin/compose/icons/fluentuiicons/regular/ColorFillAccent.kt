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

public val RegularGroup.ColorFillAccent: ImageVector
    get() {
        if (_colorFillAccent != null) {
            return _colorFillAccent!!
        }
        _colorFillAccent = Builder(name = "ColorFillAccent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0524f, 15.0f)
                curveTo(13.3247f, 16.6094f, 14.6324f, 18.0f, 16.4998f, 18.0f)
                curveTo(18.3422f, 18.0f, 19.6398f, 16.6463f, 19.9357f, 15.0642f)
                curveTo(20.5516f, 15.2509f, 21.0f, 15.8231f, 21.0f, 16.5f)
                verticalLineTo(19.5f)
                curveTo(21.0f, 20.3284f, 20.3284f, 21.0f, 19.5f, 21.0f)
                horizontalLineTo(4.5f)
                curveTo(3.6716f, 21.0f, 3.0f, 20.3284f, 3.0f, 19.5f)
                verticalLineTo(16.5f)
                curveTo(3.0f, 15.6716f, 3.6716f, 15.0f, 4.5f, 15.0f)
                lineTo(7.5897f, 15.0f)
                curveTo(8.7339f, 16.0474f, 10.4934f, 16.0474f, 11.6377f, 15.0f)
                lineTo(13.0524f, 15.0f)
                close()
            }
        }
        .build()
        return _colorFillAccent!!
    }

private var _colorFillAccent: ImageVector? = null
