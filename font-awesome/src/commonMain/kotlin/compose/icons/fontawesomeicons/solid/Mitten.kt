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

public val SolidGroup.Mitten: ImageVector
    get() {
        if (_mitten != null) {
            return _mitten!!
        }
        _mitten = Builder(name = "Mitten", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.0f, 416.0f)
                lineTo(48.0f, 416.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(320.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                verticalLineToRelative(-64.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(425.0f, 206.9f)
                curveToRelative(-27.2f, -22.6f, -67.5f, -19.0f, -90.1f, 8.2f)
                lineToRelative(-20.9f, 25.0f)
                lineToRelative(-29.6f, -128.4f)
                curveToRelative(-18.0f, -77.5f, -95.4f, -125.9f, -172.8f, -108.0f)
                curveTo(34.2f, 21.6f, -14.2f, 98.9f, 3.7f, 176.4f)
                lineTo(51.6f, 384.0f)
                horizontalLineToRelative(309.0f)
                lineToRelative(72.5f, -87.0f)
                curveToRelative(22.7f, -27.2f, 19.0f, -67.5f, -8.1f, -90.1f)
                close()
            }
        }
        .build()
        return _mitten!!
    }

private var _mitten: ImageVector? = null
