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

public val SimpleIcons.C: VectorAsset
    get() {
        if (_c != null) {
            return _c!!
        }
        _c = VectorAssetBuilder(name = "C", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.023f, 9.216f)
                reflectiveCurveToRelative(-0.386f, -3.293f, -3.955f, -3.385f)
                curveToRelative(-3.57f, -0.091f, -5.402f, 2.47f, -5.402f, 6.13f)
                curveToRelative(0.0f, 3.66f, 2.026f, 6.588f, 5.498f, 6.588f)
                curveToRelative(3.473f, 0.0f, 3.86f, -3.66f, 3.86f, -3.66f)
                lineToRelative(6.656f, 0.366f)
                reflectiveCurveToRelative(0.391f, 3.306f, -2.394f, 5.828f)
                curveTo(18.5f, 23.605f, 15.082f, 24.017f, 12.694f, 24.0f)
                curveToRelative(-2.388f, -0.018f, -5.698f, 0.034f, -8.9f, -2.969f)
                curveTo(0.595f, 18.03f, 0.05f, 15.113f, 0.05f, 12.248f)
                curveToRelative(0.0f, -2.866f, 0.607f, -6.661f, 4.414f, -9.54f)
                curveTo(7.05f, 0.754f, 9.673f, 0.033f, 12.296f, 0.033f)
                curveTo(23.246f, 0.032f, 23.98f, 9.28f, 23.98f, 9.28f)
                close()
            }
        }
        .build()
        return _c!!
    }

private var _c: VectorAsset? = null
