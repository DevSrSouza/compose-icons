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

public val SimpleIcons.Buffer: VectorAsset
    get() {
        if (_buffer != null) {
            return _buffer!!
        }
        _buffer = VectorAssetBuilder(name = "Buffer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.784f, 18.24f)
                curveToRelative(0.287f, 0.142f, 0.287f, 0.267f, 0.0f, 0.374f)
                lineToRelative(-11.357f, 5.223f)
                curveToRelative(-0.287f, 0.145f, -0.57f, 0.145f, -0.854f, 0.0f)
                lineTo(0.213f, 18.614f)
                curveToRelative(-0.284f, -0.107f, -0.284f, -0.232f, 0.0f, -0.375f)
                lineToRelative(2.722f, -1.23f)
                curveToRelative(0.284f, -0.14f, 0.57f, -0.14f, 0.852f, 0.0f)
                lineToRelative(7.787f, 3.573f)
                curveToRelative(0.285f, 0.14f, 0.57f, 0.14f, 0.854f, 0.0f)
                lineToRelative(7.787f, -3.574f)
                curveToRelative(0.283f, -0.14f, 0.568f, -0.14f, 0.852f, 0.0f)
                lineToRelative(2.717f, 1.23f)
                close()
                moveTo(23.784f, 11.786f)
                curveToRelative(0.287f, 0.143f, 0.287f, 0.285f, 0.0f, 0.426f)
                lineTo(12.427f, 17.44f)
                curveToRelative(-0.287f, 0.104f, -0.57f, 0.104f, -0.854f, 0.0f)
                lineTo(0.213f, 12.21f)
                curveToRelative(-0.284f, -0.143f, -0.284f, -0.284f, 0.0f, -0.426f)
                lineToRelative(2.722f, -1.227f)
                curveToRelative(0.284f, -0.144f, 0.57f, -0.144f, 0.852f, 0.0f)
                lineToRelative(7.787f, 3.57f)
                curveToRelative(0.285f, 0.144f, 0.57f, 0.144f, 0.854f, 0.0f)
                lineToRelative(7.787f, -3.57f)
                curveToRelative(0.283f, -0.144f, 0.568f, -0.144f, 0.852f, 0.0f)
                lineToRelative(2.717f, 1.226f)
                close()
                moveTo(0.214f, 5.76f)
                curveToRelative(-0.285f, -0.143f, -0.285f, -0.267f, 0.0f, -0.375f)
                lineTo(11.574f, 0.16f)
                curveToRelative(0.283f, -0.14f, 0.57f, -0.14f, 0.852f, 0.0f)
                lineToRelative(11.358f, 5.23f)
                curveToRelative(0.287f, 0.107f, 0.287f, 0.232f, 0.0f, 0.375f)
                lineToRelative(-11.357f, 5.223f)
                curveToRelative(-0.287f, 0.143f, -0.57f, 0.143f, -0.854f, 0.0f)
                lineTo(0.213f, 5.76f)
                close()
            }
        }
        .build()
        return _buffer!!
    }

private var _buffer: VectorAsset? = null
