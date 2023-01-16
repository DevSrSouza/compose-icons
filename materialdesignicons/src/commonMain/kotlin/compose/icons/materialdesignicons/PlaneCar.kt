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

public val MaterialDesignIcons.PlaneCar: ImageVector
    get() {
        if (_planeCar != null) {
            return _planeCar!!
        }
        _planeCar = Builder(name = "PlaneCar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.57f, 12.66f)
                curveTo(21.43f, 12.26f, 21.05f, 12.0f, 20.6f, 12.0f)
                horizontalLineTo(13.41f)
                curveTo(12.95f, 12.0f, 12.58f, 12.26f, 12.43f, 12.66f)
                lineTo(11.0f, 16.77f)
                verticalLineTo(22.28f)
                curveTo(11.0f, 22.66f, 11.32f, 23.0f, 11.7f, 23.0f)
                horizontalLineTo(12.32f)
                curveTo(12.7f, 23.0f, 13.0f, 22.62f, 13.0f, 22.24f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(22.24f)
                curveTo(21.0f, 22.62f, 21.31f, 23.0f, 21.69f, 23.0f)
                horizontalLineTo(22.3f)
                curveTo(22.68f, 23.0f, 23.0f, 22.66f, 23.0f, 22.28f)
                verticalLineTo(16.77f)
                lineTo(21.57f, 12.66f)
                moveTo(13.41f, 13.0f)
                horizontalLineTo(20.6f)
                lineTo(21.63f, 16.0f)
                horizontalLineTo(12.38f)
                lineTo(13.41f, 13.0f)
                moveTo(13.0f, 19.0f)
                curveTo(12.45f, 19.0f, 12.0f, 18.55f, 12.0f, 18.0f)
                reflectiveCurveTo(12.45f, 17.0f, 13.0f, 17.0f)
                reflectiveCurveTo(14.0f, 17.45f, 14.0f, 18.0f)
                reflectiveCurveTo(13.55f, 19.0f, 13.0f, 19.0f)
                moveTo(21.0f, 19.0f)
                curveTo(20.45f, 19.0f, 20.0f, 18.55f, 20.0f, 18.0f)
                reflectiveCurveTo(20.45f, 17.0f, 21.0f, 17.0f)
                reflectiveCurveTo(22.0f, 17.45f, 22.0f, 18.0f)
                reflectiveCurveTo(21.55f, 19.0f, 21.0f, 19.0f)
                moveTo(6.66f, 14.53f)
                lineTo(7.0f, 17.0f)
                lineTo(5.95f, 18.06f)
                lineTo(4.19f, 14.88f)
                lineTo(1.0f, 13.11f)
                lineTo(2.06f, 12.03f)
                lineTo(4.56f, 12.4f)
                lineTo(8.43f, 8.53f)
                lineTo(1.0f, 4.62f)
                lineTo(2.42f, 3.21f)
                lineTo(11.61f, 5.33f)
                lineTo(15.5f, 1.44f)
                curveTo(16.06f, 0.855f, 17.06f, 0.855f, 17.62f, 1.44f)
                curveTo(18.21f, 2.03f, 18.21f, 3.0f, 17.62f, 3.56f)
                lineTo(13.73f, 7.45f)
                lineTo(14.55f, 11.0f)
                horizontalLineTo(13.41f)
                curveTo(12.54f, 11.0f, 11.79f, 11.5f, 11.5f, 12.31f)
                lineTo(11.47f, 12.37f)
                lineTo(10.56f, 10.63f)
                lineTo(6.66f, 14.53f)
                close()
            }
        }
        .build()
        return _planeCar!!
    }

private var _planeCar: ImageVector? = null
