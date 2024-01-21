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

public val Octicons.Unlink24: ImageVector
    get() {
        if (_unlink24 != null) {
            return _unlink24!!
        }
        _unlink24 = Builder(name = "Unlink24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.347f, 3.653f)
                arcToRelative(3.936f, 3.936f, 0.0f, false, false, -5.567f, 0.0f)
                lineToRelative(-1.75f, 1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, -1.06f)
                lineToRelative(1.75f, -1.75f)
                arcToRelative(5.436f, 5.436f, 0.0f, false, true, 7.688f, 7.687f)
                lineToRelative(-1.564f, 1.564f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, -1.06f)
                lineToRelative(1.563f, -1.564f)
                arcToRelative(3.936f, 3.936f, 0.0f, false, false, 0.0f, -5.567f)
                close()
                moveTo(9.786f, 12.369f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.053f, 0.125f)
                curveToRelative(0.096f, 0.122f, 0.2f, 0.24f, 0.314f, 0.353f)
                curveToRelative(1.348f, 1.348f, 3.386f, 1.587f, 4.89f, 0.658f)
                lineToRelative(-3.922f, -2.858f)
                arcToRelative(0.745f, 0.745f, 0.0f, false, true, -0.057f, -0.037f)
                curveToRelative(-1.419f, -1.013f, -3.454f, -0.787f, -4.784f, 0.543f)
                lineTo(3.653f, 14.78f)
                arcToRelative(3.936f, 3.936f, 0.0f, false, false, 5.567f, 5.567f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(5.436f, 5.436f, 0.0f, true, true, -7.688f, -7.687f)
                lineToRelative(3.628f, -3.628f)
                arcToRelative(5.517f, 5.517f, 0.0f, false, true, 3.014f, -1.547f)
                lineToRelative(-7.05f, -5.136f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.883f, -1.213f)
                lineToRelative(20.25f, 14.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.884f, 1.213f)
                lineToRelative(-5.109f, -3.722f)
                curveToRelative(-2.155f, 1.709f, -5.278f, 1.425f, -7.232f, -0.53f)
                arcToRelative(5.491f, 5.491f, 0.0f, false, true, -0.431f, -0.485f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.125f, -1.053f)
                close()
            }
        }
        .build()
        return _unlink24!!
    }

private var _unlink24: ImageVector? = null
