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

public val MaterialDesignIcons.GlassFlute: ImageVector
    get() {
        if (_glassFlute != null) {
            return _glassFlute!!
        }
        _glassFlute = Builder(name = "GlassFlute", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 2.0f)
                horizontalLineTo(16.0f)
                curveTo(15.67f, 5.0f, 15.33f, 8.0f, 14.75f, 9.83f)
                curveTo(14.17f, 11.67f, 13.33f, 12.33f, 12.92f, 14.08f)
                curveTo(12.5f, 15.83f, 12.5f, 18.67f, 13.08f, 20.0f)
                curveTo(13.67f, 21.33f, 14.83f, 21.17f, 15.42f, 21.25f)
                curveTo(16.0f, 21.33f, 16.0f, 21.67f, 16.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(8.0f, 21.67f, 8.0f, 21.33f, 8.58f, 21.25f)
                curveTo(9.17f, 21.17f, 10.33f, 21.33f, 10.92f, 20.0f)
                curveTo(11.5f, 18.67f, 11.5f, 15.83f, 11.08f, 14.08f)
                curveTo(10.67f, 12.33f, 9.83f, 11.67f, 9.25f, 9.83f)
                curveTo(8.67f, 8.0f, 8.33f, 5.0f, 8.0f, 2.0f)
                moveTo(10.0f, 4.0f)
                curveTo(10.07f, 5.03f, 10.15f, 6.07f, 10.24f, 7.0f)
                horizontalLineTo(13.76f)
                curveTo(13.85f, 6.07f, 13.93f, 5.03f, 14.0f, 4.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _glassFlute!!
    }

private var _glassFlute: ImageVector? = null
