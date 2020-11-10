package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.AdobeIndesign: VectorAsset
    get() {
        if (_adobeIndesign != null) {
            return _adobeIndesign!!
        }
        _adobeIndesign = VectorAssetBuilder(name = "AdobeIndesign", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.3f)
                verticalLineToRelative(23.4f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.3f)
                lineTo(0.0f, 0.3f)
                close()
                moveTo(1.0f, 1.3f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(21.4f)
                lineTo(1.0f, 22.7f)
                lineTo(1.0f, 1.3f)
                close()
                moveTo(8.775f, 16.518f)
                curveToRelative(0.0f, 0.1f, -0.017f, 0.132f, -0.132f, 0.132f)
                lineTo(7.107f, 16.65f)
                curveToRelative(-0.1f, 0.0f, -0.132f, -0.05f, -0.132f, -0.132f)
                lineTo(6.975f, 5.782f)
                curveToRelative(0.0f, -0.1f, 0.05f, -0.132f, 0.132f, -0.132f)
                lineTo(8.66f, 5.65f)
                curveToRelative(0.082f, 0.0f, 0.115f, 0.033f, 0.115f, 0.116f)
                verticalLineToRelative(10.752f)
                close()
                moveTo(10.545f, 12.646f)
                curveToRelative(0.0f, -2.393f, 1.578f, -4.257f, 4.102f, -4.257f)
                curveToRelative(0.214f, 0.0f, 0.33f, 0.0f, 0.528f, 0.015f)
                lineTo(15.175f, 5.75f)
                curveToRelative(0.0f, -0.066f, 0.05f, -0.1f, 0.1f, -0.1f)
                lineTo(16.9f, 5.65f)
                curveToRelative(0.084f, 0.0f, 0.1f, 0.034f, 0.1f, 0.084f)
                verticalLineToRelative(9.355f)
                curveToRelative(0.0f, 0.28f, 0.0f, 0.625f, 0.05f, 1.004f)
                curveToRelative(0.0f, 0.066f, -0.02f, 0.083f, -0.087f, 0.116f)
                curveToRelative(-0.858f, 0.413f, -1.766f, 0.595f, -2.624f, 0.595f)
                curveToRelative(-2.213f, 0.0f, -3.797f, -1.37f, -3.797f, -4.158f)
                close()
                moveTo(15.175f, 10.022f)
                curveToRelative(-0.148f, -0.066f, -0.347f, -0.1f, -0.594f, -0.1f)
                curveToRelative(-1.285f, 0.0f, -2.187f, 0.99f, -2.187f, 2.64f)
                curveToRelative(0.0f, 1.882f, 0.918f, 2.64f, 2.073f, 2.64f)
                curveToRelative(0.247f, 0.0f, 0.512f, -0.032f, 0.71f, -0.115f)
                verticalLineToRelative(-5.065f)
                close()
            }
        }
        .build()
        return _adobeIndesign!!
    }

private var _adobeIndesign: VectorAsset? = null
