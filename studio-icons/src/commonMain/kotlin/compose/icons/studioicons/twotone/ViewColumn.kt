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

public val TwotoneGroup.ViewColumn: ImageVector
    get() {
        if (_viewColumn != null) {
            return _viewColumn!!
        }
        _viewColumn = Builder(name = "ViewColumn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.33f, 17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(3.33f)
                verticalLineTo(17.0f)
                close()
                moveTo(13.67f, 17.0f)
                horizontalLineToRelative(-3.33f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(3.33f)
                verticalLineTo(17.0f)
                close()
                moveTo(19.0f, 17.0f)
                horizontalLineToRelative(-3.33f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
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
                moveTo(8.33f, 17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(3.33f)
                verticalLineTo(17.0f)
                close()
                moveTo(13.67f, 17.0f)
                horizontalLineToRelative(-3.33f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(3.33f)
                verticalLineTo(17.0f)
                close()
                moveTo(19.0f, 17.0f)
                horizontalLineToRelative(-3.33f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _viewColumn!!
    }

private var _viewColumn: ImageVector? = null
