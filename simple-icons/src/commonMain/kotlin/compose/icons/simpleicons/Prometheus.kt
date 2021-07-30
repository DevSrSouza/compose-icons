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

public val SimpleIcons.Prometheus: ImageVector
    get() {
        if (_prometheus != null) {
            return _prometheus!!
        }
        _prometheus = Builder(name = "Prometheus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.372f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                curveToRelative(0.0f, -6.628f, -5.373f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(12.0f, 22.46f)
                curveToRelative(-1.885f, 0.0f, -3.414f, -1.26f, -3.414f, -2.814f)
                horizontalLineToRelative(6.828f)
                curveToRelative(0.0f, 1.553f, -1.528f, 2.813f, -3.414f, 2.813f)
                close()
                moveTo(17.64f, 18.715f)
                lineTo(6.36f, 18.715f)
                verticalLineToRelative(-2.046f)
                horizontalLineToRelative(11.28f)
                verticalLineToRelative(2.046f)
                close()
                moveTo(17.6f, 15.617f)
                lineTo(6.391f, 15.617f)
                curveToRelative(-0.037f, -0.043f, -0.075f, -0.086f, -0.111f, -0.13f)
                curveToRelative(-1.155f, -1.401f, -1.427f, -2.133f, -1.69f, -2.879f)
                curveToRelative(-0.005f, -0.025f, 1.4f, 0.287f, 2.395f, 0.511f)
                curveToRelative(0.0f, 0.0f, 0.513f, 0.119f, 1.262f, 0.255f)
                curveToRelative(-0.72f, -0.843f, -1.147f, -1.915f, -1.147f, -3.01f)
                curveToRelative(0.0f, -2.406f, 1.845f, -4.508f, 1.18f, -6.207f)
                curveToRelative(0.648f, 0.053f, 1.34f, 1.367f, 1.387f, 3.422f)
                curveToRelative(0.689f, -0.951f, 0.977f, -2.69f, 0.977f, -3.755f)
                curveToRelative(0.0f, -1.103f, 0.727f, -2.385f, 1.454f, -2.429f)
                curveToRelative(-0.648f, 1.069f, 0.168f, 1.984f, 0.894f, 4.256f)
                curveToRelative(0.272f, 0.854f, 0.237f, 2.29f, 0.447f, 3.201f)
                curveToRelative(0.07f, -1.892f, 0.395f, -4.652f, 1.595f, -5.605f)
                curveToRelative(-0.529f, 1.2f, 0.079f, 2.702f, 0.494f, 3.424f)
                curveToRelative(0.671f, 1.164f, 1.078f, 2.047f, 1.078f, 3.716f)
                arcToRelative(4.642f, 4.642f, 0.0f, false, true, -1.11f, 2.996f)
                curveToRelative(0.792f, -0.149f, 1.34f, -0.283f, 1.34f, -0.283f)
                lineToRelative(2.573f, -0.502f)
                reflectiveCurveToRelative(-0.374f, 1.538f, -1.81f, 3.019f)
                close()
            }
        }
        .build()
        return _prometheus!!
    }

private var _prometheus: ImageVector? = null
