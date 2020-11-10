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

public val SimpleIcons.DotNet: VectorAsset
    get() {
        if (_dotNet != null) {
            return _dotNet!!
        }
        _dotNet = VectorAssetBuilder(name = "DotNet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.1672f, 7.5655f)
                verticalLineToRelative(8.749f)
                lineTo(4.19f, 16.3145f)
                verticalLineToRelative(-6.325f)
                arcToRelative(8.979f, 8.979f, 0.0f, false, false, -0.0488f, -1.1998f)
                horizontalLineToRelative(0.0384f)
                arcToRelative(2.9082f, 2.9082f, 0.0f, false, false, 0.2784f, 0.5473f)
                lineToRelative(4.4973f, 6.9774f)
                horizontalLineToRelative(1.2569f)
                lineTo(10.2122f, 7.5655f)
                lineTo(9.1904f, 7.5655f)
                verticalLineToRelative(6.1526f)
                arcToRelative(9.2574f, 9.2574f, 0.0f, false, false, 0.0619f, 1.286f)
                horizontalLineToRelative(-0.0234f)
                curveToRelative(-0.0544f, -0.1056f, -0.173f, -0.3002f, -0.3553f, -0.585f)
                lineTo(4.4964f, 7.5656f)
                close()
                moveTo(12.4822f, 7.5655f)
                verticalLineToRelative(8.749f)
                horizontalLineToRelative(4.65f)
                lineToRelative(0.0048f, -0.9599f)
                horizontalLineToRelative(-3.6087f)
                verticalLineToRelative(-3.0331f)
                horizontalLineToRelative(3.1579f)
                lineTo(16.6862f, 11.4f)
                horizontalLineToRelative(-3.1579f)
                lineTo(13.5283f, 8.4916f)
                horizontalLineToRelative(3.3884f)
                verticalLineToRelative(-0.926f)
                close()
                moveTo(17.9196f, 7.5655f)
                verticalLineToRelative(0.926f)
                horizontalLineToRelative(2.5149f)
                verticalLineToRelative(7.823f)
                horizontalLineToRelative(1.0216f)
                verticalLineToRelative(-7.823f)
                lineTo(24.0f, 8.4915f)
                verticalLineToRelative(-0.926f)
                close()
                moveTo(0.6534f, 15.067f)
                arcToRelative(0.643f, 0.643f, 0.0f, false, false, -0.4565f, 0.2062f)
                arcTo(0.6719f, 0.6719f, 0.0f, false, false, 0.0f, 15.753f)
                arcToRelative(0.6623f, 0.6623f, 0.0f, false, false, 0.1968f, 0.4799f)
                arcToRelative(0.6479f, 0.6479f, 0.0f, false, false, 0.4799f, 0.2015f)
                arcToRelative(0.6623f, 0.6623f, 0.0f, false, false, 0.4799f, -0.2015f)
                arcToRelative(0.6575f, 0.6575f, 0.0f, false, false, 0.2015f, -0.48f)
                arcToRelative(0.667f, 0.667f, 0.0f, false, false, -0.2015f, -0.4798f)
                arcToRelative(0.6575f, 0.6575f, 0.0f, false, false, -0.4799f, -0.2062f)
                arcToRelative(0.643f, 0.643f, 0.0f, false, false, -0.0234f, 0.0f)
                close()
            }
        }
        .build()
        return _dotNet!!
    }

private var _dotNet: VectorAsset? = null
