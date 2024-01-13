package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.MoveToBottom16: ImageVector
    get() {
        if (_moveToBottom16 != null) {
            return _moveToBottom16!!
        }
        _moveToBottom16 = Builder(name = "MoveToBottom16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.47f, 10.78f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, 1.06f, 0.0f)
                lineToRelative(3.75f, -3.75f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, -1.06f, -1.06f)
                lineTo(8.75f, 8.439f)
                verticalLineTo(1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(6.689f)
                lineTo(4.78f, 5.97f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(3.75f, 3.75f)
                close()
                moveTo(3.75f, 13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-8.5f)
                close()
            }
        }
        .build()
        return _moveToBottom16!!
    }

private var _moveToBottom16: ImageVector? = null
