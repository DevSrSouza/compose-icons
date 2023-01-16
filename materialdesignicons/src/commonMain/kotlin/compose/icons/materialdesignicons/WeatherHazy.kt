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

public val MaterialDesignIcons.WeatherHazy: ImageVector
    get() {
        if (_weatherHazy != null) {
            return _weatherHazy!!
        }
        _weatherHazy = Builder(name = "WeatherHazy", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineTo(14.39f, 5.42f)
                curveTo(13.65f, 5.15f, 12.84f, 5.0f, 12.0f, 5.0f)
                curveTo(11.16f, 5.0f, 10.35f, 5.15f, 9.61f, 5.42f)
                lineTo(12.0f, 2.0f)
                moveTo(3.34f, 7.0f)
                lineTo(7.5f, 6.65f)
                curveTo(6.9f, 7.16f, 6.36f, 7.78f, 5.94f, 8.5f)
                curveTo(5.5f, 9.24f, 5.25f, 10.0f, 5.11f, 10.79f)
                lineTo(3.34f, 7.0f)
                moveTo(20.65f, 7.0f)
                lineTo(18.88f, 10.79f)
                curveTo(18.74f, 10.0f, 18.47f, 9.23f, 18.05f, 8.5f)
                curveTo(17.63f, 7.78f, 17.1f, 7.15f, 16.5f, 6.64f)
                moveTo(14.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 14.0f)
                horizontalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 16.0f)
                horizontalLineTo(13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 15.0f)
                moveTo(22.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 14.0f)
                horizontalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 16.0f)
                horizontalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.0f, 15.0f)
                moveTo(10.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 20.0f)
                horizontalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 18.0f)
                horizontalLineTo(11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 19.0f)
                moveTo(3.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 20.0f)
                horizontalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 18.0f)
                horizontalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 19.0f)
                moveTo(12.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 12.0f)
                horizontalLineTo(17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 12.0f)
                horizontalLineTo(9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _weatherHazy!!
    }

private var _weatherHazy: ImageVector? = null
