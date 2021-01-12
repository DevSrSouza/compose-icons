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
                moveTo(14.8224f, 10.3074f)
                arcToRelative(3.0179f, 3.0179f, 0.0f, true, true, 1.32f, -4.0379f)
                arcToRelative(3.0059f, 3.0059f, 0.0f, false, true, -1.32f, 4.0439f)
                close()
                moveTo(11.6005f, 0.5718f)
                curveToRelative(2.47f, -0.901f, 5.2938f, -0.852f, 7.4077f, 0.982f)
                arcToRelative(3.5869f, 3.5869f, 0.0f, false, true, 1.023f, 1.3699f)
                curveToRelative(0.213f, 0.69f, -0.749f, -0.07f, -0.88f, -0.168f)
                arcToRelative(9.4066f, 9.4066f, 0.0f, false, false, -2.1499f, -1.095f)
                curveTo(12.8375f, 0.3857f, 8.8976f, 2.7067f, 6.4637f, 6.3155f)
                arcToRelative(19.5042f, 19.5042f, 0.0f, false, false, -2.2479f, 5.1258f)
                arcToRelative(2.9179f, 2.9179f, 0.0f, false, true, -0.213f, 0.642f)
                curveToRelative(-0.107f, 0.204f, -0.049f, -0.547f, -0.049f, -0.572f)
                arcToRelative(15.8203f, 15.8203f, 0.0f, false, true, 0.43f, -2.2389f)
                curveToRelative(1.128f, -3.9328f, 3.6269f, -7.2077f, 7.2167f, -8.7076f)
                close()
                moveTo(11.6375f, 21.5638f)
                verticalLineToRelative(-8.7625f)
                curveToRelative(0.249f, 0.025f, 0.486f, 0.037f, 0.736f, 0.037f)
                arcToRelative(6.1667f, 6.1667f, 0.0f, false, false, 3.2189f, -0.895f)
                verticalLineToRelative(9.6196f)
                curveToRelative(0.0f, 0.822f, -0.15f, 1.43f, -0.52f, 1.826f)
                arcToRelative(1.874f, 1.874f, 0.0f, false, true, -1.452f, 0.6099f)
                arcToRelative(1.825f, 1.825f, 0.0f, false, true, -1.4269f, -0.609f)
                curveToRelative(-0.368f, -0.404f, -0.56f, -1.013f, -0.56f, -1.825f)
                close()
            }
        }
        .build()
        return _indeed!!
    }

private var _indeed: VectorAsset? = null
