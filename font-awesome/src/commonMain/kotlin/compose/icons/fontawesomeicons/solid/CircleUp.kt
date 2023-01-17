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

public val SolidGroup.CircleUp: ImageVector
    get() {
        if (_circleUp != null) {
            return _circleUp!!
        }
        _circleUp = Builder(name = "CircleUp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                curveToRelative(141.4f, 0.0f, 256.0f, -114.6f, 256.0f, -256.0f)
                reflectiveCurveTo(397.4f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveTo(0.0f, 114.6f, 0.0f, 256.0f)
                reflectiveCurveTo(114.6f, 512.0f, 256.0f, 512.0f)
                close()
                moveTo(267.3f, 116.7f)
                lineToRelative(112.0f, 112.0f)
                curveToRelative(4.6f, 4.6f, 5.9f, 11.5f, 3.5f, 17.4f)
                reflectiveCurveToRelative(-8.3f, 9.9f, -14.8f, 9.9f)
                lineTo(304.0f, 256.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(240.0f, 384.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(208.0f, 256.0f)
                lineTo(144.0f, 256.0f)
                curveToRelative(-6.5f, 0.0f, -12.3f, -3.9f, -14.8f, -9.9f)
                reflectiveCurveToRelative(-1.1f, -12.9f, 3.5f, -17.4f)
                lineToRelative(112.0f, -112.0f)
                curveToRelative(6.2f, -6.2f, 16.4f, -6.2f, 22.6f, 0.0f)
                close()
            }
        }
        .build()
        return _circleUp!!
    }

private var _circleUp: ImageVector? = null
