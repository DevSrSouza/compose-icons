package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Sparkasse: ImageVector
    get() {
        if (_sparkasse != null) {
            return _sparkasse!!
        }
        _sparkasse = Builder(name = "Sparkasse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.06f, 12.306f)
                verticalLineToRelative(1.845f)
                horizontalLineToRelative(14.175f)
                verticalLineToRelative(6.777f)
                curveToRelative(0.03f, 1.661f, -1.406f, 3.107f, -3.07f, 3.07f)
                lineTo(5.835f, 23.999f)
                curveToRelative(-1.658f, 0.031f, -3.101f, -1.412f, -3.07f, -3.07f)
                verticalLineToRelative(-1.225f)
                lineTo(16.908f, 19.704f)
                verticalLineToRelative(-1.845f)
                lineTo(2.765f, 17.858f)
                verticalLineToRelative(-6.777f)
                curveToRelative(-0.031f, -1.658f, 1.412f, -3.101f, 3.07f, -3.07f)
                horizontalLineToRelative(12.33f)
                curveToRelative(1.664f, -0.036f, 3.1f, 1.41f, 3.07f, 3.07f)
                verticalLineToRelative(1.225f)
                lineTo(7.06f, 12.306f)
                close()
                moveTo(11.984f, 6.157f)
                curveToRelative(1.7f, 0.0f, 3.079f, -1.378f, 3.079f, -3.079f)
                reflectiveCurveTo(13.685f, 0.0f, 11.984f, 0.0f)
                reflectiveCurveTo(8.906f, 1.378f, 8.906f, 3.079f)
                reflectiveCurveToRelative(1.378f, 3.079f, 3.079f, 3.079f)
                close()
            }
        }
        .build()
        return _sparkasse!!
    }

private var _sparkasse: ImageVector? = null
