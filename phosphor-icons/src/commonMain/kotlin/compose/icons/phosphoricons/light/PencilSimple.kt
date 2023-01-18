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

public val LightGroup.PencilSimple: ImageVector
    get() {
        if (_pencilSimple != null) {
            return _pencilSimple!!
        }
        _pencilSimple = Builder(name = "PencilSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.6f, 78.1f)
                lineTo(177.9f, 33.4f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f)
                lineToRelative(-120.0f, 120.0f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, false, -4.1f, 9.9f)
                lineTo(34.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(92.7f, 222.0f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, false, 9.9f, -4.1f)
                lineToRelative(120.0f, -120.0f)
                arcTo(14.1f, 14.1f, 0.0f, false, false, 222.6f, 78.1f)
                close()
                moveTo(94.1f, 209.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.4f, 0.6f)
                lineTo(48.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 163.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.6f, -1.4f)
                lineTo(136.0f, 72.5f)
                lineTo(183.5f, 120.0f)
                close()
                moveTo(214.1f, 89.4f)
                lineTo(192.0f, 111.5f)
                lineTo(144.5f, 64.0f)
                lineToRelative(22.1f, -22.1f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 2.8f, 0.0f)
                lineToRelative(44.7f, 44.7f)
                arcTo(1.9f, 1.9f, 0.0f, false, true, 214.1f, 89.4f)
                close()
            }
        }
        .build()
        return _pencilSimple!!
    }

private var _pencilSimple: ImageVector? = null
