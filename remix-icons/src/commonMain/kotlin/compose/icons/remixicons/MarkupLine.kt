package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.MarkupLine: ImageVector
    get() {
        if (_markupLine != null) {
            return _markupLine!!
        }
        _markupLine = Builder(name = "MarkupLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 10.5f)
                lineToRelative(1.038f, -3.635f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.924f, 0.0f)
                lineTo(14.0f, 10.5f)
                lineTo(14.0f, 12.0f)
                horizontalLineToRelative(0.72f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.97f, 0.757f)
                lineToRelative(1.361f, 5.447f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -10.102f, 0.0f)
                lineToRelative(1.362f, -5.447f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.28f, 12.0f)
                lineTo(10.0f, 12.0f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(7.952f, 7.952f, 0.0f, false, false, 3.265f, -0.694f)
                lineTo(13.938f, 14.0f)
                horizontalLineToRelative(-3.876f)
                lineToRelative(-1.327f, 5.306f)
                arcTo(7.95f, 7.95f, 0.0f, false, false, 12.0f, 20.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
            }
        }
        .build()
        return _markupLine!!
    }

private var _markupLine: ImageVector? = null
