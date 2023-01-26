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

public val TwotoneGroup.DisabledByDefault: ImageVector
    get() {
        if (_disabledByDefault != null) {
            return _disabledByDefault!!
        }
        _disabledByDefault = Builder(name = "DisabledByDefault", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(17.0f, 15.59f)
                lineTo(15.59f, 17.0f)
                lineTo(12.0f, 13.41f)
                lineTo(8.41f, 17.0f)
                lineTo(7.0f, 15.59f)
                lineTo(10.59f, 12.0f)
                lineTo(7.0f, 8.41f)
                lineTo(8.41f, 7.0f)
                lineTo(12.0f, 10.59f)
                lineTo(15.59f, 7.0f)
                lineTo(17.0f, 8.41f)
                lineTo(13.41f, 12.0f)
                lineTo(17.0f, 15.59f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(3.0f, 3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(18.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(17.0f, 15.59f)
                lineTo(15.59f, 17.0f)
                lineTo(12.0f, 13.41f)
                lineTo(8.41f, 17.0f)
                lineTo(7.0f, 15.59f)
                lineTo(10.59f, 12.0f)
                lineTo(7.0f, 8.41f)
                lineTo(8.41f, 7.0f)
                lineTo(12.0f, 10.59f)
                lineTo(15.59f, 7.0f)
                lineTo(17.0f, 8.41f)
                lineTo(13.41f, 12.0f)
                lineTo(17.0f, 15.59f)
                close()
            }
        }
        .build()
        return _disabledByDefault!!
    }

private var _disabledByDefault: ImageVector? = null
