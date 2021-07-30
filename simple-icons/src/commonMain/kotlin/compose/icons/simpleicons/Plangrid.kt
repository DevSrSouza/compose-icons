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

public val SimpleIcons.Plangrid: ImageVector
    get() {
        if (_plangrid != null) {
            return _plangrid!!
        }
        _plangrid = Builder(name = "Plangrid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.6f, 0.0f)
                curveToRelative(2.6f, 0.0f, 4.262f, 0.009f, 5.828f, 1.574f)
                curveTo(23.99f, 3.141f, 24.0f, 4.794f, 24.0f, 7.401f)
                verticalLineToRelative(9.2f)
                curveToRelative(0.0f, 2.6f, -0.01f, 4.261f, -1.574f, 5.828f)
                curveTo(20.859f, 23.991f, 19.207f, 24.0f, 16.598f, 24.0f)
                horizontalLineToRelative(-9.2f)
                curveToRelative(-2.599f, 0.0f, -4.26f, -0.009f, -5.827f, -1.574f)
                curveTo(0.01f, 20.861f, 0.0f, 19.207f, 0.0f, 16.599f)
                verticalLineToRelative(-9.2f)
                curveTo(0.0f, 4.8f, 0.01f, 3.138f, 1.574f, 1.572f)
                curveTo(3.141f, 0.01f, 4.793f, 0.0f, 7.4f, 0.0f)
                horizontalLineToRelative(9.201f)
                horizontalLineToRelative(-0.001f)
                close()
                moveTo(20.998f, 11.151f)
                curveTo(20.57f, 6.578f, 16.684f, 3.002f, 12.0f, 3.002f)
                curveToRelative(-4.971f, 0.0f, -9.0f, 4.027f, -9.0f, 8.998f)
                curveToRelative(0.0f, 4.801f, 3.752f, 8.734f, 8.485f, 9.0f)
                horizontalLineToRelative(7.136f)
                curveToRelative(1.313f, -0.003f, 2.375f, -1.066f, 2.379f, -2.381f)
                verticalLineToRelative(-7.47f)
                lineToRelative(-0.002f, 0.002f)
                close()
                moveTo(18.713f, 19.74f)
                curveToRelative(-0.564f, 0.0f, -1.023f, -0.46f, -1.023f, -1.024f)
                curveToRelative(0.0f, -0.566f, 0.459f, -1.024f, 1.023f, -1.024f)
                curveToRelative(0.566f, 0.0f, 1.025f, 0.458f, 1.025f, 1.024f)
                curveToRelative(0.0f, 0.564f, -0.459f, 1.024f, -1.025f, 1.024f)
                close()
                moveTo(12.0f, 18.949f)
                curveTo(8.163f, 18.945f, 5.055f, 15.836f, 5.051f, 12.0f)
                curveTo(5.055f, 8.164f, 8.163f, 5.055f, 12.0f, 5.051f)
                curveToRelative(3.836f, 0.004f, 6.945f, 3.113f, 6.949f, 6.949f)
                curveToRelative(-0.004f, 3.836f, -3.113f, 6.945f, -6.949f, 6.949f)
                close()
            }
        }
        .build()
        return _plangrid!!
    }

private var _plangrid: ImageVector? = null
