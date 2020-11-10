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

public val SimpleIcons.Atlassian: VectorAsset
    get() {
        if (_atlassian != null) {
            return _atlassian!!
        }
        _atlassian = VectorAssetBuilder(name = "Atlassian", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.31f, 23.957f)
                lineTo(15.71f, 23.957f)
                arcToRelative(1.26f, 1.26f, 0.0f, false, true, -1.312f, -0.792f)
                curveToRelative(-1.332f, -2.665f, -2.78f, -5.288f, -3.987f, -8.046f)
                arcToRelative(15.25f, 15.25f, 0.0f, false, true, 0.885f, -14.47f)
                curveToRelative(0.166f, -0.281f, 0.52f, -0.625f, 0.791f, -0.625f)
                reflectiveCurveToRelative(0.593f, 0.375f, 0.74f, 0.666f)
                quadToRelative(5.444f, 10.89f, 10.898f, 21.788f)
                curveToRelative(0.542f, 1.041f, 0.292f, 1.468f, -0.905f, 1.479f)
                close()
                moveTo(4.737f, 23.957f)
                lineTo(1.04f, 23.957f)
                curveToRelative(-1.041f, 0.0f, -1.27f, -0.417f, -0.812f, -1.333f)
                quadToRelative(2.8f, -5.538f, 5.549f, -11.055f)
                curveToRelative(0.5f, -1.041f, 0.895f, -1.041f, 1.592f, -0.177f)
                arcToRelative(12.221f, 12.221f, 0.0f, false, true, 2.51f, 11.17f)
                curveToRelative(-0.344f, 1.322f, -0.532f, 1.405f, -1.864f, 1.405f)
                close()
            }
        }
        .build()
        return _atlassian!!
    }

private var _atlassian: VectorAsset? = null
