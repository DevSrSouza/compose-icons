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

public val MaterialDesignIcons.SnowflakeThermometer: ImageVector
    get() {
        if (_snowflakeThermometer != null) {
            return _snowflakeThermometer!!
        }
        _snowflakeThermometer = Builder(name = "SnowflakeThermometer", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.46f, 9.41f)
                lineTo(11.0f, 7.38f)
                verticalLineTo(5.12f)
                lineTo(12.71f, 3.41f)
                lineTo(11.29f, 2.0f)
                lineTo(10.0f, 3.29f)
                lineTo(8.71f, 2.0f)
                lineTo(7.29f, 3.41f)
                lineTo(9.0f, 5.12f)
                verticalLineTo(7.38f)
                lineTo(6.5f, 8.82f)
                lineTo(4.5f, 7.69f)
                lineTo(3.92f, 5.36f)
                lineTo(2.0f, 5.88f)
                lineTo(2.47f, 7.65f)
                lineTo(0.7f, 8.12f)
                lineTo(1.22f, 10.05f)
                lineTo(3.55f, 9.43f)
                lineTo(5.55f, 10.56f)
                verticalLineTo(13.45f)
                lineTo(3.55f, 14.58f)
                lineTo(1.22f, 13.96f)
                lineTo(0.7f, 15.89f)
                lineTo(2.47f, 16.36f)
                lineTo(2.0f, 18.12f)
                lineTo(3.93f, 18.64f)
                lineTo(4.55f, 16.31f)
                lineTo(6.55f, 15.18f)
                lineTo(9.0f, 16.62f)
                verticalLineTo(18.88f)
                lineTo(7.29f, 20.59f)
                lineTo(8.71f, 22.0f)
                lineTo(10.0f, 20.71f)
                lineTo(11.29f, 22.0f)
                lineTo(12.7f, 20.59f)
                lineTo(11.0f, 18.88f)
                verticalLineTo(16.62f)
                lineTo(14.46f, 14.61f)
                moveTo(7.5f, 10.56f)
                lineTo(10.0f, 9.11f)
                lineTo(12.5f, 10.56f)
                verticalLineTo(13.44f)
                lineTo(10.0f, 14.89f)
                lineTo(7.5f, 13.44f)
                moveTo(19.0f, 5.0f)
                curveTo(17.89f, 5.0f, 17.0f, 5.89f, 17.0f, 7.0f)
                verticalLineTo(13.76f)
                curveTo(16.36f, 14.33f, 16.0f, 15.15f, 16.0f, 16.0f)
                curveTo(16.0f, 17.66f, 17.34f, 19.0f, 19.0f, 19.0f)
                reflectiveCurveTo(22.0f, 17.66f, 22.0f, 16.0f)
                curveTo(22.0f, 15.15f, 21.64f, 14.33f, 21.0f, 13.77f)
                verticalLineTo(7.0f)
                curveTo(21.0f, 5.89f, 20.11f, 5.0f, 19.0f, 5.0f)
                moveTo(19.0f, 6.0f)
                curveTo(19.55f, 6.0f, 20.0f, 6.45f, 20.0f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                curveTo(18.0f, 6.45f, 18.45f, 6.0f, 19.0f, 6.0f)
            }
        }
        .build()
        return _snowflakeThermometer!!
    }

private var _snowflakeThermometer: ImageVector? = null
