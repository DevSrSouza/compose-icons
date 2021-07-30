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
        _elementor = Builder(name = "Elementor", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(425.6f, 32.0f)
                lineTo(22.4f, 32.0f)
                curveTo(10.0f, 32.0f, 0.0f, 42.0f, 0.0f, 54.4f)
                verticalLineToRelative(403.2f)
                curveTo(0.0f, 470.0f, 10.0f, 480.0f, 22.4f, 480.0f)
                horizontalLineToRelative(403.2f)
                curveToRelative(12.4f, 0.0f, 22.4f, -10.0f, 22.4f, -22.4f)
                lineTo(448.0f, 54.4f)
                curveTo(448.0f, 42.0f, 438.0f, 32.0f, 425.6f, 32.0f)
                moveTo(164.3f, 355.5f)
                horizontalLineToRelative(-39.8f)
                verticalLineToRelative(-199.0f)
                horizontalLineToRelative(39.8f)
                verticalLineToRelative(199.0f)
                close()
                moveTo(323.6f, 355.5f)
                lineTo(204.1f, 355.5f)
                verticalLineToRelative(-39.8f)
                horizontalLineToRelative(119.5f)
                verticalLineToRelative(39.8f)
                close()
                moveTo(323.6f, 275.9f)
                lineTo(204.1f, 275.9f)
                verticalLineToRelative(-39.8f)
                horizontalLineToRelative(119.5f)
                verticalLineToRelative(39.8f)
                close()
                moveTo(323.6f, 196.2f)
                lineTo(204.1f, 196.2f)
                verticalLineToRelative(-39.8f)
                horizontalLineToRelative(119.5f)
                verticalLineToRelative(39.8f)
                close()
            }
        }
        .build()
        return _elementor!!
    }

private var _elementor: ImageVector? = null
