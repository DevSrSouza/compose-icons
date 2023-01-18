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

public val RemixIcons.SwitchLine: ImageVector
    get() {
        if (_switchLine != null) {
            return _switchLine!!
        }
        _switchLine = Builder(name = "SwitchLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                verticalLineToRelative(18.0f)
                lineTo(7.6f, 21.0f)
                arcTo(4.6f, 4.6f, 0.0f, false, true, 3.0f, 16.4f)
                lineTo(3.0f, 7.6f)
                arcTo(4.6f, 4.6f, 0.0f, false, true, 7.6f, 3.0f)
                lineTo(12.0f, 3.0f)
                close()
                moveTo(10.0f, 5.0f)
                lineTo(7.6f, 5.0f)
                arcTo(2.6f, 2.6f, 0.0f, false, false, 5.0f, 7.6f)
                verticalLineToRelative(8.8f)
                arcTo(2.6f, 2.6f, 0.0f, false, false, 7.6f, 19.0f)
                lineTo(10.0f, 19.0f)
                lineTo(10.0f, 5.0f)
                close()
                moveTo(7.5f, 10.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
                moveTo(14.0f, 3.0f)
                horizontalLineToRelative(2.4f)
                arcTo(4.6f, 4.6f, 0.0f, false, true, 21.0f, 7.6f)
                verticalLineToRelative(8.8f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, -4.6f, 4.6f)
                lineTo(14.0f, 21.0f)
                lineTo(14.0f, 3.0f)
                close()
                moveTo(17.0f, 14.7f)
                arcToRelative(1.8f, 1.8f, 0.0f, true, false, 0.0f, -3.6f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 0.0f, 3.6f)
                close()
            }
        }
        .build()
        return _switchLine!!
    }

private var _switchLine: ImageVector? = null
