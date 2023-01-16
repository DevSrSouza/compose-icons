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

public val MaterialDesignIcons.EvPlugType1: ImageVector
    get() {
        if (_evPlugType1 != null) {
            return _evPlugType1!!
        }
        _evPlugType1 = Builder(name = "EvPlugType1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 9.0f)
                curveTo(13.0f, 10.1f, 13.9f, 11.0f, 15.0f, 11.0f)
                reflectiveCurveTo(17.0f, 10.1f, 17.0f, 9.0f)
                reflectiveCurveTo(16.1f, 7.0f, 15.0f, 7.0f)
                reflectiveCurveTo(13.0f, 7.9f, 13.0f, 9.0f)
                moveTo(7.0f, 9.0f)
                curveTo(7.0f, 10.1f, 7.9f, 11.0f, 9.0f, 11.0f)
                reflectiveCurveTo(11.0f, 10.1f, 11.0f, 9.0f)
                reflectiveCurveTo(10.1f, 7.0f, 9.0f, 7.0f)
                reflectiveCurveTo(7.0f, 7.9f, 7.0f, 9.0f)
                moveTo(9.0f, 13.2f)
                curveTo(9.0f, 12.6f, 8.4f, 12.0f, 7.8f, 12.0f)
                reflectiveCurveTo(6.6f, 12.6f, 6.6f, 13.2f)
                reflectiveCurveTo(7.2f, 14.4f, 7.8f, 14.4f)
                reflectiveCurveTo(9.0f, 13.9f, 9.0f, 13.2f)
                moveTo(14.0f, 16.0f)
                curveTo(14.0f, 14.9f, 13.1f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveTo(10.0f, 14.9f, 10.0f, 16.0f)
                reflectiveCurveTo(10.9f, 18.0f, 12.0f, 18.0f)
                reflectiveCurveTo(14.0f, 17.1f, 14.0f, 16.0f)
                moveTo(12.0f, 4.0f)
                curveTo(16.4f, 4.0f, 20.0f, 7.6f, 20.0f, 12.0f)
                reflectiveCurveTo(16.4f, 20.0f, 12.0f, 20.0f)
                reflectiveCurveTo(4.0f, 16.4f, 4.0f, 12.0f)
                reflectiveCurveTo(7.6f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(22.0f, 17.5f, 22.0f, 12.0f)
                reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(17.5f, 13.2f)
                curveTo(17.5f, 12.5f, 16.9f, 12.0f, 16.3f, 12.0f)
                curveTo(15.6f, 12.0f, 15.1f, 12.6f, 15.1f, 13.2f)
                reflectiveCurveTo(15.7f, 14.4f, 16.3f, 14.4f)
                curveTo(16.9f, 14.5f, 17.5f, 13.9f, 17.5f, 13.2f)
            }
        }
        .build()
        return _evPlugType1!!
    }

private var _evPlugType1: ImageVector? = null
