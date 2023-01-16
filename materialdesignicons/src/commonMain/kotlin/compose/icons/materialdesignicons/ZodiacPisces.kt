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

public val MaterialDesignIcons.ZodiacPisces: ImageVector
    get() {
        if (_zodiacPisces != null) {
            return _zodiacPisces!!
        }
        _zodiacPisces = Builder(name = "ZodiacPisces", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 11.0f)
                horizontalLineTo(18.0f)
                curveTo(18.11f, 8.19f, 18.73f, 5.42f, 19.81f, 2.82f)
                lineTo(18.0f, 2.06f)
                curveTo(16.81f, 4.9f, 16.13f, 7.92f, 16.0f, 11.0f)
                horizontalLineTo(8.0f)
                curveTo(7.87f, 7.92f, 7.19f, 4.9f, 6.0f, 2.06f)
                lineTo(4.14f, 2.82f)
                curveTo(5.24f, 5.41f, 5.87f, 8.18f, 6.0f, 11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                curveTo(5.89f, 15.81f, 5.27f, 18.58f, 4.19f, 21.18f)
                lineTo(6.0f, 21.94f)
                curveTo(7.19f, 19.1f, 7.87f, 16.08f, 8.0f, 13.0f)
                horizontalLineTo(16.0f)
                curveTo(16.13f, 16.08f, 16.81f, 19.1f, 18.0f, 21.94f)
                lineTo(19.86f, 21.18f)
                curveTo(18.76f, 18.59f, 18.13f, 15.82f, 18.0f, 13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _zodiacPisces!!
    }

private var _zodiacPisces: ImageVector? = null
