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

public val RemixIcons.PantoneFill: ImageVector
    get() {
        if (_pantoneFill != null) {
            return _pantoneFill!!
        }
        _pantoneFill = Builder(name = "PantoneFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 18.922f)
                lineToRelative(-1.35f, -0.545f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.552f, -1.302f)
                lineTo(4.0f, 12.367f)
                verticalLineToRelative(6.555f)
                close()
                moveTo(8.86f, 21.0f)
                horizontalLineTo(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-6.078f)
                lineTo(8.86f, 21.0f)
                close()
                moveTo(6.022f, 5.968f)
                lineToRelative(9.272f, -3.746f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.301f, 0.552f)
                lineToRelative(5.62f, 13.908f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.553f, 1.302f)
                lineTo(12.39f, 21.73f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.302f, -0.553f)
                lineTo(5.47f, 7.27f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.553f, -1.301f)
                close()
                moveTo(9.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _pantoneFill!!
    }

private var _pantoneFill: ImageVector? = null
