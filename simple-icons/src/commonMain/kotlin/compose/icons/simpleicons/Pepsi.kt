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

public val SimpleIcons.Pepsi: VectorAsset
    get() {
        if (_pepsi != null) {
            return _pepsi!!
        }
        _pepsi = VectorAssetBuilder(name = "Pepsi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(8.93f, 0.0f, 5.86f, 1.17f, 3.517f, 3.514f)
                curveToRelative(-4.688f, 4.686f, -4.688f, 12.284f, 0.0f, 16.971f)
                curveToRelative(4.685f, 4.686f, 12.284f, 4.687f, 16.97f, 0.0f)
                curveToRelative(4.686f, -4.687f, 4.686f, -12.286f, -0.002f, -16.97f)
                arcTo(11.958f, 11.958f, 0.0f, false, false, 12.001f, 0.0f)
                close()
                moveTo(12.0f, 0.864f)
                curveToRelative(2.506f, 0.0f, 4.817f, 0.828f, 6.678f, 2.226f)
                arcToRelative(23.118f, 23.118f, 0.0f, false, true, -15.64f, 15.52f)
                arcTo(11.085f, 11.085f, 0.0f, false, true, 0.865f, 12.0f)
                curveTo(0.865f, 5.85f, 5.85f, 0.864f, 12.0f, 0.864f)
                close()
                moveTo(21.342f, 5.944f)
                arcTo(11.082f, 11.082f, 0.0f, false, true, 23.136f, 12.0f)
                curveToRelative(0.0f, 6.15f, -4.986f, 11.135f, -11.136f, 11.135f)
                arcToRelative(11.11f, 11.11f, 0.0f, false, true, -8.542f, -3.994f)
                curveToRelative(6.766f, -2.132f, 11.665f, -2.135f, 15.027f, -4.611f)
                curveToRelative(1.933f, -1.425f, 3.205f, -3.698f, 3.205f, -6.283f)
                curveToRelative(0.0f, -0.802f, -0.123f, -1.575f, -0.348f, -2.303f)
                close()
            }
        }
        .build()
        return _pepsi!!
    }

private var _pepsi: VectorAsset? = null
