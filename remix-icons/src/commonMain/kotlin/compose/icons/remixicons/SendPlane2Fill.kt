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

public val RemixIcons.SendPlane2Fill: ImageVector
    get() {
        if (_sendPlane2Fill != null) {
            return _sendPlane2Fill!!
        }
        _sendPlane2Fill = Builder(name = "SendPlane2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 13.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(1.846f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.741f, -0.438f)
                lineToRelative(18.462f, 10.154f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.876f)
                lineTo(3.741f, 22.592f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.0f, 22.154f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _sendPlane2Fill!!
    }

private var _sendPlane2Fill: ImageVector? = null
