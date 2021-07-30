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

public val SolidGroup.BoxOpen: ImageVector
    get() {
        if (_boxOpen != null) {
            return _boxOpen!!
        }
        _boxOpen = Builder(name = "BoxOpen", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(425.7f, 256.0f)
                curveToRelative(-16.9f, 0.0f, -32.8f, -9.0f, -41.4f, -23.4f)
                lineTo(320.0f, 126.0f)
                lineToRelative(-64.2f, 106.6f)
                curveToRelative(-8.7f, 14.5f, -24.6f, 23.5f, -41.5f, 23.5f)
                curveToRelative(-4.5f, 0.0f, -9.0f, -0.6f, -13.3f, -1.9f)
                lineTo(64.0f, 215.0f)
                verticalLineToRelative(178.0f)
                curveToRelative(0.0f, 14.7f, 10.0f, 27.5f, 24.2f, 31.0f)
                lineToRelative(216.2f, 54.1f)
                curveToRelative(10.2f, 2.5f, 20.9f, 2.5f, 31.0f, 0.0f)
                lineTo(551.8f, 424.0f)
                curveToRelative(14.2f, -3.6f, 24.2f, -16.4f, 24.2f, -31.0f)
                lineTo(576.0f, 215.0f)
                lineToRelative(-137.0f, 39.1f)
                curveToRelative(-4.3f, 1.3f, -8.8f, 1.9f, -13.3f, 1.9f)
                close()
                moveTo(638.3f, 143.8f)
                lineTo(586.8f, 41.0f)
                curveToRelative(-3.1f, -6.2f, -9.8f, -9.8f, -16.7f, -8.9f)
                lineTo(320.0f, 64.0f)
                lineToRelative(91.7f, 152.1f)
                curveToRelative(3.8f, 6.3f, 11.4f, 9.3f, 18.5f, 7.3f)
                lineToRelative(197.9f, -56.5f)
                curveToRelative(9.9f, -2.9f, 14.7f, -13.9f, 10.2f, -23.1f)
                close()
                moveTo(53.2f, 41.0f)
                lineTo(1.7f, 143.8f)
                curveToRelative(-4.6f, 9.2f, 0.3f, 20.2f, 10.1f, 23.0f)
                lineToRelative(197.9f, 56.5f)
                curveToRelative(7.1f, 2.0f, 14.7f, -1.0f, 18.5f, -7.3f)
                lineTo(320.0f, 64.0f)
                lineTo(69.8f, 32.1f)
                curveToRelative(-6.9f, -0.8f, -13.5f, 2.7f, -16.6f, 8.9f)
                close()
            }
        }
        .build()
        return _boxOpen!!
    }

private var _boxOpen: ImageVector? = null
