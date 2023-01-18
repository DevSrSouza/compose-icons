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

public val RemixIcons.SdCardMiniLine: ImageVector
    get() {
        if (_sdCardMiniLine != null) {
            return _sdCardMiniLine!!
        }
        _sdCardMiniLine = Builder(name = "SdCardMiniLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                verticalLineToRelative(5.793f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.73f, 1.765f)
                lineTo(6.0f, 12.833f)
                lineTo(6.0f, 20.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 4.0f)
                lineTo(8.0f, 4.0f)
                close()
                moveTo(7.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(5.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-8.58f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.292f, -0.706f)
                lineToRelative(1.562f, -1.568f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 6.0f, 9.793f)
                lineTo(6.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(15.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 5.0f)
                close()
                moveTo(12.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(12.0f, 5.0f)
                close()
                moveTo(9.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                lineTo(9.0f, 9.0f)
                lineTo(9.0f, 5.0f)
                close()
            }
        }
        .build()
        return _sdCardMiniLine!!
    }

private var _sdCardMiniLine: ImageVector? = null
