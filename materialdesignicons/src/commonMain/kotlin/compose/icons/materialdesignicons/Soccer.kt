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

public val MaterialDesignIcons.Soccer: ImageVector
    get() {
        if (_soccer != null) {
            return _soccer!!
        }
        _soccer = Builder(name = "Soccer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.93f, 17.12f)
                lineTo(16.13f, 15.76f)
                lineTo(17.59f, 11.39f)
                lineTo(19.0f, 10.92f)
                lineTo(20.0f, 11.67f)
                curveTo(20.0f, 11.7f, 20.0f, 11.75f, 20.0f, 11.81f)
                curveTo(20.0f, 11.88f, 20.03f, 11.94f, 20.03f, 12.0f)
                curveTo(20.03f, 13.97f, 19.37f, 15.71f, 18.06f, 17.21f)
                lineTo(16.93f, 17.12f)
                moveTo(9.75f, 15.0f)
                lineTo(8.38f, 10.97f)
                lineTo(12.0f, 8.43f)
                lineTo(15.62f, 10.97f)
                lineTo(14.25f, 15.0f)
                horizontalLineTo(9.75f)
                moveTo(12.0f, 20.03f)
                curveTo(11.12f, 20.03f, 10.29f, 19.89f, 9.5f, 19.61f)
                lineTo(8.81f, 18.1f)
                lineTo(9.47f, 17.0f)
                horizontalLineTo(14.58f)
                lineTo(15.19f, 18.1f)
                lineTo(14.5f, 19.61f)
                curveTo(13.71f, 19.89f, 12.88f, 20.03f, 12.0f, 20.03f)
                moveTo(5.94f, 17.21f)
                curveTo(5.41f, 16.59f, 4.95f, 15.76f, 4.56f, 14.75f)
                curveTo(4.17f, 13.73f, 3.97f, 12.81f, 3.97f, 12.0f)
                curveTo(3.97f, 11.94f, 4.0f, 11.88f, 4.0f, 11.81f)
                curveTo(4.0f, 11.75f, 4.0f, 11.7f, 4.0f, 11.67f)
                lineTo(5.0f, 10.92f)
                lineTo(6.41f, 11.39f)
                lineTo(7.87f, 15.76f)
                lineTo(7.07f, 17.12f)
                lineTo(5.94f, 17.21f)
                moveTo(11.0f, 5.29f)
                verticalLineTo(6.69f)
                lineTo(7.0f, 9.46f)
                lineTo(5.66f, 9.04f)
                lineTo(5.24f, 7.68f)
                curveTo(5.68f, 7.0f, 6.33f, 6.32f, 7.19f, 5.66f)
                reflectiveCurveTo(8.87f, 4.57f, 9.65f, 4.35f)
                lineTo(11.0f, 5.29f)
                moveTo(14.35f, 4.35f)
                curveTo(15.13f, 4.57f, 15.95f, 5.0f, 16.81f, 5.66f)
                curveTo(17.67f, 6.32f, 18.32f, 7.0f, 18.76f, 7.68f)
                lineTo(18.34f, 9.04f)
                lineTo(17.0f, 9.47f)
                lineTo(13.0f, 6.7f)
                verticalLineTo(5.29f)
                lineTo(14.35f, 4.35f)
                moveTo(4.93f, 4.93f)
                curveTo(3.0f, 6.89f, 2.0f, 9.25f, 2.0f, 12.0f)
                reflectiveCurveTo(3.0f, 17.11f, 4.93f, 19.07f)
                reflectiveCurveTo(9.25f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(17.11f, 21.0f, 19.07f, 19.07f)
                reflectiveCurveTo(22.0f, 14.75f, 22.0f, 12.0f)
                reflectiveCurveTo(21.0f, 6.89f, 19.07f, 4.93f)
                reflectiveCurveTo(14.75f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(6.89f, 3.0f, 4.93f, 4.93f)
                close()
            }
        }
        .build()
        return _soccer!!
    }

private var _soccer: ImageVector? = null
