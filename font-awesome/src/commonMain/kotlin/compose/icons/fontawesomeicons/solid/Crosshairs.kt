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

public val SolidGroup.Crosshairs: ImageVector
    get() {
        if (_crosshairs != null) {
            return _crosshairs!!
        }
        _crosshairs = Builder(name = "Crosshairs", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(500.0f, 224.0f)
                horizontalLineToRelative(-30.364f)
                curveTo(455.724f, 130.325f, 381.675f, 56.276f, 288.0f, 42.364f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, -6.627f, -5.373f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-40.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
                verticalLineToRelative(30.364f)
                curveTo(130.325f, 56.276f, 56.276f, 130.325f, 42.364f, 224.0f)
                horizontalLineTo(12.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(30.364f)
                curveTo(56.276f, 381.675f, 130.325f, 455.724f, 224.0f, 469.636f)
                verticalLineTo(500.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                verticalLineToRelative(-30.364f)
                curveTo(381.675f, 455.724f, 455.724f, 381.675f, 469.636f, 288.0f)
                horizontalLineTo(500.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.627f, -5.373f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(288.0f, 404.634f)
                verticalLineTo(364.0f)
                curveToRelative(0.0f, -6.627f, -5.373f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-40.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
                verticalLineToRelative(40.634f)
                curveTo(165.826f, 392.232f, 119.783f, 346.243f, 107.366f, 288.0f)
                horizontalLineTo(148.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.627f, -5.373f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-40.634f)
                curveTo(119.768f, 165.826f, 165.757f, 119.783f, 224.0f, 107.366f)
                verticalLineTo(148.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                verticalLineToRelative(-40.634f)
                curveTo(346.174f, 119.768f, 392.217f, 165.757f, 404.634f, 224.0f)
                horizontalLineTo(364.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(40.634f)
                curveTo(392.232f, 346.174f, 346.243f, 392.217f, 288.0f, 404.634f)
                close()
                moveTo(288.0f, 256.0f)
                curveToRelative(0.0f, 17.673f, -14.327f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.327f, -32.0f, -32.0f)
                curveToRelative(0.0f, -17.673f, 14.327f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.327f, 32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _crosshairs!!
    }

private var _crosshairs: ImageVector? = null
