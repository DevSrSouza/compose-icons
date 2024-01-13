package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Robloxstudio: ImageVector
    get() {
        if (_robloxstudio != null) {
            return _robloxstudio!!
        }
        _robloxstudio = Builder(name = "Robloxstudio", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.936f, 15.356f)
                lineTo(1.826f, 12.112f)
                lineTo(0.0f, 18.93f)
                lineTo(18.928f, 24.0f)
                lineTo(21.608f, 14.01f)
                lineTo(14.79f, 12.18f)
                lineTo(13.936f, 15.356f)
                close()
                moveTo(5.072f, 0.0f)
                lineTo(2.394f, 9.992f)
                lineTo(9.21f, 11.822f)
                lineTo(10.064f, 8.644f)
                lineTo(22.174f, 11.89f)
                lineTo(24.0f, 5.072f)
                lineTo(5.072f, 0.0f)
                close()
            }
        }
        .build()
        return _robloxstudio!!
    }

private var _robloxstudio: ImageVector? = null
