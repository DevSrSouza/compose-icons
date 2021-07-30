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

public val SimpleIcons.Pinboard: ImageVector
    get() {
        if (_pinboard != null) {
            return _pinboard!!
        }
        _pinboard = Builder(name = "Pinboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.352f, 14.585f)
                lineToRelative(-4.509f, 4.614f)
                lineToRelative(0.72f, -4.062f)
                lineTo(3.428f, 7.57f)
                lineTo(0.0f, 7.753f)
                lineTo(7.58f, 0.0f)
                verticalLineToRelative(2.953f)
                lineToRelative(7.214f, 6.646f)
                lineToRelative(4.513f, -1.105f)
                lineToRelative(-4.689f, 4.982f)
                lineTo(24.0f, 24.0f)
                lineToRelative(-10.648f, -9.415f)
                close()
            }
        }
        .build()
        return _pinboard!!
    }

private var _pinboard: ImageVector? = null
