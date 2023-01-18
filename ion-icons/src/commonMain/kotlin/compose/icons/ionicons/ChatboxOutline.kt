package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ChatboxOutline: ImageVector
    get() {
        if (_chatboxOutline != null) {
            return _chatboxOutline!!
        }
        _chatboxOutline = Builder(name = "ChatboxOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(408.0f, 64.0f)
                horizontalLineTo(104.0f)
                arcToRelative(56.16f, 56.16f, 0.0f, false, false, -56.0f, 56.0f)
                verticalLineTo(312.0f)
                arcToRelative(56.16f, 56.16f, 0.0f, false, false, 56.0f, 56.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(80.0f)
                lineToRelative(93.72f, -78.14f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.13f, -1.86f)
                horizontalLineTo(408.0f)
                arcToRelative(56.16f, 56.16f, 0.0f, false, false, 56.0f, -56.0f)
                verticalLineTo(120.0f)
                arcTo(56.16f, 56.16f, 0.0f, false, false, 408.0f, 64.0f)
                close()
            }
        }
        .build()
        return _chatboxOutline!!
    }

private var _chatboxOutline: ImageVector? = null
