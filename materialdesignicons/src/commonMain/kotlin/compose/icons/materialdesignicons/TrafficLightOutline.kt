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

public val MaterialDesignIcons.TrafficLightOutline: ImageVector
    get() {
        if (_trafficLightOutline != null) {
            return _trafficLightOutline!!
        }
        _trafficLightOutline = Builder(name = "TrafficLightOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.86f)
                curveTo(18.72f, 8.41f, 20.0f, 6.86f, 20.0f, 5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                curveTo(17.0f, 3.45f, 16.55f, 3.0f, 16.0f, 3.0f)
                horizontalLineTo(8.0f)
                curveTo(7.45f, 3.0f, 7.0f, 3.45f, 7.0f, 4.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 6.86f, 5.28f, 8.41f, 7.0f, 8.86f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 11.86f, 5.28f, 13.41f, 7.0f, 13.86f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 16.86f, 5.28f, 18.41f, 7.0f, 18.86f)
                verticalLineTo(20.0f)
                curveTo(7.0f, 20.55f, 7.45f, 21.0f, 8.0f, 21.0f)
                horizontalLineTo(16.0f)
                curveTo(16.55f, 21.0f, 17.0f, 20.55f, 17.0f, 20.0f)
                verticalLineTo(18.86f)
                curveTo(18.72f, 18.41f, 20.0f, 16.86f, 20.0f, 15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.86f)
                curveTo(18.72f, 13.41f, 20.0f, 11.86f, 20.0f, 10.0f)
                moveTo(15.0f, 19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                moveTo(12.0f, 18.0f)
                curveTo(12.83f, 18.0f, 13.5f, 17.33f, 13.5f, 16.5f)
                reflectiveCurveTo(12.83f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveTo(10.5f, 15.67f, 10.5f, 16.5f)
                reflectiveCurveTo(11.17f, 18.0f, 12.0f, 18.0f)
                moveTo(12.0f, 13.5f)
                curveTo(12.83f, 13.5f, 13.5f, 12.83f, 13.5f, 12.0f)
                reflectiveCurveTo(12.83f, 10.5f, 12.0f, 10.5f)
                reflectiveCurveTo(10.5f, 11.17f, 10.5f, 12.0f)
                reflectiveCurveTo(11.17f, 13.5f, 12.0f, 13.5f)
                moveTo(12.0f, 9.0f)
                curveTo(12.83f, 9.0f, 13.5f, 8.33f, 13.5f, 7.5f)
                reflectiveCurveTo(12.83f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveTo(10.5f, 6.67f, 10.5f, 7.5f)
                reflectiveCurveTo(11.17f, 9.0f, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _trafficLightOutline!!
    }

private var _trafficLightOutline: ImageVector? = null
