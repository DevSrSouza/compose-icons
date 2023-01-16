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

public val MaterialDesignIcons.WeatherWindyVariant: ImageVector
    get() {
        if (_weatherWindyVariant != null) {
            return _weatherWindyVariant!!
        }
        _weatherWindyVariant = Builder(name = "WeatherWindyVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 6.0f)
                lineTo(6.69f, 6.06f)
                curveTo(7.32f, 3.72f, 9.46f, 2.0f, 12.0f, 2.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 17.5f, 7.5f)
                lineTo(17.42f, 8.45f)
                curveTo(17.88f, 8.16f, 18.42f, 8.0f, 19.0f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 22.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 14.0f)
                horizontalLineTo(6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 2.0f, 10.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 6.0f, 6.0f)
                moveTo(6.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 12.0f)
                horizontalLineTo(19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 10.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(7.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.0f, 4.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 8.5f, 7.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.0f)
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
        return _weatherWindyVariant!!
    }

private var _weatherWindyVariant: ImageVector? = null
