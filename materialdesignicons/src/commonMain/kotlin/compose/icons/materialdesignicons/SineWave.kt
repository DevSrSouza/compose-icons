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

public val MaterialDesignIcons.SineWave: ImageVector
    get() {
        if (_sineWave != null) {
            return _sineWave!!
        }
        _sineWave = Builder(name = "SineWave", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 21.0f)
                curveTo(13.5f, 21.0f, 12.31f, 16.76f, 11.05f, 12.28f)
                curveTo(10.14f, 9.04f, 9.0f, 5.0f, 7.5f, 5.0f)
                curveTo(4.11f, 5.0f, 4.0f, 11.93f, 4.0f, 12.0f)
                horizontalLineTo(2.0f)
                curveTo(2.0f, 11.63f, 2.06f, 3.0f, 7.5f, 3.0f)
                curveTo(10.5f, 3.0f, 11.71f, 7.25f, 12.97f, 11.74f)
                curveTo(13.83f, 14.8f, 15.0f, 19.0f, 16.5f, 19.0f)
                curveTo(19.94f, 19.0f, 20.03f, 12.07f, 20.03f, 12.0f)
                horizontalLineTo(22.03f)
                curveTo(22.03f, 12.37f, 21.97f, 21.0f, 16.5f, 21.0f)
                close()
            }
        }
        .build()
        return _sineWave!!
    }

private var _sineWave: ImageVector? = null
