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

public val MaterialDesignIcons.Broadcast: ImageVector
    get() {
        if (_broadcast != null) {
            return _broadcast!!
        }
        _broadcast = Builder(name = "Broadcast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                curveTo(10.9f, 10.0f, 10.0f, 10.9f, 10.0f, 12.0f)
                reflectiveCurveTo(10.9f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveTo(14.0f, 13.1f, 14.0f, 12.0f)
                reflectiveCurveTo(13.1f, 10.0f, 12.0f, 10.0f)
                moveTo(18.0f, 12.0f)
                curveTo(18.0f, 8.7f, 15.3f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveTo(6.0f, 8.7f, 6.0f, 12.0f)
                curveTo(6.0f, 14.2f, 7.2f, 16.1f, 9.0f, 17.2f)
                lineTo(10.0f, 15.5f)
                curveTo(8.8f, 14.8f, 8.0f, 13.5f, 8.0f, 12.1f)
                curveTo(8.0f, 9.9f, 9.8f, 8.1f, 12.0f, 8.1f)
                reflectiveCurveTo(16.0f, 9.9f, 16.0f, 12.1f)
                curveTo(16.0f, 13.6f, 15.2f, 14.9f, 14.0f, 15.5f)
                lineTo(15.0f, 17.2f)
                curveTo(16.8f, 16.2f, 18.0f, 14.2f, 18.0f, 12.0f)
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                curveTo(2.0f, 15.7f, 4.0f, 18.9f, 7.0f, 20.6f)
                lineTo(8.0f, 18.9f)
                curveTo(5.6f, 17.5f, 4.0f, 14.9f, 4.0f, 12.0f)
                curveTo(4.0f, 7.6f, 7.6f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(20.0f, 7.6f, 20.0f, 12.0f)
                curveTo(20.0f, 15.0f, 18.4f, 17.5f, 16.0f, 18.9f)
                lineTo(17.0f, 20.6f)
                curveTo(20.0f, 18.9f, 22.0f, 15.7f, 22.0f, 12.0f)
                curveTo(22.0f, 6.5f, 17.5f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _broadcast!!
    }

private var _broadcast: ImageVector? = null
