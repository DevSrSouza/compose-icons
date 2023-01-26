package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Pageview: ImageVector
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
                moveTo(16.79f, 18.21f)
                lineToRelative(-2.91f, -2.91f)
                curveToRelative(-0.69f, 0.44f, -1.51f, 0.7f, -2.39f, 0.7f)
                curveTo(9.01f, 16.0f, 7.0f, 13.99f, 7.0f, 11.5f)
                reflectiveCurveTo(9.01f, 7.0f, 11.5f, 7.0f)
                reflectiveCurveTo(16.0f, 9.01f, 16.0f, 11.5f)
                curveToRelative(0.0f, 0.88f, -0.26f, 1.69f, -0.7f, 2.39f)
                lineToRelative(2.91f, 2.9f)
                lineToRelative(-1.42f, 1.42f)
                close()
            }
        }
        .build()
        return _pageview!!
    }

private var _pageview: ImageVector? = null
