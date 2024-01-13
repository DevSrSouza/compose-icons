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

public val Octicons.Paperclip16: ImageVector
    get() {
        if (_paperclip16 != null) {
            return _paperclip16!!
        }
        _paperclip16 = Builder(name = "Paperclip16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.212f, 3.02f)
                arcToRelative(1.753f, 1.753f, 0.0f, false, false, -2.478f, 0.003f)
                lineToRelative(-5.83f, 5.83f)
                arcToRelative(3.007f, 3.007f, 0.0f, false, false, -0.88f, 2.127f)
                curveToRelative(0.0f, 0.795f, 0.315f, 1.551f, 0.88f, 2.116f)
                curveToRelative(0.567f, 0.567f, 1.333f, 0.89f, 2.126f, 0.89f)
                curveToRelative(0.79f, 0.0f, 1.548f, -0.321f, 2.116f, -0.89f)
                lineToRelative(5.48f, -5.48f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.061f, 1.06f)
                lineToRelative(-5.48f, 5.48f)
                arcToRelative(4.492f, 4.492f, 0.0f, false, true, -3.177f, 1.33f)
                curveToRelative(-1.2f, 0.0f, -2.345f, -0.487f, -3.187f, -1.33f)
                arcToRelative(4.483f, 4.483f, 0.0f, false, true, -1.32f, -3.177f)
                curveToRelative(0.0f, -1.195f, 0.475f, -2.341f, 1.32f, -3.186f)
                lineToRelative(5.83f, -5.83f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 5.553f, 2.297f)
                curveToRelative(0.0f, 0.863f, -0.343f, 1.691f, -0.953f, 2.301f)
                lineTo(7.439f, 12.39f)
                curveToRelative(-0.375f, 0.377f, -0.884f, 0.59f, -1.416f, 0.593f)
                arcToRelative(1.998f, 1.998f, 0.0f, false, true, -1.412f, -0.593f)
                arcToRelative(1.992f, 1.992f, 0.0f, false, true, 0.0f, -2.828f)
                lineToRelative(5.48f, -5.48f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 1.042f, 0.018f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 0.018f, 1.042f)
                lineToRelative(-5.48f, 5.48f)
                arcToRelative(0.492f, 0.492f, 0.0f, false, false, 0.0f, 0.707f)
                arcToRelative(0.499f, 0.499f, 0.0f, false, false, 0.352f, 0.154f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, false, 0.356f, -0.154f)
                lineToRelative(5.833f, -5.827f)
                arcToRelative(1.755f, 1.755f, 0.0f, false, false, 0.0f, -2.481f)
                close()
            }
        }
        .build()
        return _paperclip16!!
    }

private var _paperclip16: ImageVector? = null
