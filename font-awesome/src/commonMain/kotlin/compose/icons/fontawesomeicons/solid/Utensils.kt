package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Utensils: ImageVector
    get() {
        if (_utensils != null) {
            return _utensils!!
        }
        _utensils = Builder(name = "Utensils", defaultWidth = 416.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 416.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.9f, 15.2f)
                curveToRelative(0.8f, 4.7f, 16.1f, 94.5f, 16.1f, 128.8f)
                curveToRelative(0.0f, 52.3f, -27.8f, 89.6f, -68.9f, 104.6f)
                lineTo(168.0f, 486.7f)
                curveToRelative(0.7f, 13.7f, -10.2f, 25.3f, -24.0f, 25.3f)
                lineTo(80.0f, 512.0f)
                curveToRelative(-13.7f, 0.0f, -24.7f, -11.5f, -24.0f, -25.3f)
                lineToRelative(12.9f, -238.1f)
                curveTo(27.7f, 233.6f, 0.0f, 196.2f, 0.0f, 144.0f)
                curveTo(0.0f, 109.6f, 15.3f, 19.9f, 16.1f, 15.2f)
                curveTo(19.3f, -5.1f, 61.4f, -5.4f, 64.0f, 16.3f)
                verticalLineToRelative(141.2f)
                curveToRelative(1.3f, 3.4f, 15.1f, 3.2f, 16.0f, 0.0f)
                curveToRelative(1.4f, -25.3f, 7.9f, -139.2f, 8.0f, -141.8f)
                curveToRelative(3.3f, -20.8f, 44.7f, -20.8f, 47.9f, 0.0f)
                curveToRelative(0.2f, 2.7f, 6.6f, 116.5f, 8.0f, 141.8f)
                curveToRelative(0.9f, 3.2f, 14.8f, 3.4f, 16.0f, 0.0f)
                lineTo(159.9f, 16.3f)
                curveToRelative(2.6f, -21.6f, 44.8f, -21.4f, 48.0f, -1.1f)
                close()
                moveTo(327.1f, 300.9f)
                lineToRelative(-15.0f, 185.1f)
                curveToRelative(-1.2f, 14.0f, 9.9f, 26.0f, 23.9f, 26.0f)
                horizontalLineToRelative(56.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                lineTo(416.0f, 24.0f)
                curveToRelative(0.0f, -13.2f, -10.7f, -24.0f, -24.0f, -24.0f)
                curveToRelative(-82.5f, 0.0f, -221.4f, 178.5f, -64.9f, 300.9f)
                close()
            }
        }
        .build()
        return _utensils!!
    }

private var _utensils: ImageVector? = null
