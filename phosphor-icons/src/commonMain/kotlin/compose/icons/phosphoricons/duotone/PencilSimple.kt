package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.PencilSimple: ImageVector
    get() {
        if (_pencilSimple != null) {
            return _pencilSimple!!
        }
        _pencilSimple = Builder(name = "PencilSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(218.3f, 93.7f)
                lineTo(192.0f, 120.0f)
                lineTo(136.0f, 64.0f)
                lineToRelative(26.3f, -26.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.4f, 0.0f)
                lineToRelative(44.6f, 44.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 218.3f, 93.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 76.7f)
                lineTo(179.3f, 32.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -22.6f, 0.0f)
                lineTo(36.7f, 152.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 32.0f, 163.3f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(92.7f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 11.3f, -4.7f)
                lineToRelative(120.0f, -120.0f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 224.0f, 76.7f)
                close()
                moveTo(92.7f, 208.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(163.3f)
                lineToRelative(88.0f, -88.0f)
                lineTo(180.7f, 120.0f)
                close()
                moveTo(192.0f, 108.7f)
                lineTo(147.3f, 64.0f)
                lineTo(168.0f, 43.3f)
                lineTo(212.7f, 88.0f)
                close()
            }
        }
        .build()
        return _pencilSimple!!
    }

private var _pencilSimple: ImageVector? = null
