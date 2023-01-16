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

public val MaterialDesignIcons.Radar: ImageVector
    get() {
        if (_radar != null) {
            return _radar!!
        }
        _radar = Builder(name = "Radar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.07f, 4.93f)
                lineTo(17.66f, 6.34f)
                curveTo(19.1f, 7.79f, 20.0f, 9.79f, 20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 4.0f, 12.0f)
                curveTo(4.0f, 7.92f, 7.05f, 4.56f, 11.0f, 4.07f)
                verticalLineTo(6.09f)
                curveTo(8.16f, 6.57f, 6.0f, 9.03f, 6.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 12.0f, 18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 18.0f, 12.0f)
                curveTo(18.0f, 10.34f, 17.33f, 8.84f, 16.24f, 7.76f)
                lineTo(14.83f, 9.17f)
                curveTo(15.55f, 9.9f, 16.0f, 10.9f, 16.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 12.0f)
                curveTo(8.0f, 10.14f, 9.28f, 8.59f, 11.0f, 8.14f)
                verticalLineTo(10.28f)
                curveTo(10.4f, 10.63f, 10.0f, 11.26f, 10.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 12.0f)
                curveTo(14.0f, 11.26f, 13.6f, 10.62f, 13.0f, 10.28f)
                verticalLineTo(2.0f)
                horizontalLineTo(12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                curveTo(22.0f, 9.24f, 20.88f, 6.74f, 19.07f, 4.93f)
                close()
            }
        }
        .build()
        return _radar!!
    }

private var _radar: ImageVector? = null
