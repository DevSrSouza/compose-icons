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

public val SolidGroup.BroomBall: ImageVector
    get() {
        if (_broomBall != null) {
            return _broomBall!!
        }
        _broomBall = Builder(name = "BroomBall", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(566.6f, 9.4f)
                curveToRelative(12.5f, 12.5f, 12.5f, 32.8f, 0.0f, 45.3f)
                lineToRelative(-192.0f, 192.0f)
                lineToRelative(34.7f, 34.7f)
                curveToRelative(4.2f, 4.2f, 6.6f, 10.0f, 6.6f, 16.0f)
                curveToRelative(0.0f, 12.5f, -10.1f, 22.6f, -22.6f, 22.6f)
                lineTo(364.3f, 320.0f)
                lineTo(256.0f, 211.7f)
                lineTo(256.0f, 182.6f)
                curveToRelative(0.0f, -12.5f, 10.1f, -22.6f, 22.6f, -22.6f)
                curveToRelative(6.0f, 0.0f, 11.8f, 2.4f, 16.0f, 6.6f)
                lineToRelative(34.7f, 34.7f)
                lineToRelative(192.0f, -192.0f)
                curveToRelative(12.5f, -12.5f, 32.8f, -12.5f, 45.3f, 0.0f)
                close()
                moveTo(222.6f, 234.9f)
                lineTo(341.1f, 353.4f)
                curveToRelative(3.7f, 42.7f, -11.7f, 85.2f, -42.3f, 115.8f)
                curveTo(271.4f, 496.6f, 234.2f, 512.0f, 195.5f, 512.0f)
                lineTo(22.1f, 512.0f)
                curveTo(9.9f, 512.0f, 0.0f, 502.1f, 0.0f, 489.9f)
                curveToRelative(0.0f, -6.3f, 2.7f, -12.3f, 7.3f, -16.5f)
                lineTo(133.7f, 359.7f)
                curveToRelative(4.2f, -3.7f, -0.4f, -10.4f, -5.4f, -7.9f)
                lineTo(77.2f, 377.4f)
                curveToRelative(-6.1f, 3.0f, -13.2f, -1.4f, -13.2f, -8.2f)
                curveToRelative(0.0f, -31.5f, 12.5f, -61.7f, 34.8f, -84.0f)
                lineToRelative(8.0f, -8.0f)
                curveToRelative(30.6f, -30.6f, 73.1f, -45.9f, 115.8f, -42.3f)
                close()
                moveTo(464.0f, 352.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 0.0f, 160.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 0.0f, -160.0f)
                close()
            }
        }
        .build()
        return _broomBall!!
    }

private var _broomBall: ImageVector? = null
