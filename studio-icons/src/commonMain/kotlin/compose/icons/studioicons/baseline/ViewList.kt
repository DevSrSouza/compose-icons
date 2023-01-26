package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.ViewList: ImageVector
    get() {
        if (_viewList != null) {
            return _viewList!!
        }
        _viewList = Builder(name = "ViewList", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 14.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(3.0f, 19.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(3.0f, 9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(8.0f, 14.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(8.0f, 19.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(8.0f, 5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _viewList!!
    }

private var _viewList: ImageVector? = null
