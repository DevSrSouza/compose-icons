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

public val RemixIcons.PaintFill: ImageVector
    get() {
        if (_paintFill != null) {
            return _paintFill!!
        }
        _paintFill = Builder(name = "PaintFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.228f, 18.732f)
                lineToRelative(1.768f, -1.768f)
                lineToRelative(1.767f, 1.768f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -3.535f, 0.0f)
                close()
                moveTo(8.878f, 1.08f)
                lineToRelative(11.314f, 11.313f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.415f)
                lineToRelative(-8.485f, 8.485f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineToRelative(-8.485f, -8.485f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.415f)
                lineToRelative(7.778f, -7.778f)
                lineToRelative(-2.122f, -2.121f)
                lineTo(8.88f, 1.08f)
                close()
                moveTo(11.0f, 6.03f)
                lineTo(3.929f, 13.1f)
                horizontalLineTo(18.07f)
                lineTo(11.0f, 6.03f)
                close()
            }
        }
        .build()
        return _paintFill!!
    }

private var _paintFill: ImageVector? = null
