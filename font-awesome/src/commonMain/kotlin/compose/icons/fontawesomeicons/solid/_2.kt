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

public val SolidGroup._2: ImageVector
    get() {
        if (__2 != null) {
            return __2!!
        }
        __2 = Builder(name = "_2", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(142.9f, 96.0f)
                curveToRelative(-21.5f, 0.0f, -42.2f, 8.5f, -57.4f, 23.8f)
                lineTo(54.6f, 150.6f)
                curveToRelative(-12.5f, 12.5f, -32.8f, 12.5f, -45.3f, 0.0f)
                reflectiveCurveToRelative(-12.5f, -32.8f, 0.0f, -45.3f)
                lineTo(40.2f, 74.5f)
                curveTo(67.5f, 47.3f, 104.4f, 32.0f, 142.9f, 32.0f)
                curveTo(223.0f, 32.0f, 288.0f, 97.0f, 288.0f, 177.1f)
                curveToRelative(0.0f, 38.5f, -15.3f, 75.4f, -42.5f, 102.6f)
                lineTo(109.3f, 416.0f)
                horizontalLineTo(288.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-12.9f, 0.0f, -24.6f, -7.8f, -29.6f, -19.8f)
                reflectiveCurveToRelative(-2.2f, -25.7f, 6.9f, -34.9f)
                lineTo(200.2f, 234.5f)
                curveToRelative(15.2f, -15.2f, 23.8f, -35.9f, 23.8f, -57.4f)
                curveToRelative(0.0f, -44.8f, -36.3f, -81.1f, -81.1f, -81.1f)
                close()
            }
        }
        .build()
        return __2!!
    }

private var __2: ImageVector? = null
