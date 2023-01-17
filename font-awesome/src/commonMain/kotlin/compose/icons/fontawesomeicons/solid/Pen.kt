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

public val SolidGroup.Pen: ImageVector
    get() {
        if (_pen != null) {
            return _pen!!
        }
        _pen = Builder(name = "Pen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(362.7f, 19.3f)
                lineTo(314.3f, 67.7f)
                lineTo(444.3f, 197.7f)
                lineToRelative(48.4f, -48.4f)
                curveToRelative(25.0f, -25.0f, 25.0f, -65.5f, 0.0f, -90.5f)
                lineTo(453.3f, 19.3f)
                curveToRelative(-25.0f, -25.0f, -65.5f, -25.0f, -90.5f, 0.0f)
                close()
                moveTo(291.7f, 90.3f)
                lineTo(58.6f, 323.5f)
                curveToRelative(-10.4f, 10.4f, -18.0f, 23.3f, -22.2f, 37.4f)
                lineTo(1.0f, 481.2f)
                curveTo(-1.5f, 489.7f, 0.8f, 498.8f, 7.0f, 505.0f)
                reflectiveCurveToRelative(15.3f, 8.5f, 23.7f, 6.1f)
                lineToRelative(120.3f, -35.4f)
                curveToRelative(14.1f, -4.2f, 27.0f, -11.8f, 37.4f, -22.2f)
                lineTo(421.7f, 220.3f)
                lineTo(291.7f, 90.3f)
                close()
            }
        }
        .build()
        return _pen!!
    }

private var _pen: ImageVector? = null
