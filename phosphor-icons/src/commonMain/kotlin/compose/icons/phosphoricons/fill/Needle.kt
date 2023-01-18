package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Needle: ImageVector
    get() {
        if (_needle != null) {
            return _needle!!
        }
        _needle = Builder(name = "Needle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.3f, 43.7f)
                arcToRelative(40.1f, 40.1f, 0.0f, false, false, -56.6f, 0.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -2.2f, 4.3f)
                curveTo(120.7f, 123.3f, 36.0f, 208.7f, 34.4f, 210.3f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.8f, -0.9f, 86.8f, -86.4f, 138.3f, -95.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 4.3f, -2.2f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(40.1f, 40.1f, 0.0f, false, false, 0.0f, -56.6f)
                close()
                moveTo(189.7f, 77.7f)
                lineTo(173.7f, 93.7f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, -11.4f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 11.4f)
                close()
            }
        }
        .build()
        return _needle!!
    }

private var _needle: ImageVector? = null
