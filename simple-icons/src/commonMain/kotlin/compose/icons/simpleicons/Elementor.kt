package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Elementor: ImageVector
    get() {
        if (_elementor != null) {
            return _elementor!!
        }
        _elementor = Builder(name = "Elementor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.372f, 0.0f, 0.0f, 5.372f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.626f, 5.372f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.372f, 12.0f, -12.0f)
                curveToRelative(0.0f, -6.626f, -5.372f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(9.0f, 17.0f)
                lineTo(7.0f, 17.0f)
                lineTo(7.0f, 7.0f)
                lineTo(9.0f, 7.0f)
                close()
                moveTo(17.0f, 17.0f)
                lineTo(11.0f, 17.0f)
                lineTo(11.0f, 15.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(17.0f, 13.0f)
                lineTo(11.0f, 13.0f)
                lineTo(11.0f, 11.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(17.0f, 9.0f)
                lineTo(11.0f, 9.0f)
                lineTo(11.0f, 7.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _elementor!!
    }

private var _elementor: ImageVector? = null
