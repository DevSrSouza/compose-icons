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

public val LightGroup.PersonSimpleRun: ImageVector
    get() {
        if (_personSimpleRun != null) {
            return _personSimpleRun!!
        }
        _personSimpleRun = Builder(name = "PersonSimpleRun", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 86.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -30.0f, -30.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, false, 152.0f, 86.0f)
                close()
                moveTo(152.0f, 38.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 152.0f, 38.0f)
                close()
                moveTo(219.2f, 138.6f)
                lineTo(218.8f, 138.9f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.6f, 0.3f, -7.3f, 3.6f, -19.2f, 3.6f)
                curveToRelative(-13.8f, 0.0f, -34.6f, -4.5f, -61.0f, -23.5f)
                arcToRelative(166.5f, 166.5f, 0.0f, false, true, -18.1f, 38.5f)
                curveToRelative(9.4f, 2.8f, 21.9f, 7.7f, 33.1f, 16.2f)
                curveTo(172.5f, 188.0f, 182.0f, 207.7f, 182.0f, 232.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                curveToRelative(0.0f, -44.0f, -37.2f, -59.2f, -56.9f, -64.1f)
                curveToRelative(-16.3f, 20.9f, -40.0f, 38.5f, -72.4f, 38.5f)
                curveToRelative(-3.0f, 0.0f, -6.1f, -0.1f, -9.3f, -0.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 1.2f, -12.0f)
                curveToRelative(27.6f, 2.8f, 51.3f, -8.3f, 70.7f, -33.0f)
                lineToRelative(2.4f, -3.2f)
                curveToRelative(0.0f, -0.1f, 0.1f, -0.1f, 0.1f, -0.2f)
                arcToRelative(150.1f, 150.1f, 0.0f, false, false, 22.5f, -46.3f)
                curveTo(87.5f, 82.0f, 61.2f, 105.0f, 60.0f, 106.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -4.0f, 1.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                verticalLineToRelative(-0.3f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, 0.2f, -1.1f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.3f, -1.0f)
                horizontalLineToRelative(0.1f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.5f, -0.9f)
                horizontalLineToRelative(0.1f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, true, 0.7f, -0.8f)
                horizontalLineToRelative(0.0f)
                arcToRelative(55.7f, 55.7f, 0.0f, false, true, 25.0f, -11.5f)
                curveToRelative(13.7f, -2.7f, 35.5f, -1.6f, 61.6f, 18.3f)
                lineToRelative(0.5f, 0.4f)
                lineToRelative(0.7f, 0.5f)
                curveToRelative(46.2f, 36.2f, 73.3f, 23.5f, 73.6f, 23.4f)
                horizontalLineToRelative(0.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.6f, 2.7f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, -1.7f, 7.7f)
                horizontalLineToRelative(-0.4f)
                close()
            }
        }
        .build()
        return _personSimpleRun!!
    }

private var _personSimpleRun: ImageVector? = null
