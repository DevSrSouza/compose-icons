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

public val SimpleIcons.Qantas: ImageVector
    get() {
        if (_qantas != null) {
            return _qantas!!
        }
        _qantas = Builder(name = "Qantas", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 3.47f)
                lineToRelative(0.218f, 0.572f)
                curveToRelative(1.925f, 5.006f, 5.566f, 2.689f, 10.415f, 7.139f)
                lineToRelative(0.056f, 0.05f)
                curveToRelative(0.652f, 0.599f, 1.1f, 0.044f, 0.888f, -0.306f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, true, -0.165f, -0.532f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, true, 2.606f, 1.369f)
                lineToRelative(-0.06f, 0.126f)
                curveToRelative(-0.366f, 0.73f, -3.959f, 0.421f, -4.0f, 1.943f)
                arcToRelative(0.969f, 0.969f, 0.0f, false, false, 0.607f, 0.923f)
                lineToRelative(0.71f, 0.287f)
                arcToRelative(17.34f, 17.34f, 0.0f, false, true, 6.086f, 4.146f)
                arcToRelative(0.086f, 0.086f, 0.0f, false, true, -0.063f, 0.147f)
                arcToRelative(0.079f, 0.079f, 0.0f, false, true, -0.054f, -0.018f)
                arcToRelative(17.32f, 17.32f, 0.0f, false, false, -8.173f, -3.61f)
                arcToRelative(0.467f, 0.467f, 0.0f, false, true, -0.39f, -0.41f)
                curveToRelative(-0.548f, -5.089f, -5.575f, -5.434f, -7.492f, -8.705f)
                lineToRelative(5.313f, 13.94f)
                horizontalLineTo(24.0f)
                lineTo(9.979f, 6.449f)
                arcToRelative(10.022f, 10.022f, 0.0f, false, false, -7.045f, -2.98f)
                close()
            }
        }
        .build()
        return _qantas!!
    }

private var _qantas: ImageVector? = null
