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

public val FillGroup.PersonSimpleRun: ImageVector
    get() {
        if (_personSimpleRun != null) {
            return _personSimpleRun!!
        }
        _personSimpleRun = Builder(name = "PersonSimpleRun", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 56.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 120.0f, 56.0f)
                close()
                moveTo(224.0f, 133.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -3.7f, 0.9f)
                horizontalLineToRelative(0.1f)
                curveToRelative(-0.1f, 0.0f, -6.5f, 3.1f, -18.2f, 1.9f)
                reflectiveCurveToRelative(-29.5f, -6.4f, -53.3f, -25.1f)
                curveToRelative(-15.0f, -11.7f, -38.3f, -24.6f, -64.4f, -19.6f)
                curveTo(60.7f, 86.7f, 51.6f, 94.8f, 50.6f, 95.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -0.5f, 11.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.3f, 0.5f)
                curveToRelative(1.1f, -1.0f, 25.8f, -22.4f, 64.6f, 4.6f)
                arcToRelative(147.9f, 147.9f, 0.0f, false, true, -21.9f, 44.4f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-2.4f, 3.1f)
                curveToRelative(-18.9f, 24.2f, -42.1f, 35.0f, -68.9f, 32.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -1.6f, 16.0f)
                curveToRelative(3.3f, 0.3f, 6.4f, 0.4f, 9.5f, 0.4f)
                curveToRelative(32.6f, 0.0f, 56.6f, -17.4f, 73.2f, -38.3f)
                curveToRelative(19.4f, 5.2f, 54.1f, 20.2f, 54.1f, 61.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                curveToRelative(0.0f, -24.7f, -10.1f, -45.4f, -29.2f, -59.9f)
                curveToRelative(-10.4f, -7.9f, -22.0f, -12.8f, -31.2f, -15.8f)
                arcToRelative(164.5f, 164.5f, 0.0f, false, false, 16.0f, -34.1f)
                curveToRelative(25.8f, 17.9f, 46.2f, 22.3f, 60.0f, 22.3f)
                reflectiveCurveToRelative(19.5f, -3.5f, 20.1f, -3.9f)
                horizontalLineToRelative(0.0f)
                arcTo(7.8f, 7.8f, 0.0f, false, false, 224.0f, 133.6f)
                close()
            }
        }
        .build()
        return _personSimpleRun!!
    }

private var _personSimpleRun: ImageVector? = null
