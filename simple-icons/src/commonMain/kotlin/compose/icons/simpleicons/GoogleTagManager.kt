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

public val SimpleIcons.GoogleTagManager: VectorAsset
    get() {
        if (_googleTagManager != null) {
            return _googleTagManager!!
        }
        _googleTagManager = VectorAssetBuilder(name = "GoogleTagManager", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.929f, 18.136f)
                curveToRelative(1.619f, 0.0f, 2.932f, 1.313f, 2.932f, 2.932f)
                reflectiveCurveTo(13.549f, 24.0f, 11.929f, 24.0f)
                reflectiveCurveToRelative(-2.932f, -1.313f, -2.932f, -2.932f)
                reflectiveCurveTo(10.31f, 18.136f, 11.929f, 18.136f)
                close()
                moveTo(23.119f, 9.878f)
                lineToRelative(-9.0f, -9.0f)
                curveToRelative(-1.171f, -1.171f, -3.071f, -1.171f, -4.242f, 0.0f)
                curveToRelative(-1.171f, 1.171f, -1.171f, 3.071f, 0.0f, 4.242f)
                lineToRelative(6.866f, 6.866f)
                lineToRelative(-4.493f, 4.588f)
                lineToRelative(2.119f, 2.211f)
                curveToRelative(0.581f, 0.621f, 0.901f, 1.432f, 0.901f, 2.282f)
                curveToRelative(0.0f, 0.313f, -0.044f, 0.615f, -0.125f, 0.903f)
                lineToRelative(7.974f, -7.851f)
                curveTo(24.291f, 12.949f, 24.291f, 11.05f, 23.119f, 9.878f)
                close()
                moveTo(11.669f, 7.491f)
                lineTo(9.588f, 5.41f)
                curveTo(8.944f, 4.766f, 8.589f, 3.91f, 8.589f, 3.0f)
                curveToRelative(0.0f, -0.333f, 0.048f, -0.659f, 0.14f, -0.97f)
                lineTo(0.876f, 9.809f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.067f, 0.0f, 4.238f)
                lineToRelative(7.824f, 7.875f)
                curveToRelative(-0.072f, -0.273f, -0.111f, -0.559f, -0.111f, -0.854f)
                curveToRelative(0.0f, -1.842f, 1.499f, -3.341f, 3.341f, -3.341f)
                curveToRelative(0.351f, 0.0f, 0.69f, 0.055f, 1.008f, 0.156f)
                lineToRelative(-5.706f, -5.955f)
                lineTo(11.669f, 7.491f)
                close()
            }
        }
        .build()
        return _googleTagManager!!
    }

private var _googleTagManager: VectorAsset? = null
