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

public val SharpGroup.ViewWeek: ImageVector
    get() {
        if (_viewWeek != null) {
            return _viewWeek!!
        }
        _viewWeek = Builder(name = "ViewWeek", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.33f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(5.33f)
                verticalLineTo(20.0f)
                close()
                moveTo(22.0f, 20.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-5.33f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(14.67f, 20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.33f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(14.67f)
                close()
            }
        }
        .build()
        return _viewWeek!!
    }

private var _viewWeek: ImageVector? = null
