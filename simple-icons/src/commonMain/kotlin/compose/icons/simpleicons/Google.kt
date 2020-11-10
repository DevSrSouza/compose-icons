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

public val SimpleIcons.Google: VectorAsset
    get() {
        if (_google != null) {
            return _google!!
        }
        _google = VectorAssetBuilder(name = "Google", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.24f, 10.285f)
                verticalLineTo(14.4f)
                horizontalLineToRelative(6.806f)
                curveToRelative(-0.275f, 1.765f, -2.056f, 5.174f, -6.806f, 5.174f)
                curveToRelative(-4.095f, 0.0f, -7.439f, -3.389f, -7.439f, -7.574f)
                reflectiveCurveToRelative(3.345f, -7.574f, 7.439f, -7.574f)
                curveToRelative(2.33f, 0.0f, 3.891f, 0.989f, 4.785f, 1.849f)
                lineToRelative(3.254f, -3.138f)
                curveTo(18.189f, 1.186f, 15.479f, 0.0f, 12.24f, 0.0f)
                curveToRelative(-6.635f, 0.0f, -12.0f, 5.365f, -12.0f, 12.0f)
                reflectiveCurveToRelative(5.365f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.926f, 0.0f, 11.52f, -4.869f, 11.52f, -11.726f)
                curveToRelative(0.0f, -0.788f, -0.085f, -1.39f, -0.189f, -1.989f)
                horizontalLineTo(12.24f)
                close()
            }
        }
        .build()
        return _google!!
    }

private var _google: VectorAsset? = null
