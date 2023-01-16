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

public val MaterialDesignIcons.DatabaseSearchOutline: ImageVector
    get() {
        if (_databaseSearchOutline != null) {
            return _databaseSearchOutline!!
        }
        _databaseSearchOutline = Builder(name = "DatabaseSearchOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 18.95f)
                curveTo(7.77f, 18.72f, 6.0f, 17.45f, 6.0f, 17.0f)
                verticalLineTo(14.77f)
                curveTo(7.13f, 15.32f, 8.5f, 15.69f, 10.0f, 15.87f)
                curveTo(10.0f, 15.21f, 10.04f, 14.54f, 10.21f, 13.89f)
                curveTo(8.5f, 13.67f, 6.97f, 13.16f, 6.0f, 12.45f)
                verticalLineTo(9.64f)
                curveTo(7.43f, 10.45f, 9.5f, 10.97f, 11.82f, 11.0f)
                curveTo(11.85f, 10.97f, 11.87f, 10.93f, 11.9f, 10.9f)
                curveTo(14.1f, 8.71f, 17.5f, 8.41f, 20.0f, 10.03f)
                verticalLineTo(7.0f)
                curveTo(20.0f, 4.79f, 16.42f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(4.0f, 4.79f, 4.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 19.21f, 7.59f, 21.0f, 12.0f, 21.0f)
                curveTo(12.34f, 21.0f, 12.68f, 21.0f, 13.0f, 20.97f)
                curveTo(12.62f, 20.72f, 12.24f, 20.44f, 11.9f, 20.1f)
                curveTo(11.55f, 19.74f, 11.25f, 19.36f, 11.0f, 18.95f)
                moveTo(12.0f, 5.0f)
                curveTo(15.87f, 5.0f, 18.0f, 6.5f, 18.0f, 7.0f)
                reflectiveCurveTo(15.87f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveTo(6.0f, 7.5f, 6.0f, 7.0f)
                reflectiveCurveTo(8.13f, 5.0f, 12.0f, 5.0f)
                moveTo(20.31f, 17.9f)
                curveTo(20.75f, 17.21f, 21.0f, 16.38f, 21.0f, 15.5f)
                curveTo(21.0f, 13.0f, 19.0f, 11.0f, 16.5f, 11.0f)
                reflectiveCurveTo(12.0f, 13.0f, 12.0f, 15.5f)
                reflectiveCurveTo(14.0f, 20.0f, 16.5f, 20.0f)
                curveTo(17.37f, 20.0f, 18.19f, 19.75f, 18.88f, 19.32f)
                lineTo(22.0f, 22.39f)
                lineTo(23.39f, 21.0f)
                lineTo(20.31f, 17.9f)
                moveTo(16.5f, 18.0f)
                curveTo(15.12f, 18.0f, 14.0f, 16.88f, 14.0f, 15.5f)
                reflectiveCurveTo(15.12f, 13.0f, 16.5f, 13.0f)
                reflectiveCurveTo(19.0f, 14.12f, 19.0f, 15.5f)
                reflectiveCurveTo(17.88f, 18.0f, 16.5f, 18.0f)
                close()
            }
        }
        .build()
        return _databaseSearchOutline!!
    }

private var _databaseSearchOutline: ImageVector? = null
