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

public val SimpleIcons.Vala: ImageVector
    get() {
        if (_vala != null) {
            return _vala!!
        }
        _vala = Builder(name = "Vala", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.3836f, 23.9993f)
                lineToRelative(-0.5152f, -21.859f)
                quadToRelative(-2.2504f, 0.8435f, -3.5153f, 2.64f)
                quadToRelative(-1.2509f, 1.7971f, -1.2509f, 4.4689f)
                quadToRelative(0.0f, 0.6092f, 0.0629f, 1.0002f)
                quadToRelative(0.0776f, 0.3748f, 0.156f, 0.6092f)
                quadToRelative(0.0783f, 0.2188f, 0.1411f, 0.3438f)
                quadToRelative(0.0777f, 0.1249f, 0.0777f, 0.2188f)
                quadToRelative(-0.828f, 0.0f, -1.4682f, -0.156f)
                quadToRelative(-0.641f, -0.1723f, -1.0786f, -0.5316f)
                quadToRelative(-0.4222f, -0.3585f, -0.6565f, -0.9529f)
                quadToRelative(-0.2188f, -0.593f, -0.2188f, -1.4682f)
                quadToRelative(0.0f, -1.0624f, 0.4524f, -2.0937f)
                quadToRelative(0.4687f, -1.0306f, 1.2657f, -1.9532f)
                quadToRelative(0.8125f, -0.9211f, 1.891f, -1.7025f)
                quadToRelative(1.0942f, -0.7815f, 2.328f, -1.344f)
                quadTo(8.3044f, 0.6409f, 9.6484f, 0.3289f)
                quadTo(11.0079f, 0.0f, 12.3519f, 0.0f)
                quadToRelative(0.3593f, 0.0f, 0.6565f, 0.0155f)
                quadToRelative(0.312f, 0.0156f, 0.624f, 0.0466f)
                lineToRelative(0.2816f, 19.687f)
                lineTo(20.6481f, 0.1554f)
                horizontalLineToRelative(2.2341f)
                lineTo(13.9924f, 24.0f)
                horizontalLineTo(9.3829f)
                close()
            }
        }
        .build()
        return _vala!!
    }

private var _vala: ImageVector? = null
