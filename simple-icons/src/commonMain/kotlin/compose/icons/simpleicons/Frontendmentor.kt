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

public val SimpleIcons.Frontendmentor: ImageVector
    get() {
        if (_frontendmentor != null) {
            return _frontendmentor!!
        }
        _frontendmentor = Builder(name = "Frontendmentor", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.1706f, 1.2719f)
                arcToRelative(0.732f, 0.732f, 0.0f, false, false, -0.7186f, 0.732f)
                verticalLineToRelative(13.914f)
                arcToRelative(0.732f, 0.732f, 0.0f, false, false, 0.732f, 0.732f)
                arcToRelative(0.732f, 0.732f, 0.0f, false, false, 0.7318f, -0.732f)
                lineTo(12.9158f, 2.004f)
                arcToRelative(0.732f, 0.732f, 0.0f, false, false, -0.7452f, -0.732f)
                close()
                moveTo(23.2447f, 5.4404f)
                arcToRelative(0.7339f, 0.7339f, 0.0f, false, false, -0.2764f, 0.063f)
                lineTo(16.686f, 8.307f)
                arcToRelative(0.7329f, 0.7329f, 0.0f, false, false, 0.0f, 1.3361f)
                lineToRelative(6.2823f, 2.8134f)
                arcToRelative(0.7378f, 0.7378f, 0.0f, false, false, 0.2993f, 0.0648f)
                arcToRelative(0.732f, 0.732f, 0.0f, false, false, 0.2973f, -1.401f)
                lineToRelative(-4.786f, -2.1443f)
                lineToRelative(4.786f, -2.1366f)
                arcToRelative(0.7339f, 0.7339f, 0.0f, false, false, 0.3698f, -0.9664f)
                arcToRelative(0.7339f, 0.7339f, 0.0f, false, false, -0.69f, -0.4327f)
                close()
                moveTo(0.7457f, 10.4724f)
                arcToRelative(0.7316f, 0.7316f, 0.0f, false, false, -0.7223f, 0.9149f)
                curveToRelative(1.736f, 6.677f, 7.7748f, 11.341f, 14.6822f, 11.341f)
                arcToRelative(0.732f, 0.732f, 0.0f, false, false, 0.0f, -1.464f)
                arcToRelative(13.7055f, 13.7055f, 0.0f, false, true, -13.266f, -10.2449f)
                arcToRelative(0.7316f, 0.7316f, 0.0f, false, false, -0.6939f, -0.547f)
                close()
            }
        }
        .build()
        return _frontendmentor!!
    }

private var _frontendmentor: ImageVector? = null
