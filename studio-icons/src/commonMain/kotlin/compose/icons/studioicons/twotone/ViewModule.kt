package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.ViewModule: ImageVector
    get() {
        if (_viewModule != null) {
            return _viewModule!!
        }
        _viewModule = Builder(name = "ViewModule", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 11.0f)
                horizontalLineToRelative(-3.33f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(13.67f, 11.0f)
                horizontalLineToRelative(-3.33f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(3.33f)
                verticalLineTo(11.0f)
                close()
                moveTo(8.33f, 7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.33f)
                close()
                moveTo(5.0f, 17.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.33f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(10.33f, 17.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.33f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(10.33f)
                close()
                moveTo(15.67f, 17.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(15.67f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(18.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(19.0f, 11.0f)
                horizontalLineToRelative(-3.33f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(13.67f, 11.0f)
                horizontalLineToRelative(-3.33f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(3.33f)
                verticalLineTo(11.0f)
                close()
                moveTo(8.33f, 7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.33f)
                close()
                moveTo(5.0f, 17.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.33f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(10.33f, 17.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.33f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(10.33f)
                close()
                moveTo(15.67f, 17.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(15.67f)
                close()
            }
        }
        .build()
        return _viewModule!!
    }

private var _viewModule: ImageVector? = null
