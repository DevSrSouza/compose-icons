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

public val SimpleIcons.Samsungpay: ImageVector
    get() {
        if (_samsungpay != null) {
            return _samsungpay!!
        }
        _samsungpay = Builder(name = "Samsungpay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.978f, 10.702f)
                curveToRelative(-0.133f, -3.828f, -1.139f, -6.909f, -3.408f, -8.592f)
                reflectiveCurveTo(14.89f, -0.157f, 10.604f, 0.047f)
                curveTo(8.658f, 0.141f, 6.902f, 0.394f, 5.477f, 0.964f)
                curveToRelative(-1.47f, 0.59f, -2.606f, 1.421f, -3.437f, 2.578f)
                curveTo(0.369f, 5.867f, -0.148f, 9.377f, 0.035f, 13.422f)
                curveToRelative(0.174f, 3.84f, 1.169f, 6.878f, 3.465f, 8.535f)
                curveToRelative(2.284f, 1.647f, 5.996f, 2.17f, 9.909f, 2.005f)
                curveToRelative(3.798f, -0.16f, 6.883f, -1.167f, 8.535f, -3.466f)
                curveToRelative(1.649f, -2.295f, 2.175f, -5.683f, 2.034f, -9.794f)
                close()
                moveTo(6.602f, 14.77f)
                horizontalLineToRelative(-0.495f)
                verticalLineToRelative(-1.063f)
                horizontalLineToRelative(0.495f)
                curveToRelative(0.946f, 0.0f, 1.636f, -0.732f, 1.636f, -1.636f)
                curveToRelative(0.0f, -0.903f, -0.732f, -1.636f, -1.636f, -1.636f)
                lineTo(5.003f, 10.435f)
                arcToRelative(0.13f, 0.13f, 0.0f, false, false, -0.124f, 0.093f)
                verticalLineToRelative(5.802f)
                horizontalLineToRelative(-1.03f)
                verticalLineToRelative(-5.802f)
                curveToRelative(0.0f, -0.638f, 0.517f, -1.155f, 1.155f, -1.155f)
                horizontalLineToRelative(1.599f)
                curveToRelative(1.49f, 0.0f, 2.725f, 1.208f, 2.725f, 2.698f)
                reflectiveCurveTo(8.175f, 14.77f, 6.602f, 14.77f)
                close()
                moveTo(15.304f, 14.771f)
                lineTo(14.26f, 14.771f)
                verticalLineToRelative(-2.78f)
                curveToRelative(-0.021f, -0.784f, -0.853f, -1.565f, -1.739f, -1.565f)
                curveToRelative(-0.996f, 0.0f, -1.729f, 0.85f, -1.729f, 1.646f)
                curveToRelative(0.0f, 1.126f, 0.794f, 1.641f, 1.729f, 1.641f)
                horizontalLineToRelative(0.368f)
                verticalLineToRelative(1.058f)
                horizontalLineToRelative(-0.368f)
                curveToRelative(-1.538f, -0.001f, -2.785f, -0.985f, -2.785f, -2.699f)
                curveToRelative(0.0f, -1.398f, 1.247f, -2.699f, 2.785f, -2.699f)
                curveToRelative(1.389f, 0.0f, 2.739f, 1.165f, 2.783f, 2.618f)
                verticalLineToRelative(2.78f)
                close()
                moveTo(16.628f, 9.55f)
                lineToRelative(1.361f, 2.788f)
                lineToRelative(-0.592f, 1.203f)
                lineToRelative(-1.949f, -3.99f)
                horizontalLineToRelative(1.18f)
                close()
                moveTo(17.889f, 16.521f)
                horizontalLineToRelative(-1.181f)
                lineToRelative(3.426f, -6.971f)
                horizontalLineToRelative(1.181f)
                lineToRelative(-3.426f, 6.971f)
                close()
            }
        }
        .build()
        return _samsungpay!!
    }

private var _samsungpay: ImageVector? = null
