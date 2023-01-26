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

public val SharpGroup.Wysiwyg: ImageVector
    get() {
        if (_wysiwyg != null) {
            return _wysiwyg!!
        }
        _wysiwyg = Builder(name = "Wysiwyg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 12.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(13.0f, 14.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(18.0f)
                verticalLineTo(21.0f)
                close()
                moveTo(19.0f, 7.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _wysiwyg!!
    }

private var _wysiwyg: ImageVector? = null