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

public val RemixIcons.SteamFill: ImageVector
    get() {
        if (_steamFill != null) {
            return _steamFill!!
        }
        _steamFill = Builder(name = "SteamFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.004f, 2.0f)
                curveToRelative(-5.25f, 0.0f, -9.556f, 4.05f, -9.964f, 9.197f)
                lineToRelative(5.36f, 2.216f)
                curveToRelative(0.454f, -0.31f, 1.002f, -0.492f, 1.593f, -0.492f)
                curveToRelative(0.053f, 0.0f, 0.104f, 0.003f, 0.157f, 0.005f)
                lineToRelative(2.384f, -3.452f)
                verticalLineToRelative(-0.049f)
                curveToRelative(0.0f, -2.08f, 1.69f, -3.77f, 3.77f, -3.77f)
                curveToRelative(2.079f, 0.0f, 3.77f, 1.692f, 3.77f, 3.772f)
                reflectiveCurveToRelative(-1.692f, 3.771f, -3.77f, 3.771f)
                horizontalLineToRelative(-0.087f)
                lineToRelative(-3.397f, 2.426f)
                curveToRelative(0.0f, 0.043f, 0.003f, 0.088f, 0.003f, 0.133f)
                curveToRelative(0.0f, 1.562f, -1.262f, 2.83f, -2.825f, 2.83f)
                curveToRelative(-1.362f, 0.0f, -2.513f, -0.978f, -2.775f, -2.273f)
                lineToRelative(-3.838f, -1.589f)
                curveTo(3.573f, 18.922f, 7.427f, 22.0f, 12.005f, 22.0f)
                curveToRelative(5.522f, 0.0f, 9.998f, -4.477f, 9.998f, -10.0f)
                curveToRelative(0.0f, -5.522f, -4.477f, -10.0f, -9.999f, -10.0f)
                close()
                moveTo(7.078f, 16.667f)
                curveToRelative(0.218f, 0.452f, 0.595f, 0.832f, 1.094f, 1.041f)
                curveToRelative(1.081f, 0.45f, 2.328f, -0.063f, 2.777f, -1.145f)
                curveToRelative(0.22f, -0.525f, 0.22f, -1.1f, 0.004f, -1.625f)
                curveToRelative(-0.215f, -0.525f, -0.625f, -0.934f, -1.147f, -1.152f)
                curveToRelative(-0.52f, -0.217f, -1.075f, -0.208f, -1.565f, -0.025f)
                lineToRelative(1.269f, 0.525f)
                curveToRelative(0.797f, 0.333f, 1.174f, 1.25f, 0.84f, 2.046f)
                curveToRelative(-0.33f, 0.797f, -1.247f, 1.175f, -2.044f, 0.843f)
                lineToRelative(-1.228f, -0.508f)
                close()
                moveTo(17.818f, 9.422f)
                curveToRelative(0.0f, -1.385f, -1.128f, -2.512f, -2.513f, -2.512f)
                curveToRelative(-1.387f, 0.0f, -2.512f, 1.127f, -2.512f, 2.512f)
                curveToRelative(0.0f, 1.388f, 1.125f, 2.513f, 2.512f, 2.513f)
                curveToRelative(1.386f, 0.0f, 2.512f, -1.125f, 2.512f, -2.513f)
                close()
                moveTo(15.31f, 7.53f)
                curveToRelative(1.04f, 0.0f, 1.888f, 0.845f, 1.888f, 1.888f)
                reflectiveCurveToRelative(-0.847f, 1.888f, -1.888f, 1.888f)
                curveToRelative(-1.044f, 0.0f, -1.888f, -0.845f, -1.888f, -1.888f)
                reflectiveCurveToRelative(0.845f, -1.888f, 1.888f, -1.888f)
                close()
            }
        }
        .build()
        return _steamFill!!
    }

private var _steamFill: ImageVector? = null
