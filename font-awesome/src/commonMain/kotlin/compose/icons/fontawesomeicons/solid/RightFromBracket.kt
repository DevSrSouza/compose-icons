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

public val SolidGroup.RightFromBracket: ImageVector
    get() {
        if (_rightFromBracket != null) {
            return _rightFromBracket!!
        }
        _rightFromBracket = Builder(name = "RightFromBracket", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(377.9f, 105.9f)
                lineTo(500.7f, 228.7f)
                curveToRelative(7.2f, 7.2f, 11.3f, 17.1f, 11.3f, 27.3f)
                reflectiveCurveToRelative(-4.1f, 20.1f, -11.3f, 27.3f)
                lineTo(377.9f, 406.1f)
                curveToRelative(-6.4f, 6.4f, -15.0f, 9.9f, -24.0f, 9.9f)
                curveToRelative(-18.7f, 0.0f, -33.9f, -15.2f, -33.9f, -33.9f)
                lineToRelative(0.0f, -62.1f)
                lineToRelative(-128.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(128.0f, 0.0f)
                lineToRelative(0.0f, -62.1f)
                curveToRelative(0.0f, -18.7f, 15.2f, -33.9f, 33.9f, -33.9f)
                curveToRelative(9.0f, 0.0f, 17.6f, 3.6f, 24.0f, 9.9f)
                close()
                moveTo(160.0f, 96.0f)
                lineTo(96.0f, 96.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                lineTo(0.0f, 128.0f)
                curveTo(0.0f, 75.0f, 43.0f, 32.0f, 96.0f, 32.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _rightFromBracket!!
    }

private var _rightFromBracket: ImageVector? = null
