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

public val SimpleIcons.GoogleNews: VectorAsset
    get() {
        if (_googleNews != null) {
            return _googleNews!!
        }
        _googleNews = VectorAssetBuilder(name = "GoogleNews", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0863f, 5.6694f)
                verticalLineToRelative(-2.875f)
                arcToRelative(0.6101f, 0.6101f, 0.0f, false, false, -0.6114f, -0.6073f)
                lineTo(5.5235f, 2.1871f)
                arcToRelative(0.6101f, 0.6101f, 0.0f, false, false, -0.6156f, 0.6074f)
                verticalLineToRelative(2.834f)
                lineToRelative(8.3905f, -3.052f)
                arcToRelative(0.5938f, 0.5938f, 0.0f, false, true, 0.7422f, 0.3895f)
                lineToRelative(0.5448f, 1.4981f)
                close()
                moveTo(23.582f, 7.343f)
                lineToRelative(-8.8032f, -2.3683f)
                lineToRelative(0.7518f, 2.066f)
                horizontalLineToRelative(5.5837f)
                arcToRelative(0.6142f, 0.6142f, 0.0f, false, true, 0.6128f, 0.6128f)
                verticalLineToRelative(8.795f)
                lineToRelative(2.247f, -8.366f)
                arcToRelative(0.5924f, 0.5924f, 0.0f, false, false, -0.3921f, -0.7395f)
                close()
                moveTo(2.27f, 7.6535f)
                arcToRelative(0.6156f, 0.6156f, 0.0f, false, true, 0.613f, -0.6128f)
                horizontalLineToRelative(12.1546f)
                lineToRelative(-1.2693f, -3.4905f)
                arcToRelative(0.5951f, 0.5951f, 0.0f, false, false, -0.7435f, -0.3827f)
                lineTo(0.3674f, 7.7748f)
                arcToRelative(0.5938f, 0.5938f, 0.0f, false, false, -0.3227f, 0.775f)
                lineToRelative(2.2253f, 6.112f)
                close()
                moveTo(2.27f, 7.6535f)
                arcToRelative(0.6156f, 0.6156f, 0.0f, false, true, 0.613f, -0.6128f)
                horizontalLineToRelative(12.1546f)
                lineToRelative(-1.2693f, -3.4905f)
                arcToRelative(0.5951f, 0.5951f, 0.0f, false, false, -0.7435f, -0.3827f)
                lineTo(0.3674f, 7.7748f)
                arcToRelative(0.5938f, 0.5938f, 0.0f, false, false, -0.3227f, 0.775f)
                lineToRelative(2.2253f, 6.112f)
                close()
                moveTo(21.2668f, 21.2f)
                arcToRelative(0.6142f, 0.6142f, 0.0f, false, true, -0.6129f, 0.6129f)
                lineTo(3.3445f, 21.8129f)
                arcToRelative(0.6142f, 0.6142f, 0.0f, false, true, -0.6129f, -0.6129f)
                lineTo(2.7316f, 8.1153f)
                arcToRelative(0.6142f, 0.6142f, 0.0f, false, true, 0.6129f, -0.6129f)
                horizontalLineToRelative(17.3093f)
                arcToRelative(0.6142f, 0.6142f, 0.0f, false, true, 0.6129f, 0.6129f)
                close()
                moveTo(18.2353f, 17.7804f)
                verticalLineToRelative(-1.1958f)
                arcToRelative(0.0804f, 0.0804f, 0.0f, false, false, -0.0804f, -0.0803f)
                horizontalLineToRelative(-5.3726f)
                verticalLineToRelative(1.3619f)
                horizontalLineToRelative(5.3726f)
                arcToRelative(0.0817f, 0.0817f, 0.0f, false, false, 0.0804f, -0.0858f)
                close()
                moveTo(19.0523f, 15.1928f)
                verticalLineToRelative(-1.2012f)
                arcToRelative(0.0804f, 0.0804f, 0.0f, false, false, -0.0803f, -0.0817f)
                horizontalLineToRelative(-6.1897f)
                verticalLineToRelative(1.3619f)
                horizontalLineToRelative(6.1897f)
                arcToRelative(0.079f, 0.079f, 0.0f, false, false, 0.0804f, -0.0817f)
                close()
                moveTo(18.2353f, 12.6053f)
                verticalLineToRelative(-1.2067f)
                arcToRelative(0.0804f, 0.0804f, 0.0f, false, false, -0.0804f, -0.0803f)
                horizontalLineToRelative(-5.3726f)
                verticalLineToRelative(1.3619f)
                horizontalLineToRelative(5.3726f)
                arcToRelative(0.0817f, 0.0817f, 0.0f, false, false, 0.0804f, -0.079f)
                close()
                moveTo(8.1493f, 14.0448f)
                verticalLineToRelative(1.2256f)
                horizontalLineToRelative(1.7704f)
                curveToRelative(-0.1457f, 0.749f, -0.8049f, 1.2925f, -1.7704f, 1.2925f)
                arcToRelative(1.976f, 1.976f, 0.0f, false, true, 0.0f, -3.9495f)
                arcToRelative(1.7704f, 1.7704f, 0.0f, false, true, 1.2529f, 0.4903f)
                lineToRelative(0.9342f, -0.9329f)
                arcToRelative(3.1405f, 3.1405f, 0.0f, false, false, -2.1871f, -0.8525f)
                arcToRelative(3.2685f, 3.2685f, 0.0f, true, false, 0.0f, 6.537f)
                curveToRelative(1.8889f, 0.0f, 3.1323f, -1.3279f, 3.1323f, -3.1977f)
                arcToRelative(3.9576f, 3.9576f, 0.0f, false, false, -0.0518f, -0.6183f)
                close()
            }
        }
        .build()
        return _googleNews!!
    }

private var _googleNews: VectorAsset? = null
