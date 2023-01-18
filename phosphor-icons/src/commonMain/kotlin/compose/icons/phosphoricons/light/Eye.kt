package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.5f, 125.6f)
                curveToRelative(-0.4f, -0.8f, -8.7f, -19.3f, -27.3f, -37.8f)
                reflectiveCurveTo(171.4f, 50.0f, 128.0f, 50.0f)
                reflectiveCurveTo(55.0f, 70.5f, 37.8f, 87.8f)
                reflectiveCurveToRelative(-26.9f, 37.0f, -27.3f, 37.8f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 0.0f, 4.8f)
                curveToRelative(0.4f, 0.8f, 8.7f, 19.3f, 27.3f, 37.8f)
                reflectiveCurveTo(84.6f, 206.0f, 128.0f, 206.0f)
                reflectiveCurveToRelative(73.0f, -20.5f, 90.2f, -37.8f)
                reflectiveCurveToRelative(26.9f, -37.0f, 27.3f, -37.8f)
                arcTo(5.7f, 5.7f, 0.0f, false, false, 245.5f, 125.6f)
                close()
                moveTo(128.0f, 194.0f)
                curveToRelative(-31.4f, 0.0f, -58.8f, -11.4f, -81.4f, -33.9f)
                arcTo(133.9f, 133.9f, 0.0f, false, true, 22.7f, 128.0f)
                arcTo(133.9f, 133.9f, 0.0f, false, true, 46.6f, 95.9f)
                curveTo(69.2f, 73.4f, 96.6f, 62.0f, 128.0f, 62.0f)
                reflectiveCurveToRelative(58.8f, 11.4f, 81.4f, 33.9f)
                arcTo(133.9f, 133.9f, 0.0f, false, true, 233.3f, 128.0f)
                curveTo(226.9f, 140.2f, 195.0f, 194.0f, 128.0f, 194.0f)
                close()
                moveTo(128.0f, 82.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, 46.0f, 46.0f)
                arcTo(46.0f, 46.0f, 0.0f, false, false, 128.0f, 82.0f)
                close()
                moveTo(128.0f, 162.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, -34.0f)
                arcTo(34.1f, 34.1f, 0.0f, false, true, 128.0f, 162.0f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
