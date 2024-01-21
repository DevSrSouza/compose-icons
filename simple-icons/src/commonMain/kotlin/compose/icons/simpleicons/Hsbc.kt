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

public val SimpleIcons.Hsbc: ImageVector
    get() {
        if (_hsbc != null) {
            return _hsbc!!
        }
        _hsbc = Builder(name = "Hsbc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.007f)
                lineToRelative(-5.996f, 5.997f)
                lineTo(18.004f, 5.996f)
                lineTo(24.0f, 12.007f)
                close()
                moveTo(18.004f, 5.997f)
                lineTo(6.01f, 5.997f)
                lineToRelative(5.996f, 6.01f)
                lineToRelative(5.997f, -6.01f)
                close()
                moveTo(0.0f, 12.006f)
                lineToRelative(6.01f, 5.997f)
                lineTo(6.01f, 5.996f)
                lineTo(0.0f, 12.007f)
                close()
                moveTo(6.01f, 18.003f)
                horizontalLineToRelative(11.994f)
                lineToRelative(-5.997f, -5.997f)
                lineToRelative(-5.996f, 5.997f)
                close()
            }
        }
        .build()
        return _hsbc!!
    }

private var _hsbc: ImageVector? = null
