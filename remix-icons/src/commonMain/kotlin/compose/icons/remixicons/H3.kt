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

public val RemixIcons.H3: ImageVector
    get() {
        if (_h3 != null) {
            return _h3!!
        }
        _h3 = Builder(name = "H3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.0f)
                lineToRelative(-0.002f, 2.0f)
                lineToRelative(-2.505f, 2.883f)
                curveToRelative(1.59f, 0.435f, 2.757f, 1.89f, 2.757f, 3.617f)
                curveToRelative(0.0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
                curveToRelative(-1.826f, 0.0f, -3.347f, -1.305f, -3.682f, -3.033f)
                lineToRelative(1.964f, -0.382f)
                curveToRelative(0.156f, 0.806f, 0.866f, 1.415f, 1.718f, 1.415f)
                curveToRelative(0.966f, 0.0f, 1.75f, -0.784f, 1.75f, -1.75f)
                reflectiveCurveToRelative(-0.784f, -1.75f, -1.75f, -1.75f)
                curveToRelative(-0.286f, 0.0f, -0.556f, 0.069f, -0.794f, 0.19f)
                lineToRelative(-1.307f, -1.547f)
                lineTo(19.35f, 10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(4.0f, 4.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _h3!!
    }

private var _h3: ImageVector? = null
