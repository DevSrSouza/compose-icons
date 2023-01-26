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

public val OutlineGroup.FormatBold: ImageVector
    get() {
        if (_formatBold != null) {
            return _formatBold!!
        }
        _formatBold = Builder(name = "FormatBold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.6f, 10.79f)
                curveToRelative(0.97f, -0.67f, 1.65f, -1.77f, 1.65f, -2.79f)
                curveToRelative(0.0f, -2.26f, -1.75f, -4.0f, -4.0f, -4.0f)
                lineTo(7.0f, 4.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(7.04f)
                curveToRelative(2.09f, 0.0f, 3.71f, -1.7f, 3.71f, -3.79f)
                curveToRelative(0.0f, -1.52f, -0.86f, -2.82f, -2.15f, -3.42f)
                close()
                moveTo(10.0f, 6.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(13.5f, 15.5f)
                lineTo(10.0f, 15.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _formatBold!!
    }

private var _formatBold: ImageVector? = null
