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

public val SolidGroup.EllipsisVertical: ImageVector
    get() {
        if (_ellipsisVertical != null) {
            return _ellipsisVertical!!
        }
        _ellipsisVertical = Builder(name = "EllipsisVertical", defaultWidth = 128.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 128.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 360.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 0.0f, 112.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 0.0f, -112.0f)
                close()
                moveTo(64.0f, 200.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 0.0f, 112.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 0.0f, -112.0f)
                close()
                moveTo(120.0f, 96.0f)
                arcTo(56.0f, 56.0f, 0.0f, true, false, 8.0f, 96.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 112.0f, 0.0f)
                close()
            }
        }
        .build()
        return _ellipsisVertical!!
    }

private var _ellipsisVertical: ImageVector? = null
