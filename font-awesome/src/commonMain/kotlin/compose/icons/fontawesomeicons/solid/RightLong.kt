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

public val SolidGroup.RightLong: ImageVector
    get() {
        if (_rightLong != null) {
            return _rightLong!!
        }
        _rightLong = Builder(name = "RightLong", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(334.5f, 414.0f)
                curveToRelative(8.8f, 3.8f, 19.0f, 2.0f, 26.0f, -4.6f)
                lineToRelative(144.0f, -136.0f)
                curveToRelative(4.8f, -4.5f, 7.5f, -10.8f, 7.5f, -17.4f)
                reflectiveCurveToRelative(-2.7f, -12.9f, -7.5f, -17.4f)
                lineToRelative(-144.0f, -136.0f)
                curveToRelative(-7.0f, -6.6f, -17.2f, -8.4f, -26.0f, -4.6f)
                reflectiveCurveToRelative(-14.5f, 12.5f, -14.5f, 22.0f)
                lineToRelative(0.0f, 72.0f)
                lineTo(32.0f, 192.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(288.0f, 0.0f)
                lineToRelative(0.0f, 72.0f)
                curveToRelative(0.0f, 9.6f, 5.7f, 18.2f, 14.5f, 22.0f)
                close()
            }
        }
        .build()
        return _rightLong!!
    }

private var _rightLong: ImageVector? = null
