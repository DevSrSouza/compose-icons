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

public val SimpleIcons.Sketchup: VectorAsset
    get() {
        if (_sketchup != null) {
            return _sketchup!!
        }
        _sketchup = VectorAssetBuilder(name = "Sketchup", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.537f, 0.0f)
                lineTo(0.951f, 1.9f)
                verticalLineToRelative(0.11f)
                lineToRelative(2.107f, 12.595f)
                lineTo(6.053f, 24.0f)
                lineToRelative(15.387f, -4.381f)
                lineToRelative(1.608f, -13.725f)
                close()
                moveTo(15.147f, 1.458f)
                lineToRelative(6.062f, 4.764f)
                lineToRelative(-5.387f, 0.969f)
                lineToRelative(-3.289f, -3.422f)
                lineToRelative(-9.155f, 1.333f)
                lineToRelative(-0.835f, -1.999f)
                close()
                moveTo(12.657f, 7.458f)
                lineToRelative(3.121f, 3.892f)
                lineToRelative(-5.058f, 1.077f)
                lineToRelative(-1.209f, -2.08f)
                lineToRelative(-4.658f, 0.907f)
                lineToRelative(-0.845f, -2.267f)
                close()
                moveTo(9.857f, 14.472f)
                lineToRelative(1.148f, 2.257f)
                lineToRelative(-4.675f, 1.165f)
                lineToRelative(-0.827f, -2.427f)
                close()
            }
        }
        .build()
        return _sketchup!!
    }

private var _sketchup: VectorAsset? = null
