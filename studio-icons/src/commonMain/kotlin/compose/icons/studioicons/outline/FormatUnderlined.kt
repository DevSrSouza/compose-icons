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

public val OutlineGroup.FormatUnderlined: ImageVector
    get() {
        if (_formatUnderlined != null) {
            return _formatUnderlined!!
        }
        _formatUnderlined = Builder(name = "FormatUnderlined", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                curveToRelative(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f)
                lineTo(18.0f, 3.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveTo(8.5f, 12.93f, 8.5f, 11.0f)
                lineTo(8.5f, 3.0f)
                lineTo(6.0f, 3.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(5.0f, 19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-2.0f)
                lineTo(5.0f, 19.0f)
                close()
            }
        }
        .build()
        return _formatUnderlined!!
    }

private var _formatUnderlined: ImageVector? = null