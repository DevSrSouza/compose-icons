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

public val RemixIcons.SipLine: ImageVector
    get() {
        if (_sipLine != null) {
            return _sipLine!!
        }
        _sipLine = Builder(name = "SipLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.457f, 18.957f)
                lineToRelative(8.564f, -8.564f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-8.564f, 8.564f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(12.192f, 7.565f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.768f, 1.767f)
                lineToRelative(2.829f, -2.828f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                lineToRelative(2.121f, 2.121f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                lineToRelative(-2.828f, 2.829f)
                lineToRelative(1.767f, 1.768f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(7.243f, 21.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-4.243f)
                lineToRelative(9.192f, -9.192f)
                close()
            }
        }
        .build()
        return _sipLine!!
    }

private var _sipLine: ImageVector? = null
