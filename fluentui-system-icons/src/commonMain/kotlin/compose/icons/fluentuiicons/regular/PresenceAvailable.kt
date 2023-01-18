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

public val RegularGroup.PresenceAvailable: ImageVector
    get() {
        if (_presenceAvailable != null) {
            return _presenceAvailable!!
        }
        _presenceAvailable = Builder(name = "PresenceAvailable", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.3726f, 0.0f, 0.0f, 5.3726f, 0.0f, 12.0f)
                curveTo(0.0f, 18.6274f, 5.3726f, 24.0f, 12.0f, 24.0f)
                curveTo(18.6274f, 24.0f, 24.0f, 18.6274f, 24.0f, 12.0f)
                curveTo(24.0f, 5.3726f, 18.6274f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 7.0294f, 7.0294f, 3.0f, 12.0f, 3.0f)
                curveTo(16.9706f, 3.0f, 21.0f, 7.0294f, 21.0f, 12.0f)
                curveTo(21.0f, 16.9706f, 16.9706f, 21.0f, 12.0f, 21.0f)
                curveTo(7.0294f, 21.0f, 3.0f, 16.9706f, 3.0f, 12.0f)
                close()
                moveTo(17.0607f, 8.4393f)
                curveTo(17.6464f, 9.0251f, 17.6464f, 9.9749f, 17.0607f, 10.5607f)
                lineTo(11.5607f, 16.0607f)
                curveTo(10.9749f, 16.6464f, 10.0251f, 16.6464f, 9.4393f, 16.0607f)
                lineTo(7.4393f, 14.0607f)
                curveTo(6.8535f, 13.4749f, 6.8535f, 12.5251f, 7.4393f, 11.9393f)
                curveTo(8.0251f, 11.3536f, 8.9749f, 11.3536f, 9.5607f, 11.9393f)
                lineTo(10.5f, 12.8787f)
                lineTo(14.9393f, 8.4393f)
                curveTo(15.5251f, 7.8535f, 16.4749f, 7.8535f, 17.0607f, 8.4393f)
                close()
            }
        }
        .build()
        return _presenceAvailable!!
    }

private var _presenceAvailable: ImageVector? = null
