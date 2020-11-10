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

public val SimpleIcons.Dash: VectorAsset
    get() {
        if (_dash != null) {
            return _dash!!
        }
        _dash = VectorAssetBuilder(name = "Dash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.211f, 9.967f)
                curveToRelative(-2.29f, 0.0f, -2.617f, 1.49f, -2.832f, 2.393f)
                curveTo(0.093f, 13.538f, 0.0f, 14.02f, 0.0f, 14.02f)
                horizontalLineToRelative(8.947f)
                curveToRelative(2.29f, 0.0f, 2.617f, -1.492f, 2.832f, -2.394f)
                curveToRelative(0.285f, -1.178f, 0.379f, -1.66f, 0.379f, -1.66f)
                close()
                moveTo(15.72f, 2.259f)
                horizontalLineTo(6.983f)
                lineTo(6.26f, 6.307f)
                lineToRelative(7.885f, 0.01f)
                curveToRelative(3.885f, 0.0f, 5.03f, 1.41f, 4.997f, 3.748f)
                curveToRelative(-0.019f, 1.196f, -0.537f, 3.225f, -0.762f, 3.884f)
                curveToRelative(-0.598f, 1.753f, -1.827f, 3.749f, -6.436f, 3.744f)
                lineToRelative(-7.666f, -0.004f)
                lineToRelative(-0.725f, 4.052f)
                horizontalLineToRelative(8.718f)
                curveToRelative(3.076f, 0.0f, 4.38f, -0.36f, 5.768f, -0.995f)
                curveToRelative(3.071f, -1.426f, 4.899f, -4.455f, 5.633f, -8.41f)
                curveTo(24.76f, 6.448f, 23.404f, 2.26f, 15.72f, 2.26f)
                close()
            }
        }
        .build()
        return _dash!!
    }

private var _dash: VectorAsset? = null
