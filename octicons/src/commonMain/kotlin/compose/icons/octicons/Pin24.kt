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
                moveTo(7.886f, 1.553f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 2.869f, 0.604f)
                lineToRelative(0.633f, 1.629f)
                arcToRelative(5.667f, 5.667f, 0.0f, false, false, 3.725f, 3.395f)
                lineToRelative(3.959f, 1.131f)
                arcToRelative(1.749f, 1.749f, 0.0f, false, true, 0.757f, 2.92f)
                lineTo(16.06f, 15.0f)
                lineToRelative(5.594f, 5.595f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.326f, 1.275f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.734f, -0.215f)
                lineTo(15.0f, 16.061f)
                lineToRelative(-3.768f, 3.768f)
                arcToRelative(1.749f, 1.749f, 0.0f, false, true, -2.92f, -0.757f)
                lineToRelative(-1.131f, -3.96f)
                arcToRelative(5.665f, 5.665f, 0.0f, false, false, -3.395f, -3.724f)
                lineToRelative(-1.63f, -0.633f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -0.603f, -2.869f)
                close()
                moveTo(14.475f, 14.465f)
                lineTo(18.768f, 10.171f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.108f, -0.417f)
                lineTo(14.7f, 8.623f)
                arcTo(7.165f, 7.165f, 0.0f, false, true, 9.99f, 4.33f)
                lineTo(9.357f, 2.7f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.41f, -0.086f)
                lineTo(2.614f, 8.946f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.086f, 0.41f)
                lineToRelative(1.63f, 0.634f)
                arcToRelative(7.167f, 7.167f, 0.0f, false, true, 4.294f, 4.71f)
                lineToRelative(1.13f, 3.96f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.417f, 0.108f)
                lineToRelative(4.294f, -4.293f)
                close()
            }
        }
        .build()
        return _pin24!!
    }

private var _pin24: ImageVector? = null
