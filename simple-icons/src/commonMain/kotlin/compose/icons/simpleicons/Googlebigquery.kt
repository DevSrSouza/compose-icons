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

public val SimpleIcons.Googlebigquery: ImageVector
    get() {
        if (_googlebigquery != null) {
            return _googlebigquery!!
        }
        _googlebigquery = Builder(name = "Googlebigquery", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.676f, 10.595f)
                horizontalLineToRelative(2.052f)
                verticalLineToRelative(5.244f)
                arcToRelative(5.892f, 5.892f, 0.0f, false, true, -2.052f, -2.088f)
                verticalLineToRelative(-3.156f)
                close()
                moveTo(23.855f, 21.431f)
                arcToRelative(0.504f, 0.504f, 0.0f, false, true, 0.0f, 0.708f)
                lineToRelative(-1.716f, 1.716f)
                arcToRelative(0.504f, 0.504f, 0.0f, false, true, -0.708f, 0.0f)
                lineToRelative(-4.248f, -4.248f)
                arcToRelative(0.206f, 0.206f, 0.0f, false, true, -0.007f, -0.007f)
                curveToRelative(-0.02f, -0.02f, -0.028f, -0.045f, -0.043f, -0.066f)
                arcToRelative(10.736f, 10.736f, 0.0f, false, true, -6.334f, 2.065f)
                curveTo(4.835f, 21.599f, 0.0f, 16.764f, 0.0f, 10.799f)
                reflectiveCurveTo(4.835f, 0.0f, 10.8f, 0.0f)
                reflectiveCurveToRelative(10.799f, 4.835f, 10.799f, 10.8f)
                curveToRelative(0.0f, 2.369f, -0.772f, 4.553f, -2.066f, 6.333f)
                curveToRelative(0.025f, 0.017f, 0.052f, 0.028f, 0.074f, 0.05f)
                lineToRelative(4.248f, 4.248f)
                close()
                moveTo(18.827f, 10.799f)
                arcToRelative(8.015f, 8.015f, 0.0f, true, false, -8.028f, 8.028f)
                horizontalLineToRelative(0.024f)
                arcToRelative(8.016f, 8.016f, 0.0f, false, false, 8.004f, -8.028f)
                close()
                moveTo(13.967f, 15.779f)
                arcToRelative(6.002f, 6.002f, 0.0f, false, false, 2.04f, -2.184f)
                verticalLineToRelative(-1.764f)
                horizontalLineToRelative(-2.04f)
                verticalLineToRelative(3.948f)
                close()
                moveTo(9.467f, 16.727f)
                curveToRelative(0.442f, 0.057f, 0.887f, 0.08f, 1.332f, 0.072f)
                curveToRelative(0.4f, 0.025f, 0.8f, 0.025f, 1.2f, 0.0f)
                lineTo(11.999f, 7.692f)
                lineTo(9.468f, 7.692f)
                verticalLineToRelative(9.035f)
                close()
            }
        }
        .build()
        return _googlebigquery!!
    }

private var _googlebigquery: ImageVector? = null
