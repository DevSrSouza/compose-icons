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

public val SimpleIcons.Qemu: ImageVector
    get() {
        if (_qemu != null) {
            return _qemu!!
        }
        _qemu = Builder(name = "Qemu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.003f, 0.064f)
                curveTo(5.376f, 0.064f, 0.0f, 5.407f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.376f, 11.936f, 12.003f, 11.936f)
                curveToRelative(2.169f, 0.0f, 4.2f, -0.57f, 5.955f, -1.57f)
                lineToRelative(0.624f, 1.57f)
                horizontalLineToRelative(4.841f)
                lineToRelative(-1.893f, -4.679f)
                arcTo(11.845f, 11.845f, 0.0f, false, false, 24.0f, 12.0f)
                curveTo(24.0f, 5.407f, 18.63f, 0.064f, 12.003f, 0.064f)
                close()
                moveTo(8.818f, 2.03f)
                curveToRelative(0.398f, 0.339f, 0.324f, 0.198f, 0.86f, 0.134f)
                curveToRelative(0.61f, -0.397f, 0.893f, 0.942f, 1.147f, 0.195f)
                curveToRelative(0.748f, 0.097f, 1.542f, 0.34f, 2.25f, 0.584f)
                arcToRelative(3.447f, 3.447f, 0.0f, false, true, 1.859f, 1.128f)
                lineToRelative(-0.014f, 0.007f)
                lineToRelative(0.35f, 0.463f)
                curveToRelative(0.045f, 0.08f, 0.082f, 0.164f, 0.12f, 0.248f)
                curveToRelative(0.142f, 1.205f, 1.48f, 1.19f, 2.377f, 1.625f)
                curveToRelative(0.767f, 0.272f, 1.69f, 0.686f, 1.785f, 1.611f)
                curveToRelative(-0.193f, -0.042f, -0.941f, -0.921f, -1.53f, -1.007f)
                arcToRelative(3.919f, 3.919f, 0.0f, false, true, -1.094f, -0.255f)
                lineTo(14.86f, 6.38f)
                verticalLineToRelative(-0.007f)
                arcToRelative(3.035f, 3.035f, 0.0f, false, true, -0.309f, -0.053f)
                verticalLineToRelative(0.013f)
                lineToRelative(-2.927f, -0.362f)
                curveToRelative(0.048f, 0.033f, 0.1f, 0.077f, 0.148f, 0.12f)
                lineToRelative(3.0f, 0.585f)
                verticalLineToRelative(-0.007f)
                lineToRelative(0.209f, 0.053f)
                lineToRelative(0.839f, 0.188f)
                curveToRelative(0.166f, 0.016f, 0.334f, 0.043f, 0.47f, 0.067f)
                curveToRelative(0.856f, 0.236f, 1.868f, 0.194f, 2.571f, 0.792f)
                curveToRelative(-0.184f, 0.352f, -1.21f, 0.153f, -1.719f, 0.108f)
                curveToRelative(-0.062f, -0.012f, -0.131f, -0.023f, -0.194f, -0.034f)
                lineToRelative(-0.034f, -0.007f)
                curveToRelative(-0.696f, -0.113f, -1.411f, -0.12f, -2.081f, 0.088f)
                horizontalLineToRelative(-0.007f)
                arcToRelative(3.193f, 3.193f, 0.0f, false, false, -0.671f, 0.302f)
                curveToRelative(-0.968f, 0.563f, -2.164f, 0.767f, -2.967f, 1.577f)
                curveToRelative(-0.787f, 0.847f, -0.739f, 2.012f, -0.604f, 3.095f)
                horizontalLineToRelative(0.033f)
                verticalLineToRelative(0.275f)
                curveToRelative(0.013f, 0.095f, 0.028f, 0.19f, 0.04f, 0.282f)
                curveToRelative(0.41f, 2.19f, 1.5f, 4.2f, 1.84f, 6.412f)
                curveToRelative(0.065f, 0.843f, 0.203f, 1.932f, 0.309f, 2.618f)
                curveToRelative(-0.306f, -0.091f, -0.475f, -1.462f, -0.544f, -1.007f)
                arcToRelative(38.196f, 38.196f, 0.0f, false, false, -3.565f, -5.25f)
                curveToRelative(-0.853f, -1.004f, -1.697f, -2.06f, -2.712f, -2.894f)
                curveToRelative(-0.685f, -0.528f, -0.468f, -1.55f, -0.537f, -2.302f)
                curveToRelative(-0.23f, -0.926f, -0.094f, -1.848f, 0.06f, -2.773f)
                curveToRelative(0.313f, -0.963f, 0.418f, -1.968f, 0.846f, -2.893f)
                curveToRelative(0.653f, -0.581f, 0.669f, -1.63f, 1.303f, -2.135f)
                curveToRelative(0.094f, 0.058f, 0.157f, 0.085f, 0.2f, 0.1f)
                lineToRelative(0.068f, 0.008f)
                horizontalLineToRelative(0.007f)
                curveToRelative(0.09f, -0.095f, -0.888f, -1.116f, 0.02f, -0.712f)
                curveToRelative(0.035f, -0.537f, 0.854f, -0.128f, 0.866f, -0.597f)
                close()
                moveTo(12.665f, 4.212f)
                curveToRelative(-0.323f, 0.009f, -0.574f, 0.13f, -0.645f, 0.335f)
                curveToRelative(-0.114f, 0.33f, 0.273f, 0.755f, 0.866f, 0.96f)
                curveToRelative(0.594f, 0.205f, 1.168f, 0.109f, 1.282f, -0.221f)
                curveToRelative(0.114f, -0.33f, -0.272f, -0.762f, -0.866f, -0.967f)
                arcToRelative(1.842f, 1.842f, 0.0f, false, false, -0.637f, -0.107f)
                close()
            }
        }
        .build()
        return _qemu!!
    }

private var _qemu: ImageVector? = null
