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

public val MaterialDesignIcons.DatabaseRefreshOutline: ImageVector
    get() {
        if (_databaseRefreshOutline != null) {
            return _databaseRefreshOutline!!
        }
        _databaseRefreshOutline = Builder(name = "DatabaseRefreshOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 12.45f)
                verticalLineTo(9.64f)
                curveTo(7.47f, 10.47f, 9.61f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveTo(16.53f, 10.47f, 18.0f, 9.64f)
                verticalLineTo(12.03f)
                curveTo(18.17f, 12.0f, 18.33f, 12.0f, 18.5f, 12.0f)
                curveTo(19.0f, 12.0f, 19.5f, 12.07f, 20.0f, 12.18f)
                verticalLineTo(7.0f)
                curveTo(20.0f, 4.79f, 16.42f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(4.0f, 4.79f, 4.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 19.21f, 7.59f, 21.0f, 12.0f, 21.0f)
                curveTo(12.17f, 21.0f, 12.33f, 21.0f, 12.5f, 21.0f)
                curveTo(12.24f, 20.37f, 12.09f, 19.7f, 12.03f, 19.0f)
                lineTo(12.0f, 19.0f)
                curveTo(8.13f, 19.0f, 6.0f, 17.5f, 6.0f, 17.0f)
                verticalLineTo(14.77f)
                curveTo(7.61f, 15.55f, 9.72f, 16.0f, 12.0f, 16.0f)
                curveTo(12.17f, 16.0f, 12.34f, 16.0f, 12.5f, 16.0f)
                curveTo(12.85f, 15.18f, 13.34f, 14.46f, 13.95f, 13.86f)
                curveTo(13.32f, 13.95f, 12.67f, 14.0f, 12.0f, 14.0f)
                curveTo(9.58f, 14.0f, 7.3f, 13.4f, 6.0f, 12.45f)
                moveTo(12.0f, 5.0f)
                curveTo(15.87f, 5.0f, 18.0f, 6.5f, 18.0f, 7.0f)
                reflectiveCurveTo(15.87f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveTo(6.0f, 7.5f, 6.0f, 7.0f)
                reflectiveCurveTo(8.13f, 5.0f, 12.0f, 5.0f)
                moveTo(18.0f, 18.5f)
                lineTo(19.77f, 16.73f)
                curveTo(19.32f, 16.28f, 18.69f, 16.0f, 18.0f, 16.0f)
                curveTo(16.62f, 16.0f, 15.5f, 17.12f, 15.5f, 18.5f)
                reflectiveCurveTo(16.62f, 21.0f, 18.0f, 21.0f)
                curveTo(18.82f, 21.0f, 19.54f, 20.61f, 20.0f, 20.0f)
                horizontalLineTo(21.71f)
                curveTo(21.12f, 21.47f, 19.68f, 22.5f, 18.0f, 22.5f)
                curveTo(15.79f, 22.5f, 14.0f, 20.71f, 14.0f, 18.5f)
                reflectiveCurveTo(15.79f, 14.5f, 18.0f, 14.5f)
                curveTo(19.11f, 14.5f, 20.11f, 14.95f, 20.83f, 15.67f)
                lineTo(22.0f, 14.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _databaseRefreshOutline!!
    }

private var _databaseRefreshOutline: ImageVector? = null
