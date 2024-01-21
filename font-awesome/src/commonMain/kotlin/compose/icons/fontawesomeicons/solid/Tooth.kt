package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Tooth: ImageVector
    get() {
        if (_tooth != null) {
            return _tooth!!
        }
        _tooth = Builder(name = "Tooth", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.1f, 52.1f)
                curveTo(169.3f, 39.1f, 148.7f, 32.0f, 127.5f, 32.0f)
                curveTo(74.7f, 32.0f, 32.0f, 74.7f, 32.0f, 127.5f)
                verticalLineToRelative(6.2f)
                curveToRelative(0.0f, 15.8f, 3.7f, 31.3f, 10.7f, 45.5f)
                lineToRelative(23.5f, 47.1f)
                curveToRelative(4.5f, 8.9f, 7.6f, 18.4f, 9.4f, 28.2f)
                lineToRelative(36.7f, 205.8f)
                curveToRelative(2.0f, 11.2f, 11.6f, 19.4f, 22.9f, 19.8f)
                reflectiveCurveToRelative(21.4f, -7.4f, 24.0f, -18.4f)
                lineToRelative(28.9f, -121.3f)
                curveTo(192.2f, 323.7f, 207.0f, 312.0f, 224.0f, 312.0f)
                reflectiveCurveToRelative(31.8f, 11.7f, 35.8f, 28.3f)
                lineToRelative(28.9f, 121.3f)
                curveToRelative(2.6f, 11.1f, 12.7f, 18.8f, 24.0f, 18.4f)
                reflectiveCurveToRelative(20.9f, -8.6f, 22.9f, -19.8f)
                lineToRelative(36.7f, -205.8f)
                curveToRelative(1.8f, -9.8f, 4.9f, -19.3f, 9.4f, -28.2f)
                lineToRelative(23.5f, -47.1f)
                curveToRelative(7.1f, -14.1f, 10.7f, -29.7f, 10.7f, -45.5f)
                verticalLineToRelative(-2.1f)
                curveToRelative(0.0f, -55.0f, -44.6f, -99.6f, -99.6f, -99.6f)
                curveToRelative(-24.1f, 0.0f, -47.4f, 8.8f, -65.6f, 24.6f)
                lineToRelative(-3.2f, 2.8f)
                lineToRelative(19.5f, 15.2f)
                curveToRelative(7.0f, 5.4f, 8.2f, 15.5f, 2.8f, 22.5f)
                reflectiveCurveToRelative(-15.5f, 8.2f, -22.5f, 2.8f)
                lineToRelative(-24.4f, -19.0f)
                lineToRelative(-37.0f, -28.8f)
                close()
            }
        }
        .build()
        return _tooth!!
    }

private var _tooth: ImageVector? = null
