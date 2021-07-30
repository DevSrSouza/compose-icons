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

public val SimpleIcons.Vfairs: ImageVector
    get() {
        if (_vfairs != null) {
            return _vfairs!!
        }
        _vfairs = Builder(name = "Vfairs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.316f, 5.923f)
                curveToRelative(-0.01f, -0.014f, -0.027f, -0.024f, -0.04f, -0.035f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, false, -0.06f, -0.047f)
                lineTo(12.223f, 0.061f)
                arcToRelative(0.427f, 0.427f, 0.0f, false, false, -0.08f, -0.033f)
                curveTo(12.128f, 0.02f, 12.113f, 0.02f, 12.1f, 0.015f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.325f, 0.046f)
                lineToRelative(-9.992f, 5.78f)
                arcToRelative(0.418f, 0.418f, 0.0f, false, false, -0.143f, 0.141f)
                curveToRelative(-0.015f, 0.014f, -0.02f, 0.034f, -0.028f, 0.05f)
                arcToRelative(0.423f, 0.423f, 0.0f, false, false, -0.048f, 0.191f)
                verticalLineToRelative(11.56f)
                arcToRelative(0.418f, 0.418f, 0.0f, false, false, 0.007f, 0.05f)
                curveToRelative(0.007f, 0.14f, 0.088f, 0.266f, 0.212f, 0.331f)
                lineToRelative(9.992f, 5.78f)
                arcToRelative(0.555f, 0.555f, 0.0f, false, false, 0.487f, 0.0f)
                lineToRelative(9.888f, -5.756f)
                arcToRelative(0.437f, 0.437f, 0.0f, false, false, 0.284f, -0.406f)
                lineTo(22.434f, 6.223f)
                arcToRelative(0.408f, 0.408f, 0.0f, false, false, -0.119f, -0.3f)
                close()
                moveTo(2.45f, 17.015f)
                lineTo(2.45f, 6.99f)
                lineToRelative(8.665f, 5.012f)
                lineToRelative(-8.665f, 5.012f)
                close()
                moveTo(12.902f, 11.992f)
                lineToRelative(8.648f, -5.001f)
                verticalLineToRelative(10.024f)
                curveToRelative(-2.905f, -1.676f, -5.634f, -3.268f, -8.648f, -5.023f)
                close()
                moveTo(12.442f, 11.235f)
                lineTo(12.442f, 1.211f)
                lineToRelative(8.666f, 5.012f)
                close()
                moveTo(11.557f, 11.235f)
                lineTo(2.891f, 6.223f)
                lineToRelative(8.666f, -5.012f)
                close()
                moveTo(11.557f, 12.77f)
                verticalLineToRelative(10.024f)
                lineToRelative(-8.665f, -5.012f)
                close()
                moveTo(12.482f, 12.793f)
                lineToRelative(5.477f, 3.168f)
                lineToRelative(3.129f, 1.821f)
                lineToRelative(-8.606f, 5.01f)
                close()
            }
        }
        .build()
        return _vfairs!!
    }

private var _vfairs: ImageVector? = null
