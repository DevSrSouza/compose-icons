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

public val MaterialDesignIcons.DatabaseClockOutline: ImageVector
    get() {
        if (_databaseClockOutline != null) {
            return _databaseClockOutline!!
        }
        _databaseClockOutline = Builder(name = "DatabaseClockOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 16.25f)
                lineTo(19.36f, 17.94f)
                lineTo(18.61f, 19.16f)
                lineTo(15.0f, 17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.25f)
                moveTo(23.0f, 16.0f)
                curveTo(23.0f, 19.87f, 19.87f, 23.0f, 16.0f, 23.0f)
                curveTo(13.61f, 23.0f, 11.5f, 21.8f, 10.25f, 20.0f)
                curveTo(6.19f, 19.79f, 3.0f, 18.08f, 3.0f, 16.0f)
                verticalLineTo(6.0f)
                curveTo(3.0f, 3.79f, 6.58f, 2.0f, 11.0f, 2.0f)
                reflectiveCurveTo(19.0f, 3.79f, 19.0f, 6.0f)
                verticalLineTo(9.68f)
                curveTo(21.36f, 10.81f, 23.0f, 13.21f, 23.0f, 16.0f)
                moveTo(17.0f, 9.08f)
                verticalLineTo(8.64f)
                curveTo(16.77f, 8.77f, 16.5f, 8.9f, 16.24f, 9.0f)
                curveTo(16.5f, 9.0f, 16.75f, 9.04f, 17.0f, 9.08f)
                moveTo(5.0f, 6.0f)
                curveTo(5.0f, 6.5f, 7.13f, 8.0f, 11.0f, 8.0f)
                reflectiveCurveTo(17.0f, 6.5f, 17.0f, 6.0f)
                reflectiveCurveTo(14.87f, 4.0f, 11.0f, 4.0f)
                reflectiveCurveTo(5.0f, 5.5f, 5.0f, 6.0f)
                moveTo(5.0f, 11.45f)
                curveTo(6.07f, 12.23f, 7.8f, 12.76f, 9.72f, 12.93f)
                curveTo(10.33f, 11.67f, 11.32f, 10.62f, 12.54f, 9.92f)
                curveTo(12.04f, 9.97f, 11.53f, 10.0f, 11.0f, 10.0f)
                curveTo(8.61f, 10.0f, 6.47f, 9.47f, 5.0f, 8.64f)
                verticalLineTo(11.45f)
                moveTo(9.26f, 17.87f)
                curveTo(9.1f, 17.27f, 9.0f, 16.65f, 9.0f, 16.0f)
                curveTo(9.0f, 15.61f, 9.04f, 15.23f, 9.1f, 14.86f)
                curveTo(7.56f, 14.69f, 6.15f, 14.33f, 5.0f, 13.77f)
                verticalLineTo(16.0f)
                curveTo(5.0f, 16.42f, 6.5f, 17.5f, 9.26f, 17.87f)
                moveTo(21.0f, 16.0f)
                curveTo(21.0f, 13.24f, 18.76f, 11.0f, 16.0f, 11.0f)
                reflectiveCurveTo(11.0f, 13.24f, 11.0f, 16.0f)
                reflectiveCurveTo(13.24f, 21.0f, 16.0f, 21.0f)
                reflectiveCurveTo(21.0f, 18.76f, 21.0f, 16.0f)
                close()
            }
        }
        .build()
        return _databaseClockOutline!!
    }

private var _databaseClockOutline: ImageVector? = null
