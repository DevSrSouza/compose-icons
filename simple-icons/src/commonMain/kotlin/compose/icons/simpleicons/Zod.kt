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

public val SimpleIcons.Zod: ImageVector
    get() {
        if (_zod != null) {
            return _zod!!
        }
        _zod = Builder(name = "Zod", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.088f, 2.477f)
                lineTo(24.0f, 7.606f)
                lineTo(12.521f, 20.485f)
                lineToRelative(-0.925f, 1.038f)
                lineTo(0.0f, 7.559f)
                lineToRelative(5.108f, -5.082f)
                horizontalLineToRelative(13.98f)
                close()
                moveTo(1.654f, 7.677f)
                lineTo(8.588f, 3.674f)
                lineTo(5.601f, 3.674f)
                lineTo(1.619f, 7.636f)
                lineToRelative(0.035f, 0.041f)
                close()
                moveTo(13.771f, 3.674f)
                lineTo(3.333f, 9.7f)
                lineToRelative(2.149f, 2.588f)
                lineToRelative(10.809f, -6.241f)
                lineToRelative(-0.2f, -0.346f)
                lineToRelative(2.851f, -1.646f)
                lineToRelative(-0.365f, -0.381f)
                horizontalLineToRelative(-4.806f)
                close()
                moveTo(21.291f, 6.508f)
                lineTo(8.257f, 14.034f)
                horizontalLineToRelative(5.101f)
                verticalLineToRelative(-0.4f)
                horizontalLineToRelative(3.667f)
                lineToRelative(5.346f, -5.998f)
                lineToRelative(-1.08f, -1.128f)
                close()
                moveTo(14.162f, 16.846f)
                lineTo(9.268f, 16.846f)
                lineToRelative(2.36f, 2.843f)
                lineToRelative(2.534f, -2.843f)
                close()
            }
        }
        .build()
        return _zod!!
    }

private var _zod: ImageVector? = null
