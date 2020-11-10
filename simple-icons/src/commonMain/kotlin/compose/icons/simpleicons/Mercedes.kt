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

public val SimpleIcons.Mercedes: VectorAsset
    get() {
        if (_mercedes != null) {
            return _mercedes!!
        }
        _mercedes = VectorAssetBuilder(name = "Mercedes", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.005f, 0.0f)
                curveToRelative(6.623f, 0.0f, 12.0f, 5.377f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.377f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveToRelative(-12.0f, -5.377f, -12.0f, -12.0f)
                reflectiveCurveToRelative(5.377f, -12.0f, 12.0f, -12.0f)
                close()
                moveTo(3.25f, 17.539f)
                arcToRelative(10.357f, 10.357f, 0.0f, false, false, 8.755f, 4.821f)
                curveToRelative(3.681f, 0.0f, 6.917f, -1.924f, 8.755f, -4.821f)
                lineToRelative(-8.755f, -3.336f)
                lineToRelative(-8.755f, 3.336f)
                close()
                moveTo(13.913f, 10.898f)
                lineToRelative(7.267f, 5.915f)
                arcTo(10.306f, 10.306f, 0.0f, false, false, 22.365f, 12.0f)
                curveToRelative(0.0f, -5.577f, -4.417f, -10.131f, -9.94f, -10.352f)
                lineToRelative(1.488f, 9.25f)
                close()
                moveTo(11.585f, 1.648f)
                curveTo(6.062f, 1.869f, 1.645f, 6.423f, 1.645f, 12.0f)
                curveToRelative(0.0f, 1.737f, 0.428f, 3.374f, 1.185f, 4.813f)
                lineToRelative(7.267f, -5.915f)
                lineToRelative(1.488f, -9.25f)
                close()
            }
        }
        .build()
        return _mercedes!!
    }

private var _mercedes: VectorAsset? = null
