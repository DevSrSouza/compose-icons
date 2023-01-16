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

public val MaterialDesignIcons.PanoramaSphere: ImageVector
    get() {
        if (_panoramaSphere != null) {
            return _panoramaSphere!!
        }
        _panoramaSphere = Builder(name = "PanoramaSphere", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.1f)
                curveTo(21.7f, 8.0f, 21.3f, 7.8f, 21.0f, 7.7f)
                curveTo(19.4f, 4.3f, 16.0f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(4.6f, 4.3f, 3.0f, 7.7f)
                curveTo(2.7f, 7.8f, 2.3f, 8.0f, 2.1f, 8.1f)
                curveTo(1.4f, 8.5f, 1.0f, 9.2f, 1.0f, 9.9f)
                verticalLineTo(14.1f)
                curveTo(1.0f, 14.8f, 1.4f, 15.5f, 2.0f, 15.9f)
                curveTo(2.3f, 16.0f, 2.7f, 16.2f, 3.0f, 16.3f)
                curveTo(4.6f, 19.7f, 8.0f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(19.4f, 19.7f, 21.0f, 16.3f)
                curveTo(21.3f, 16.2f, 21.6f, 16.0f, 21.9f, 15.8f)
                curveTo(22.5f, 15.4f, 23.0f, 14.8f, 23.0f, 14.0f)
                verticalLineTo(9.9f)
                curveTo(23.0f, 9.2f, 22.6f, 8.5f, 22.0f, 8.1f)
                moveTo(12.0f, 4.0f)
                curveTo(14.4f, 4.0f, 16.5f, 5.0f, 18.0f, 6.7f)
                curveTo(16.2f, 6.2f, 14.1f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveTo(7.8f, 6.2f, 6.1f, 6.7f)
                curveTo(7.5f, 5.0f, 9.6f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 20.0f)
                curveTo(9.6f, 20.0f, 7.5f, 19.0f, 6.1f, 17.3f)
                curveTo(7.8f, 17.8f, 9.9f, 18.0f, 12.0f, 18.0f)
                reflectiveCurveTo(16.2f, 17.8f, 18.0f, 17.3f)
                curveTo(16.5f, 19.0f, 14.4f, 20.0f, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _panoramaSphere!!
    }

private var _panoramaSphere: ImageVector? = null
