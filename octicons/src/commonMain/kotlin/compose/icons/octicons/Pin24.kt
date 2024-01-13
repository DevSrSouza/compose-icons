package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Pin24: ImageVector
    get() {
        if (_pin24 != null) {
            return _pin24!!
        }
        _pin24 = Builder(name = "Pin24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.114f, 1.553f)
                lineToRelative(6.333f, 6.333f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -0.603f, 2.869f)
                lineToRelative(-1.63f, 0.633f)
                arcToRelative(5.67f, 5.67f, 0.0f, false, false, -3.395f, 3.725f)
                lineToRelative(-1.131f, 3.959f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -2.92f, 0.757f)
                lineTo(9.0f, 16.061f)
                lineToRelative(-5.595f, 5.594f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, -1.06f, -1.06f)
                lineTo(7.939f, 15.0f)
                lineToRelative(-3.768f, -3.768f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.757f, -2.92f)
                lineToRelative(3.959f, -1.131f)
                arcToRelative(5.666f, 5.666f, 0.0f, false, false, 3.725f, -3.395f)
                lineToRelative(0.633f, -1.63f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 2.869f, -0.603f)
                close()
                moveTo(5.232f, 10.171f)
                lineToRelative(8.597f, 8.597f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.417f, -0.108f)
                lineToRelative(1.131f, -3.959f)
                arcTo(7.17f, 7.17f, 0.0f, false, true, 19.67f, 9.99f)
                lineToRelative(1.63f, -0.634f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.086f, -0.409f)
                lineToRelative(-6.333f, -6.333f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.409f, 0.086f)
                lineToRelative(-0.634f, 1.63f)
                arcToRelative(7.17f, 7.17f, 0.0f, false, true, -4.711f, 4.293f)
                lineTo(5.34f, 9.754f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.108f, 0.417f)
                close()
            }
        }
        .build()
        return _pin24!!
    }

private var _pin24: ImageVector? = null
