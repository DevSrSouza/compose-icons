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

public val FilledGroup.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) {
            return _arrowLeft!!
        }
        _arrowLeft = Builder(name = "ArrowLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.2949f, 19.7152f)
                curveTo(10.6883f, 20.1028f, 11.3215f, 20.0981f, 11.7091f, 19.7047f)
                curveTo(12.0967f, 19.3113f, 12.092f, 18.6782f, 11.6986f, 18.2906f)
                lineTo(6.3283f, 12.9992f)
                horizontalLineTo(19.9995f)
                curveTo(20.5517f, 12.9992f, 20.9995f, 12.5514f, 20.9995f, 11.9992f)
                curveTo(20.9995f, 11.4469f, 20.5517f, 10.9992f, 19.9995f, 10.9992f)
                horizontalLineTo(6.3349f)
                lineTo(11.6986f, 5.7143f)
                curveTo(12.092f, 5.3267f, 12.0967f, 4.6935f, 11.7091f, 4.3001f)
                curveTo(11.3215f, 3.9067f, 10.6883f, 3.902f, 10.2949f, 4.2896f)
                lineTo(3.3707f, 11.112f)
                curveTo(2.8738f, 11.6016f, 2.8738f, 12.4032f, 3.3707f, 12.8928f)
                lineTo(10.2949f, 19.7152f)
                close()
            }
        }
        .build()
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
