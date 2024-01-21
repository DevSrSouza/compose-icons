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
                moveTo(6.488f, 7.469f)
                lineTo(0.0f, 15.05f)
                horizontalLineToRelative(11.585f)
                lineToRelative(1.301f, -3.576f)
                horizontalLineTo(7.922f)
                lineToRelative(3.033f, -3.507f)
                lineToRelative(0.01f, -0.092f)
                lineTo(8.993f, 4.48f)
                horizontalLineToRelative(8.873f)
                lineToRelative(-6.878f, 18.925f)
                horizontalLineToRelative(4.706f)
                lineTo(24.0f, 0.595f)
                horizontalLineTo(2.543f)
                lineToRelative(3.945f, 6.874f)
                close()
            }
        }
        .build()
        return _wise!!
    }

private var _wise: ImageVector? = null
