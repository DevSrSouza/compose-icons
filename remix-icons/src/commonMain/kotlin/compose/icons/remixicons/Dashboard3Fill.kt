package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.Dashboard3Fill: ImageVector
    get() {
        if (_dashboard3Fill != null) {
            return _dashboard3Fill!!
        }
        _dashboard3Fill = Builder(name = "Dashboard3Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(16.596f, 7.404f)
                curveToRelative(-0.204f, -0.205f, -0.526f, -0.233f, -0.763f, -0.067f)
                curveToRelative(-2.89f, 2.028f, -4.52f, 3.23f, -4.894f, 3.602f)
                curveToRelative(-0.585f, 0.586f, -0.585f, 1.536f, 0.0f, 2.122f)
                curveToRelative(0.586f, 0.585f, 1.536f, 0.585f, 2.122f, 0.0f)
                curveToRelative(0.219f, -0.22f, 1.418f, -1.851f, 3.598f, -4.897f)
                curveToRelative(0.168f, -0.234f, 0.141f, -0.556f, -0.063f, -0.76f)
                close()
                moveTo(17.5f, 11.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(6.5f, 11.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(8.818f, 7.404f)
                curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.39f, 0.39f, 1.023f, 0.39f, 1.414f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0.0f, -1.414f)
                close()
                moveTo(12.0f, 5.5f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _dashboard3Fill!!
    }

private var _dashboard3Fill: ImageVector? = null
