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

public val MaterialDesignIcons.SnowflakeMelt: ImageVector
    get() {
        if (_snowflakeMelt != null) {
            return _snowflakeMelt!!
        }
        _snowflakeMelt = Builder(name = "SnowflakeMelt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 17.85f)
                curveTo(8.0f, 19.04f, 7.11f, 20.0f, 6.0f, 20.0f)
                reflectiveCurveTo(4.0f, 19.04f, 4.0f, 17.85f)
                curveTo(4.0f, 16.42f, 6.0f, 14.0f, 6.0f, 14.0f)
                reflectiveCurveTo(8.0f, 16.42f, 8.0f, 17.85f)
                moveTo(16.46f, 12.0f)
                verticalLineTo(10.56f)
                lineTo(18.46f, 9.43f)
                lineTo(20.79f, 10.05f)
                lineTo(21.31f, 8.12f)
                lineTo(19.54f, 7.65f)
                lineTo(20.0f, 5.88f)
                lineTo(18.07f, 5.36f)
                lineTo(17.45f, 7.69f)
                lineTo(15.45f, 8.82f)
                lineTo(13.0f, 7.38f)
                verticalLineTo(5.12f)
                lineTo(14.71f, 3.41f)
                lineTo(13.29f, 2.0f)
                lineTo(12.0f, 3.29f)
                lineTo(10.71f, 2.0f)
                lineTo(9.29f, 3.41f)
                lineTo(11.0f, 5.12f)
                verticalLineTo(7.38f)
                lineTo(8.5f, 8.82f)
                lineTo(6.5f, 7.69f)
                lineTo(5.92f, 5.36f)
                lineTo(4.0f, 5.88f)
                lineTo(4.47f, 7.65f)
                lineTo(2.7f, 8.12f)
                lineTo(3.22f, 10.05f)
                lineTo(5.55f, 9.43f)
                lineTo(7.55f, 10.56f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.46f)
                moveTo(9.5f, 12.0f)
                verticalLineTo(10.56f)
                lineTo(12.0f, 9.11f)
                lineTo(14.5f, 10.56f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.5f)
                moveTo(20.0f, 17.85f)
                curveTo(20.0f, 19.04f, 19.11f, 20.0f, 18.0f, 20.0f)
                reflectiveCurveTo(16.0f, 19.04f, 16.0f, 17.85f)
                curveTo(16.0f, 16.42f, 18.0f, 14.0f, 18.0f, 14.0f)
                reflectiveCurveTo(20.0f, 16.42f, 20.0f, 17.85f)
                moveTo(14.0f, 20.85f)
                curveTo(14.0f, 22.04f, 13.11f, 23.0f, 12.0f, 23.0f)
                reflectiveCurveTo(10.0f, 22.04f, 10.0f, 20.85f)
                curveTo(10.0f, 19.42f, 12.0f, 17.0f, 12.0f, 17.0f)
                reflectiveCurveTo(14.0f, 19.42f, 14.0f, 20.85f)
                close()
            }
        }
        .build()
        return _snowflakeMelt!!
    }

private var _snowflakeMelt: ImageVector? = null
