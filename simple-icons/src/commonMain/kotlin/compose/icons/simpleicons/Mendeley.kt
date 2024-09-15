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

public val SimpleIcons.Mendeley: ImageVector
    get() {
        if (_mendeley != null) {
            return _mendeley!!
        }
        _mendeley = Builder(name = "Mendeley", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.004f, 9.168f)
                horizontalLineToRelative(0.019f)
                arcToRelative(2.355f, 2.355f, 0.0f, false, true, 1.504f, 4.166f)
                arcToRelative(1.808f, 1.808f, 0.0f, false, true, -0.856f, 0.452f)
                arcToRelative(2.348f, 2.348f, 0.0f, false, true, -0.649f, 0.092f)
                horizontalLineToRelative(-0.019f)
                curveToRelative(-0.225f, 0.0f, -0.442f, -0.033f, -0.649f, -0.092f)
                arcToRelative(1.813f, 1.813f, 0.0f, false, true, -0.856f, -0.452f)
                arcToRelative(2.346f, 2.346f, 0.0f, false, true, -0.851f, -1.811f)
                arcToRelative(2.358f, 2.358f, 0.0f, false, true, 2.357f, -2.355f)
                moveToRelative(-9.973f, 9.474f)
                curveToRelative(1.265f, 0.158f, 2.388f, -0.762f, 2.507f, -2.057f)
                arcToRelative(2.444f, 2.444f, 0.0f, false, false, -0.214f, -1.236f)
                curveToRelative(-1.772f, -3.889f, 6.973f, -3.978f, 5.495f, -0.308f)
                lineToRelative(-0.01f, 0.016f)
                curveToRelative(-0.699f, 1.118f, -0.32f, 2.569f, 0.841f, 3.24f)
                curveToRelative(0.427f, 0.249f, 0.9f, 0.351f, 1.362f, 0.331f)
                curveToRelative(0.462f, 0.02f, 0.935f, -0.082f, 1.362f, -0.331f)
                curveToRelative(1.161f, -0.672f, 1.54f, -2.122f, 0.841f, -3.24f)
                lineToRelative(-0.01f, -0.016f)
                curveToRelative(-1.478f, -3.67f, 7.268f, -3.581f, 5.494f, 0.308f)
                arcToRelative(2.446f, 2.446f, 0.0f, false, false, -0.213f, 1.236f)
                curveToRelative(0.12f, 1.295f, 1.242f, 2.216f, 2.508f, 2.057f)
                arcToRelative(2.345f, 2.345f, 0.0f, false, false, 1.425f, -0.737f)
                reflectiveCurveToRelative(0.589f, -0.488f, 0.58f, -1.733f)
                curveToRelative(-0.008f, -1.016f, -0.58f, -1.578f, -0.58f, -1.578f)
                arcToRelative(2.212f, 2.212f, 0.0f, false, false, -1.814f, -0.646f)
                curveToRelative(-1.623f, -0.036f, -1.864f, -1.307f, -1.406f, -3.703f)
                curveToRelative(0.169f, -0.425f, 0.242f, -0.88f, 0.227f, -1.335f)
                arcToRelative(3.417f, 3.417f, 0.0f, false, false, -2.13f, -3.295f)
                curveToRelative(-0.039f, -0.017f, -0.078f, -0.03f, -0.118f, -0.046f)
                arcToRelative(1.514f, 1.514f, 0.0f, false, false, -0.134f, -0.046f)
                arcToRelative(3.416f, 3.416f, 0.0f, false, false, -4.004f, 1.453f)
                curveToRelative(-0.817f, 0.897f, -1.187f, 1.442f, -2.027f, 1.442f)
                curveToRelative(-0.799f, 0.0f, -1.211f, -0.544f, -2.027f, -1.442f)
                arcToRelative(3.413f, 3.413f, 0.0f, false, false, -4.137f, -1.408f)
                curveToRelative(-0.04f, 0.016f, -0.079f, 0.029f, -0.119f, 0.046f)
                arcToRelative(3.416f, 3.416f, 0.0f, false, false, -2.129f, 3.295f)
                curveToRelative(-0.016f, 0.455f, 0.058f, 0.91f, 0.226f, 1.335f)
                curveToRelative(0.458f, 2.397f, 0.218f, 3.667f, -1.405f, 3.703f)
                curveToRelative(-0.795f, -0.085f, -1.388f, 0.243f, -1.988f, 0.843f)
                curveToRelative(-0.602f, 0.6f, -0.551f, 2.206f, 0.0f, 2.906f)
                curveToRelative(0.4f, 0.51f, 0.942f, 0.863f, 1.598f, 0.945f)
            }
        }
        .build()
        return _mendeley!!
    }

private var _mendeley: ImageVector? = null
