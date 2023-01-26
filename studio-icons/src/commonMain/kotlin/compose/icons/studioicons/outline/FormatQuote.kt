package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.FormatQuote: ImageVector
    get() {
        if (_formatQuote != null) {
            return _formatQuote!!
        }
        _formatQuote = Builder(name = "FormatQuote", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.62f, 18.0f)
                horizontalLineToRelative(-5.24f)
                lineToRelative(2.0f, -4.0f)
                lineTo(13.0f, 14.0f)
                lineTo(13.0f, 6.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(7.24f)
                lineTo(18.62f, 18.0f)
                close()
                moveTo(16.62f, 16.0f)
                horizontalLineToRelative(0.76f)
                lineTo(19.0f, 12.76f)
                lineTo(19.0f, 8.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.62f)
                lineToRelative(-2.0f, 4.0f)
                close()
                moveTo(8.62f, 18.0f)
                lineTo(3.38f, 18.0f)
                lineToRelative(2.0f, -4.0f)
                lineTo(3.0f, 14.0f)
                lineTo(3.0f, 6.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(7.24f)
                lineTo(8.62f, 18.0f)
                close()
                moveTo(6.62f, 16.0f)
                horizontalLineToRelative(0.76f)
                lineTo(9.0f, 12.76f)
                lineTo(9.0f, 8.0f)
                lineTo(5.0f, 8.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.62f)
                lineToRelative(-2.0f, 4.0f)
                close()
            }
        }
        .build()
        return _formatQuote!!
    }

private var _formatQuote: ImageVector? = null
