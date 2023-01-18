package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.RecycleLine: ImageVector
    get() {
        if (_recycleLine != null) {
            return _recycleLine!!
        }
        _recycleLine = Builder(name = "RecycleLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.562f, 12.097f)
                lineToRelative(1.531f, 2.653f)
                curveToRelative(0.967f, 1.674f, 0.393f, 3.815f, -1.28f, 4.781f)
                curveToRelative(-0.533f, 0.307f, -1.136f, 0.469f, -1.75f, 0.469f)
                lineTo(16.0f, 20.0f)
                verticalLineToRelative(2.5f)
                lineTo(11.0f, 19.0f)
                lineToRelative(5.0f, -3.5f)
                lineTo(16.0f, 18.0f)
                horizontalLineToRelative(2.062f)
                curveToRelative(0.263f, 0.0f, 0.522f, -0.07f, 0.75f, -0.201f)
                curveToRelative(0.718f, -0.414f, 0.963f, -1.332f, 0.55f, -2.049f)
                lineToRelative(-1.532f, -2.653f)
                lineToRelative(1.732f, -1.0f)
                close()
                moveTo(7.304f, 9.134f)
                lineToRelative(0.53f, 6.08f)
                lineToRelative(-2.164f, -1.25f)
                lineToRelative(-1.031f, 1.786f)
                curveToRelative(-0.132f, 0.228f, -0.201f, 0.487f, -0.201f, 0.75f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                lineTo(9.0f, 18.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.938f, 20.0f)
                curveToRelative(-1.933f, 0.0f, -3.5f, -1.567f, -3.5f, -3.5f)
                curveToRelative(0.0f, -0.614f, 0.162f, -1.218f, 0.469f, -1.75f)
                lineToRelative(1.03f, -1.787f)
                lineToRelative(-2.164f, -1.249f)
                lineToRelative(5.53f, -2.58f)
                close()
                moveTo(13.75f, 2.969f)
                curveToRelative(0.532f, 0.307f, 0.974f, 0.749f, 1.281f, 1.281f)
                lineToRelative(1.03f, 1.785f)
                lineToRelative(2.166f, -1.25f)
                lineToRelative(-0.53f, 6.081f)
                lineToRelative(-5.532f, -2.58f)
                lineToRelative(2.165f, -1.25f)
                lineToRelative(-1.031f, -1.786f)
                curveToRelative(-0.132f, -0.228f, -0.321f, -0.417f, -0.549f, -0.549f)
                curveToRelative(-0.717f, -0.414f, -1.635f, -0.168f, -2.049f, 0.549f)
                lineTo(9.169f, 7.903f)
                lineToRelative(-1.732f, -1.0f)
                lineTo(8.97f, 4.25f)
                curveToRelative(0.966f, -1.674f, 3.107f, -2.248f, 4.781f, -1.281f)
                close()
            }
        }
        .build()
        return _recycleLine!!
    }

private var _recycleLine: ImageVector? = null
