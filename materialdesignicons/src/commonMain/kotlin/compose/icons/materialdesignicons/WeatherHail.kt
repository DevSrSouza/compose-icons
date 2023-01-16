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

public val MaterialDesignIcons.WeatherHail: ImageVector
    get() {
        if (_weatherHail != null) {
            return _weatherHail!!
        }
        _weatherHail = Builder(name = "WeatherHail", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 16.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 1.0f, 11.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 6.0f, 6.0f)
                curveTo(7.0f, 3.65f, 9.3f, 2.0f, 12.0f, 2.0f)
                curveTo(15.43f, 2.0f, 18.24f, 4.66f, 18.5f, 8.03f)
                lineTo(19.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 23.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 19.0f, 16.0f)
                horizontalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 14.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 4.0f)
                curveTo(9.5f, 4.0f, 7.45f, 5.82f, 7.06f, 8.19f)
                curveTo(6.73f, 8.07f, 6.37f, 8.0f, 6.0f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.0f, 14.0f)
                moveTo(10.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 18.0f)
                moveTo(14.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 19.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 16.0f)
                moveTo(10.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 12.0f)
                close()
            }
        }
        .build()
        return _weatherHail!!
    }

private var _weatherHail: ImageVector? = null
