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

public val SharpGroup.ViewArray: ImageVector
    get() {
        if (_viewArray != null) {
            return _viewArray!!
        }
        _viewArray = Builder(name = "ViewArray", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(17.0f, 5.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(10.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(6.0f, 5.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _viewArray!!
    }

private var _viewArray: ImageVector? = null
