package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Instalod: ImageVector
    get() {
        if (_instalod != null) {
            return _instalod!!
        }
        _instalod = Builder(name = "Instalod", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(153.384f, 480.0f)
                horizontalLineTo(387.113f)
                lineTo(502.554f, 275.765f)
                lineTo(204.229f, 333.211f)
                close()
                moveTo(504.726f, 240.078f)
                lineTo(387.113f, 32.0f)
                horizontalLineTo(155.669f)
                lineTo(360.23f, 267.9f)
                close()
                moveTo(124.386f, 48.809f)
                lineTo(7.274f, 256.0f)
                lineTo(123.236f, 461.154f)
                lineTo(225.627f, 165.561f)
                close()
            }
        }
        .build()
        return _instalod!!
    }

private var _instalod: ImageVector? = null
