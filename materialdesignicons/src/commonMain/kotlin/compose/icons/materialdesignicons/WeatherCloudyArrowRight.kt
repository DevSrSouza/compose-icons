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

public val MaterialDesignIcons.WeatherCloudyArrowRight: ImageVector
    get() {
        if (_weatherCloudyArrowRight != null) {
            return _weatherCloudyArrowRight!!
        }
        _weatherCloudyArrowRight = Builder(name = "WeatherCloudyArrowRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 7.0f)
                lineTo(6.69f, 7.06f)
                curveTo(7.32f, 4.72f, 9.46f, 3.0f, 12.0f, 3.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 17.5f, 8.5f)
                lineTo(17.42f, 9.45f)
                curveTo(17.88f, 9.16f, 18.42f, 9.0f, 19.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 15.0f)
                horizontalLineTo(6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 2.0f, 11.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 6.0f, 7.0f)
                moveTo(6.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 13.0f)
                horizontalLineTo(19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 11.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(8.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.0f, 5.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 8.5f, 8.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                moveTo(22.0f, 19.0f)
                lineTo(19.0f, 22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                lineTo(22.0f, 19.0f)
            }
        }
        .build()
        return _weatherCloudyArrowRight!!
    }

private var _weatherCloudyArrowRight: ImageVector? = null
