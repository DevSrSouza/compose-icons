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

public val SolidGroup.Bolt: ImageVector
    get() {
        if (_bolt != null) {
            return _bolt!!
        }
        _bolt = Builder(name = "Bolt", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(349.4f, 44.6f)
                curveToRelative(5.9f, -13.7f, 1.5f, -29.7f, -10.6f, -38.5f)
                reflectiveCurveToRelative(-28.6f, -8.0f, -39.9f, 1.8f)
                lineToRelative(-256.0f, 224.0f)
                curveToRelative(-10.0f, 8.8f, -13.6f, 22.9f, -8.9f, 35.3f)
                reflectiveCurveTo(50.7f, 288.0f, 64.0f, 288.0f)
                horizontalLineTo(175.5f)
                lineTo(98.6f, 467.4f)
                curveToRelative(-5.9f, 13.7f, -1.5f, 29.7f, 10.6f, 38.5f)
                reflectiveCurveToRelative(28.6f, 8.0f, 39.9f, -1.8f)
                lineToRelative(256.0f, -224.0f)
                curveToRelative(10.0f, -8.8f, 13.6f, -22.9f, 8.9f, -35.3f)
                reflectiveCurveToRelative(-16.6f, -20.7f, -30.0f, -20.7f)
                horizontalLineTo(272.5f)
                lineTo(349.4f, 44.6f)
                close()
            }
        }
        .build()
        return _bolt!!
    }

private var _bolt: ImageVector? = null
