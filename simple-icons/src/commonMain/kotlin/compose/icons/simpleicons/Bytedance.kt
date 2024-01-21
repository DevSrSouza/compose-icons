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

public val SimpleIcons.Bytedance: ImageVector
    get() {
        if (_bytedance != null) {
            return _bytedance!!
        }
        _bytedance = Builder(name = "Bytedance", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.8772f, 1.4685f)
                lineTo(24.0f, 2.5326f)
                verticalLineToRelative(18.9426f)
                lineToRelative(-4.1228f, 1.0563f)
                lineTo(19.8772f, 1.4685f)
                close()
                moveTo(6.5291f, 10.8965f)
                lineToRelative(4.115f, 1.0641f)
                verticalLineToRelative(8.9786f)
                lineToRelative(-4.115f, 1.0642f)
                verticalLineToRelative(-11.107f)
                close()
                moveTo(0.0f, 2.572f)
                lineToRelative(4.115f, 1.0642f)
                verticalLineToRelative(16.7354f)
                lineTo(0.0f, 21.428f)
                lineTo(0.0f, 2.572f)
                close()
                moveTo(17.4553f, 8.1925f)
                verticalLineToRelative(11.107f)
                lineToRelative(-4.1228f, -1.0642f)
                lineTo(13.3325f, 9.2568f)
                lineToRelative(4.1228f, -1.0642f)
                close()
            }
        }
        .build()
        return _bytedance!!
    }

private var _bytedance: ImageVector? = null
