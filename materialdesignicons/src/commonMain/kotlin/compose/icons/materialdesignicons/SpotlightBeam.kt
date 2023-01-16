package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.SpotlightBeam: ImageVector
    get() {
        if (_spotlightBeam != null) {
            return _spotlightBeam!!
        }
        _spotlightBeam = Builder(name = "SpotlightBeam", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 16.5f)
                lineTo(9.91f, 15.59f)
                lineTo(15.13f, 20.8f)
                lineTo(14.21f, 21.71f)
                lineTo(9.0f, 16.5f)
                moveTo(15.5f, 10.0f)
                lineTo(16.41f, 9.09f)
                lineTo(21.63f, 14.3f)
                lineTo(20.71f, 15.21f)
                lineTo(15.5f, 10.0f)
                moveTo(6.72f, 2.72f)
                lineTo(10.15f, 6.15f)
                lineTo(6.15f, 10.15f)
                lineTo(2.72f, 6.72f)
                curveTo(1.94f, 5.94f, 1.94f, 4.67f, 2.72f, 3.89f)
                lineTo(3.89f, 2.72f)
                curveTo(4.67f, 1.94f, 5.94f, 1.94f, 6.72f, 2.72f)
                moveTo(14.57f, 7.5f)
                lineTo(15.28f, 8.21f)
                lineTo(8.21f, 15.28f)
                lineTo(7.5f, 14.57f)
                lineTo(6.64f, 11.07f)
                lineTo(11.07f, 6.64f)
                lineTo(14.57f, 7.5f)
                close()
            }
        }
        .build()
        return _spotlightBeam!!
    }

private var _spotlightBeam: ImageVector? = null
