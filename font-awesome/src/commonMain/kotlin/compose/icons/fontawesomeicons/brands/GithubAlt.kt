package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.GithubAlt: ImageVector
    get() {
        if (_githubAlt != null) {
            return _githubAlt!!
        }
        _githubAlt = Builder(name = "GithubAlt", defaultWidth = 480.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 480.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.1f, 328.7f)
                curveToRelative(0.0f, 20.9f, -10.9f, 55.1f, -36.7f, 55.1f)
                reflectiveCurveToRelative(-36.7f, -34.2f, -36.7f, -55.1f)
                reflectiveCurveToRelative(10.9f, -55.1f, 36.7f, -55.1f)
                reflectiveCurveToRelative(36.7f, 34.2f, 36.7f, 55.1f)
                close()
                moveTo(480.0f, 278.2f)
                curveToRelative(0.0f, 31.9f, -3.2f, 65.7f, -17.5f, 95.0f)
                curveToRelative(-37.9f, 76.6f, -142.1f, 74.8f, -216.7f, 74.8f)
                curveToRelative(-75.8f, 0.0f, -186.2f, 2.7f, -225.6f, -74.8f)
                curveToRelative(-14.6f, -29.0f, -20.2f, -63.1f, -20.2f, -95.0f)
                curveToRelative(0.0f, -41.9f, 13.9f, -81.5f, 41.5f, -113.6f)
                curveToRelative(-5.2f, -15.8f, -7.7f, -32.4f, -7.7f, -48.8f)
                curveToRelative(0.0f, -21.5f, 4.9f, -32.3f, 14.6f, -51.8f)
                curveToRelative(45.3f, 0.0f, 74.3f, 9.0f, 108.8f, 36.0f)
                curveToRelative(29.0f, -6.9f, 58.8f, -10.0f, 88.7f, -10.0f)
                curveToRelative(27.0f, 0.0f, 54.2f, 2.9f, 80.4f, 9.2f)
                curveToRelative(34.0f, -26.7f, 63.0f, -35.2f, 107.8f, -35.2f)
                curveToRelative(9.8f, 19.5f, 14.6f, 30.3f, 14.6f, 51.8f)
                curveToRelative(0.0f, 16.4f, -2.6f, 32.7f, -7.7f, 48.2f)
                curveToRelative(27.5f, 32.4f, 39.0f, 72.3f, 39.0f, 114.2f)
                close()
                moveTo(415.7f, 328.7f)
                curveToRelative(0.0f, -43.9f, -26.7f, -82.6f, -73.5f, -82.6f)
                curveToRelative(-18.9f, 0.0f, -37.0f, 3.4f, -56.0f, 6.0f)
                curveToRelative(-14.9f, 2.3f, -29.8f, 3.2f, -45.1f, 3.2f)
                curveToRelative(-15.2f, 0.0f, -30.1f, -0.9f, -45.1f, -3.2f)
                curveToRelative(-18.7f, -2.6f, -37.0f, -6.0f, -56.0f, -6.0f)
                curveToRelative(-46.8f, 0.0f, -73.5f, 38.7f, -73.5f, 82.6f)
                curveToRelative(0.0f, 87.8f, 80.4f, 101.3f, 150.4f, 101.3f)
                horizontalLineToRelative(48.2f)
                curveToRelative(70.3f, 0.0f, 150.6f, -13.4f, 150.6f, -101.3f)
                close()
                moveTo(333.1f, 273.6f)
                curveToRelative(-25.8f, 0.0f, -36.7f, 34.2f, -36.7f, 55.1f)
                reflectiveCurveToRelative(10.9f, 55.1f, 36.7f, 55.1f)
                reflectiveCurveToRelative(36.7f, -34.2f, 36.7f, -55.1f)
                reflectiveCurveToRelative(-10.9f, -55.1f, -36.7f, -55.1f)
                close()
            }
        }
        .build()
        return _githubAlt!!
    }

private var _githubAlt: ImageVector? = null
