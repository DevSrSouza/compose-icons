package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ClosedCaptioning: ImageVector
    get() {
        if (_closedCaptioning != null) {
            return _closedCaptioning!!
        }
        _closedCaptioning = Builder(name = "ClosedCaptioning", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 64.0f)
                lineTo(48.0f, 64.0f)
                curveTo(21.5f, 64.0f, 0.0f, 85.5f, 0.0f, 112.0f)
                verticalLineToRelative(288.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(416.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(512.0f, 112.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(218.1f, 287.7f)
                curveToRelative(2.8f, -2.5f, 7.1f, -2.1f, 9.2f, 0.9f)
                lineToRelative(19.5f, 27.7f)
                curveToRelative(1.7f, 2.4f, 1.5f, 5.6f, -0.5f, 7.7f)
                curveToRelative(-53.6f, 56.8f, -172.8f, 32.1f, -172.8f, -67.9f)
                curveToRelative(0.0f, -97.3f, 121.7f, -119.5f, 172.5f, -70.1f)
                curveToRelative(2.1f, 2.0f, 2.5f, 3.2f, 1.0f, 5.7f)
                lineToRelative(-17.5f, 30.5f)
                curveToRelative(-1.9f, 3.1f, -6.2f, 4.0f, -9.1f, 1.7f)
                curveToRelative(-40.8f, -32.0f, -94.6f, -14.9f, -94.6f, 31.2f)
                curveToRelative(0.1f, 48.0f, 51.1f, 70.5f, 92.3f, 32.6f)
                close()
                moveTo(408.5f, 287.7f)
                curveToRelative(2.8f, -2.5f, 7.1f, -2.1f, 9.2f, 0.9f)
                lineToRelative(19.5f, 27.7f)
                curveToRelative(1.7f, 2.4f, 1.5f, 5.6f, -0.5f, 7.7f)
                curveToRelative(-53.5f, 56.9f, -172.7f, 32.1f, -172.7f, -67.9f)
                curveToRelative(0.0f, -97.3f, 121.7f, -119.5f, 172.5f, -70.1f)
                curveToRelative(2.1f, 2.0f, 2.5f, 3.2f, 1.0f, 5.7f)
                lineTo(420.0f, 222.2f)
                curveToRelative(-1.9f, 3.1f, -6.2f, 4.0f, -9.1f, 1.7f)
                curveToRelative(-40.8f, -32.0f, -94.6f, -14.9f, -94.6f, 31.2f)
                curveToRelative(0.0f, 48.0f, 51.0f, 70.5f, 92.2f, 32.6f)
                close()
            }
        }
        .build()
        return _closedCaptioning!!
    }

private var _closedCaptioning: ImageVector? = null
