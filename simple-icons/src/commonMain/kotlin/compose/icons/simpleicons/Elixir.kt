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

public val SimpleIcons.Elixir: VectorAsset
    get() {
        if (_elixir != null) {
            return _elixir!!
        }
        _elixir = VectorAssetBuilder(name = "Elixir", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.789f, 16.578f)
                curveToRelative(0.0f, 3.75f, -2.926f, 7.422f, -7.739f, 7.422f)
                curveToRelative(-5.246f, 0.0f, -7.839f, -3.708f, -7.839f, -8.285f)
                curveToRelative(0.0f, -5.207f, 3.89f, -12.946f, 7.995f, -15.639f)
                curveToRelative(0.277f, -0.182f, 0.643f, 0.041f, 0.611f, 0.371f)
                curveToRelative(-0.03f, 0.313f, -0.046f, 0.631f, -0.046f, 0.951f)
                curveToRelative(0.0f, 2.067f, 0.641f, 3.985f, 1.738f, 5.563f)
                curveToRelative(0.522f, 0.795f, 1.092f, 1.477f, 1.763f, 2.351f)
                curveToRelative(0.94f, 1.226f, 1.636f, 1.905f, 2.642f, 3.84f)
                curveToRelative(0.005f, 0.01f, 0.01f, 0.018f, 0.015f, 0.028f)
                curveTo(19.48f, 14.197f, 19.789f, 15.352f, 19.789f, 16.578f)
                close()
            }
        }
        .build()
        return _elixir!!
    }

private var _elixir: VectorAsset? = null
