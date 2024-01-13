package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Markdown16: ImageVector
    get() {
        if (_markdown16 != null) {
            return _markdown16!!
        }
        _markdown16 = Builder(name = "Markdown16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.85f, 3.0f)
                curveToRelative(0.63f, 0.0f, 1.15f, 0.52f, 1.14f, 1.15f)
                verticalLineToRelative(7.7f)
                curveToRelative(0.0f, 0.63f, -0.51f, 1.15f, -1.15f, 1.15f)
                lineTo(1.15f, 13.0f)
                curveTo(0.52f, 13.0f, 0.0f, 12.48f, 0.0f, 11.84f)
                lineTo(0.0f, 4.15f)
                curveTo(0.0f, 3.52f, 0.52f, 3.0f, 1.15f, 3.0f)
                close()
                moveTo(9.0f, 11.0f)
                lineTo(9.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                lineTo(5.5f, 7.0f)
                lineTo(4.0f, 5.0f)
                lineTo(2.0f, 5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                lineTo(4.0f, 8.0f)
                lineToRelative(1.5f, 1.92f)
                lineTo(7.0f, 8.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(11.99f, 11.5f)
                lineTo(14.5f, 8.0f)
                lineTo(13.0f, 8.0f)
                lineTo(13.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                lineTo(9.5f, 8.0f)
                close()
            }
        }
        .build()
        return _markdown16!!
    }

private var _markdown16: ImageVector? = null
