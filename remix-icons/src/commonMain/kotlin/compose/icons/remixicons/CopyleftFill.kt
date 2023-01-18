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

public val RemixIcons.CopyleftFill: ImageVector
    get() {
        if (_copyleftFill != null) {
            return _copyleftFill!!
        }
        _copyleftFill = Builder(name = "CopyleftFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f)
                reflectiveCurveTo(6.48f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.48f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.48f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f)
                curveToRelative(-1.82f, 0.0f, -3.413f, 0.973f, -4.288f, 2.428f)
                lineToRelative(1.715f, 1.028f)
                curveTo(9.952f, 9.583f, 10.907f, 9.0f, 12.0f, 9.0f)
                curveToRelative(1.658f, 0.0f, 3.0f, 1.342f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.342f, 3.0f, -3.0f, 3.0f)
                curveToRelative(-1.093f, 0.0f, -2.05f, -0.584f, -2.574f, -1.457f)
                lineToRelative(-1.714f, 1.03f)
                curveTo(8.587f, 16.026f, 10.18f, 17.0f, 12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _copyleftFill!!
    }

private var _copyleftFill: ImageVector? = null
