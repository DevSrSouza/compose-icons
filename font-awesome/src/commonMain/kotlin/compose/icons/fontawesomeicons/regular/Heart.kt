package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(458.4f, 64.3f)
                curveTo(400.6f, 15.7f, 311.3f, 23.0f, 256.0f, 79.3f)
                curveTo(200.7f, 23.0f, 111.4f, 15.6f, 53.6f, 64.3f)
                curveTo(-21.6f, 127.6f, -10.6f, 230.8f, 43.0f, 285.5f)
                lineToRelative(175.4f, 178.7f)
                curveToRelative(10.0f, 10.2f, 23.4f, 15.9f, 37.6f, 15.9f)
                curveToRelative(14.3f, 0.0f, 27.6f, -5.6f, 37.6f, -15.8f)
                lineTo(469.0f, 285.6f)
                curveToRelative(53.5f, -54.7f, 64.7f, -157.9f, -10.6f, -221.3f)
                close()
                moveTo(434.8f, 251.8f)
                lineTo(259.4f, 430.5f)
                curveToRelative(-2.4f, 2.4f, -4.4f, 2.4f, -6.8f, 0.0f)
                lineTo(77.2f, 251.8f)
                curveToRelative(-36.5f, -37.2f, -43.9f, -107.6f, 7.3f, -150.7f)
                curveToRelative(38.9f, -32.7f, 98.9f, -27.8f, 136.5f, 10.5f)
                lineToRelative(35.0f, 35.7f)
                lineToRelative(35.0f, -35.7f)
                curveToRelative(37.8f, -38.5f, 97.8f, -43.2f, 136.5f, -10.6f)
                curveToRelative(51.1f, 43.1f, 43.5f, 113.9f, 7.3f, 150.8f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
