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

public val SimpleIcons.Googlecloud: ImageVector
    get() {
        if (_googlecloud != null) {
            return _googlecloud!!
        }
        _googlecloud = Builder(name = "Googlecloud", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.19f, 2.38f)
                arcToRelative(9.344f, 9.344f, 0.0f, false, false, -9.234f, 6.893f)
                curveToRelative(0.053f, -0.02f, -0.055f, 0.013f, 0.0f, 0.0f)
                curveToRelative(-3.875f, 2.551f, -3.922f, 8.11f, -0.247f, 10.941f)
                lineToRelative(0.006f, -0.007f)
                lineToRelative(-0.007f, 0.03f)
                arcToRelative(6.717f, 6.717f, 0.0f, false, false, 4.077f, 1.356f)
                horizontalLineToRelative(5.173f)
                lineToRelative(0.03f, 0.03f)
                horizontalLineToRelative(5.192f)
                curveToRelative(6.687f, 0.053f, 9.376f, -8.605f, 3.835f, -12.35f)
                arcToRelative(9.365f, 9.365f, 0.0f, false, false, -2.821f, -4.552f)
                lineToRelative(-0.043f, 0.043f)
                lineToRelative(0.006f, -0.05f)
                arcTo(9.344f, 9.344f, 0.0f, false, false, 12.19f, 2.38f)
                close()
                moveTo(11.832f, 6.526f)
                curveToRelative(1.244f, -0.04f, 2.518f, 0.368f, 3.486f, 1.15f)
                arcToRelative(5.186f, 5.186f, 0.0f, false, true, 1.862f, 4.078f)
                verticalLineToRelative(0.518f)
                curveToRelative(3.53f, -0.07f, 3.53f, 5.262f, 0.0f, 5.193f)
                horizontalLineToRelative(-5.193f)
                lineToRelative(-0.008f, 0.009f)
                verticalLineToRelative(-0.04f)
                lineTo(6.785f, 17.434f)
                arcToRelative(2.59f, 2.59f, 0.0f, false, true, -1.067f, -0.23f)
                horizontalLineToRelative(0.001f)
                arcToRelative(2.597f, 2.597f, 0.0f, true, true, 3.437f, -3.437f)
                lineToRelative(3.013f, -3.012f)
                arcTo(6.747f, 6.747f, 0.0f, false, false, 8.11f, 8.24f)
                curveToRelative(0.018f, -0.01f, 0.04f, -0.026f, 0.054f, -0.023f)
                arcToRelative(5.186f, 5.186f, 0.0f, false, true, 3.67f, -1.69f)
                close()
            }
        }
        .build()
        return _googlecloud!!
    }

private var _googlecloud: ImageVector? = null
