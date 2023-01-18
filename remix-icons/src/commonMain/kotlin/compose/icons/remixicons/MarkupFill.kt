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

public val RemixIcons.MarkupFill: ImageVector
    get() {
        if (_markupFill != null) {
            return _markupFill!!
        }
        _markupFill = Builder(name = "MarkupFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(17.051f, 18.204f)
                lineToRelative(-0.862f, -3.447f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.97f, -0.757f)
                lineTo(8.781f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.97f, 0.757f)
                lineToRelative(-0.862f, 3.447f)
                arcTo(7.967f, 7.967f, 0.0f, false, false, 12.0f, 20.0f)
                arcToRelative(7.967f, 7.967f, 0.0f, false, false, 5.051f, -1.796f)
                close()
                moveTo(10.0f, 12.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.5f)
                lineToRelative(-1.038f, -3.635f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.924f, 0.0f)
                lineTo(10.0f, 10.5f)
                lineTo(10.0f, 12.0f)
                close()
            }
        }
        .build()
        return _markupFill!!
    }

private var _markupFill: ImageVector? = null
