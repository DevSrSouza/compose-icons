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

public val SimpleIcons.Ovh: VectorAsset
    get() {
        if (_ovh != null) {
            return _ovh!!
        }
        _ovh = VectorAssetBuilder(name = "Ovh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.881f, 10.095f)
                lineToRelative(2.563f, -4.45f)
                curveTo(23.434f, 7.389f, 24.0f, 9.404f, 24.0f, 11.555f)
                curveToRelative(0.0f, 2.88f, -1.017f, 5.523f, -2.71f, 7.594f)
                horizontalLineToRelative(-6.62f)
                lineToRelative(2.04f, -3.541f)
                horizontalLineToRelative(-2.696f)
                lineToRelative(3.176f, -5.513f)
                horizontalLineToRelative(2.691f)
                close()
                moveTo(17.561f, 4.852f)
                lineTo(9.333f, 19.14f)
                lineToRelative(0.003f, 0.009f)
                lineTo(2.709f, 19.149f)
                curveTo(1.014f, 17.077f, 0.0f, 14.435f, 0.0f, 11.555f)
                curveToRelative(0.0f, -2.152f, 0.57f, -4.17f, 1.561f, -5.918f)
                lineTo(5.855f, 13.1f)
                lineTo(10.6f, 4.852f)
                horizontalLineToRelative(6.961f)
                close()
            }
        }
        .build()
        return _ovh!!
    }

private var _ovh: VectorAsset? = null
