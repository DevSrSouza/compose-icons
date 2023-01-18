package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.EdgeFill: ImageVector
    get() {
        if (_edgeFill != null) {
            return _edgeFill!!
        }
        _edgeFill = Builder(name = "EdgeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.644f, 8.586f)
                curveToRelative(-0.17f, -0.711f, -0.441f, -1.448f, -0.774f, -2.021f)
                curveToRelative(-0.771f, -1.329f, -1.464f, -2.237f, -3.177f, -3.32f)
                curveTo(14.98f, 2.162f, 13.076f, 2.0f, 12.17f, 2.0f)
                curveToRelative(-2.415f, 0.0f, -4.211f, 0.86f, -5.525f, 1.887f)
                curveTo(3.344f, 6.47f, 3.0f, 11.0f, 3.0f, 11.0f)
                reflectiveCurveToRelative(1.221f, -2.045f, 3.54f, -3.526f)
                curveTo(7.943f, 6.579f, 9.941f, 6.0f, 11.568f, 6.0f)
                curveTo(15.885f, 6.0f, 16.0f, 10.0f, 16.0f, 10.0f)
                horizontalLineTo(9.0f)
                curveToRelative(0.0f, -2.0f, 1.0f, -3.0f, 1.0f, -3.0f)
                reflectiveCurveToRelative(-5.0f, 2.0f, -5.0f, 7.044f)
                curveToRelative(0.0f, 0.487f, -0.003f, 1.372f, 0.248f, 2.283f)
                curveToRelative(0.232f, 0.843f, 0.7f, 1.705f, 1.132f, 2.353f)
                curveToRelative(1.221f, 1.832f, 3.045f, 2.614f, 3.916f, 2.904f)
                curveToRelative(0.996f, 0.332f, 2.029f, 0.416f, 3.01f, 0.416f)
                curveToRelative(2.72f, 0.0f, 4.877f, -0.886f, 5.694f, -1.275f)
                verticalLineToRelative(-4.172f)
                curveToRelative(-0.758f, 0.454f, -2.679f, 1.447f, -5.0f, 1.447f)
                curveToRelative(-5.0f, 0.0f, -5.0f, -4.0f, -5.0f, -4.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.49f)
                reflectiveCurveToRelative(-0.039f, -1.593f, -0.356f, -2.924f)
                close()
            }
        }
        .build()
        return _edgeFill!!
    }

private var _edgeFill: ImageVector? = null
