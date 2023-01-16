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

public val MaterialDesignIcons.WeatherWindy: ImageVector
    get() {
        if (_weatherWindy != null) {
            return _weatherWindy!!
        }
        _weatherWindy = Builder(name = "WeatherWindy", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 8.0f)
                horizontalLineTo(12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 4.0f)
                curveTo(11.45f, 4.0f, 10.95f, 4.22f, 10.59f, 4.59f)
                curveTo(10.2f, 5.0f, 9.56f, 5.0f, 9.17f, 4.59f)
                curveTo(8.78f, 4.2f, 8.78f, 3.56f, 9.17f, 3.17f)
                curveTo(9.9f, 2.45f, 10.9f, 2.0f, 12.0f, 2.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 10.0f)
                horizontalLineTo(4.0f)
                moveTo(19.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 10.0f)
                curveTo(18.72f, 10.0f, 18.47f, 10.11f, 18.29f, 10.29f)
                curveTo(17.9f, 10.68f, 17.27f, 10.68f, 16.88f, 10.29f)
                curveTo(16.5f, 9.9f, 16.5f, 9.27f, 16.88f, 8.88f)
                curveTo(17.42f, 8.34f, 18.17f, 8.0f, 19.0f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 22.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 14.0f)
                horizontalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 12.0f)
                horizontalLineTo(19.0f)
                moveTo(18.0f, 18.0f)
                horizontalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 16.0f)
                horizontalLineTo(18.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 21.0f, 19.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 18.0f, 22.0f)
                curveTo(17.17f, 22.0f, 16.42f, 21.66f, 15.88f, 21.12f)
                curveTo(15.5f, 20.73f, 15.5f, 20.1f, 15.88f, 19.71f)
                curveTo(16.27f, 19.32f, 16.9f, 19.32f, 17.29f, 19.71f)
                curveTo(17.47f, 19.89f, 17.72f, 20.0f, 18.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 18.0f)
                close()
            }
        }
        .build()
        return _weatherWindy!!
    }

private var _weatherWindy: ImageVector? = null
