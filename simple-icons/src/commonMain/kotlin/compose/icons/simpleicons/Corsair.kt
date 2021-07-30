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

public val SimpleIcons.Corsair: ImageVector
    get() {
        if (_corsair != null) {
            return _corsair!!
        }
        _corsair = Builder(name = "Corsair", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.072f, 0.412f)
                reflectiveCurveToRelative(1.913f, 3.881f, 1.563f, 5.5f)
                curveToRelative(0.0f, 0.0f, 4.987f, 1.612f, 5.54f, 4.272f)
                curveToRelative(0.0f, 0.0f, 2.73f, -3.594f, -7.103f, -9.772f)
                close()
                moveTo(7.908f, 4.067f)
                reflectiveCurveToRelative(1.678f, 2.625f, 1.417f, 4.35f)
                lineToRelative(2.818f, 1.067f)
                arcToRelative(17.56f, 17.56f, 0.0f, false, false, -0.991f, -3.248f)
                close()
                moveTo(11.692f, 4.758f)
                arcToRelative(14.162f, 14.162f, 0.0f, false, true, 0.163f, 13.794f)
                arcToRelative(17.702f, 17.702f, 0.0f, false, false, 0.594f, -6.585f)
                curveToRelative(-0.017f, -0.186f, -0.031f, -0.368f, -0.053f, -0.55f)
                lineTo(6.908f, 7.759f)
                arcToRelative(14.13f, 14.13f, 0.0f, false, true, 1.133f, 4.465f)
                arcToRelative(14.02f, 14.02f, 0.0f, false, true, -1.305f, 7.347f)
                arcToRelative(17.75f, 17.75f, 0.0f, false, false, 0.442f, -5.988f)
                arcToRelative(0.92f, 0.92f, 0.0f, false, true, -0.022f, -0.243f)
                lineToRelative(-5.133f, -2.726f)
                arcToRelative(11.639f, 11.639f, 0.0f, false, true, 1.075f, 3.93f)
                arcTo(11.785f, 11.785f, 0.0f, false, true, 0.0f, 23.587f)
                curveToRelative(21.91f, -9.29f, 22.795f, -3.173f, 22.795f, -3.173f)
                reflectiveCurveToRelative(1.656f, -2.164f, 1.085f, -4.51f)
                curveTo(23.128f, 12.79f, 11.692f, 4.759f, 11.692f, 4.759f)
                close()
                moveTo(3.04f, 7.245f)
                reflectiveCurveToRelative(1.629f, 2.09f, 1.363f, 3.815f)
                lineToRelative(2.567f, 0.637f)
                arcToRelative(20.357f, 20.357f, 0.0f, false, false, -0.863f, -2.788f)
                close()
            }
        }
        .build()
        return _corsair!!
    }

private var _corsair: ImageVector? = null
