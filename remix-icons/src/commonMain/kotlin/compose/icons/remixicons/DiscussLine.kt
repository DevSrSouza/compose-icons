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

public val RemixIcons.DiscussLine: ImageVector
    get() {
        if (_discussLine != null) {
            return _discussLine!!
        }
        _discussLine = Builder(name = "DiscussLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 22.5f)
                lineTo(11.2f, 19.0f)
                lineTo(6.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(5.0f, 7.103f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                lineTo(23.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-5.2f)
                lineTo(14.0f, 22.5f)
                close()
                moveTo(15.839f, 17.0f)
                lineTo(21.0f, 17.0f)
                lineTo(21.0f, 8.103f)
                lineTo(7.0f, 8.103f)
                lineTo(7.0f, 17.0f)
                lineTo(12.161f, 17.0f)
                lineTo(14.0f, 19.298f)
                lineTo(15.839f, 17.0f)
                close()
                moveTo(2.0f, 2.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 4.0f)
                verticalLineToRelative(11.0f)
                lineTo(1.0f, 15.0f)
                lineTo(1.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _discussLine!!
    }

private var _discussLine: ImageVector? = null
