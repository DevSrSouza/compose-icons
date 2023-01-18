package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.EjectSimple: ImageVector
    get() {
        if (_ejectSimple != null) {
            return _ejectSimple!!
        }
        _ejectSimple = Builder(name = "EjectSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.8f, 166.0f)
                lineTo(215.2f, 166.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 10.9f, -22.8f)
                lineTo(138.9f, 35.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -21.8f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineTo(29.9f, 143.2f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 40.8f, 166.0f)
                close()
                moveTo(39.3f, 150.7f)
                lineTo(126.4f, 43.4f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 3.2f, 0.0f)
                lineToRelative(87.1f, 107.3f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 0.3f, 2.2f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.8f, 1.1f)
                lineTo(40.8f, 154.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.8f, -1.1f)
                arcTo(2.1f, 2.1f, 0.0f, false, true, 39.3f, 150.7f)
                close()
                moveTo(230.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(32.0f, 214.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(224.0f, 202.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 230.0f, 208.0f)
                close()
            }
        }
        .build()
        return _ejectSimple!!
    }

private var _ejectSimple: ImageVector? = null
