package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.At: ImageVector
    get() {
        if (_at != null) {
            return _at!!
        }
        _at = Builder(name = "At", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcToRelative(108.0f, 108.0f, 0.0f, true, false, 59.7f, 198.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -13.3f, -20.0f)
                arcTo(83.0f, 83.0f, 0.0f, false, true, 128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                curveToRelative(0.0f, 9.3f, -1.7f, 17.1f, -4.7f, 21.9f)
                reflectiveCurveToRelative(-6.0f, 6.1f, -11.3f, 6.1f)
                reflectiveCurveToRelative(-8.7f, -1.8f, -11.3f, -6.1f)
                reflectiveCurveTo(180.0f, 137.3f, 180.0f, 128.0f)
                lineTo(180.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -23.5f, -3.5f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, 8.9f, 79.6f)
                curveToRelative(6.9f, 10.2f, 17.4f, 15.9f, 30.6f, 15.9f)
                curveToRelative(24.7f, 0.0f, 40.0f, -19.9f, 40.0f, -52.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 156.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 128.0f, 156.0f)
                close()
            }
        }
        .build()
        return _at!!
    }

private var _at: ImageVector? = null
