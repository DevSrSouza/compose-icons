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

public val SolidGroup.Marker: ImageVector
    get() {
        if (_marker != null) {
            return _marker!!
        }
        _marker = Builder(name = "Marker", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(481.0f, 31.0f)
                curveTo(445.1f, -4.8f, 386.9f, -4.8f, 351.0f, 31.0f)
                lineToRelative(-15.0f, 15.0f)
                lineTo(322.9f, 33.0f)
                curveTo(294.8f, 4.9f, 249.2f, 4.9f, 221.1f, 33.0f)
                lineTo(135.0f, 119.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(24.6f, 9.4f, 33.9f, 0.0f)
                lineTo(255.0f, 66.9f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                lineTo(302.1f, 80.0f)
                lineTo(186.3f, 195.7f)
                lineTo(316.3f, 325.7f)
                lineTo(481.0f, 161.0f)
                curveToRelative(35.9f, -35.9f, 35.9f, -94.1f, 0.0f, -129.9f)
                close()
                moveTo(293.7f, 348.3f)
                lineTo(163.7f, 218.3f)
                lineTo(99.5f, 282.5f)
                curveToRelative(-48.0f, 48.0f, -80.8f, 109.2f, -94.1f, 175.8f)
                lineToRelative(-5.0f, 25.0f)
                curveToRelative(-1.6f, 7.9f, 0.9f, 16.0f, 6.6f, 21.7f)
                reflectiveCurveToRelative(13.8f, 8.1f, 21.7f, 6.6f)
                lineToRelative(25.0f, -5.0f)
                curveToRelative(66.6f, -13.3f, 127.8f, -46.1f, 175.8f, -94.1f)
                lineToRelative(64.2f, -64.2f)
                close()
            }
        }
        .build()
        return _marker!!
    }

private var _marker: ImageVector? = null
