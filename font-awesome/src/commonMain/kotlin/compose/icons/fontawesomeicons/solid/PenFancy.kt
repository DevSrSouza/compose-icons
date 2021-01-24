package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.PenFancy: ImageVector
    get() {
        if (_penFancy != null) {
            return _penFancy!!
        }
        _penFancy = Builder(name = "PenFancy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(79.18f, 282.94f)
                arcToRelative(32.005f, 32.005f, 0.0f, false, false, -20.24f, 20.24f)
                lineTo(0.0f, 480.0f)
                lineToRelative(4.69f, 4.69f)
                lineToRelative(92.89f, -92.89f)
                curveToRelative(-0.66f, -2.56f, -1.57f, -5.03f, -1.57f, -7.8f)
                curveToRelative(0.0f, -17.67f, 14.33f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.33f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.33f, 32.0f, -32.0f, 32.0f)
                curveToRelative(-2.77f, 0.0f, -5.24f, -0.91f, -7.8f, -1.57f)
                lineToRelative(-92.89f, 92.89f)
                lineTo(32.0f, 512.0f)
                lineToRelative(176.82f, -58.94f)
                arcToRelative(31.983f, 31.983f, 0.0f, false, false, 20.24f, -20.24f)
                lineToRelative(33.07f, -84.07f)
                lineToRelative(-98.88f, -98.88f)
                lineToRelative(-84.07f, 33.07f)
                close()
                moveTo(369.25f, 28.32f)
                lineTo(186.14f, 227.81f)
                lineToRelative(97.85f, 97.85f)
                lineToRelative(199.49f, -183.11f)
                curveTo(568.4f, 67.48f, 443.73f, -55.94f, 369.25f, 28.32f)
                close()
            }
        }
        .build()
        return _penFancy!!
    }

private var _penFancy: ImageVector? = null
