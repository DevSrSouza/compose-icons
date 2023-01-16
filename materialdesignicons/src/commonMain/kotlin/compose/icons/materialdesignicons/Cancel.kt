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

public val MaterialDesignIcons.Cancel: ImageVector
    get() {
        if (_cancel != null) {
            return _cancel!!
        }
        _cancel = Builder(name = "Cancel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5f, 2.0f, 22.0f, 6.5f, 22.0f, 12.0f)
                reflectiveCurveTo(17.5f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(2.0f, 17.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 4.0f)
                curveTo(10.1f, 4.0f, 8.4f, 4.6f, 7.1f, 5.7f)
                lineTo(18.3f, 16.9f)
                curveTo(19.3f, 15.5f, 20.0f, 13.8f, 20.0f, 12.0f)
                curveTo(20.0f, 7.6f, 16.4f, 4.0f, 12.0f, 4.0f)
                moveTo(16.9f, 18.3f)
                lineTo(5.7f, 7.1f)
                curveTo(4.6f, 8.4f, 4.0f, 10.1f, 4.0f, 12.0f)
                curveTo(4.0f, 16.4f, 7.6f, 20.0f, 12.0f, 20.0f)
                curveTo(13.9f, 20.0f, 15.6f, 19.4f, 16.9f, 18.3f)
                close()
            }
        }
        .build()
        return _cancel!!
    }

private var _cancel: ImageVector? = null
