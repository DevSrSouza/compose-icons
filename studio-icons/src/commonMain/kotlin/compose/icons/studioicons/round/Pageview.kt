package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Pageview: ImageVector
    get() {
        if (_pageview != null) {
            return _pageview!!
        }
        _pageview = Builder(name = "Pageview", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 9.0f)
                curveTo(10.12f, 9.0f, 9.0f, 10.12f, 9.0f, 11.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(12.88f, 9.0f, 11.5f, 9.0f)
                close()
                moveTo(20.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(22.0f, 6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(16.08f, 17.5f)
                lineToRelative(-2.2f, -2.2f)
                curveToRelative(-0.9f, 0.58f, -2.03f, 0.84f, -3.22f, 0.62f)
                curveToRelative(-1.88f, -0.35f, -3.38f, -1.93f, -3.62f, -3.83f)
                curveToRelative(-0.38f, -3.01f, 2.18f, -5.52f, 5.21f, -5.04f)
                curveToRelative(1.88f, 0.3f, 3.39f, 1.84f, 3.7f, 3.71f)
                curveToRelative(0.19f, 1.16f, -0.08f, 2.23f, -0.64f, 3.12f)
                lineToRelative(2.2f, 2.19f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.03f, 0.0f, 1.42f)
                curveToRelative(-0.4f, 0.4f, -1.04f, 0.4f, -1.43f, 0.01f)
                close()
            }
        }
        .build()
        return _pageview!!
    }

private var _pageview: ImageVector? = null
