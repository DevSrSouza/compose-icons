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

public val MaterialDesignIcons.PillMultiple: ImageVector
    get() {
        if (_pillMultiple != null) {
            return _pillMultiple!!
        }
        _pillMultiple = Builder(name = "PillMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.2f, 3.5f)
                curveTo(15.2f, 2.5f, 13.9f, 2.0f, 12.7f, 2.0f)
                reflectiveCurveTo(10.1f, 2.5f, 9.2f, 3.5f)
                lineTo(3.4f, 9.1f)
                curveTo(1.4f, 11.1f, 1.4f, 14.2f, 3.4f, 16.2f)
                reflectiveCurveTo(8.5f, 18.2f, 10.5f, 16.2f)
                lineTo(16.2f, 10.5f)
                curveTo(18.1f, 8.6f, 18.1f, 5.4f, 16.2f, 3.5f)
                moveTo(14.8f, 9.1f)
                lineTo(12.0f, 11.9f)
                lineTo(8.4f, 8.4f)
                lineTo(4.0f, 12.8f)
                curveTo(4.0f, 12.0f, 4.2f, 11.1f, 4.9f, 10.5f)
                lineTo(10.6f, 4.8f)
                curveTo(11.1f, 4.3f, 11.9f, 4.0f, 12.6f, 4.0f)
                reflectiveCurveTo(14.1f, 4.3f, 14.7f, 4.8f)
                curveTo(15.9f, 6.1f, 15.9f, 7.9f, 14.8f, 9.1f)
                moveTo(19.6f, 7.1f)
                curveTo(19.6f, 7.9f, 19.4f, 8.6f, 19.2f, 9.4f)
                curveTo(20.2f, 10.6f, 20.2f, 12.4f, 19.1f, 13.5f)
                lineTo(16.3f, 16.3f)
                lineTo(14.8f, 14.8f)
                lineTo(12.0f, 17.6f)
                curveTo(10.7f, 18.9f, 8.9f, 19.6f, 7.2f, 19.6f)
                curveTo(7.4f, 19.9f, 7.6f, 20.2f, 7.9f, 20.5f)
                curveTo(9.9f, 22.5f, 13.0f, 22.5f, 15.0f, 20.5f)
                lineTo(20.7f, 14.8f)
                curveTo(22.7f, 12.8f, 22.7f, 9.7f, 20.7f, 7.7f)
                curveTo(20.2f, 7.5f, 19.9f, 7.3f, 19.6f, 7.1f)
                close()
            }
        }
        .build()
        return _pillMultiple!!
    }

private var _pillMultiple: ImageVector? = null
