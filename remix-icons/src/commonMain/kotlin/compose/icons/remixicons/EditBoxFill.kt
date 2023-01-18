package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.EditBoxFill: ImageVector
    get() {
        if (_editBoxFill != null) {
            return _editBoxFill!!
        }
        _editBoxFill = Builder(name = "EditBoxFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.757f, 3.0f)
                lineToRelative(-7.466f, 7.466f)
                lineToRelative(0.008f, 4.247f)
                lineToRelative(4.238f, -0.007f)
                lineTo(21.0f, 7.243f)
                lineTo(21.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(4.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(12.757f)
                close()
                moveTo(20.485f, 2.1f)
                lineTo(21.9f, 3.516f)
                lineToRelative(-9.192f, 9.192f)
                lineToRelative(-1.412f, 0.003f)
                lineToRelative(-0.002f, -1.417f)
                lineTo(20.485f, 2.1f)
                close()
            }
        }
        .build()
        return _editBoxFill!!
    }

private var _editBoxFill: ImageVector? = null
