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

public val SolidGroup.Question: ImageVector
    get() {
        if (_question != null) {
            return _question!!
        }
        _question = Builder(name = "Question", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 96.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                curveTo(0.0f, 75.0f, 43.0f, 32.0f, 96.0f, 32.0f)
                horizontalLineToRelative(97.0f)
                curveToRelative(70.1f, 0.0f, 127.0f, 56.9f, 127.0f, 127.0f)
                curveToRelative(0.0f, 52.4f, -32.2f, 99.4f, -81.0f, 118.4f)
                lineToRelative(-63.0f, 24.5f)
                lineToRelative(0.0f, 18.1f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(112.0f, 301.9f)
                curveToRelative(0.0f, -26.4f, 16.2f, -50.1f, 40.8f, -59.6f)
                lineToRelative(63.0f, -24.5f)
                curveTo(240.0f, 208.3f, 256.0f, 185.0f, 256.0f, 159.0f)
                curveToRelative(0.0f, -34.8f, -28.2f, -63.0f, -63.0f, -63.0f)
                lineTo(96.0f, 96.0f)
                close()
                moveTo(144.0f, 480.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, -17.9f, -40.0f, -40.0f)
                reflectiveCurveToRelative(17.9f, -40.0f, 40.0f, -40.0f)
                reflectiveCurveToRelative(40.0f, 17.9f, 40.0f, 40.0f)
                reflectiveCurveToRelative(-17.9f, 40.0f, -40.0f, 40.0f)
                close()
            }
        }
        .build()
        return _question!!
    }

private var _question: ImageVector? = null
