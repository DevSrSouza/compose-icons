package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Bandlab: ImageVector
    get() {
        if (_bandlab != null) {
            return _bandlab!!
        }
        _bandlab = Builder(name = "Bandlab", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.375f, 2.625f)
                curveToRelative(0.5f, 0.0f, 0.5f, 0.75f, 0.0f, 0.75f)
                reflectiveCurveTo(11.875f, 2.625f, 12.375f, 2.625f)
                close()
                moveTo(11.25f, 4.125f)
                curveToRelative(0.0f, 1.0f, -1.5f, 1.0f, -1.5f, 0.0f)
                reflectiveCurveTo(11.25f, 3.125f, 11.25f, 4.125f)
                close()
                moveTo(17.742f, 17.555f)
                curveToRelative(-0.391f, 0.551f, -0.822f, 0.82f, -1.707f, 0.82f)
                horizontalLineToRelative(-8.07f)
                curveToRelative(-0.881f, 0.0f, -1.316f, -0.27f, -1.707f, -0.818f)
                curveToRelative(-0.531f, -0.756f, -0.082f, -1.574f, -0.082f, -1.574f)
                lineToRelative(3.559f, -6.918f)
                curveToRelative(0.0f, 0.0f, 0.154f, -0.459f, -0.074f, -0.705f)
                curveTo(9.435f, 8.123f, 8.715f, 7.328f, 8.658f, 7.267f)
                curveTo(8.58f, 7.17f, 8.555f, 7.095f, 8.547f, 7.02f)
                curveTo(8.535f, 6.953f, 8.479f, 6.172f, 8.479f, 6.082f)
                reflectiveCurveTo(8.461f, 5.906f, 8.617f, 5.744f)
                curveToRelative(0.125f, -0.119f, 0.398f, -0.119f, 0.398f, -0.119f)
                horizontalLineToRelative(5.98f)
                curveToRelative(0.0f, 0.0f, 0.273f, -0.004f, 0.398f, 0.119f)
                curveToRelative(0.156f, 0.162f, 0.138f, 0.248f, 0.138f, 0.338f)
                curveToRelative(-0.017f, 0.315f, -0.039f, 0.629f, -0.068f, 0.941f)
                curveToRelative(-0.008f, 0.072f, -0.03f, 0.151f, -0.116f, 0.244f)
                lineToRelative(-1.013f, 1.092f)
                curveToRelative(-0.026f, 0.026f, -0.045f, 0.059f, -0.063f, 0.09f)
                horizontalLineToRelative(-3.654f)
                curveToRelative(-0.086f, 0.0f, -0.135f, 0.008f, -0.197f, 0.074f)
                curveToRelative(-0.094f, 0.109f, -0.031f, 0.233f, -0.031f, 0.233f)
                lineToRelative(2.566f, 5.002f)
                curveToRelative(0.137f, 0.287f, -0.07f, 0.617f, -0.387f, 0.619f)
                curveToRelative(-1.227f, 0.0f, -1.935f, 0.638f, -1.935f, 1.414f)
                curveToRelative(0.0f, 0.779f, 0.876f, 1.414f, 1.957f, 1.414f)
                curveToRelative(1.076f, 0.0f, 1.947f, -0.627f, 1.959f, -1.402f)
                curveToRelative(0.0f, 0.0f, 0.022f, -0.259f, -0.109f, -0.582f)
                lineToRelative(-2.588f, -5.031f)
                curveToRelative(0.0f, 0.0f, -0.049f, -0.133f, 0.033f, -0.248f)
                curveToRelative(0.084f, -0.117f, 0.219f, -0.123f, 0.219f, -0.123f)
                horizontalLineToRelative(2.52f)
                lineToRelative(3.199f, 6.164f)
                curveTo(17.824f, 15.983f, 18.273f, 16.801f, 17.742f, 17.555f)
                close()
            }
        }
        .build()
        return _bandlab!!
    }

private var _bandlab: ImageVector? = null
