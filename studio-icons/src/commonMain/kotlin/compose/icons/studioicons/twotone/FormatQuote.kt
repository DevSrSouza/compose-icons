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

public val TwotoneGroup.FormatQuote: ImageVector
    get() {
        if (_formatQuote != null) {
            return _formatQuote!!
        }
        _formatQuote = Builder(name = "FormatQuote", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.62f, 16.0f)
                horizontalLineToRelative(0.76f)
                lineTo(19.0f, 12.76f)
                lineTo(19.0f, 8.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.62f)
                close()
                moveTo(6.62f, 16.0f)
                horizontalLineToRelative(0.76f)
                lineTo(9.0f, 12.76f)
                lineTo(9.0f, 8.0f)
                lineTo(5.0f, 8.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.62f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.62f, 18.0f)
                lineTo(21.0f, 13.24f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.38f)
                lineToRelative(-2.0f, 4.0f)
                horizontalLineToRelative(5.24f)
                close()
                moveTo(15.0f, 12.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.76f)
                lineTo(17.38f, 16.0f)
                horizontalLineToRelative(-0.76f)
                lineToRelative(2.0f, -4.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(3.38f, 18.0f)
                horizontalLineToRelative(5.24f)
                lineTo(11.0f, 13.24f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.38f)
                lineToRelative(-2.0f, 4.0f)
                close()
                moveTo(5.0f, 12.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.76f)
                lineTo(7.38f, 16.0f)
                horizontalLineToRelative(-0.76f)
                lineToRelative(2.0f, -4.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _formatQuote!!
    }

private var _formatQuote: ImageVector? = null
