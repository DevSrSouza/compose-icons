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

public val LightGroup.PencilLine: ImageVector
    get() {
        if (_pencilLine != null) {
            return _pencilLine!!
        }
        _pencilLine = Builder(name = "PencilLine", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.7f, 88.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -4.1f, -9.9f)
                lineTo(177.9f, 33.4f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -19.8f, 0.0f)
                lineToRelative(-120.0f, 120.0f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, -3.1f, 4.8f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, false, -0.9f, 5.0f)
                verticalLineTo(208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineTo(216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(110.5f)
                lineTo(222.6f, 97.9f)
                arcTo(14.1f, 14.1f, 0.0f, false, false, 226.7f, 88.0f)
                close()
                moveTo(76.5f, 188.0f)
                lineTo(164.0f, 100.5f)
                lineTo(183.5f, 120.0f)
                lineTo(96.0f, 207.5f)
                close()
                moveTo(68.0f, 179.5f)
                lineTo(48.5f, 160.0f)
                lineTo(136.0f, 72.5f)
                lineTo(155.5f, 92.0f)
                close()
                moveTo(46.0f, 208.0f)
                verticalLineTo(174.5f)
                lineTo(81.5f, 210.0f)
                horizontalLineTo(48.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 46.0f, 208.0f)
                close()
                moveTo(214.1f, 89.4f)
                lineTo(192.0f, 111.5f)
                lineTo(144.5f, 64.0f)
                lineToRelative(22.1f, -22.1f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 2.8f, 0.0f)
                lineToRelative(44.7f, 44.7f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.0f, 2.8f)
                close()
            }
        }
        .build()
        return _pencilLine!!
    }

private var _pencilLine: ImageVector? = null
