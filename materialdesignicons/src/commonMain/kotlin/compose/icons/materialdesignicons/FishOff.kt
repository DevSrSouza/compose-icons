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

public val MaterialDesignIcons.FishOff: ImageVector
    get() {
        if (_fishOff != null) {
            return _fishOff!!
        }
        _fishOff = Builder(name = "FishOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8f, 22.7f)
                lineTo(15.7f, 17.6f)
                curveTo(15.1f, 18.3f, 14.6f, 18.9f, 14.1f, 19.3f)
                curveTo(13.3f, 20.0f, 12.7f, 20.0f, 12.0f, 20.0f)
                lineTo(12.8f, 17.0f)
                curveTo(9.5f, 16.8f, 6.6f, 15.4f, 5.8f, 13.6f)
                curveTo(5.7f, 14.1f, 5.6f, 14.5f, 5.4f, 14.8f)
                curveTo(4.7f, 16.0f, 3.3f, 16.0f, 2.0f, 16.0f)
                curveTo(3.1f, 16.0f, 3.5f, 14.4f, 3.5f, 12.5f)
                reflectiveCurveTo(3.1f, 9.0f, 2.0f, 9.0f)
                curveTo(3.3f, 9.0f, 4.7f, 9.0f, 5.3f, 10.2f)
                curveTo(5.5f, 10.5f, 5.6f, 11.0f, 5.7f, 11.4f)
                curveTo(6.0f, 10.7f, 6.7f, 10.0f, 7.6f, 9.5f)
                lineTo(1.1f, 3.0f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(9.8f, 6.6f)
                lineTo(9.0f, 5.0f)
                curveTo(11.0f, 5.0f, 13.0f, 5.0f, 14.3f, 5.7f)
                curveTo(15.4f, 6.3f, 16.1f, 7.3f, 16.7f, 8.4f)
                curveTo(19.6f, 9.1f, 22.0f, 10.7f, 22.0f, 12.5f)
                curveTo(22.0f, 13.8f, 20.8f, 15.0f, 19.0f, 15.8f)
                lineTo(9.8f, 6.6f)
                moveTo(16.0f, 12.0f)
                curveTo(16.0f, 12.6f, 16.4f, 13.0f, 17.0f, 13.0f)
                reflectiveCurveTo(18.0f, 12.6f, 18.0f, 12.0f)
                reflectiveCurveTo(17.6f, 11.0f, 17.0f, 11.0f)
                reflectiveCurveTo(16.0f, 11.4f, 16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _fishOff!!
    }

private var _fishOff: ImageVector? = null
