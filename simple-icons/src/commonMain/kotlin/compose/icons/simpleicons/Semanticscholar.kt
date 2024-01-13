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

public val SimpleIcons.Semanticscholar: ImageVector
    get() {
        if (_semanticscholar != null) {
            return _semanticscholar!!
        }
        _semanticscholar = Builder(name = "Semanticscholar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 8.609f)
                curveToRelative(-0.848f, 0.536f, -1.436f, 0.83f, -2.146f, 1.245f)
                curveToRelative(-4.152f, 2.509f, -8.15f, 5.295f, -11.247f, 8.981f)
                lineToRelative(-1.488f, 1.817f)
                lineToRelative(-4.568f, -7.268f)
                curveToRelative(1.021f, 0.814f, 3.564f, 3.098f, 4.603f, 3.599f)
                lineToRelative(3.356f, -2.526f)
                curveToRelative(2.336f, -1.644f, 8.946f, -5.226f, 11.49f, -5.848f)
                close()
                moveTo(8.046f, 15.201f)
                curveToRelative(0.346f, 0.277f, 0.692f, 0.537f, 0.969f, 0.744f)
                curveToRelative(0.761f, -3.668f, 0.121f, -7.613f, -1.886f, -11.039f)
                curveToRelative(3.374f, -0.052f, 6.731f, -0.087f, 10.105f, -0.139f)
                arcToRelative(14.794f, 14.794f, 0.0f, false, true, 1.298f, 5.295f)
                curveToRelative(0.294f, -0.156f, 0.588f, -0.294f, 0.883f, -0.433f)
                curveToRelative(-0.104f, -1.868f, -0.641f, -3.91f, -1.662f, -6.263f)
                curveToRelative(-4.602f, -0.018f, -9.188f, -0.018f, -13.79f, -0.018f)
                curveToRelative(2.993f, 3.547f, 4.36f, 7.839f, 4.083f, 11.853f)
                close()
                moveTo(7.423f, 14.717f)
                curveToRelative(0.087f, 0.086f, 0.191f, 0.155f, 0.277f, 0.225f)
                curveToRelative(-0.138f, -3.409f, -1.419f, -6.887f, -3.824f, -9.881f)
                lineTo(1.73f, 5.061f)
                curveToRelative(3.098f, 2.855f, 4.984f, 6.299f, 5.693f, 9.656f)
                close()
                moveTo(6.679f, 14.059f)
                curveToRelative(0.104f, 0.087f, 0.208f, 0.173f, 0.329f, 0.277f)
                curveToRelative(-0.9f, -2.526f, -2.492f, -5.018f, -4.741f, -7.198f)
                lineTo(0.0f, 7.138f)
                curveToRelative(2.89f, 2.076f, 5.122f, 4.481f, 6.679f, 6.921f)
                close()
            }
        }
        .build()
        return _semanticscholar!!
    }

private var _semanticscholar: ImageVector? = null
