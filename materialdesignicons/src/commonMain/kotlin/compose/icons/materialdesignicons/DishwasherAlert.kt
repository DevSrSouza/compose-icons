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

public val MaterialDesignIcons.DishwasherAlert: ImageVector
    get() {
        if (_dishwasherAlert != null) {
            return _dishwasherAlert!!
        }
        _dishwasherAlert = Builder(name = "DishwasherAlert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.11f, 2.9f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(17.11f, 22.0f, 18.0f, 21.11f, 18.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(18.0f, 2.9f, 17.11f, 2.0f, 16.0f, 2.0f)
                moveTo(8.0f, 4.0f)
                curveTo(8.55f, 4.0f, 9.0f, 4.45f, 9.0f, 5.0f)
                reflectiveCurveTo(8.55f, 6.0f, 8.0f, 6.0f)
                reflectiveCurveTo(7.0f, 5.55f, 7.0f, 5.0f)
                reflectiveCurveTo(7.45f, 4.0f, 8.0f, 4.0f)
                moveTo(5.0f, 4.0f)
                curveTo(5.55f, 4.0f, 6.0f, 4.45f, 6.0f, 5.0f)
                reflectiveCurveTo(5.55f, 6.0f, 5.0f, 6.0f)
                reflectiveCurveTo(4.0f, 5.55f, 4.0f, 5.0f)
                reflectiveCurveTo(4.45f, 4.0f, 5.0f, 4.0f)
                moveTo(16.0f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                moveTo(12.67f, 15.33f)
                curveTo(12.69f, 16.03f, 12.41f, 16.71f, 11.91f, 17.21f)
                curveTo(10.86f, 18.26f, 9.15f, 18.27f, 8.09f, 17.21f)
                curveTo(7.59f, 16.71f, 7.31f, 16.03f, 7.33f, 15.33f)
                curveTo(7.4f, 14.62f, 7.63f, 13.94f, 8.0f, 13.33f)
                curveTo(8.37f, 12.5f, 8.81f, 11.73f, 9.33f, 11.0f)
                lineTo(10.0f, 10.0f)
                curveTo(11.79f, 12.59f, 12.67f, 14.36f, 12.67f, 15.33f)
                moveTo(20.0f, 15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                moveTo(20.0f, 7.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _dishwasherAlert!!
    }

private var _dishwasherAlert: ImageVector? = null
