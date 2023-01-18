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

public val RemixIcons.OpenSourceLine: ImageVector
    get() {
        if (_openSourceLine != null) {
            return _openSourceLine!!
        }
        _openSourceLine = Builder(name = "OpenSourceLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                curveToRelative(0.0f, 4.4f, -2.841f, 8.136f, -6.789f, 9.473f)
                lineToRelative(-0.226f, 0.074f)
                lineToRelative(-2.904f, -7.55f)
                curveTo(13.15f, 13.95f, 14.0f, 13.054f, 14.0f, 12.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                curveToRelative(0.0f, 1.077f, 0.851f, 1.955f, 1.917f, 1.998f)
                lineToRelative(-2.903f, 7.549f)
                lineToRelative(-0.225f, -0.074f)
                curveTo(4.84f, 20.136f, 2.0f, 16.4f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(-4.418f, 0.0f, -8.0f, 3.582f, -8.0f, 8.0f)
                curveToRelative(0.0f, 2.92f, 1.564f, 5.475f, 3.901f, 6.872f)
                lineToRelative(1.48f, -3.849f)
                curveTo(8.534f, 14.29f, 8.0f, 13.207f, 8.0f, 12.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f)
                curveToRelative(0.0f, 1.207f, -0.535f, 2.29f, -1.38f, 3.023f)
                curveToRelative(0.565f, 1.474f, 1.059f, 2.757f, 1.479f, 3.85f)
                curveTo(18.435f, 17.475f, 20.0f, 14.92f, 20.0f, 12.0f)
                curveToRelative(0.0f, -4.418f, -3.582f, -8.0f, -8.0f, -8.0f)
                close()
            }
        }
        .build()
        return _openSourceLine!!
    }

private var _openSourceLine: ImageVector? = null
