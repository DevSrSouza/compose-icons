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

public val BoldGroup.PersonSimple: ImageVector
    get() {
        if (_personSimple != null) {
            return _personSimple!!
        }
        _personSimple = Builder(name = "PersonSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(127.9f, 84.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 127.9f, 84.0f)
                close()
                moveTo(127.9f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 127.9f, 36.0f)
                close()
                moveTo(234.3f, 138.2f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 224.0f, 144.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -6.2f, -1.7f)
                curveToRelative(-0.3f, -0.2f, -32.3f, -18.9f, -77.8f, -21.9f)
                verticalLineToRelative(27.0f)
                lineTo(201.0f, 216.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -1.0f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, -1.0f)
                lineToRelative(-55.0f, -61.9f)
                lineTo(73.0f, 232.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -18.0f, -16.0f)
                lineToRelative(61.0f, -68.6f)
                verticalLineToRelative(-27.0f)
                curveToRelative(-45.7f, 3.0f, -77.5f, 21.7f, -77.8f, 21.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.4f, -20.6f)
                curveTo(27.6f, 120.7f, 69.4f, 96.0f, 128.0f, 96.0f)
                reflectiveCurveToRelative(100.4f, 24.7f, 102.2f, 25.7f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 234.3f, 138.2f)
                close()
            }
        }
        .build()
        return _personSimple!!
    }

private var _personSimple: ImageVector? = null
