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

public val SolidGroup.Backward: ImageVector
    get() {
        if (_backward != null) {
            return _backward!!
        }
        _backward = Builder(name = "Backward", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 280.6f)
                lineToRelative(192.0f, 160.0f)
                curveToRelative(20.6f, 17.2f, 52.5f, 2.8f, 52.5f, -24.6f)
                lineTo(256.0f, 96.0f)
                curveToRelative(0.0f, -27.4f, -31.9f, -41.8f, -52.5f, -24.6f)
                lineToRelative(-192.0f, 160.0f)
                curveToRelative(-15.3f, 12.8f, -15.3f, 36.4f, 0.0f, 49.2f)
                close()
                moveTo(267.5f, 280.6f)
                lineToRelative(192.0f, 160.0f)
                curveToRelative(20.6f, 17.2f, 52.5f, 2.8f, 52.5f, -24.6f)
                lineTo(512.0f, 96.0f)
                curveToRelative(0.0f, -27.4f, -31.9f, -41.8f, -52.5f, -24.6f)
                lineToRelative(-192.0f, 160.0f)
                curveToRelative(-15.3f, 12.8f, -15.3f, 36.4f, 0.0f, 49.2f)
                close()
            }
        }
        .build()
        return _backward!!
    }

private var _backward: ImageVector? = null
