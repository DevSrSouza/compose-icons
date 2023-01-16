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

public val MaterialDesignIcons.HorseHuman: ImageVector
    get() {
        if (_horseHuman != null) {
            return _horseHuman!!
        }
        _horseHuman = Builder(name = "HorseHuman", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 3.5f)
                curveTo(10.0f, 2.67f, 10.67f, 2.0f, 11.5f, 2.0f)
                reflectiveCurveTo(13.0f, 2.67f, 13.0f, 3.5f)
                reflectiveCurveTo(12.33f, 5.0f, 11.5f, 5.0f)
                reflectiveCurveTo(10.0f, 4.33f, 10.0f, 3.5f)
                moveTo(22.0f, 8.0f)
                verticalLineTo(11.5f)
                lineTo(20.97f, 11.85f)
                curveTo(20.8f, 13.06f, 19.76f, 14.0f, 18.5f, 14.0f)
                horizontalLineTo(18.42f)
                curveTo(18.28f, 14.68f, 17.95f, 15.29f, 17.5f, 15.78f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                curveTo(14.92f, 17.0f, 14.84f, 17.0f, 14.75f, 17.0f)
                curveTo(14.54f, 17.0f, 14.33f, 16.97f, 14.13f, 16.94f)
                lineTo(9.69f, 16.2f)
                lineTo(8.57f, 18.21f)
                lineTo(9.32f, 22.0f)
                horizontalLineTo(6.78f)
                lineTo(6.0f, 18.25f)
                curveTo(5.97f, 17.95f, 6.0f, 17.65f, 6.16f, 17.39f)
                lineTo(7.18f, 15.58f)
                curveTo(6.2f, 15.03f, 5.53f, 14.0f, 5.5f, 12.81f)
                curveTo(5.46f, 12.96f, 5.44f, 13.18f, 5.47f, 13.5f)
                curveTo(5.5f, 13.94f, 5.61f, 14.59f, 5.54f, 15.31f)
                curveTo(5.5f, 16.03f, 5.17f, 16.77f, 4.75f, 17.26f)
                curveTo(4.32f, 17.75f, 3.85f, 18.09f, 3.35f, 18.35f)
                lineTo(2.65f, 17.65f)
                curveTo(2.84f, 17.18f, 3.03f, 16.76f, 3.07f, 16.37f)
                curveTo(3.13f, 16.0f, 3.06f, 15.7f, 2.95f, 15.43f)
                lineTo(2.42f, 14.3f)
                curveTo(2.21f, 13.79f, 1.95f, 13.05f, 2.0f, 12.18f)
                curveTo(2.03f, 11.33f, 2.5f, 10.22f, 3.39f, 9.61f)
                curveTo(4.29f, 9.0f, 5.26f, 8.91f, 6.05f, 9.08f)
                curveTo(6.55f, 9.18f, 7.06f, 9.42f, 7.5f, 9.76f)
                curveTo(7.87f, 9.59f, 8.3f, 9.5f, 8.75f, 9.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.11f)
                curveTo(9.0f, 7.11f, 9.68f, 6.19f, 10.66f, 6.03f)
                curveTo(11.92f, 5.82f, 13.0f, 6.79f, 13.0f, 8.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(9.0f)
                curveTo(14.5f, 6.79f, 16.29f, 5.0f, 18.5f, 5.0f)
                horizontalLineTo(22.0f)
                lineTo(21.11f, 6.34f)
                curveTo(21.65f, 6.7f, 22.0f, 7.31f, 22.0f, 8.0f)
                moveTo(20.0f, 11.2f)
                lineTo(18.96f, 9.54f)
                curveTo(18.83f, 9.33f, 18.5f, 9.42f, 18.5f, 9.67f)
                verticalLineTo(13.0f)
                curveTo(19.33f, 13.0f, 20.0f, 12.33f, 20.0f, 11.5f)
                verticalLineTo(11.2f)
                close()
            }
        }
        .build()
        return _horseHuman!!
    }

private var _horseHuman: ImageVector? = null
