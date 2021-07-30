package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Undo: ImageVector
    get() {
        if (_undo != null) {
            return _undo!!
        }
        _undo = Builder(name = "Undo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.3393f, 4.4678f)
                horizontalLineTo(7.3393f)
                verticalLineTo(7.0249f)
                curveTo(8.5293f, 6.0898f, 10.0299f, 5.5321f, 11.6607f, 5.5321f)
                curveTo(15.5267f, 5.5321f, 18.6607f, 8.6661f, 18.6607f, 12.5321f)
                curveTo(18.6607f, 16.3981f, 15.5267f, 19.5321f, 11.6607f, 19.5321f)
                curveTo(9.5103f, 19.5321f, 7.5862f, 18.5623f, 6.3022f, 17.0363f)
                lineTo(7.9215f, 15.8515f)
                curveTo(8.8374f, 16.8825f, 10.1732f, 17.5321f, 11.6607f, 17.5321f)
                curveTo(14.4222f, 17.5321f, 16.6607f, 15.2935f, 16.6607f, 12.5321f)
                curveTo(16.6607f, 9.7706f, 14.4222f, 7.5321f, 11.6607f, 7.5321f)
                curveTo(10.5739f, 7.5321f, 9.5681f, 7.8788f, 8.7478f, 8.4678f)
                lineTo(11.3393f, 8.4678f)
                verticalLineTo(10.4678f)
                horizontalLineTo(5.3393f)
                verticalLineTo(4.4678f)
                close()
            }
        }
        .build()
        return _undo!!
    }

private var _undo: ImageVector? = null
