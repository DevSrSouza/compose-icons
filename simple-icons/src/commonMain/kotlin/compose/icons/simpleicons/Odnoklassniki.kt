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

public val SimpleIcons.Odnoklassniki: VectorAsset
    get() {
        if (_odnoklassniki != null) {
            return _odnoklassniki!!
        }
        _odnoklassniki = VectorAssetBuilder(name = "Odnoklassniki", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.505f, 17.44f)
                curveToRelative(1.275f, -0.29f, 2.493f, -0.794f, 3.6f, -1.49f)
                curveToRelative(0.834f, -0.558f, 1.058f, -1.686f, 0.5f, -2.52f)
                curveToRelative(-0.536f, -0.802f, -1.604f, -1.044f, -2.435f, -0.553f)
                curveToRelative(-2.55f, 1.595f, -5.79f, 1.595f, -8.34f, 0.0f)
                curveToRelative(-0.847f, -0.534f, -1.965f, -0.28f, -2.5f, 0.565f)
                curveToRelative(0.0f, 0.002f, 0.0f, 0.004f, -0.002f, 0.005f)
                curveToRelative(-0.534f, 0.847f, -0.28f, 1.966f, 0.567f, 2.5f)
                lineToRelative(0.002f, 0.002f)
                curveToRelative(1.105f, 0.695f, 2.322f, 1.2f, 3.596f, 1.488f)
                lineToRelative(-3.465f, 3.465f)
                curveToRelative(-0.707f, 0.695f, -0.72f, 1.83f, -0.028f, 2.537f)
                lineToRelative(0.03f, 0.03f)
                curveToRelative(0.344f, 0.354f, 0.81f, 0.53f, 1.274f, 0.53f)
                curveToRelative(0.465f, 0.0f, 0.93f, -0.176f, 1.275f, -0.53f)
                lineTo(12.0f, 20.065f)
                lineToRelative(3.404f, 3.406f)
                curveToRelative(0.72f, 0.695f, 1.87f, 0.676f, 2.566f, -0.045f)
                curveToRelative(0.678f, -0.703f, 0.678f, -1.818f, 0.0f, -2.52f)
                lineToRelative(-3.465f, -3.466f)
                close()
                moveTo(12.0f, 12.388f)
                curveToRelative(3.42f, -0.004f, 6.19f, -2.774f, 6.195f, -6.193f)
                curveTo(18.195f, 2.78f, 15.415f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(5.805f, 2.78f, 5.805f, 6.197f)
                curveToRelative(0.005f, 3.42f, 2.776f, 6.19f, 6.195f, 6.192f)
                close()
                moveTo(12.0f, 3.631f)
                curveToRelative(1.416f, 0.002f, 2.563f, 1.15f, 2.564f, 2.565f)
                curveToRelative(0.0f, 1.416f, -1.148f, 2.563f, -2.564f, 2.565f)
                curveToRelative(-1.415f, -0.002f, -2.562f, -1.148f, -2.565f, -2.564f)
                curveTo(9.437f, 4.78f, 10.585f, 3.633f, 12.0f, 3.63f)
                close()
            }
        }
        .build()
        return _odnoklassniki!!
    }

private var _odnoklassniki: VectorAsset? = null
