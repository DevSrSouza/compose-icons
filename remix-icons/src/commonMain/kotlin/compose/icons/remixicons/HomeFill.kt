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

public val RemixIcons.HomeFill: ImageVector
    get() {
        if (_homeFill != null) {
            return _homeFill!!
        }
        _homeFill = Builder(name = "HomeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(9.49f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.386f, -0.79f)
                lineToRelative(8.0f, -6.222f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.228f, 0.0f)
                lineToRelative(8.0f, 6.222f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.386f, 0.79f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _homeFill!!
    }

private var _homeFill: ImageVector? = null
