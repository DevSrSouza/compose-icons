package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.PersonSimpleRun: ImageVector
    get() {
        if (_personSimpleRun != null) {
            return _personSimpleRun!!
        }
        _personSimpleRun = Builder(name = "PersonSimpleRun", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 88.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 152.0f, 88.0f)
                close()
                moveTo(152.0f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 152.0f, 40.0f)
                close()
                moveTo(219.7f, 140.6f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.6f, 0.4f, -7.6f, 3.9f, -20.1f, 3.9f)
                reflectiveCurveToRelative(-34.2f, -4.4f, -60.0f, -22.3f)
                arcToRelative(164.5f, 164.5f, 0.0f, false, true, -16.0f, 34.1f)
                curveToRelative(9.2f, 3.0f, 20.8f, 7.9f, 31.2f, 15.8f)
                curveTo(173.9f, 186.6f, 184.0f, 207.3f, 184.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                curveToRelative(0.0f, -41.7f, -34.7f, -56.7f, -54.1f, -61.9f)
                curveTo(97.3f, 191.0f, 73.3f, 208.4f, 40.7f, 208.4f)
                curveToRelative(-3.1f, 0.0f, -6.2f, -0.1f, -9.5f, -0.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 1.6f, -16.0f)
                curveToRelative(26.8f, 2.7f, 50.0f, -8.1f, 68.9f, -32.3f)
                lineToRelative(2.4f, -3.1f)
                horizontalLineToRelative(0.1f)
                arcTo(149.6f, 149.6f, 0.0f, false, false, 126.0f, 112.1f)
                curveToRelative(-38.8f, -27.0f, -63.5f, -5.6f, -64.6f, -4.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, -0.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 0.5f, -11.3f)
                curveToRelative(1.0f, -0.9f, 10.1f, -9.0f, 25.9f, -12.1f)
                curveToRelative(26.1f, -5.0f, 49.4f, 7.9f, 64.4f, 19.6f)
                curveToRelative(23.8f, 18.7f, 42.1f, 23.9f, 53.3f, 25.1f)
                reflectiveCurveToRelative(18.1f, -1.9f, 18.2f, -1.9f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, 3.7f, -0.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                arcTo(7.8f, 7.8f, 0.0f, false, true, 219.7f, 140.6f)
                close()
            }
        }
        .build()
        return _personSimpleRun!!
    }

private var _personSimpleRun: ImageVector? = null
