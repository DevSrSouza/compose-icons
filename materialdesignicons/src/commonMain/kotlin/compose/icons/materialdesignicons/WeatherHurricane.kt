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

public val MaterialDesignIcons.WeatherHurricane: ImageVector
    get() {
        if (_weatherHurricane != null) {
            return _weatherHurricane!!
        }
        _weatherHurricane = Builder(name = "WeatherHurricane", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 6.79f)
                curveTo(16.86f, 7.86f, 18.0f, 9.85f, 18.0f, 12.0f)
                curveTo(18.0f, 22.0f, 6.0f, 22.0f, 6.0f, 22.0f)
                curveTo(7.25f, 21.06f, 8.38f, 19.95f, 9.34f, 18.71f)
                curveTo(9.38f, 18.66f, 9.41f, 18.61f, 9.44f, 18.55f)
                curveTo(9.69f, 18.06f, 9.5f, 17.46f, 9.0f, 17.21f)
                curveTo(7.14f, 16.14f, 6.0f, 14.15f, 6.0f, 12.0f)
                curveTo(6.0f, 2.0f, 18.0f, 2.0f, 18.0f, 2.0f)
                curveTo(16.75f, 2.94f, 15.62f, 4.05f, 14.66f, 5.29f)
                curveTo(14.62f, 5.34f, 14.59f, 5.39f, 14.56f, 5.45f)
                curveTo(14.31f, 5.94f, 14.5f, 6.54f, 15.0f, 6.79f)
                moveTo(12.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return _weatherHurricane!!
    }

private var _weatherHurricane: ImageVector? = null
