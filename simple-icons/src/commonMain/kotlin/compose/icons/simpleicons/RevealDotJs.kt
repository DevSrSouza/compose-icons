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

public val SimpleIcons.Revealdotjs: ImageVector
    get() {
        if (_revealdotjs != null) {
            return _revealdotjs!!
        }
        _revealdotjs = Builder(name = "Revealdotjs", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.271f, 1.352f)
                arcToRelative(0.774f, 0.774f, 0.0f, false, false, -0.787f, 0.775f)
                verticalLineToRelative(19.761f)
                curveToRelative(0.0f, 0.49f, 0.45f, 0.857f, 0.93f, 0.758f)
                lineToRelative(6.676f, -1.382f)
                lineToRelative(-2.77f, -0.614f)
                lineToRelative(-3.675f, 0.762f)
                lineTo(4.645f, 2.607f)
                lineToRelative(3.101f, 0.686f)
                lineToRelative(2.777f, -0.574f)
                lineToRelative(-6.097f, -1.35f)
                arcToRelative(0.774f, 0.774f, 0.0f, false, false, -0.155f, -0.017f)
                close()
                moveTo(19.586f, 1.354f)
                lineTo(5.145f, 4.344f)
                verticalLineToRelative(15.092f)
                lineToRelative(14.43f, 3.195f)
                arcToRelative(0.774f, 0.774f, 0.0f, false, false, 0.94f, -0.758f)
                lineTo(20.515f, 2.111f)
                arcToRelative(0.773f, 0.773f, 0.0f, false, false, -0.93f, -0.757f)
                close()
                moveTo(2.984f, 4.79f)
                lineToRelative(-2.367f, 0.49f)
                arcTo(0.774f, 0.774f, 0.0f, false, false, 0.0f, 6.04f)
                verticalLineToRelative(11.639f)
                arcToRelative(0.774f, 0.774f, 0.0f, false, false, 0.607f, 0.754f)
                lineToRelative(2.377f, 0.525f)
                lineTo(2.984f, 4.791f)
                close()
                moveTo(21.018f, 5.042f)
                lineTo(21.018f, 6.23f)
                lineToRelative(1.822f, 0.405f)
                verticalLineToRelative(11.011f)
                lineToRelative(-1.822f, 0.377f)
                verticalLineToRelative(1.186f)
                lineToRelative(2.365f, -0.49f)
                arcTo(0.774f, 0.774f, 0.0f, false, false, 24.0f, 17.96f)
                lineTo(24.0f, 6.322f)
                arcToRelative(0.774f, 0.774f, 0.0f, false, false, -0.607f, -0.754f)
                lineToRelative(-2.375f, -0.525f)
                close()
            }
        }
        .build()
        return _revealdotjs!!
    }

private var _revealdotjs: ImageVector? = null
