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

public val RemixIcons.ShareFill: ImageVector
    get() {
        if (_shareFill != null) {
            return _shareFill!!
        }
        _shareFill = Builder(name = "ShareFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.576f, 17.271f)
                lineToRelative(-5.11f, -2.787f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, -4.968f)
                lineToRelative(5.11f, -2.787f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.958f, 1.755f)
                lineToRelative(-5.11f, 2.787f)
                arcToRelative(3.514f, 3.514f, 0.0f, false, true, 0.0f, 1.458f)
                lineToRelative(5.11f, 2.787f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -0.958f, 1.755f)
                close()
            }
        }
        .build()
        return _shareFill!!
    }

private var _shareFill: ImageVector? = null
