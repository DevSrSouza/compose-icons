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

public val RemixIcons.Number5: ImageVector
    get() {
        if (_number5 != null) {
            return _number5!!
        }
        _number5 = Builder(name = "Number5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(9.3f)
                lineToRelative(-0.677f, 6.445f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, -2.93f, 7.133f)
                lineToRelative(1.94f, -0.486f)
                arcTo(4.502f, 4.502f, 0.0f, false, false, 16.5f, 16.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.5f, -4.5f)
                curveToRelative(-2.022f, 0.0f, -3.278f, 0.639f, -3.96f, 1.53f)
                lineToRelative(-1.575f, -1.182f)
                lineTo(7.5f, 2.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _number5!!
    }

private var _number5: ImageVector? = null
