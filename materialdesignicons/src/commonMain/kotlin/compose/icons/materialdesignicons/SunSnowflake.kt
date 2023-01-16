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

public val MaterialDesignIcons.SunSnowflake: ImageVector
    get() {
        if (_sunSnowflake != null) {
            return _sunSnowflake!!
        }
        _sunSnowflake = Builder(name = "SunSnowflake", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.69f)
                lineTo(8.69f, 4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.69f)
                lineTo(0.69f, 12.0f)
                lineTo(4.0f, 15.31f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.69f)
                lineTo(12.0f, 23.31f)
                lineTo(13.0f, 22.31f)
                verticalLineTo(17.83f)
                lineTo(16.24f, 21.07f)
                lineTo(17.66f, 19.66f)
                lineTo(13.0f, 15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                lineTo(19.66f, 17.66f)
                lineTo(21.07f, 16.24f)
                lineTo(17.83f, 13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.83f)
                lineTo(21.07f, 7.76f)
                lineTo(19.66f, 6.34f)
                lineTo(15.0f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                lineTo(17.66f, 4.34f)
                lineTo(16.24f, 2.93f)
                lineTo(13.0f, 6.17f)
                verticalLineTo(1.69f)
                moveTo(11.0f, 6.09f)
                verticalLineTo(8.13f)
                curveTo(9.24f, 8.59f, 8.0f, 10.18f, 8.0f, 12.0f)
                curveTo(8.0f, 13.82f, 9.24f, 15.41f, 11.0f, 15.87f)
                verticalLineTo(17.91f)
                curveTo(8.12f, 17.42f, 6.0f, 14.93f, 6.0f, 12.0f)
                curveTo(6.0f, 9.07f, 8.11f, 6.57f, 11.0f, 6.09f)
                close()
            }
        }
        .build()
        return _sunSnowflake!!
    }

private var _sunSnowflake: ImageVector? = null
