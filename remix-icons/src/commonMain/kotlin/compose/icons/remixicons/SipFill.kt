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

public val RemixIcons.SipFill: ImageVector
    get() {
        if (_sipFill != null) {
            return _sipFill!!
        }
        _sipFill = Builder(name = "SipFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.96f, 6.504f)
                lineToRelative(2.829f, -2.828f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                lineToRelative(2.121f, 2.121f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                lineToRelative(-2.828f, 2.829f)
                lineToRelative(1.767f, 1.768f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-7.07f, -7.071f)
                lineToRelative(1.413f, -1.414f)
                lineToRelative(1.768f, 1.767f)
                close()
                moveTo(10.778f, 8.98f)
                lineToRelative(4.243f, 4.243f)
                lineTo(7.243f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-4.243f)
                lineToRelative(7.778f, -7.778f)
                close()
            }
        }
        .build()
        return _sipFill!!
    }

private var _sipFill: ImageVector? = null
