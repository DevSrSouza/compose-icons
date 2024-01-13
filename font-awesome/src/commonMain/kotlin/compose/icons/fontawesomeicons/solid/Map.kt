package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 476.1f)
                lineTo(192.0f, 421.2f)
                lineTo(192.0f, 35.9f)
                lineTo(384.0f, 90.8f)
                lineTo(384.0f, 476.1f)
                close()
                moveTo(416.0f, 474.9f)
                lineTo(416.0f, 88.4f)
                lineTo(543.1f, 37.5f)
                curveToRelative(15.8f, -6.3f, 32.9f, 5.3f, 32.9f, 22.3f)
                lineTo(576.0f, 394.6f)
                curveToRelative(0.0f, 9.8f, -6.0f, 18.6f, -15.1f, 22.3f)
                lineTo(416.0f, 474.8f)
                close()
                moveTo(15.1f, 95.1f)
                lineTo(160.0f, 37.2f)
                lineTo(160.0f, 423.6f)
                lineTo(32.9f, 474.5f)
                curveTo(17.1f, 480.8f, 0.0f, 469.2f, 0.0f, 452.2f)
                lineTo(0.0f, 117.4f)
                curveToRelative(0.0f, -9.8f, 6.0f, -18.6f, 15.1f, -22.3f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
