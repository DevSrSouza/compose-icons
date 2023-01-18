package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.PresenceOffline: ImageVector
    get() {
        if (_presenceOffline != null) {
            return _presenceOffline!!
        }
        _presenceOffline = Builder(name = "PresenceOffline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0607f, 7.9393f)
                curveTo(16.6464f, 8.5251f, 16.6464f, 9.4749f, 16.0607f, 10.0607f)
                lineTo(14.1213f, 12.0f)
                lineTo(16.0607f, 13.9394f)
                curveTo(16.6464f, 14.5252f, 16.6464f, 15.4749f, 16.0607f, 16.0607f)
                curveTo(15.4749f, 16.6465f, 14.5251f, 16.6465f, 13.9393f, 16.0607f)
                lineTo(12.0f, 14.1214f)
                lineTo(10.0607f, 16.0607f)
                curveTo(9.4749f, 16.6464f, 8.5251f, 16.6464f, 7.9393f, 16.0607f)
                curveTo(7.3535f, 15.4749f, 7.3535f, 14.5251f, 7.9393f, 13.9393f)
                lineTo(9.8786f, 12.0f)
                lineTo(7.9393f, 10.0607f)
                curveTo(7.3535f, 9.4749f, 7.3535f, 8.5252f, 7.9393f, 7.9394f)
                curveTo(8.5251f, 7.3536f, 9.4749f, 7.3536f, 10.0607f, 7.9394f)
                lineTo(12.0f, 9.8787f)
                lineTo(13.9393f, 7.9393f)
                curveTo(14.5251f, 7.3535f, 15.4749f, 7.3535f, 16.0607f, 7.9393f)
                close()
                moveTo(0.0f, 12.0f)
                curveTo(0.0f, 5.3726f, 5.3726f, 0.0f, 12.0f, 0.0f)
                curveTo(18.6274f, 0.0f, 24.0f, 5.3726f, 24.0f, 12.0f)
                curveTo(24.0f, 18.6274f, 18.6274f, 24.0f, 12.0f, 24.0f)
                curveTo(5.3726f, 24.0f, 0.0f, 18.6274f, 0.0f, 12.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(7.0294f, 3.0f, 3.0f, 7.0294f, 3.0f, 12.0f)
                curveTo(3.0f, 16.9706f, 7.0294f, 21.0f, 12.0f, 21.0f)
                curveTo(16.9706f, 21.0f, 21.0f, 16.9706f, 21.0f, 12.0f)
                curveTo(21.0f, 7.0294f, 16.9706f, 3.0f, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _presenceOffline!!
    }

private var _presenceOffline: ImageVector? = null
