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

public val SimpleIcons.JiraSoftware: ImageVector
    get() {
        if (_jiraSoftware != null) {
            return _jiraSoftware!!
        }
        _jiraSoftware = Builder(name = "JiraSoftware", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.004f, 0.0f)
                curveToRelative(-2.35f, 2.395f, -2.365f, 6.185f, 0.133f, 8.585f)
                lineToRelative(3.412f, 3.413f)
                lineToRelative(-3.197f, 3.198f)
                arcToRelative(6.501f, 6.501f, 0.0f, false, true, 1.412f, 7.04f)
                lineToRelative(9.566f, -9.566f)
                arcToRelative(0.95f, 0.95f, 0.0f, false, false, 0.0f, -1.344f)
                lineTo(12.004f, 0.0f)
                close()
                moveTo(10.256f, 1.74f)
                lineTo(0.67f, 11.327f)
                arcToRelative(0.95f, 0.95f, 0.0f, false, false, 0.0f, 1.344f)
                curveTo(4.45f, 16.44f, 8.22f, 20.244f, 12.0f, 24.0f)
                curveToRelative(2.295f, -2.298f, 2.395f, -6.096f, -0.08f, -8.533f)
                lineToRelative(-3.47f, -3.469f)
                lineToRelative(3.2f, -3.2f)
                curveToRelative(-1.918f, -1.955f, -2.363f, -4.725f, -1.394f, -7.057f)
                close()
            }
        }
        .build()
        return _jiraSoftware!!
    }

private var _jiraSoftware: ImageVector? = null
