package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.NoteBlank: ImageVector
    get() {
        if (_noteBlank != null) {
            return _noteBlank!!
        }
        _noteBlank = Builder(name = "NoteBlank", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 156.7f)
                verticalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(156.7f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 11.3f, -4.7f)
                lineTo(219.3f, 168.0f)
                arcToRelative(16.7f, 16.7f, 0.0f, false, false, 3.3f, -4.7f)
                curveToRelative(0.0f, -0.1f, 0.0f, -0.1f, 0.1f, -0.2f)
                arcTo(17.4f, 17.4f, 0.0f, false, false, 224.0f, 156.7f)
                close()
                moveTo(48.0f, 48.0f)
                horizontalLineTo(208.0f)
                verticalLineTo(152.0f)
                horizontalLineTo(160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(48.0f)
                horizontalLineTo(48.0f)
                close()
                moveTo(196.7f, 168.0f)
                lineTo(168.0f, 196.7f)
                verticalLineTo(168.0f)
                close()
            }
        }
        .build()
        return _noteBlank!!
    }

private var _noteBlank: ImageVector? = null
