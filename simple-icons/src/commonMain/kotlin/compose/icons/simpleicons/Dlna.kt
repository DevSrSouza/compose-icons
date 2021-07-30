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

public val SimpleIcons.Dlna: ImageVector
    get() {
        if (_dlna != null) {
            return _dlna!!
        }
        _dlna = Builder(name = "Dlna", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.255f, 12.667f)
                horizontalLineTo(13.02f)
                curveToRelative(-1.052f, 0.0f, -2.1f, 0.489f, -2.693f, 1.266f)
                verticalLineToRelative(-0.017f)
                arcToRelative(3.24f, 3.24f, 0.0f, false, true, -2.629f, 1.353f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 0.0f, -6.502f)
                curveToRelative(1.085f, 0.0f, 2.04f, 0.536f, 2.63f, 1.353f)
                verticalLineToRelative(-0.013f)
                curveToRelative(0.591f, 0.776f, 1.64f, 1.273f, 2.692f, 1.273f)
                horizontalLineToRelative(10.129f)
                curveToRelative(0.186f, -0.005f, 0.873f, -0.095f, 0.848f, -0.981f)
                curveToRelative(-0.884f, -5.086f, -5.88f, -8.987f, -11.923f, -8.987f)
                curveToRelative(-3.722f, 0.0f, -7.048f, 1.48f, -9.263f, 3.803f)
                curveToRelative(-0.356f, 0.527f, 0.014f, 0.689f, 0.35f, 0.734f)
                horizontalLineTo(9.77f)
                curveToRelative(1.05f, 0.0f, 2.1f, -0.498f, 2.692f, -1.277f)
                verticalLineToRelative(0.018f)
                arcToRelative(3.242f, 3.242f, 0.0f, false, true, 2.63f, -1.355f)
                arcToRelative(3.252f, 3.252f, 0.0f, false, true, 0.0f, 6.503f)
                arcToRelative(3.24f, 3.24f, 0.0f, false, true, -2.63f, -1.355f)
                verticalLineToRelative(0.019f)
                curveToRelative(-0.592f, -0.78f, -1.642f, -1.266f, -2.692f, -1.266f)
                horizontalLineTo(2.55f)
                lineToRelative(0.028f, 0.003f)
                reflectiveCurveToRelative(-1.068f, -0.06f, -1.719f, 0.859f)
                curveTo(0.361f, 8.9f, 0.0f, 10.62f, 0.0f, 12.002f)
                curveToRelative(0.0f, 1.388f, 0.198f, 2.65f, 0.867f, 3.923f)
                curveToRelative(0.564f, 0.908f, 1.71f, 0.85f, 1.71f, 0.85f)
                lineToRelative(-0.042f, 0.005f)
                horizontalLineToRelative(7.233f)
                curveToRelative(1.05f, 0.0f, 2.1f, -0.49f, 2.692f, -1.268f)
                verticalLineToRelative(0.02f)
                arcToRelative(3.242f, 3.242f, 0.0f, false, true, 2.63f, -1.356f)
                arcToRelative(3.251f, 3.251f, 0.0f, false, true, 0.0f, 6.502f)
                arcToRelative(3.242f, 3.242f, 0.0f, false, true, -2.63f, -1.354f)
                verticalLineToRelative(0.018f)
                curveToRelative(-0.592f, -0.779f, -1.642f, -1.277f, -2.692f, -1.277f)
                horizontalLineTo(3.164f)
                curveToRelative(-0.328f, 0.042f, -0.698f, 0.198f, -0.379f, 0.7f)
                curveToRelative(2.216f, 2.336f, 5.555f, 3.823f, 9.289f, 3.823f)
                curveToRelative(6.054f, 0.0f, 11.056f, -3.91f, 11.926f, -9.009f)
                curveToRelative(-0.004f, -0.713f, -0.489f, -0.877f, -0.745f, -0.912f)
            }
        }
        .build()
        return _dlna!!
    }

private var _dlna: ImageVector? = null
