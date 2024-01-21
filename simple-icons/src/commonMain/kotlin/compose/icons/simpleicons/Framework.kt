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

public val SimpleIcons.Framework: ImageVector
    get() {
        if (_framework != null) {
            return _framework!!
        }
        _framework = Builder(name = "Framework", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.186f, 9.07f)
                lineTo(21.41f, 8.019f)
                arcToRelative(2.78f, 2.78f, 0.0f, false, true, -1.344f, -2.391f)
                verticalLineTo(3.523f)
                curveToRelative(0.0f, -0.431f, -0.19f, -0.837f, -0.516f, -1.108f)
                arcTo(11.965f, 11.965f, 0.0f, false, false, 16.317f, 0.493f)
                arcToRelative(1.356f, 1.356f, 0.0f, false, false, -1.193f, 0.091f)
                lineTo(13.347f, 1.64f)
                arcToRelative(2.622f, 2.622f, 0.0f, false, true, -2.688f, 0.0f)
                lineTo(8.882f, 0.584f)
                arcToRelative(1.348f, 1.348f, 0.0f, false, false, -1.194f, -0.09f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, -3.231f, 1.918f)
                arcToRelative(1.44f, 1.44f, 0.0f, false, false, -0.516f, 1.108f)
                verticalLineToRelative(2.104f)
                curveToRelative(0.0f, 0.986f, -0.51f, 1.897f, -1.344f, 2.392f)
                lineTo(0.823f, 9.068f)
                curveToRelative(-0.363f, 0.215f, -0.61f, 0.588f, -0.675f, 1.013f)
                arcTo(12.24f, 12.24f, 0.0f, false, false, 0.0f, 12.001f)
                curveToRelative(0.0f, 0.651f, 0.048f, 1.292f, 0.145f, 1.916f)
                curveToRelative(0.065f, 0.425f, 0.312f, 0.801f, 0.675f, 1.016f)
                lineToRelative(1.774f, 1.052f)
                arcToRelative(2.78f, 2.78f, 0.0f, false, true, 1.344f, 2.392f)
                verticalLineToRelative(2.104f)
                curveToRelative(0.0f, 0.431f, 0.191f, 0.837f, 0.516f, 1.108f)
                curveToRelative(0.965f, 0.8f, 2.054f, 1.452f, 3.231f, 1.919f)
                curveToRelative(0.393f, 0.155f, 0.831f, 0.124f, 1.194f, -0.091f)
                lineToRelative(1.777f, -1.055f)
                arcToRelative(2.622f, 2.622f, 0.0f, false, true, 2.688f, 0.0f)
                lineToRelative(1.777f, 1.055f)
                curveToRelative(0.363f, 0.215f, 0.804f, 0.246f, 1.193f, 0.091f)
                arcToRelative(11.973f, 11.973f, 0.0f, false, false, 3.232f, -1.92f)
                arcToRelative(1.44f, 1.44f, 0.0f, false, false, 0.516f, -1.107f)
                verticalLineToRelative(-2.104f)
                arcToRelative(2.78f, 2.78f, 0.0f, false, true, 1.344f, -2.392f)
                lineToRelative(1.774f, -1.052f)
                curveToRelative(0.363f, -0.215f, 0.61f, -0.588f, 0.675f, -1.016f)
                curveToRelative(0.094f, -0.624f, 0.145f, -1.265f, 0.145f, -1.916f)
                curveToRelative(0.0f, -0.652f, -0.048f, -1.293f, -0.145f, -1.917f)
                arcToRelative(1.41f, 1.41f, 0.0f, false, false, -0.67f, -1.013f)
                close()
                moveTo(12.003f, 19.41f)
                curveToRelative(-3.981f, 0.0f, -7.21f, -3.317f, -7.21f, -7.407f)
                reflectiveCurveToRelative(3.229f, -7.406f, 7.21f, -7.406f)
                curveToRelative(3.98f, 0.0f, 7.21f, 3.316f, 7.21f, 7.406f)
                reflectiveCurveToRelative(-3.23f, 7.407f, -7.21f, 7.407f)
                close()
            }
        }
        .build()
        return _framework!!
    }

private var _framework: ImageVector? = null
