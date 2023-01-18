package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.EjectSimple: ImageVector
    get() {
        if (_ejectSimple != null) {
            return _ejectSimple!!
        }
        _ejectSimple = Builder(name = "EjectSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.8f, 172.0f)
                horizontalLineTo(215.2f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 15.5f, -32.6f)
                lineTo(143.5f, 32.1f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -31.0f, 0.0f)
                lineTo(25.3f, 139.4f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 40.8f, 172.0f)
                close()
                moveTo(128.0f, 51.0f)
                lineToRelative(78.8f, 97.0f)
                horizontalLineTo(49.2f)
                close()
                moveTo(236.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineTo(224.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 236.0f, 208.0f)
                close()
            }
        }
        .build()
        return _ejectSimple!!
    }

private var _ejectSimple: ImageVector? = null
