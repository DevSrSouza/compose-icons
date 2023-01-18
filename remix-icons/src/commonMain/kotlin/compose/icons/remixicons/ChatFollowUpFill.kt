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

public val RemixIcons.ChatFollowUpFill: ImageVector
    get() {
        if (_chatFollowUpFill != null) {
            return _chatFollowUpFill!!
        }
        _chatFollowUpFill = Builder(name = "ChatFollowUpFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(6.455f, 19.0f)
                lineTo(2.0f, 22.5f)
                lineTo(2.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(17.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                lineTo(17.0f, 7.0f)
                close()
                moveTo(11.0f, 8.0f)
                lineTo(9.0f, 8.0f)
                verticalLineToRelative(1.999f)
                lineTo(7.0f, 10.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(2.0f, -0.001f)
                lineTo(9.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.001f)
                lineTo(13.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-2.0f, -0.001f)
                lineTo(11.0f, 8.0f)
                close()
            }
        }
        .build()
        return _chatFollowUpFill!!
    }

private var _chatFollowUpFill: ImageVector? = null
