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

public val SolidGroup._9: ImageVector
    get() {
        if (__9 != null) {
            return __9!!
        }
        __9 = Builder(name = "_9", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 192.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 192.0f, 0.0f)
                arcTo(96.0f, 96.0f, 0.0f, true, false, 64.0f, 192.0f)
                close()
                moveTo(151.5f, 351.8f)
                curveTo(67.1f, 347.4f, 0.0f, 277.5f, 0.0f, 192.0f)
                curveTo(0.0f, 103.6f, 71.6f, 32.0f, 160.0f, 32.0f)
                reflectiveCurveToRelative(160.0f, 71.6f, 160.0f, 160.0f)
                curveToRelative(0.0f, 2.6f, -0.1f, 5.3f, -0.2f, 7.9f)
                curveToRelative(-1.7f, 35.7f, -15.2f, 70.0f, -38.4f, 97.4f)
                lineToRelative(-145.0f, 171.4f)
                curveToRelative(-11.4f, 13.5f, -31.6f, 15.2f, -45.1f, 3.8f)
                reflectiveCurveToRelative(-15.2f, -31.6f, -3.8f, -45.1f)
                lineToRelative(63.9f, -75.6f)
                close()
            }
        }
        .build()
        return __9!!
    }

private var __9: ImageVector? = null
