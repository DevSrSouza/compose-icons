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

public val RemixIcons.PlayFill: ImageVector
    get() {
        if (_playFill != null) {
            return _playFill!!
        }
        _playFill = Builder(name = "PlayFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.376f, 12.416f)
                lineTo(8.777f, 19.482f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 19.066f)
                verticalLineTo(4.934f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.777f, -0.416f)
                lineToRelative(10.599f, 7.066f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.832f)
                close()
            }
        }
        .build()
        return _playFill!!
    }

private var _playFill: ImageVector? = null
