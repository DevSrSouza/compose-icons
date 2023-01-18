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

public val FilledGroup.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) {
            return _arrowUp!!
        }
        _arrowUp = Builder(name = "ArrowUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.2838f, 10.2949f)
                curveTo(3.8962f, 10.6883f, 3.9008f, 11.3215f, 4.2942f, 11.7091f)
                curveTo(4.6877f, 12.0967f, 5.3208f, 12.092f, 5.7084f, 11.6986f)
                lineTo(10.9998f, 6.3283f)
                verticalLineTo(19.9994f)
                curveTo(10.9998f, 20.5517f, 11.4475f, 20.9994f, 11.9998f, 20.9994f)
                curveTo(12.552f, 20.9994f, 12.9998f, 20.5517f, 12.9998f, 19.9994f)
                verticalLineTo(6.3348f)
                lineTo(18.2847f, 11.6986f)
                curveTo(18.6723f, 12.092f, 19.3055f, 12.0967f, 19.6989f, 11.7091f)
                curveTo(20.0923f, 11.3215f, 20.097f, 10.6883f, 19.7094f, 10.2949f)
                lineTo(12.887f, 3.3707f)
                curveTo(12.3974f, 2.8738f, 11.5958f, 2.8738f, 11.1062f, 3.3707f)
                lineTo(4.2838f, 10.2949f)
                close()
            }
        }
        .build()
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
