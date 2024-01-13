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

public val SolidGroup.LinesLeaning: ImageVector
    get() {
        if (_linesLeaning != null) {
            return _linesLeaning!!
        }
        _linesLeaning = Builder(name = "LinesLeaning", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(190.4f, 74.1f)
                curveToRelative(5.6f, -16.8f, -3.5f, -34.9f, -20.2f, -40.5f)
                reflectiveCurveToRelative(-34.9f, 3.5f, -40.5f, 20.2f)
                lineToRelative(-128.0f, 384.0f)
                curveToRelative(-5.6f, 16.8f, 3.5f, 34.9f, 20.2f, 40.5f)
                reflectiveCurveToRelative(34.9f, -3.5f, 40.5f, -20.2f)
                lineToRelative(128.0f, -384.0f)
                close()
                moveTo(261.3f, 32.4f)
                curveToRelative(-17.4f, -2.9f, -33.9f, 8.9f, -36.8f, 26.3f)
                lineToRelative(-64.0f, 384.0f)
                curveToRelative(-2.9f, 17.4f, 8.9f, 33.9f, 26.3f, 36.8f)
                reflectiveCurveToRelative(33.9f, -8.9f, 36.8f, -26.3f)
                lineToRelative(64.0f, -384.0f)
                curveToRelative(2.9f, -17.4f, -8.9f, -33.9f, -26.3f, -36.8f)
                close()
                moveTo(352.0f, 32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineTo(320.0f, 448.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(384.0f, 64.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _linesLeaning!!
    }

private var _linesLeaning: ImageVector? = null
