package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 56.0f)
                curveTo(48.0f, 56.0f, 16.0f, 128.0f, 16.0f, 128.0f)
                reflectiveCurveToRelative(32.0f, 72.0f, 112.0f, 72.0f)
                reflectiveCurveToRelative(112.0f, -72.0f, 112.0f, -72.0f)
                reflectiveCurveTo(208.0f, 56.0f, 128.0f, 56.0f)
                close()
                moveTo(128.0f, 168.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 128.0f, 168.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.3f, 124.8f)
                curveToRelative(-0.3f, -0.8f, -8.8f, -19.6f, -27.6f, -38.5f)
                curveTo(194.6f, 61.3f, 162.9f, 48.0f, 128.0f, 48.0f)
                reflectiveCurveTo(61.4f, 61.3f, 36.3f, 86.3f)
                curveTo(17.5f, 105.2f, 9.0f, 124.0f, 8.7f, 124.8f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 0.0f, 6.4f)
                curveToRelative(0.3f, 0.8f, 8.8f, 19.6f, 27.6f, 38.5f)
                curveTo(61.4f, 194.7f, 93.1f, 208.0f, 128.0f, 208.0f)
                reflectiveCurveToRelative(66.6f, -13.3f, 91.7f, -38.3f)
                curveToRelative(18.8f, -18.9f, 27.3f, -37.7f, 27.6f, -38.5f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 247.3f, 124.8f)
                close()
                moveTo(128.0f, 192.0f)
                curveToRelative(-30.8f, 0.0f, -57.7f, -11.2f, -79.9f, -33.3f)
                arcTo(130.3f, 130.3f, 0.0f, false, true, 25.0f, 128.0f)
                arcTo(130.3f, 130.3f, 0.0f, false, true, 48.1f, 97.2f)
                curveTo(70.3f, 75.2f, 97.2f, 64.0f, 128.0f, 64.0f)
                reflectiveCurveToRelative(57.7f, 11.2f, 79.9f, 33.2f)
                arcTo(130.3f, 130.3f, 0.0f, false, true, 231.0f, 128.0f)
                curveTo(223.8f, 141.5f, 192.4f, 192.0f, 128.0f, 192.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 80.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 48.0f, 48.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 128.0f, 80.0f)
                close()
                moveTo(128.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 128.0f, 160.0f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
