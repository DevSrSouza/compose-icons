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

public val RemixIcons.LiveLine: ImageVector
    get() {
        if (_liveLine != null) {
            return _liveLine!!
        }
        _liveLine = Builder(name = "LiveLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(4.2f)
                lineToRelative(5.213f, -3.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.787f, 0.41f)
                verticalLineToRelative(12.08f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.787f, 0.41f)
                lineTo(17.0f, 14.8f)
                lineTo(17.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(2.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(1.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(15.0f, 6.0f)
                lineTo(3.0f, 6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(12.0f)
                lineTo(15.0f, 6.0f)
                close()
                moveTo(7.4f, 8.829f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.215f, 0.062f)
                lineToRelative(4.355f, 2.772f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.0f, 0.674f)
                lineTo(7.615f, 15.11f)
                arcTo(0.4f, 0.4f, 0.0f, false, true, 7.0f, 14.77f)
                lineTo(7.0f, 9.23f)
                curveToRelative(0.0f, -0.221f, 0.18f, -0.4f, 0.4f, -0.4f)
                close()
                moveTo(21.0f, 8.84f)
                lineToRelative(-4.0f, 2.8f)
                verticalLineToRelative(0.718f)
                lineToRelative(4.0f, 2.8f)
                lineTo(21.0f, 8.84f)
                close()
            }
        }
        .build()
        return _liveLine!!
    }

private var _liveLine: ImageVector? = null
