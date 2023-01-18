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

public val RemixIcons.GhostFill: ImageVector
    get() {
        if (_ghostFill != null) {
            return _ghostFill!!
        }
        _ghostFill = Builder(name = "GhostFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 9.0f, 9.0f)
                verticalLineToRelative(7.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -6.39f, 1.976f)
                arcToRelative(2.999f, 2.999f, 0.0f, false, true, -5.223f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -6.382f, -1.783f)
                lineTo(3.0f, 18.499f)
                lineTo(3.0f, 11.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 9.0f, -9.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 1.12f, -2.0f, 2.5f)
                reflectiveCurveToRelative(0.895f, 2.5f, 2.0f, 2.5f)
                reflectiveCurveToRelative(2.0f, -1.12f, 2.0f, -2.5f)
                reflectiveCurveToRelative(-0.895f, -2.5f, -2.0f, -2.5f)
                close()
                moveTo(9.5f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(14.5f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
            }
        }
        .build()
        return _ghostFill!!
    }

private var _ghostFill: ImageVector? = null
