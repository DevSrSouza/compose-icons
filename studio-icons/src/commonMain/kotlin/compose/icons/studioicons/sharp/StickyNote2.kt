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

public val SharpGroup.StickyNote2: ImageVector
    get() {
        if (_stickyNote2 != null) {
            return _stickyNote2!!
        }
        _stickyNote2 = Builder(name = "StickyNote2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.99f, 3.0f)
                lineTo(3.0f, 21.0f)
                horizontalLineToRelative(12.0f)
                lineToRelative(6.0f, -6.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(2.99f)
                close()
                moveTo(7.0f, 8.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(12.0f, 14.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(14.0f, 19.5f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(5.5f)
                lineTo(14.0f, 19.5f)
                close()
            }
        }
        .build()
        return _stickyNote2!!
    }

private var _stickyNote2: ImageVector? = null
