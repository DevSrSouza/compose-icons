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

public val SimpleIcons.Garmin: VectorAsset
    get() {
        if (_garmin != null) {
            return _garmin!!
        }
        _garmin = VectorAssetBuilder(name = "Garmin", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.017f, 22.67f)
                horizontalLineTo(1.984f)
                curveToRelative(-0.77f, 0.0f, -1.388f, -0.383f, -1.694f, -1.002f)
                curveToRelative(-0.387f, -0.61f, -0.387f, -1.39f, 0.0f, -2.002f)
                lineTo(10.304f, 2.33f)
                curveToRelative(0.385f, -0.615f, 1.002f, -1.0f, 1.695f, -1.0f)
                curveToRelative(0.77f, 0.0f, 1.386f, 0.385f, 1.69f, 1.0f)
                lineToRelative(10.02f, 17.336f)
                curveToRelative(0.387f, 0.617f, 0.387f, 1.39f, 0.0f, 2.002f)
                curveToRelative(-0.31f, 0.695f, -0.927f, 1.002f, -1.693f, 1.002f)
                close()
            }
        }
        .build()
        return _garmin!!
    }

private var _garmin: VectorAsset? = null
