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

public val SolidGroup.PencilAlt: ImageVector
    get() {
        if (_pencilAlt != null) {
            return _pencilAlt!!
        }
        _pencilAlt = Builder(name = "PencilAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(497.9f, 142.1f)
                lineToRelative(-46.1f, 46.1f)
                curveToRelative(-4.7f, 4.7f, -12.3f, 4.7f, -17.0f, 0.0f)
                lineToRelative(-111.0f, -111.0f)
                curveToRelative(-4.7f, -4.7f, -4.7f, -12.3f, 0.0f, -17.0f)
                lineToRelative(46.1f, -46.1f)
                curveToRelative(18.7f, -18.7f, 49.1f, -18.7f, 67.9f, 0.0f)
                lineToRelative(60.1f, 60.1f)
                curveToRelative(18.8f, 18.7f, 18.8f, 49.1f, 0.0f, 67.9f)
                close()
                moveTo(284.2f, 99.8f)
                lineTo(21.6f, 362.4f)
                lineTo(0.4f, 483.9f)
                curveToRelative(-2.9f, 16.4f, 11.4f, 30.6f, 27.8f, 27.8f)
                lineToRelative(121.5f, -21.3f)
                lineToRelative(262.6f, -262.6f)
                curveToRelative(4.7f, -4.7f, 4.7f, -12.3f, 0.0f, -17.0f)
                lineToRelative(-111.0f, -111.0f)
                curveToRelative(-4.8f, -4.7f, -12.4f, -4.7f, -17.1f, 0.0f)
                close()
                moveTo(124.1f, 339.9f)
                curveToRelative(-5.5f, -5.5f, -5.5f, -14.3f, 0.0f, -19.8f)
                lineToRelative(154.0f, -154.0f)
                curveToRelative(5.5f, -5.5f, 14.3f, -5.5f, 19.8f, 0.0f)
                reflectiveCurveToRelative(5.5f, 14.3f, 0.0f, 19.8f)
                lineToRelative(-154.0f, 154.0f)
                curveToRelative(-5.5f, 5.5f, -14.3f, 5.5f, -19.8f, 0.0f)
                close()
                moveTo(88.0f, 424.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(36.3f)
                lineToRelative(-64.5f, 11.3f)
                lineToRelative(-31.1f, -31.1f)
                lineTo(51.7f, 376.0f)
                horizontalLineTo(88.0f)
                verticalLineToRelative(48.0f)
                close()
            }
        }
        .build()
        return _pencilAlt!!
    }

private var _pencilAlt: ImageVector? = null
