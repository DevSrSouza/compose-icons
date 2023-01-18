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

public val RemixIcons.FloodFill: ImageVector
    get() {
        if (_floodFill != null) {
            return _floodFill!!
        }
        _floodFill = Builder(name = "FloodFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 17.472f)
                arcTo(5.978f, 5.978f, 0.0f, false, false, 20.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(7.963f, 7.963f, 0.0f, false, true, -4.0f, -1.07f)
                arcTo(7.96f, 7.96f, 0.0f, false, true, 12.0f, 21.0f)
                arcToRelative(7.963f, 7.963f, 0.0f, false, true, -4.0f, -1.07f)
                arcTo(7.96f, 7.96f, 0.0f, false, true, 4.0f, 21.0f)
                lineTo(2.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.537f, 0.0f, 2.94f, -0.578f, 4.0f, -1.528f)
                arcTo(5.978f, 5.978f, 0.0f, false, false, 12.0f, 19.0f)
                curveToRelative(1.537f, 0.0f, 2.94f, -0.578f, 4.0f, -1.528f)
                close()
                moveTo(12.573f, 1.532f)
                lineToRelative(0.1f, 0.08f)
                lineTo(23.0f, 11.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(4.992f, 4.992f, 0.0f, false, true, -4.0f, -2.0f)
                arcToRelative(4.99f, 4.99f, 0.0f, false, true, -4.0f, 2.0f)
                arcToRelative(4.992f, 4.992f, 0.0f, false, true, -4.0f, -2.0f)
                arcToRelative(4.99f, 4.99f, 0.0f, false, true, -4.0f, 2.0f)
                lineToRelative(-0.001f, -6.0f)
                lineTo(1.0f, 11.0f)
                lineToRelative(10.327f, -9.388f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.14f, -0.145f)
                lineToRelative(0.106f, 0.065f)
                close()
            }
        }
        .build()
        return _floodFill!!
    }

private var _floodFill: ImageVector? = null
