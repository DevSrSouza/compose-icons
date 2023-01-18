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

public val RemixIcons.FlagLine: ImageVector
    get() {
        if (_flagLine != null) {
            return _flagLine!!
        }
        _flagLine = Builder(name = "FlagLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 16.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(9.382f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.894f, 0.553f)
                lineTo(14.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-6.382f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.894f, -0.553f)
                lineTo(12.0f, 16.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(5.0f, 5.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(8.236f)
                lineToRelative(1.0f, 2.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-6.236f)
                lineToRelative(-1.0f, -2.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _flagLine!!
    }

private var _flagLine: ImageVector? = null
