package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.MagnifyingGlassLocation: ImageVector
    get() {
        if (_magnifyingGlassLocation != null) {
            return _magnifyingGlassLocation!!
        }
        _magnifyingGlassLocation = Builder(name = "MagnifyingGlassLocation", defaultWidth =
                512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight =
                512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 208.0f)
                curveToRelative(0.0f, 45.9f, -14.9f, 88.3f, -40.0f, 122.7f)
                lineTo(502.6f, 457.4f)
                curveToRelative(12.5f, 12.5f, 12.5f, 32.8f, 0.0f, 45.3f)
                reflectiveCurveToRelative(-32.8f, 12.5f, -45.3f, 0.0f)
                lineTo(330.7f, 376.0f)
                curveToRelative(-34.4f, 25.2f, -76.8f, 40.0f, -122.7f, 40.0f)
                curveTo(93.1f, 416.0f, 0.0f, 322.9f, 0.0f, 208.0f)
                reflectiveCurveTo(93.1f, 0.0f, 208.0f, 0.0f)
                reflectiveCurveTo(416.0f, 93.1f, 416.0f, 208.0f)
                close()
                moveTo(288.0f, 176.0f)
                curveToRelative(0.0f, -44.2f, -35.8f, -80.0f, -80.0f, -80.0f)
                reflectiveCurveToRelative(-80.0f, 35.8f, -80.0f, 80.0f)
                curveToRelative(0.0f, 48.8f, 46.5f, 111.6f, 68.6f, 138.6f)
                curveToRelative(6.0f, 7.3f, 16.8f, 7.3f, 22.7f, 0.0f)
                curveToRelative(22.1f, -27.0f, 68.6f, -89.8f, 68.6f, -138.6f)
                close()
                moveTo(176.0f, 176.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _magnifyingGlassLocation!!
    }

private var _magnifyingGlassLocation: ImageVector? = null
