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

public val SolidGroup.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(name = "Paperclip", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(364.2f, 83.8f)
                curveToRelative(-24.4f, -24.4f, -64.0f, -24.4f, -88.4f, 0.0f)
                lineToRelative(-184.0f, 184.0f)
                curveToRelative(-42.1f, 42.1f, -42.1f, 110.3f, 0.0f, 152.4f)
                reflectiveCurveToRelative(110.3f, 42.1f, 152.4f, 0.0f)
                lineToRelative(152.0f, -152.0f)
                curveToRelative(10.9f, -10.9f, 28.7f, -10.9f, 39.6f, 0.0f)
                reflectiveCurveToRelative(10.9f, 28.7f, 0.0f, 39.6f)
                lineToRelative(-152.0f, 152.0f)
                curveToRelative(-64.0f, 64.0f, -167.6f, 64.0f, -231.6f, 0.0f)
                reflectiveCurveToRelative(-64.0f, -167.6f, 0.0f, -231.6f)
                lineToRelative(184.0f, -184.0f)
                curveToRelative(46.3f, -46.3f, 121.3f, -46.3f, 167.6f, 0.0f)
                reflectiveCurveToRelative(46.3f, 121.3f, 0.0f, 167.6f)
                lineToRelative(-176.0f, 176.0f)
                curveToRelative(-28.6f, 28.6f, -75.0f, 28.6f, -103.6f, 0.0f)
                reflectiveCurveToRelative(-28.6f, -75.0f, 0.0f, -103.6f)
                lineToRelative(144.0f, -144.0f)
                curveToRelative(10.9f, -10.9f, 28.7f, -10.9f, 39.6f, 0.0f)
                reflectiveCurveToRelative(10.9f, 28.7f, 0.0f, 39.6f)
                lineToRelative(-144.0f, 144.0f)
                curveToRelative(-6.7f, 6.7f, -6.7f, 17.7f, 0.0f, 24.4f)
                reflectiveCurveToRelative(17.7f, 6.7f, 24.4f, 0.0f)
                lineToRelative(176.0f, -176.0f)
                curveToRelative(24.4f, -24.4f, 24.4f, -64.0f, 0.0f, -88.4f)
                close()
            }
        }
        .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
