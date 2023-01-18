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

public val RemixIcons.InputCursorMove: ImageVector
    get() {
        if (_inputCursorMove != null) {
            return _inputCursorMove!!
        }
        _inputCursorMove = Builder(name = "InputCursorMove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(11.0f, 5.0f)
                lineTo(8.0f, 5.0f)
                lineTo(8.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 21.0f)
                close()
                moveTo(18.05f, 7.05f)
                lineTo(23.0f, 12.0f)
                lineToRelative(-4.95f, 4.95f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(20.172f, 12.0f)
                lineToRelative(-3.536f, -3.536f)
                lineTo(18.05f, 7.05f)
                close()
                moveTo(5.95f, 7.05f)
                lineToRelative(1.414f, 1.414f)
                lineTo(3.828f, 12.0f)
                lineToRelative(3.536f, 3.536f)
                lineTo(5.95f, 16.95f)
                lineTo(1.0f, 12.0f)
                lineToRelative(4.95f, -4.95f)
                close()
            }
        }
        .build()
        return _inputCursorMove!!
    }

private var _inputCursorMove: ImageVector? = null
