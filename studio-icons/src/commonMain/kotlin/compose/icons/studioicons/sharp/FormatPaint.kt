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

public val SharpGroup.FormatPaint: ImageVector
    get() {
        if (_formatPaint != null) {
            return _formatPaint!!
        }
        _formatPaint = Builder(name = "FormatPaint", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _formatPaint!!
    }

private var _formatPaint: ImageVector? = null
