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
                horizontalLineToRelative(-30.36f)
                curveTo(455.72f, 130.32f, 381.67f, 56.28f, 288.0f, 42.36f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, -6.63f, -5.37f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-40.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, 5.37f, -12.0f, 12.0f)
                verticalLineToRelative(30.36f)
                curveTo(130.32f, 56.28f, 56.28f, 130.32f, 42.36f, 224.0f)
                horizontalLineTo(12.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, 5.37f, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.63f, 5.37f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(30.36f)
                curveTo(56.28f, 381.67f, 130.32f, 455.72f, 224.0f, 469.64f)
                verticalLineTo(500.0f)
                curveToRelative(0.0f, 6.63f, 5.37f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, -5.37f, 12.0f, -12.0f)
                verticalLineToRelative(-30.36f)
                curveTo(381.67f, 455.72f, 455.72f, 381.67f, 469.64f, 288.0f)
                horizontalLineTo(500.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, -5.37f, 12.0f, -12.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.63f, -5.37f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(288.0f, 404.63f)
                verticalLineTo(364.0f)
                curveToRelative(0.0f, -6.63f, -5.37f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-40.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, 5.37f, -12.0f, 12.0f)
                verticalLineToRelative(40.63f)
                curveTo(165.83f, 392.23f, 119.78f, 346.24f, 107.37f, 288.0f)
                horizontalLineTo(148.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, -5.37f, 12.0f, -12.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.63f, -5.37f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-40.63f)
                curveTo(119.77f, 165.83f, 165.76f, 119.78f, 224.0f, 107.37f)
                verticalLineTo(148.0f)
                curveToRelative(0.0f, 6.63f, 5.37f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, -5.37f, 12.0f, -12.0f)
                verticalLineToRelative(-40.63f)
                curveTo(346.17f, 119.77f, 392.22f, 165.76f, 404.63f, 224.0f)
                horizontalLineTo(364.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, 5.37f, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.63f, 5.37f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(40.63f)
                curveTo(392.23f, 346.17f, 346.24f, 392.22f, 288.0f, 404.63f)
                close()
                moveTo(288.0f, 256.0f)
                curveToRelative(0.0f, 17.67f, -14.33f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.33f, -32.0f, -32.0f)
                curveToRelative(0.0f, -17.67f, 14.33f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.33f, 32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _crosshairs!!
    }

private var _crosshairs: ImageVector? = null
