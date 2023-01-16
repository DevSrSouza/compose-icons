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

public val MaterialDesignIcons.DishwasherOff: ImageVector
    get() {
        if (_dishwasherOff != null) {
            return _dishwasherOff!!
        }
        _dishwasherOff = Builder(name = "DishwasherOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(4.0f, 5.89f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.11f, 4.89f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(18.58f, 22.0f, 19.1f, 21.75f, 19.46f, 21.35f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(18.0f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.11f)
                lineTo(10.5f, 12.37f)
                curveTo(10.31f, 12.69f, 10.15f, 13.0f, 10.0f, 13.33f)
                curveTo(9.63f, 13.94f, 9.4f, 14.62f, 9.33f, 15.33f)
                curveTo(9.31f, 16.03f, 9.59f, 16.71f, 10.09f, 17.21f)
                curveTo(11.15f, 18.27f, 12.86f, 18.26f, 13.91f, 17.21f)
                curveTo(14.16f, 16.97f, 14.35f, 16.68f, 14.5f, 16.36f)
                lineTo(18.0f, 19.89f)
                verticalLineTo(20.0f)
                moveTo(11.2f, 8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.8f)
                lineTo(20.0f, 16.8f)
                verticalLineTo(4.0f)
                curveTo(20.0f, 2.9f, 19.11f, 2.0f, 18.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(5.76f, 2.0f, 5.54f, 2.05f, 5.33f, 2.13f)
                lineTo(11.2f, 8.0f)
                moveTo(10.0f, 4.0f)
                curveTo(10.55f, 4.0f, 11.0f, 4.45f, 11.0f, 5.0f)
                reflectiveCurveTo(10.55f, 6.0f, 10.0f, 6.0f)
                reflectiveCurveTo(9.0f, 5.55f, 9.0f, 5.0f)
                reflectiveCurveTo(9.45f, 4.0f, 10.0f, 4.0f)
                close()
            }
        }
        .build()
        return _dishwasherOff!!
    }

private var _dishwasherOff: ImageVector? = null
