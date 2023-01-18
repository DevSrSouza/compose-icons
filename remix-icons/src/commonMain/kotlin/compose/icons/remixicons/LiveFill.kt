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

public val RemixIcons.LiveFill: ImageVector
    get() {
        if (_liveFill != null) {
            return _liveFill!!
        }
        _liveFill = Builder(name = "LiveFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                verticalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(7.4f, 8.829f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.392f, 0.32f)
                lineTo(7.0f, 9.228f)
                verticalLineToRelative(5.542f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.542f, 0.374f)
                lineToRelative(0.073f, -0.036f)
                lineToRelative(4.355f, -2.772f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.063f, -0.624f)
                lineToRelative(-0.063f, -0.05f)
                lineTo(7.615f, 8.89f)
                arcTo(0.4f, 0.4f, 0.0f, false, false, 7.4f, 8.83f)
                close()
            }
        }
        .build()
        return _liveFill!!
    }

private var _liveFill: ImageVector? = null
