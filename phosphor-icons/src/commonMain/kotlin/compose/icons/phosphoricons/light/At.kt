package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.At: ImageVector
    get() {
        if (_at != null) {
            return _at!!
        }
        _at = Builder(name = "At", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcToRelative(102.0f, 102.0f, 0.0f, true, false, 56.4f, 187.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.6f, -10.0f)
                arcTo(90.0f, 90.0f, 0.0f, true, true, 218.0f, 128.0f)
                curveToRelative(0.0f, 29.6f, -13.8f, 34.0f, -22.0f, 34.0f)
                reflectiveCurveToRelative(-22.0f, -4.4f, -22.0f, -34.0f)
                lineTo(174.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, 4.3f, 56.4f)
                curveTo(171.8f, 166.6f, 182.0f, 174.0f, 196.0f, 174.0f)
                curveToRelative(21.3f, 0.0f, 34.0f, -17.2f, 34.0f, -46.0f)
                arcTo(102.2f, 102.2f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 162.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, -34.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 128.0f, 162.0f)
                close()
            }
        }
        .build()
        return _at!!
    }

private var _at: ImageVector? = null
