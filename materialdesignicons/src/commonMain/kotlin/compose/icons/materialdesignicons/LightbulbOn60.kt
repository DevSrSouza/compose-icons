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

public val MaterialDesignIcons.LightbulbOn60: ImageVector
    get() {
        if (_lightbulbOn60 != null) {
            return _lightbulbOn60!!
        }
        _lightbulbOn60 = Builder(name = "LightbulbOn60", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 21.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(22.0f)
                curveTo(14.0f, 22.6f, 13.6f, 23.0f, 13.0f, 23.0f)
                horizontalLineTo(11.0f)
                curveTo(10.4f, 23.0f, 10.0f, 22.6f, 10.0f, 22.0f)
                verticalLineTo(21.0f)
                moveTo(1.0f, 13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(13.0f)
                moveTo(4.9f, 3.5f)
                lineTo(3.5f, 4.9f)
                lineTo(5.6f, 7.0f)
                lineTo(7.0f, 5.6f)
                lineTo(4.9f, 3.5f)
                moveTo(13.0f, 1.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(1.0f)
                moveTo(20.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                moveTo(18.0f, 12.0f)
                curveTo(18.0f, 14.2f, 16.8f, 16.2f, 15.0f, 17.2f)
                verticalLineTo(19.0f)
                curveTo(15.0f, 19.6f, 14.6f, 20.0f, 14.0f, 20.0f)
                horizontalLineTo(10.0f)
                curveTo(9.4f, 20.0f, 9.0f, 19.6f, 9.0f, 19.0f)
                verticalLineTo(17.2f)
                curveTo(7.2f, 16.2f, 6.0f, 14.2f, 6.0f, 12.0f)
                curveTo(6.0f, 8.7f, 8.7f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveTo(18.0f, 8.7f, 18.0f, 12.0f)
                moveTo(8.0f, 12.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 9.79f, 14.21f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveTo(8.0f, 9.79f, 8.0f, 12.0f)
                moveTo(19.1f, 3.5f)
                lineTo(17.0f, 5.6f)
                lineTo(18.4f, 7.0f)
                lineTo(20.5f, 4.9f)
                lineTo(19.1f, 3.5f)
                close()
            }
        }
        .build()
        return _lightbulbOn60!!
    }

private var _lightbulbOn60: ImageVector? = null
