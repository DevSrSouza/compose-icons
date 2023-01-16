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

public val MaterialDesignIcons.WeatherFog: ImageVector
    get() {
        if (_weatherFog != null) {
            return _weatherFog!!
        }
        _weatherFog = Builder(name = "WeatherFog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 15.0f)
                horizontalLineTo(13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 17.0f)
                horizontalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 15.0f)
                moveTo(16.0f, 15.0f)
                horizontalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 22.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 17.0f)
                horizontalLineTo(16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 15.0f)
                moveTo(1.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 6.0f, 7.0f)
                curveTo(7.0f, 4.65f, 9.3f, 3.0f, 12.0f, 3.0f)
                curveTo(15.43f, 3.0f, 18.24f, 5.66f, 18.5f, 9.03f)
                lineTo(19.0f, 9.0f)
                curveTo(21.19f, 9.0f, 22.97f, 10.76f, 23.0f, 13.0f)
                horizontalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 5.0f)
                curveTo(9.5f, 5.0f, 7.45f, 6.82f, 7.06f, 9.19f)
                curveTo(6.73f, 9.07f, 6.37f, 9.0f, 6.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.0f, 12.0f)
                curveTo(3.0f, 12.35f, 3.06f, 12.69f, 3.17f, 13.0f)
                horizontalLineTo(1.1f)
                lineTo(1.0f, 12.0f)
                moveTo(3.0f, 19.0f)
                horizontalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 21.0f)
                horizontalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 19.0f)
                moveTo(8.0f, 19.0f)
                horizontalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 22.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 21.0f)
                horizontalLineTo(8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 19.0f)
                close()
            }
        }
        .build()
        return _weatherFog!!
    }

private var _weatherFog: ImageVector? = null
