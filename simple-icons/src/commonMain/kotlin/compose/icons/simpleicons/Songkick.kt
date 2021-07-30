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

public val SimpleIcons.Songkick: ImageVector
    get() {
        if (_songkick != null) {
            return _songkick!!
        }
        _songkick = Builder(name = "Songkick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.55f, 18.779f)
                curveToRelative(-1.855f, 0.0f, -3.372f, -0.339f, -4.598f, -1.602f)
                lineToRelative(1.92f, -1.908f)
                curveToRelative(0.63f, 0.631f, 1.74f, 0.853f, 2.715f, 0.853f)
                curveToRelative(1.186f, 0.0f, 1.739f, -0.391f, 1.739f, -1.089f)
                curveToRelative(0.0f, -0.291f, -0.06f, -0.529f, -0.239f, -0.717f)
                curveToRelative(-0.15f, -0.154f, -0.404f, -0.273f, -0.795f, -0.324f)
                lineToRelative(-1.455f, -0.205f)
                curveToRelative(-1.064f, -0.152f, -1.891f, -0.51f, -2.43f, -1.072f)
                curveToRelative(-0.555f, -0.578f, -0.84f, -1.395f, -0.84f, -2.434f)
                curveTo(2.536f, 8.066f, 4.2f, 6.45f, 6.96f, 6.45f)
                curveToRelative(1.74f, 0.0f, 3.048f, 0.407f, 4.086f, 1.448f)
                lineTo(9.171f, 9.77f)
                curveToRelative(-0.765f, -0.766f, -1.77f, -0.715f, -2.295f, -0.715f)
                curveToRelative(-1.039f, 0.0f, -1.465f, 0.597f, -1.465f, 1.125f)
                curveToRelative(0.0f, 0.152f, 0.051f, 0.375f, 0.24f, 0.561f)
                curveToRelative(0.15f, 0.153f, 0.404f, 0.307f, 0.832f, 0.359f)
                lineToRelative(1.467f, 0.203f)
                curveToRelative(1.09f, 0.153f, 1.875f, 0.495f, 2.385f, 1.005f)
                curveToRelative(0.645f, 0.63f, 0.9f, 1.53f, 0.9f, 2.655f)
                curveToRelative(0.0f, 2.47f, -2.127f, 3.819f, -4.68f, 3.819f)
                lineToRelative(-0.005f, -0.003f)
                close()
                moveTo(20.813f, 2.651f)
                curveTo(19.178f, 1.432f, 17.37f, 0.612f, 15.089f, 0.237f)
                verticalLineToRelative(10.875f)
                lineToRelative(3.261f, -4.539f)
                horizontalLineToRelative(3.565f)
                lineToRelative(-4.095f, 5.72f)
                reflectiveCurveToRelative(0.944f, 1.51f, 1.515f, 2.405f)
                curveToRelative(0.586f, 0.899f, 1.139f, 1.14f, 1.965f, 1.14f)
                horizontalLineToRelative(0.57f)
                verticalLineToRelative(2.806f)
                horizontalLineToRelative(-0.872f)
                curveToRelative(-1.812f, 0.0f, -2.9f, -0.33f, -3.72f, -1.575f)
                curveToRelative(-0.504f, -0.811f, -2.175f, -3.436f, -2.175f, -3.436f)
                verticalLineToRelative(4.995f)
                horizontalLineTo(12.12f)
                verticalLineTo(-0.001f)
                horizontalLineTo(12.0f)
                curveToRelative(-3.852f, 0.0f, -6.509f, 0.931f, -8.811f, 2.652f)
                curveTo(-0.132f, 5.137f, 0.001f, 8.451f, 0.001f, 11.997f)
                curveToRelative(0.0f, 3.547f, -0.133f, 6.867f, 3.188f, 9.352f)
                curveTo(5.491f, 23.074f, 8.148f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(6.51f, -0.927f, 8.812f, -2.651f)
                curveTo(24.131f, 18.865f, 24.0f, 15.544f, 24.0f, 11.997f)
                curveToRelative(0.0f, -3.546f, 0.132f, -6.859f, -3.188f, -9.346f)
                horizontalLineToRelative(0.001f)
                close()
            }
        }
        .build()
        return _songkick!!
    }

private var _songkick: ImageVector? = null
