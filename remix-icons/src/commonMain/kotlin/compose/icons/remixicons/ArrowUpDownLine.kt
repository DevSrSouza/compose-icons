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

public val RemixIcons.ArrowUpDownLine: ImageVector
    get() {
        if (_arrowUpDownLine != null) {
            return _arrowUpDownLine!!
        }
        _arrowUpDownLine = Builder(name = "ArrowUpDownLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.95f, 7.95f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(8.0f, 6.828f)
                lineTo(8.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                lineTo(6.0f, 6.828f)
                lineTo(3.465f, 9.364f)
                lineTo(2.05f, 7.95f)
                lineTo(7.0f, 3.0f)
                lineToRelative(4.95f, 4.95f)
                close()
                moveTo(21.95f, 16.05f)
                lineTo(17.0f, 21.0f)
                lineToRelative(-4.95f, -4.95f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.537f, 2.536f)
                lineTo(16.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(13.172f)
                lineToRelative(2.536f, -2.536f)
                lineToRelative(1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _arrowUpDownLine!!
    }

private var _arrowUpDownLine: ImageVector? = null
