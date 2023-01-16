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

public val MaterialDesignIcons.WindTurbineAlert: ImageVector
    get() {
        if (_windTurbineAlert != null) {
            return _windTurbineAlert!!
        }
        _windTurbineAlert = Builder(name = "WindTurbineAlert", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.33f, 11.67f)
                lineTo(15.21f, 14.58f)
                curveTo(16.62f, 13.16f, 15.21f, 11.75f, 15.21f, 11.75f)
                lineTo(13.72f, 10.24f)
                curveTo(13.9f, 9.86f, 14.0f, 9.44f, 14.0f, 9.0f)
                curveTo(14.0f, 7.95f, 13.46f, 7.03f, 12.64f, 6.5f)
                lineTo(14.0f, 2.11f)
                curveTo(12.09f, 1.53f, 11.5f, 3.44f, 11.5f, 3.44f)
                lineTo(10.69f, 6.03f)
                curveTo(9.46f, 6.16f, 8.46f, 7.0f, 8.13f, 8.18f)
                lineTo(3.67f, 9.63f)
                curveTo(4.31f, 11.53f, 6.2f, 10.9f, 6.2f, 10.9f)
                lineTo(8.27f, 10.23f)
                curveTo(8.61f, 10.97f, 9.23f, 11.54f, 10.0f, 11.82f)
                verticalLineTo(19.0f)
                curveTo(10.0f, 19.0f, 8.0f, 19.0f, 8.0f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(21.0f)
                curveTo(14.0f, 21.0f, 14.0f, 19.0f, 12.0f, 19.0f)
                verticalLineTo(11.82f)
                curveTo(12.12f, 11.78f, 12.23f, 11.72f, 12.33f, 11.67f)
                moveTo(9.5f, 9.0f)
                curveTo(9.5f, 8.17f, 10.17f, 7.5f, 11.0f, 7.5f)
                reflectiveCurveTo(12.5f, 8.17f, 12.5f, 9.0f)
                reflectiveCurveTo(11.83f, 10.5f, 11.0f, 10.5f)
                reflectiveCurveTo(9.5f, 9.83f, 9.5f, 9.0f)
                moveTo(18.0f, 12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                moveTo(18.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _windTurbineAlert!!
    }

private var _windTurbineAlert: ImageVector? = null
