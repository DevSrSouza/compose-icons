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

public val SolidGroup._6: ImageVector
    get() {
        if (__6 != null) {
            return __6!!
        }
        __6 = Builder(name = "_6", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.4f, 84.7f)
                curveToRelative(11.4f, -13.5f, 9.7f, -33.7f, -3.8f, -45.1f)
                reflectiveCurveToRelative(-33.7f, -9.7f, -45.1f, 3.8f)
                lineTo(38.6f, 214.7f)
                curveTo(14.7f, 242.9f, 1.1f, 278.4f, 0.1f, 315.2f)
                curveToRelative(0.0f, 1.4f, -0.1f, 2.9f, -0.1f, 4.3f)
                curveToRelative(0.0f, 0.2f, 0.0f, 0.3f, 0.0f, 0.5f)
                curveToRelative(0.0f, 88.4f, 71.6f, 160.0f, 160.0f, 160.0f)
                reflectiveCurveToRelative(160.0f, -71.6f, 160.0f, -160.0f)
                curveToRelative(0.0f, -85.5f, -67.1f, -155.4f, -151.5f, -159.8f)
                lineToRelative(63.9f, -75.6f)
                close()
                moveTo(256.0f, 320.0f)
                arcTo(96.0f, 96.0f, 0.0f, true, true, 64.0f, 320.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 192.0f, 0.0f)
                close()
            }
        }
        .build()
        return __6!!
    }

private var __6: ImageVector? = null
