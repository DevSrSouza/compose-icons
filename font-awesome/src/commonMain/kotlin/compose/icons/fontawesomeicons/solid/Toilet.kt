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

public val SolidGroup.Toilet: ImageVector
    get() {
        if (_toilet != null) {
            return _toilet!!
        }
        _toilet = Builder(name = "Toilet", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.0f, 48.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(384.0f, 16.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(16.0f, 0.0f)
                curveTo(7.2f, 0.0f, 0.0f, 7.2f, 0.0f, 16.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(156.7f)
                curveTo(11.8f, 214.8f, 0.0f, 226.9f, 0.0f, 240.0f)
                curveToRelative(0.0f, 67.2f, 34.6f, 126.2f, 86.8f, 160.5f)
                lineToRelative(-21.4f, 70.2f)
                curveTo(59.1f, 491.2f, 74.5f, 512.0f, 96.0f, 512.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(21.5f, 0.0f, 36.9f, -20.8f, 30.6f, -41.3f)
                lineToRelative(-21.4f, -70.2f)
                curveTo(349.4f, 366.2f, 384.0f, 307.2f, 384.0f, 240.0f)
                curveToRelative(0.0f, -13.1f, -11.8f, -25.2f, -32.0f, -35.3f)
                lineTo(352.0f, 48.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(80.0f, 72.0f)
                curveToRelative(0.0f, -4.4f, 3.6f, -8.0f, 8.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, 3.6f, 8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 4.4f, -3.6f, 8.0f, -8.0f, 8.0f)
                lineTo(88.0f, 96.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, -3.6f, -8.0f, -8.0f)
                lineTo(80.0f, 72.0f)
                close()
                moveTo(192.0f, 272.0f)
                curveToRelative(-77.1f, 0.0f, -139.6f, -14.3f, -139.6f, -32.0f)
                reflectiveCurveToRelative(62.5f, -32.0f, 139.6f, -32.0f)
                reflectiveCurveToRelative(139.6f, 14.3f, 139.6f, 32.0f)
                reflectiveCurveToRelative(-62.5f, 32.0f, -139.6f, 32.0f)
                close()
            }
        }
        .build()
        return _toilet!!
    }

private var _toilet: ImageVector? = null
