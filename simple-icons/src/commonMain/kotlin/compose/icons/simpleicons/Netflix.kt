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

public val SimpleIcons.Netflix: VectorAsset
    get() {
        if (_netflix != null) {
            return _netflix!!
        }
        _netflix = VectorAssetBuilder(name = "Netflix", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.398f, 0.0f)
                verticalLineToRelative(0.006f)
                curveToRelative(3.028f, 8.556f, 5.37f, 15.175f, 8.348f, 23.596f)
                curveToRelative(2.344f, 0.058f, 4.85f, 0.398f, 4.854f, 0.398f)
                curveToRelative(-2.8f, -7.924f, -5.923f, -16.747f, -8.487f, -24.0f)
                close()
                moveTo(13.887f, 0.0f)
                verticalLineToRelative(9.63f)
                lineTo(18.6f, 22.951f)
                curveToRelative(-0.043f, -7.86f, -0.004f, -15.913f, 0.002f, -22.95f)
                close()
                moveTo(5.398f, 1.05f)
                lineTo(5.398f, 24.0f)
                curveToRelative(1.873f, -0.225f, 2.81f, -0.312f, 4.715f, -0.398f)
                verticalLineToRelative(-9.22f)
                close()
            }
        }
        .build()
        return _netflix!!
    }

private var _netflix: VectorAsset? = null
