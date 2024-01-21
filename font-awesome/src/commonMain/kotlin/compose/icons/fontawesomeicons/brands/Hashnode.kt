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

public val BrandsGroup.Hashnode: ImageVector
    get() {
        if (_hashnode != null) {
            return _hashnode!!
        }
        _hashnode = Builder(name = "Hashnode", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(35.19f, 171.1f)
                curveTo(-11.72f, 217.1f, -11.72f, 294.0f, 35.19f, 340.9f)
                lineTo(171.1f, 476.8f)
                curveTo(217.1f, 523.7f, 294.0f, 523.7f, 340.9f, 476.8f)
                lineTo(476.8f, 340.9f)
                curveTo(523.7f, 294.0f, 523.7f, 217.1f, 476.8f, 171.1f)
                lineTo(340.9f, 35.19f)
                curveTo(294.0f, -11.72f, 217.1f, -11.72f, 171.1f, 35.19f)
                lineTo(35.19f, 171.1f)
                close()
                moveTo(315.5f, 315.5f)
                curveTo(282.6f, 348.3f, 229.4f, 348.3f, 196.6f, 315.5f)
                curveTo(163.7f, 282.6f, 163.7f, 229.4f, 196.6f, 196.6f)
                curveTo(229.4f, 163.7f, 282.6f, 163.7f, 315.5f, 196.6f)
                curveTo(348.3f, 229.4f, 348.3f, 282.6f, 315.5f, 315.5f)
                close()
            }
        }
        .build()
        return _hashnode!!
    }

private var _hashnode: ImageVector? = null
