package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Webflow: ImageVector
    get() {
        if (_webflow != null) {
            return _webflow!!
        }
        _webflow = Builder(name = "Webflow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.802f, 8.56f)
                reflectiveCurveToRelative(-1.946f, 6.103f, -2.105f, 6.607f)
                arcToRelative(4778.8f, 4778.8f, 0.0f, false, false, -1.484f, -11.473f)
                curveToRelative(-3.316f, 0.0f, -5.089f, 2.36f, -6.026f, 4.851f)
                lineToRelative(-2.565f, 6.637f)
                curveToRelative(-0.015f, -0.476f, -0.36f, -6.565f, -0.36f, -6.565f)
                curveToRelative(-0.204f, -3.052f, -3.0f, -4.91f, -5.262f, -4.91f)
                lineToRelative(2.739f, 16.6f)
                curveToRelative(3.474f, -0.015f, 5.347f, -2.361f, 6.328f, -4.852f)
                curveToRelative(0.0f, 0.0f, 2.09f, -5.398f, 2.176f, -5.643f)
                curveToRelative(0.015f, 0.23f, 1.5f, 10.494f, 1.5f, 10.494f)
                curveToRelative(3.488f, 0.0f, 5.362f, -2.202f, 6.37f, -4.606f)
                lineTo(24.0f, 3.708f)
                curveToRelative(-3.445f, 0.0f, -5.261f, 2.346f, -6.198f, 4.851f)
                close()
            }
        }
        .build()
        return _webflow!!
    }

private var _webflow: ImageVector? = null
