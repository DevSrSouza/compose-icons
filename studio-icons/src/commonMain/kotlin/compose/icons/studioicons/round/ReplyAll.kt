package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.ReplyAll: ImageVector
    get() {
        if (_replyAll != null) {
            return _replyAll!!
        }
        _replyAll = Builder(name = "ReplyAll", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 7.56f)
                curveToRelative(0.0f, -0.94f, -1.14f, -1.42f, -1.81f, -0.75f)
                lineTo(0.71f, 11.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(4.48f, 4.48f)
                curveToRelative(0.67f, 0.68f, 1.81f, 0.2f, 1.81f, -0.74f)
                curveToRelative(0.0f, -0.28f, -0.11f, -0.55f, -0.31f, -0.75f)
                lineTo(3.0f, 12.0f)
                lineToRelative(3.69f, -3.69f)
                curveToRelative(0.2f, -0.2f, 0.31f, -0.47f, 0.31f, -0.75f)
                close()
                moveTo(13.0f, 9.0f)
                verticalLineTo(7.41f)
                curveToRelative(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f)
                lineTo(6.7f, 11.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(4.59f, 4.59f)
                curveToRelative(0.63f, 0.63f, 1.71f, 0.18f, 1.71f, -0.71f)
                verticalLineTo(14.9f)
                curveToRelative(5.0f, 0.0f, 8.5f, 1.6f, 11.0f, 5.1f)
                curveToRelative(-1.0f, -5.0f, -4.0f, -10.0f, -11.0f, -11.0f)
                close()
            }
        }
        .build()
        return _replyAll!!
    }

private var _replyAll: ImageVector? = null
