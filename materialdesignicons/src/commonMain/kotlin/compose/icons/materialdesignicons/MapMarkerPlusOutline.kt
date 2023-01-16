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

public val MaterialDesignIcons.MapMarkerPlusOutline: ImageVector
    get() {
        if (_mapMarkerPlusOutline != null) {
            return _mapMarkerPlusOutline!!
        }
        _mapMarkerPlusOutline = Builder(name = "MapMarkerPlusOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 17.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                moveTo(9.0f, 6.5f)
                curveTo(10.4f, 6.5f, 11.5f, 7.6f, 11.5f, 9.0f)
                reflectiveCurveTo(10.4f, 11.5f, 9.0f, 11.5f)
                reflectiveCurveTo(6.5f, 10.4f, 6.5f, 9.0f)
                reflectiveCurveTo(7.6f, 6.5f, 9.0f, 6.5f)
                moveTo(9.0f, 2.0f)
                curveTo(12.9f, 2.0f, 16.0f, 5.1f, 16.0f, 9.0f)
                curveTo(16.0f, 14.2f, 9.0f, 22.0f, 9.0f, 22.0f)
                reflectiveCurveTo(2.0f, 14.2f, 2.0f, 9.0f)
                curveTo(2.0f, 5.1f, 5.1f, 2.0f, 9.0f, 2.0f)
                moveTo(9.0f, 4.0f)
                curveTo(6.2f, 4.0f, 4.0f, 6.2f, 4.0f, 9.0f)
                curveTo(4.0f, 10.0f, 4.0f, 12.0f, 9.0f, 18.7f)
                curveTo(14.0f, 12.0f, 14.0f, 10.0f, 14.0f, 9.0f)
                curveTo(14.0f, 6.2f, 11.8f, 4.0f, 9.0f, 4.0f)
                close()
            }
        }
        .build()
        return _mapMarkerPlusOutline!!
    }

private var _mapMarkerPlusOutline: ImageVector? = null
