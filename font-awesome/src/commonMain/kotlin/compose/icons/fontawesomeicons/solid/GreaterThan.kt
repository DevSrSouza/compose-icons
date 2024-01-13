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

public val SolidGroup.GreaterThan: ImageVector
    get() {
        if (_greaterThan != null) {
            return _greaterThan!!
        }
        _greaterThan = Builder(name = "GreaterThan", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.4f, 81.7f)
                curveToRelative(-7.9f, 15.8f, -1.5f, 35.0f, 14.3f, 42.9f)
                lineTo(280.5f, 256.0f)
                lineTo(17.7f, 387.4f)
                curveTo(1.9f, 395.3f, -4.5f, 414.5f, 3.4f, 430.3f)
                reflectiveCurveToRelative(27.1f, 22.2f, 42.9f, 14.3f)
                lineToRelative(320.0f, -160.0f)
                curveToRelative(10.8f, -5.4f, 17.7f, -16.5f, 17.7f, -28.6f)
                reflectiveCurveToRelative(-6.8f, -23.2f, -17.7f, -28.6f)
                lineToRelative(-320.0f, -160.0f)
                curveToRelative(-15.8f, -7.9f, -35.0f, -1.5f, -42.9f, 14.3f)
                close()
            }
        }
        .build()
        return _greaterThan!!
    }

private var _greaterThan: ImageVector? = null
