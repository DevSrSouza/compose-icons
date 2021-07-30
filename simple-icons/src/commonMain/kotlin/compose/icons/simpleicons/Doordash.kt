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

public val SimpleIcons.Doordash: ImageVector
    get() {
        if (_doordash != null) {
            return _doordash!!
        }
        _doordash = Builder(name = "Doordash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.071f, 8.409f)
                arcToRelative(6.09f, 6.09f, 0.0f, false, false, -5.396f, -3.228f)
                horizontalLineTo(0.584f)
                arcTo(0.589f, 0.589f, 0.0f, false, false, 0.17f, 6.184f)
                lineTo(3.894f, 9.93f)
                arcToRelative(1.752f, 1.752f, 0.0f, false, false, 1.242f, 0.516f)
                horizontalLineToRelative(12.049f)
                arcToRelative(1.554f, 1.554f, 0.0f, true, true, 0.031f, 3.108f)
                horizontalLineTo(8.91f)
                arcToRelative(0.589f, 0.589f, 0.0f, false, false, -0.415f, 1.003f)
                lineToRelative(3.725f, 3.747f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 1.242f, 0.516f)
                horizontalLineToRelative(3.757f)
                curveToRelative(4.887f, 0.0f, 8.584f, -5.225f, 5.852f, -10.413f)
            }
        }
        .build()
        return _doordash!!
    }

private var _doordash: ImageVector? = null
