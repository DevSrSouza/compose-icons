package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Hourglass: ImageVector
    get() {
        if (_hourglass != null) {
            return _hourglass!!
        }
        _hourglass = Builder(name = "Hourglass", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.0f, 48.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, -5.37f, 12.0f, -12.0f)
                lineTo(384.0f, 12.0f)
                curveToRelative(0.0f, -6.63f, -5.37f, -12.0f, -12.0f, -12.0f)
                lineTo(12.0f, 0.0f)
                curveTo(5.37f, 0.0f, 0.0f, 5.37f, 0.0f, 12.0f)
                verticalLineToRelative(24.0f)
                curveToRelative(0.0f, 6.63f, 5.37f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.0f, 80.56f, 32.19f, 165.81f, 97.18f, 208.0f)
                curveTo(47.9f, 298.38f, 16.0f, 383.9f, 16.0f, 464.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, 5.37f, -12.0f, 12.0f)
                verticalLineToRelative(24.0f)
                curveToRelative(0.0f, 6.63f, 5.37f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(360.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, -5.37f, 12.0f, -12.0f)
                verticalLineToRelative(-24.0f)
                curveToRelative(0.0f, -6.63f, -5.37f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(0.0f, -80.56f, -32.19f, -165.81f, -97.18f, -208.0f)
                curveTo(336.1f, 213.62f, 368.0f, 128.1f, 368.0f, 48.0f)
                close()
                moveTo(64.0f, 48.0f)
                horizontalLineToRelative(256.0f)
                curveToRelative(0.0f, 101.62f, -57.31f, 184.0f, -128.0f, 184.0f)
                reflectiveCurveTo(64.0f, 149.62f, 64.0f, 48.0f)
                close()
                moveTo(320.0f, 464.0f)
                lineTo(64.0f, 464.0f)
                curveToRelative(0.0f, -101.62f, 57.31f, -184.0f, 128.0f, -184.0f)
                reflectiveCurveToRelative(128.0f, 82.38f, 128.0f, 184.0f)
                close()
            }
        }
        .build()
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
