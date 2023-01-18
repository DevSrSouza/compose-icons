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

public val RemixIcons.GhostSmileFill: ImageVector
    get() {
        if (_ghostSmileFill != null) {
            return _ghostSmileFill!!
        }
        _ghostSmileFill = Builder(name = "GhostSmileFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(16.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.995f, 0.15f)
                lineTo(10.0f, 13.0f)
                lineTo(8.0f, 13.0f)
                lineToRelative(0.005f, 0.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.99f, 0.0f)
                lineTo(16.0f, 13.0f)
                close()
                moveTo(12.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                close()
            }
        }
        .build()
        return _ghostSmileFill!!
    }

private var _ghostSmileFill: ImageVector? = null
