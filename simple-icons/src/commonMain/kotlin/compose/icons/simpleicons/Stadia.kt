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

public val SimpleIcons.Stadia: VectorAsset
    get() {
        if (_stadia != null) {
            return _stadia!!
        }
        _stadia = VectorAssetBuilder(name = "Stadia", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.202f, 8.668f)
                arcToRelative(0.482f, 0.482f, 0.0f, false, false, -0.202f, 0.39f)
                verticalLineToRelative(0.006f)
                curveToRelative(0.0f, 0.064f, 0.014f, 0.128f, 0.04f, 0.19f)
                lineToRelative(2.298f, 5.204f)
                curveToRelative(0.102f, 0.23f, 0.364f, 0.343f, 0.602f, 0.259f)
                curveToRelative(1.504f, -0.536f, 6.713f, -2.233f, 10.083f, -1.318f)
                curveToRelative(0.0f, 0.0f, -3.381f, 0.196f, -6.438f, 2.593f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, false, -0.142f, 0.571f)
                lineToRelative(1.029f, 2.326f)
                lineToRelative(0.396f, 0.929f)
                curveToRelative(0.094f, 0.22f, 0.395f, 0.247f, 0.528f, 0.047f)
                curveToRelative(0.713f, -1.074f, 1.916f, -1.611f, 3.072f, -2.08f)
                arcToRelative(17.647f, 17.647f, 0.0f, false, true, 3.679f, -1.05f)
                arcToRelative(15.993f, 15.993f, 0.0f, false, true, 4.07f, -0.167f)
                arcToRelative(0.481f, 0.481f, 0.0f, false, false, 0.503f, -0.335f)
                lineToRelative(1.038f, -3.317f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, false, -0.176f, -0.531f)
                curveToRelative(-1.158f, -0.838f, -5.741f, -3.654f, -13.802f, -2.523f)
                curveToRelative(0.0f, 0.0f, 6.878f, -3.951f, 15.61f, 0.39f)
                arcToRelative(0.481f, 0.481f, 0.0f, false, false, 0.673f, -0.288f)
                lineToRelative(0.915f, -2.925f)
                arcTo(0.484f, 0.484f, 0.0f, false, false, 24.0f, 6.902f)
                verticalLineToRelative(-0.014f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, false, -0.243f, -0.41f)
                curveTo(22.66f, 5.858f, 18.95f, 4.0f, 13.846f, 4.0f)
                curveTo(9.934f, 4.0f, 5.203f, 5.09f, 0.202f, 8.668f)
            }
        }
        .build()
        return _stadia!!
    }

private var _stadia: VectorAsset? = null
