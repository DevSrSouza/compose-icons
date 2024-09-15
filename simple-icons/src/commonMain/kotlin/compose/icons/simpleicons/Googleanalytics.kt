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

public val SimpleIcons.Googleanalytics: ImageVector
    get() {
        if (_googleanalytics != null) {
            return _googleanalytics!!
        }
        _googleanalytics = Builder(name = "Googleanalytics", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.84f, 2.998f)
                verticalLineToRelative(17.999f)
                curveToRelative(0.009f, 1.647f, -1.32f, 2.99f, -2.967f, 2.998f)
                arcToRelative(2.981f, 2.981f, 0.0f, false, true, -0.368f, -0.021f)
                curveToRelative(-1.528f, -0.226f, -2.648f, -1.556f, -2.611f, -3.1f)
                lineTo(16.895f, 3.12f)
                curveToRelative(-0.037f, -1.546f, 1.086f, -2.876f, 2.616f, -3.1f)
                curveToRelative(1.636f, -0.191f, 3.118f, 0.98f, 3.309f, 2.616f)
                curveToRelative(0.014f, 0.12f, 0.021f, 0.241f, 0.02f, 0.362f)
                close()
                moveTo(4.133f, 18.055f)
                curveToRelative(-1.642f, 0.0f, -2.973f, 1.331f, -2.973f, 2.973f)
                curveTo(1.16f, 22.669f, 2.491f, 24.0f, 4.133f, 24.0f)
                reflectiveCurveToRelative(2.973f, -1.331f, 2.973f, -2.973f)
                reflectiveCurveToRelative(-1.331f, -2.973f, -2.973f, -2.973f)
                close()
                moveTo(12.005f, 9.045f)
                curveToRelative(-0.017f, 0.0f, -0.034f, 0.0f, -0.051f, 0.0f)
                curveToRelative(-1.65f, 0.09f, -2.929f, 1.474f, -2.891f, 3.126f)
                verticalLineToRelative(7.985f)
                curveToRelative(0.0f, 2.167f, 0.953f, 3.483f, 2.351f, 3.763f)
                curveToRelative(1.612f, 0.327f, 3.183f, -0.715f, 3.51f, -2.327f)
                curveToRelative(0.04f, -0.197f, 0.06f, -0.398f, 0.059f, -0.6f)
                verticalLineToRelative(-8.958f)
                curveToRelative(0.003f, -1.647f, -1.33f, -2.985f, -2.977f, -2.988f)
                close()
            }
        }
        .build()
        return _googleanalytics!!
    }

private var _googleanalytics: ImageVector? = null
