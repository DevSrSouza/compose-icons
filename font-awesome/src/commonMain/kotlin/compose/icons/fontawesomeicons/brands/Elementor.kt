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

public val BrandsGroup.Elementor: ImageVector
    get() {
        if (_elementor != null) {
            return _elementor!!
        }
        _elementor = Builder(name = "Elementor", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.361f, 256.0f)
                curveTo(0.361f, 397.0f, 114.0f, 511.0f, 255.0f, 511.0f)
                curveTo(397.0f, 511.0f, 511.0f, 397.0f, 511.0f, 256.0f)
                curveTo(511.0f, 116.0f, 397.0f, 2.05f, 255.0f, 2.05f)
                curveTo(114.0f, 2.05f, 0.361f, 116.0f, 0.361f, 256.0f)
                close()
                moveTo(192.0f, 150.0f)
                verticalLineTo(363.0f)
                horizontalLineTo(149.0f)
                verticalLineTo(150.0f)
                horizontalLineTo(192.0f)
                close()
                moveTo(234.0f, 150.0f)
                horizontalLineTo(362.0f)
                verticalLineTo(193.0f)
                horizontalLineTo(234.0f)
                verticalLineTo(150.0f)
                close()
                moveTo(362.0f, 235.0f)
                verticalLineTo(278.0f)
                horizontalLineTo(234.0f)
                verticalLineTo(235.0f)
                horizontalLineTo(362.0f)
                close()
                moveTo(234.0f, 320.0f)
                horizontalLineTo(362.0f)
                verticalLineTo(363.0f)
                horizontalLineTo(234.0f)
                verticalLineTo(320.0f)
                close()
            }
        }
        .build()
        return _elementor!!
    }

private var _elementor: ImageVector? = null
