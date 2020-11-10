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

public val SimpleIcons.Indeed: VectorAsset
    get() {
        if (_indeed != null) {
            return _indeed!!
        }
        _indeed = VectorAssetBuilder(name = "Indeed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.822f, 10.308f)
                arcToRelative(3.018f, 3.018f, 0.0f, true, true, 1.32f, -4.038f)
                arcToRelative(3.006f, 3.006f, 0.0f, false, true, -1.32f, 4.044f)
                close()
                moveTo(11.6f, 0.572f)
                curveToRelative(2.47f, -0.901f, 5.294f, -0.852f, 7.408f, 0.982f)
                arcToRelative(3.587f, 3.587f, 0.0f, false, true, 1.023f, 1.37f)
                curveToRelative(0.213f, 0.69f, -0.749f, -0.07f, -0.88f, -0.168f)
                arcToRelative(9.407f, 9.407f, 0.0f, false, false, -2.15f, -1.095f)
                curveTo(12.837f, 0.386f, 8.897f, 2.707f, 6.463f, 6.316f)
                arcToRelative(19.505f, 19.505f, 0.0f, false, false, -2.248f, 5.126f)
                arcToRelative(2.918f, 2.918f, 0.0f, false, true, -0.213f, 0.642f)
                curveToRelative(-0.107f, 0.204f, -0.049f, -0.547f, -0.049f, -0.572f)
                arcToRelative(15.821f, 15.821f, 0.0f, false, true, 0.43f, -2.239f)
                curveTo(5.511f, 5.34f, 8.01f, 2.065f, 11.6f, 0.565f)
                close()
                moveTo(11.637f, 21.565f)
                verticalLineToRelative(-8.763f)
                curveToRelative(0.249f, 0.025f, 0.486f, 0.037f, 0.736f, 0.037f)
                arcToRelative(6.167f, 6.167f, 0.0f, false, false, 3.219f, -0.895f)
                verticalLineToRelative(9.62f)
                curveToRelative(0.0f, 0.822f, -0.15f, 1.43f, -0.52f, 1.826f)
                arcTo(1.874f, 1.874f, 0.0f, false, true, 13.62f, 24.0f)
                arcToRelative(1.825f, 1.825f, 0.0f, false, true, -1.427f, -0.609f)
                curveToRelative(-0.368f, -0.404f, -0.56f, -1.013f, -0.56f, -1.825f)
                close()
            }
        }
        .build()
        return _indeed!!
    }

private var _indeed: VectorAsset? = null
