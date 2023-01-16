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

public val MaterialDesignIcons.WindTurbineCheck: ImageVector
    get() {
        if (_windTurbineCheck != null) {
            return _windTurbineCheck!!
        }
        _windTurbineCheck = Builder(name = "WindTurbineCheck", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.33f, 11.67f)
                lineTo(14.21f, 14.58f)
                curveTo(15.62f, 13.16f, 14.21f, 11.75f, 14.21f, 11.75f)
                lineTo(12.72f, 10.24f)
                curveTo(12.9f, 9.86f, 13.0f, 9.44f, 13.0f, 9.0f)
                curveTo(13.0f, 7.95f, 12.46f, 7.03f, 11.64f, 6.5f)
                lineTo(13.0f, 2.11f)
                curveTo(11.09f, 1.53f, 10.5f, 3.44f, 10.5f, 3.44f)
                lineTo(9.69f, 6.03f)
                curveTo(8.46f, 6.16f, 7.46f, 7.0f, 7.13f, 8.18f)
                lineTo(2.67f, 9.63f)
                curveTo(3.31f, 11.53f, 5.2f, 10.9f, 5.2f, 10.9f)
                lineTo(7.27f, 10.23f)
                curveTo(7.61f, 10.97f, 8.23f, 11.54f, 9.0f, 11.82f)
                verticalLineTo(19.0f)
                curveTo(9.0f, 19.0f, 7.0f, 19.0f, 7.0f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(21.0f)
                curveTo(13.0f, 21.0f, 13.0f, 19.0f, 11.0f, 19.0f)
                verticalLineTo(11.82f)
                curveTo(11.12f, 11.78f, 11.23f, 11.72f, 11.33f, 11.67f)
                moveTo(8.5f, 9.0f)
                curveTo(8.5f, 8.17f, 9.17f, 7.5f, 10.0f, 7.5f)
                reflectiveCurveTo(11.5f, 8.17f, 11.5f, 9.0f)
                reflectiveCurveTo(10.83f, 10.5f, 10.0f, 10.5f)
                reflectiveCurveTo(8.5f, 9.83f, 8.5f, 9.0f)
                moveTo(16.75f, 21.16f)
                lineTo(14.0f, 18.16f)
                lineTo(15.16f, 17.0f)
                lineTo(16.75f, 18.59f)
                lineTo(20.34f, 15.0f)
                lineTo(21.5f, 16.41f)
                lineTo(16.75f, 21.16f)
            }
        }
        .build()
        return _windTurbineCheck!!
    }

private var _windTurbineCheck: ImageVector? = null
