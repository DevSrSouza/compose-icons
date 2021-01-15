package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Hilton: ImageVector
    get() {
        if (_hilton != null) {
            return _hilton!!
        }
        _hilton = Builder(name = "Hilton", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.123f, 14.234f)
                curveToRelative(0.0f, -1.544f, -1.06f, -2.788f, -2.972f, -3.386f)
                verticalLineTo(7.347f)
                horizontalLineToRelative(3.57f)
                verticalLineToRelative(8.59f)
                horizontalLineToRelative(-1.105f)
                arcToRelative(2.993f, 2.993f, 0.0f, false, false, 0.506f, -1.703f)
                moveTo(11.194f, 3.708f)
                curveTo(4.744f, 3.708f, 0.0f, 7.808f, 0.0f, 12.184f)
                curveToRelative(0.0f, 2.257f, 1.267f, 4.168f, 2.88f, 5.481f)
                lineToRelative(0.114f, -0.092f)
                arcToRelative(6.369f, 6.369f, 0.0f, false, true, -2.418f, -4.95f)
                curveTo(0.92f, 7.83f, 6.818f, 5.134f, 12.092f, 5.134f)
                curveToRelative(3.709f, 0.0f, 10.388f, 0.85f, 10.388f, 7.072f)
                curveToRelative(0.0f, 3.247f, -3.455f, 7.462f, -10.733f, 7.462f)
                curveToRelative(-3.731f, 0.0f, -6.61f, -2.004f, -6.61f, -4.86f)
                curveToRelative(0.0f, -2.487f, 1.935f, -4.26f, 4.836f, -4.26f)
                arcToRelative(7.83f, 7.83f, 0.0f, false, true, 2.12f, 0.345f)
                curveToRelative(-1.199f, -0.207f, -3.087f, 0.092f, -4.055f, 0.85f)
                verticalLineToRelative(4.192f)
                horizontalLineToRelative(3.57f)
                verticalLineToRelative(-4.743f)
                arcToRelative(4.064f, 4.064f, 0.0f, false, true, 1.543f, 0.6f)
                verticalLineToRelative(4.192f)
                horizontalLineToRelative(0.922f)
                arcToRelative(3.83f, 3.83f, 0.0f, false, true, -3.27f, 1.126f)
                verticalLineToRelative(0.184f)
                curveToRelative(3.385f, 0.276f, 4.813f, -1.336f, 4.813f, -3.156f)
                curveToRelative(0.0f, -2.118f, -2.004f, -3.362f, -4.03f, -3.639f)
                verticalLineTo(7.347f)
                horizontalLineToRelative(-3.57f)
                verticalLineToRelative(3.179f)
                curveToRelative(-2.304f, 0.46f, -4.561f, 1.842f, -4.561f, 4.1f)
                curveToRelative(0.0f, 3.501f, 4.883f, 5.666f, 9.12f, 5.666f)
                curveToRelative(6.452f, 0.0f, 11.425f, -3.109f, 11.425f, -7.508f)
                curveToRelative(0.023f, -5.299f, -7.163f, -9.076f, -12.806f, -9.076f)
                close()
            }
        }
        .build()
        return _hilton!!
    }

private var _hilton: ImageVector? = null
