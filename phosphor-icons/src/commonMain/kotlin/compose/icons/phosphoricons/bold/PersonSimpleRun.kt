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

public val BoldGroup.PersonSimpleRun: ImageVector
    get() {
        if (_personSimpleRun != null) {
            return _personSimpleRun!!
        }
        _personSimpleRun = Builder(name = "PersonSimpleRun", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 92.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 152.0f, 92.0f)
                close()
                moveTo(152.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 152.0f, 44.0f)
                close()
                moveTo(213.6f, 152.2f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.6f, 0.8f, -9.1f, 4.3f, -21.9f, 4.3f)
                arcToRelative(56.2f, 56.2f, 0.0f, false, true, -5.7f, -0.2f)
                curveToRelative(-15.5f, -1.2f, -31.8f, -7.1f, -48.6f, -17.5f)
                curveToRelative(-2.2f, 4.7f, -4.8f, 10.0f, -7.9f, 15.4f)
                curveToRelative(23.7f, 8.6f, 58.5f, 29.6f, 58.5f, 77.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                curveToRelative(0.0f, -18.7f, -7.0f, -33.1f, -21.3f, -43.9f)
                curveToRelative(-9.1f, -7.0f, -19.5f, -11.1f, -27.4f, -13.4f)
                curveToRelative(-1.9f, 2.3f, -3.9f, 4.6f, -6.1f, 6.9f)
                curveToRelative(-19.3f, 20.3f, -42.9f, 30.8f, -68.7f, 30.8f)
                arcToRelative(79.8f, 79.8f, 0.0f, false, true, -9.7f, -0.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 2.4f, -23.8f)
                curveToRelative(22.3f, 2.2f, 42.0f, -5.6f, 58.7f, -23.1f)
                arcToRelative(112.2f, 112.2f, 0.0f, false, false, 8.9f, -10.7f)
                horizontalLineToRelative(0.0f)
                arcToRelative(143.6f, 143.6f, 0.0f, false, false, 16.5f, -29.8f)
                curveToRelative(-15.4f, -11.2f, -30.1f, -15.7f, -43.9f, -13.5f)
                arcTo(37.7f, 37.7f, 0.0f, false, false, 56.0f, 118.5f)
                horizontalLineToRelative(0.1f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -8.1f, 3.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.1f, -20.9f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.0f, -1.0f, 11.0f, -9.8f, 27.8f, -13.0f)
                curveToRelative(27.6f, -5.3f, 52.0f, 8.2f, 67.7f, 20.4f)
                lineToRelative(3.4f, 2.6f)
                horizontalLineToRelative(0.1f)
                curveToRelative(40.5f, 30.2f, 63.6f, 20.2f, 63.8f, 20.1f)
                horizontalLineToRelative(-0.3f)
                arcToRelative(13.2f, 13.2f, 0.0f, false, true, 5.6f, -1.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 5.6f, 22.6f)
                close()
            }
        }
        .build()
        return _personSimpleRun!!
    }

private var _personSimpleRun: ImageVector? = null
