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

public val MaterialDesignIcons.CloudClockOutline: ImageVector
    get() {
        if (_cloudClockOutline != null) {
            return _cloudClockOutline!!
        }
        _cloudClockOutline = Builder(name = "CloudClockOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 15.5f)
                curveTo(23.0f, 14.79f, 22.84f, 14.14f, 22.55f, 13.54f)
                curveTo(21.89f, 11.79f, 20.56f, 10.38f, 18.86f, 9.62f)
                curveTo(18.61f, 8.26f, 18.0f, 7.06f, 16.96f, 6.04f)
                curveTo(15.6f, 4.68f, 13.95f, 4.0f, 12.0f, 4.0f)
                curveTo(10.42f, 4.0f, 9.0f, 4.47f, 7.75f, 5.43f)
                reflectiveCurveTo(5.67f, 7.62f, 5.25f, 9.15f)
                curveTo(4.0f, 9.43f, 2.96f, 10.08f, 2.17f, 11.1f)
                reflectiveCurveTo(1.0f, 13.28f, 1.0f, 14.58f)
                curveTo(1.0f, 16.09f, 1.54f, 17.38f, 2.61f, 18.43f)
                curveTo(3.69f, 19.5f, 5.0f, 20.0f, 6.5f, 20.0f)
                horizontalLineTo(10.26f)
                curveTo(11.53f, 21.81f, 13.62f, 23.0f, 16.0f, 23.0f)
                curveTo(19.87f, 23.0f, 23.0f, 19.87f, 23.0f, 16.0f)
                curveTo(23.0f, 15.89f, 23.0f, 15.79f, 23.0f, 15.68f)
                curveTo(23.0f, 15.62f, 23.0f, 15.56f, 23.0f, 15.5f)
                moveTo(6.5f, 18.0f)
                curveTo(5.53f, 18.0f, 4.71f, 17.66f, 4.03f, 17.0f)
                curveTo(3.34f, 16.29f, 3.0f, 15.47f, 3.0f, 14.5f)
                reflectiveCurveTo(3.34f, 12.71f, 4.03f, 12.03f)
                curveTo(4.71f, 11.34f, 5.53f, 11.0f, 6.5f, 11.0f)
                horizontalLineTo(7.0f)
                curveTo(7.0f, 9.62f, 7.5f, 8.44f, 8.46f, 7.46f)
                curveTo(9.44f, 6.5f, 10.62f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveTo(14.56f, 6.5f, 15.54f, 7.46f)
                curveTo(16.0f, 7.93f, 16.35f, 8.46f, 16.59f, 9.03f)
                curveTo(16.4f, 9.0f, 16.2f, 9.0f, 16.0f, 9.0f)
                curveTo(12.13f, 9.0f, 9.0f, 12.13f, 9.0f, 16.0f)
                curveTo(9.0f, 16.7f, 9.11f, 17.37f, 9.29f, 18.0f)
                horizontalLineTo(6.5f)
                moveTo(16.0f, 21.0f)
                curveTo(13.24f, 21.0f, 11.0f, 18.76f, 11.0f, 16.0f)
                reflectiveCurveTo(13.24f, 11.0f, 16.0f, 11.0f)
                reflectiveCurveTo(21.0f, 13.24f, 21.0f, 16.0f)
                reflectiveCurveTo(18.76f, 21.0f, 16.0f, 21.0f)
                moveTo(16.5f, 16.25f)
                lineTo(19.36f, 17.94f)
                lineTo(18.61f, 19.16f)
                lineTo(15.0f, 17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.25f)
                close()
            }
        }
        .build()
        return _cloudClockOutline!!
    }

private var _cloudClockOutline: ImageVector? = null
