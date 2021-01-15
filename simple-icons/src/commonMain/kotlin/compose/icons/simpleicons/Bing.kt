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

public val SimpleIcons.Bing: ImageVector
    get() {
        if (_bing != null) {
            return _bing!!
        }
        _bing = Builder(name = "Bing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.605f, 0.0f)
                lineTo(8.4f, 1.686f)
                verticalLineTo(18.56f)
                lineToRelative(6.753f, -3.895f)
                lineToRelative(-3.31f, -1.555f)
                lineToRelative(-2.09f, -5.2f)
                lineToRelative(10.64f, 3.738f)
                verticalLineToRelative(5.435f)
                lineTo(8.403f, 24.0f)
                lineToRelative(-4.797f, -2.67f)
                verticalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _bing!!
    }

private var _bing: ImageVector? = null
