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

public val SolidGroup.CheckDouble: ImageVector
    get() {
        if (_checkDouble != null) {
            return _checkDouble!!
        }
        _checkDouble = Builder(name = "CheckDouble", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(505.0f, 174.8f)
                lineToRelative(-39.6f, -39.6f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                lineTo(192.0f, 374.7f)
                lineTo(80.6f, 263.2f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                lineTo(7.0f, 302.9f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 34.0f)
                lineTo(175.0f, 505.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(296.0f, -296.2f)
                curveToRelative(9.4f, -9.5f, 9.4f, -24.7f, 0.1f, -34.0f)
                close()
                moveTo(180.7f, 280.8f)
                curveToRelative(6.2f, 6.3f, 16.4f, 6.3f, 22.6f, 0.0f)
                lineToRelative(208.0f, -208.2f)
                curveToRelative(6.2f, -6.3f, 6.2f, -16.4f, 0.0f, -22.6f)
                lineTo(366.1f, 4.7f)
                curveToRelative(-6.2f, -6.3f, -16.4f, -6.3f, -22.6f, 0.0f)
                lineTo(192.0f, 156.2f)
                lineToRelative(-55.4f, -55.5f)
                curveToRelative(-6.2f, -6.3f, -16.4f, -6.3f, -22.6f, 0.0f)
                lineTo(68.7f, 146.0f)
                curveToRelative(-6.2f, 6.3f, -6.2f, 16.4f, 0.0f, 22.6f)
                lineToRelative(112.0f, 112.2f)
                close()
            }
        }
        .build()
        return _checkDouble!!
    }

private var _checkDouble: ImageVector? = null
