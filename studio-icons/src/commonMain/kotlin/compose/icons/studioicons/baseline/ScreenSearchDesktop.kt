package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.ScreenSearchDesktop: ImageVector
    get() {
        if (_screenSearchDesktop != null) {
            return _screenSearchDesktop!!
        }
        _screenSearchDesktop = Builder(name = "ScreenSearchDesktop", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 18.0f)
                curveTo(21.1f, 18.0f, 21.99f, 17.1f, 21.99f, 16.0f)
                lineTo(22.0f, 6.0f)
                curveTo(22.0f, 4.89f, 21.1f, 4.0f, 20.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                curveTo(2.89f, 4.0f, 2.0f, 4.89f, 2.0f, 6.0f)
                lineTo(2.0f, 16.0f)
                curveTo(2.0f, 17.1f, 2.89f, 18.0f, 4.0f, 18.0f)
                lineTo(0.0f, 18.0f)
                lineTo(0.0f, 20.0f)
                lineTo(24.0f, 20.0f)
                lineTo(24.0f, 18.0f)
                lineTo(20.0f, 18.0f)
                close()
                moveTo(4.0f, 16.0f)
                lineTo(4.0f, 6.0f)
                lineTo(20.0f, 6.0f)
                lineTo(20.0f, 16.0f)
                lineTo(20.0f, 16.01f)
                lineTo(4.0f, 16.0f)
                close()
                moveTo(9.0967f, 9.9531f)
                curveTo(9.0967f, 8.9261f, 9.9327f, 8.0891f, 10.9607f, 8.0891f)
                curveTo(11.9877f, 8.0891f, 12.8247f, 8.9261f, 12.8247f, 9.9531f)
                curveTo(12.8247f, 10.9801f, 11.9877f, 11.8171f, 10.9607f, 11.8171f)
                curveTo(9.9327f, 11.8171f, 9.0967f, 10.9801f, 9.0967f, 9.9531f)
                close()
                moveTo(16.1287f, 14.1891f)
                lineTo(13.6467f, 11.7071f)
                curveTo(13.9777f, 11.2021f, 14.1737f, 10.6001f, 14.1737f, 9.9531f)
                curveTo(14.1737f, 8.1811f, 12.7327f, 6.7401f, 10.9607f, 6.7401f)
                curveTo(9.1887f, 6.7401f, 7.7467f, 8.1811f, 7.7467f, 9.9531f)
                curveTo(7.7467f, 11.7251f, 9.1887f, 13.1671f, 10.9607f, 13.1671f)
                curveTo(11.5967f, 13.1671f, 12.1857f, 12.9751f, 12.6847f, 12.6561f)
                lineTo(15.1737f, 15.1441f)
                lineTo(16.1287f, 14.1891f)
                close()
            }
        }
        .build()
        return _screenSearchDesktop!!
    }

private var _screenSearchDesktop: ImageVector? = null
