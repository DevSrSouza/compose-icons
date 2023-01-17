package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Wise: ImageVector
    get() {
        if (_wise != null) {
            return _wise!!
        }
        _wise = Builder(name = "Wise", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.6426f, 0.0f)
                lineToRelative(3.7383f, 6.3594f)
                lineToRelative(-6.6602f, 6.3613f)
                horizontalLineTo(12.043f)
                lineToRelative(1.1816f, -2.7734f)
                horizontalLineTo(7.4883f)
                lineToRelative(3.5879f, -3.588f)
                lineToRelative(-2.084f, -3.5878f)
                horizontalLineToRelative(9.7324f)
                lineTo(9.7441f, 24.0f)
                horizontalLineToRelative(3.373f)
                lineTo(23.2794f, 0.0f)
                close()
            }
        }
        .build()
        return _wise!!
    }

private var _wise: ImageVector? = null
