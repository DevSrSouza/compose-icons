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

public val FillGroup.Wrench: ImageVector
    get() {
        if (_wrench != null) {
            return _wrench!!
        }
        _wrench = Builder(name = "Wrench", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.9f, 146.9f)
                arcToRelative(72.2f, 72.2f, 0.0f, false, true, -79.8f, 15.0f)
                lineTo(79.0f, 222.2f)
                curveToRelative(-0.1f, 0.1f, -0.2f, 0.3f, -0.4f, 0.4f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, true, -45.2f, 0.0f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, true, 0.0f, -45.2f)
                curveToRelative(0.1f, -0.2f, 0.3f, -0.3f, 0.4f, -0.4f)
                lineToRelative(60.3f, -52.1f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, 94.0f, -95.2f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, 4.4f, 4.6f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, -0.4f, 6.3f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, true, -1.5f, 2.1f)
                lineToRelative(-38.9f, 39.0f)
                lineToRelative(3.8f, 18.8f)
                lineToRelative(18.8f, 3.8f)
                lineToRelative(39.0f, -38.9f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, true, 2.1f, -1.5f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, 6.3f, -0.4f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, 4.6f, 4.4f)
                arcTo(71.6f, 71.6f, 0.0f, false, true, 210.9f, 146.9f)
                close()
            }
        }
        .build()
        return _wrench!!
    }

private var _wrench: ImageVector? = null
