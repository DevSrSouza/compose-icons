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
                moveTo(153.38f, 480.0f)
                horizontalLineTo(387.11f)
                lineTo(502.55f, 275.77f)
                lineTo(204.23f, 333.21f)
                close()
                moveTo(504.73f, 240.08f)
                lineTo(387.11f, 32.0f)
                horizontalLineTo(155.67f)
                lineTo(360.23f, 267.9f)
                close()
                moveTo(124.39f, 48.81f)
                lineTo(7.27f, 256.0f)
                lineTo(123.24f, 461.15f)
                lineTo(225.63f, 165.56f)
                close()
            }
        }
        .build()
        return _instalod!!
    }

private var _instalod: ImageVector? = null
