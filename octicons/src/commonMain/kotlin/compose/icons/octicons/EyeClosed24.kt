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

public val Octicons.EyeClosed24: ImageVector
    get() {
        if (_eyeClosed24 != null) {
            return _eyeClosed24!!
        }
        _eyeClosed24 = Builder(name = "EyeClosed24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.052f, 5.837f)
                arcTo(9.715f, 9.715f, 0.0f, false, true, 12.0f, 5.0f)
                curveToRelative(2.955f, 0.0f, 5.309f, 1.315f, 7.06f, 2.864f)
                curveToRelative(1.756f, 1.553f, 2.866f, 3.307f, 3.307f, 4.08f)
                arcToRelative(0.11f, 0.11f, 0.0f, false, true, 0.016f, 0.055f)
                arcToRelative(0.122f, 0.122f, 0.0f, false, true, -0.017f, 0.06f)
                arcToRelative(16.766f, 16.766f, 0.0f, false, true, -1.53f, 2.218f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.163f, 0.946f)
                arcToRelative(18.253f, 18.253f, 0.0f, false, false, 1.67f, -2.42f)
                arcToRelative(1.607f, 1.607f, 0.0f, false, false, 0.001f, -1.602f)
                curveToRelative(-0.485f, -0.85f, -1.69f, -2.757f, -3.616f, -4.46f)
                curveTo(18.124f, 5.034f, 15.432f, 3.5f, 12.0f, 3.5f)
                curveToRelative(-1.695f, 0.0f, -3.215f, 0.374f, -4.552f, 0.963f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.604f, 1.373f)
                close()
                moveTo(19.166f, 17.987f)
                curveTo(17.328f, 19.38f, 14.933f, 20.5f, 12.0f, 20.5f)
                curveToRelative(-3.432f, 0.0f, -6.125f, -1.534f, -8.054f, -3.24f)
                curveTo(2.02f, 15.556f, 0.814f, 13.648f, 0.33f, 12.798f)
                arcToRelative(1.606f, 1.606f, 0.0f, false, true, 0.001f, -1.6f)
                arcTo(18.283f, 18.283f, 0.0f, false, true, 3.648f, 7.01f)
                lineTo(1.317f, 5.362f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.866f, -1.224f)
                lineToRelative(20.5f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.866f, 1.224f)
                close()
                moveTo(4.902f, 7.898f)
                curveToRelative(-1.73f, 1.541f, -2.828f, 3.273f, -3.268f, 4.044f)
                arcToRelative(0.112f, 0.112f, 0.0f, false, false, -0.017f, 0.059f)
                curveToRelative(0.0f, 0.015f, 0.003f, 0.034f, 0.016f, 0.055f)
                curveToRelative(0.441f, 0.774f, 1.551f, 2.527f, 3.307f, 4.08f)
                curveTo(6.69f, 17.685f, 9.045f, 19.0f, 12.0f, 19.0f)
                curveToRelative(2.334f, 0.0f, 4.29f, -0.82f, 5.874f, -1.927f)
                lineToRelative(-3.516f, -2.487f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -5.583f, -3.949f)
                lineTo(4.902f, 7.899f)
                close()
            }
        }
        .build()
        return _eyeClosed24!!
    }

private var _eyeClosed24: ImageVector? = null
