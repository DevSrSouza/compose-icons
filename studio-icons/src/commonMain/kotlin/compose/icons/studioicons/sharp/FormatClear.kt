package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.FormatClear: ImageVector
    get() {
        if (_formatClear != null) {
            return _formatClear!!
        }
        _formatClear = Builder(name = "FormatClear", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.39f)
                lineToRelative(3.0f, 3.0f)
                horizontalLineToRelative(1.83f)
                lineToRelative(-0.55f, 1.28f)
                lineToRelative(2.09f, 2.1f)
                lineTo(14.21f, 8.0f)
                close()
                moveTo(3.41f, 4.86f)
                lineTo(2.0f, 6.27f)
                lineToRelative(6.97f, 6.97f)
                lineTo(6.5f, 19.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(1.57f, -3.66f)
                lineTo(16.73f, 21.0f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }
        .build()
        return _formatClear!!
    }

private var _formatClear: ImageVector? = null
