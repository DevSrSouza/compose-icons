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

public val MaterialDesignIcons.MusicClefBass: ImageVector
    get() {
        if (_musicClefBass != null) {
            return _musicClefBass!!
        }
        _musicClefBass = Builder(name = "MusicClefBass", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 17.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.5f, 5.0f)
                moveTo(18.5f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 17.0f, 12.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.5f, 11.0f)
                moveTo(10.0f, 4.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 5.0f, 9.0f)
                verticalLineTo(10.0f)
                arcTo(2.0f, 2.0f, 0.0f, true, false, 7.18f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 10.0f, 6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 14.0f, 10.0f)
                curveTo(14.0f, 13.59f, 11.77f, 16.19f, 7.0f, 18.2f)
                lineTo(7.76f, 20.04f)
                curveTo(13.31f, 17.72f, 16.0f, 14.43f, 16.0f, 10.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 10.0f, 4.0f)
                close()
            }
        }
        .build()
        return _musicClefBass!!
    }

private var _musicClefBass: ImageVector? = null
