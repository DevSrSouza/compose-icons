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

public val RemixIcons.ChatOffLine: ImageVector
    get() {
        if (_chatOffLine != null) {
            return _chatOffLine!!
        }
        _chatOffLine = Builder(name = "ChatOffLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.808f, 1.393f)
                lineToRelative(19.799f, 19.8f)
                lineToRelative(-1.415f, 1.414f)
                lineToRelative(-3.608f, -3.608f)
                lineTo(6.455f, 19.0f)
                lineTo(2.0f, 22.5f)
                lineTo(2.0f, 4.0f)
                curveToRelative(0.0f, -0.17f, 0.042f, -0.329f, 0.116f, -0.469f)
                lineToRelative(-0.723f, -0.723f)
                lineToRelative(1.415f, -1.415f)
                close()
                moveTo(3.999f, 5.413f)
                lineTo(4.0f, 18.385f)
                lineTo(5.763f, 17.0f)
                horizontalLineToRelative(9.821f)
                lineTo(4.0f, 5.412f)
                close()
                moveTo(21.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(13.785f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(20.0f, 5.0f)
                lineTo(9.213f, 4.999f)
                lineTo(7.214f, 3.0f)
                lineTo(21.0f, 3.0f)
                close()
            }
        }
        .build()
        return _chatOffLine!!
    }

private var _chatOffLine: ImageVector? = null
