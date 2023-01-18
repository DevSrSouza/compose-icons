package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) {
            return _arrowRight!!
        }
        _arrowRight = Builder(name = "ArrowRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7045f, 4.2838f)
                curveTo(13.3111f, 3.8962f, 12.678f, 3.9008f, 12.2904f, 4.2942f)
                curveTo(11.9027f, 4.6877f, 11.9074f, 5.3208f, 12.3008f, 5.7084f)
                lineTo(17.6712f, 10.9998f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 10.9998f, 3.0f, 11.4475f, 3.0f, 11.9998f)
                curveTo(3.0f, 12.5521f, 3.4477f, 12.9998f, 4.0f, 12.9998f)
                horizontalLineTo(17.6646f)
                lineTo(12.3008f, 18.2847f)
                curveTo(11.9074f, 18.6723f, 11.9027f, 19.3055f, 12.2904f, 19.6989f)
                curveTo(12.678f, 20.0923f, 13.3111f, 20.097f, 13.7045f, 19.7094f)
                lineTo(20.6287f, 12.887f)
                curveTo(21.1256f, 12.3974f, 21.1256f, 11.5958f, 20.6287f, 11.1062f)
                lineTo(13.7045f, 4.2838f)
                close()
            }
        }
        .build()
        return _arrowRight!!
    }

private var _arrowRight: ImageVector? = null
