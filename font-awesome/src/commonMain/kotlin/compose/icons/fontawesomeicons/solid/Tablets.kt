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

public val SolidGroup.Tablets: ImageVector
    get() {
        if (_tablets != null) {
            return _tablets!!
        }
        _tablets = Builder(name = "Tablets", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 192.0f)
                curveTo(78.9f, 192.0f, 12.5f, 250.5f, 0.1f, 326.7f)
                curveToRelative(-0.8f, 4.8f, 3.3f, 9.3f, 8.3f, 9.3f)
                horizontalLineToRelative(303.3f)
                curveToRelative(5.0f, 0.0f, 9.1f, -4.5f, 8.3f, -9.3f)
                curveTo(307.5f, 250.5f, 241.1f, 192.0f, 160.0f, 192.0f)
                close()
                moveTo(311.6f, 368.0f)
                lineTo(8.4f, 368.0f)
                curveToRelative(-5.0f, 0.0f, -9.1f, 4.5f, -8.3f, 9.3f)
                curveTo(12.5f, 453.5f, 78.9f, 512.0f, 160.0f, 512.0f)
                reflectiveCurveToRelative(147.5f, -58.5f, 159.9f, -134.7f)
                curveToRelative(0.8f, -4.8f, -3.3f, -9.3f, -8.3f, -9.3f)
                close()
                moveTo(593.4f, 46.6f)
                curveToRelative(-56.5f, -56.5f, -144.2f, -61.4f, -206.9f, -16.0f)
                curveToRelative(-4.0f, 2.9f, -4.3f, 8.9f, -0.8f, 12.3f)
                lineTo(597.0f, 254.3f)
                curveToRelative(3.5f, 3.5f, 9.5f, 3.2f, 12.3f, -0.8f)
                curveToRelative(45.5f, -62.7f, 40.6f, -150.4f, -15.9f, -206.9f)
                close()
                moveTo(363.0f, 65.7f)
                curveToRelative(-3.5f, -3.5f, -9.5f, -3.2f, -12.3f, 0.8f)
                curveToRelative(-45.4f, 62.7f, -40.5f, 150.4f, 15.9f, 206.9f)
                curveToRelative(56.5f, 56.5f, 144.2f, 61.4f, 206.9f, 15.9f)
                curveToRelative(4.0f, -2.9f, 4.3f, -8.9f, 0.8f, -12.3f)
                lineTo(363.0f, 65.7f)
                close()
            }
        }
        .build()
        return _tablets!!
    }

private var _tablets: ImageVector? = null
