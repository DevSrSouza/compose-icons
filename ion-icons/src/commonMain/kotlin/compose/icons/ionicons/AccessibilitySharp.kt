package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.AccessibilitySharp: ImageVector
    get() {
        if (_accessibilitySharp != null) {
            return _accessibilitySharp!!
        }
        _accessibilitySharp = Builder(name = "AccessibilitySharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 112.0f)
                curveToRelative(-66.82f, 17.92f, -119.55f, 32.0f, -192.0f, 32.0f)
                reflectiveCurveTo(130.82f, 129.92f, 64.0f, 112.0f)
                lineTo(48.0f, 163.0f)
                curveToRelative(48.0f, 20.53f, 96.71f, 35.16f, 147.2f, 53.2f)
                lineTo(144.0f, 496.0f)
                lineToRelative(56.4f, 16.0f)
                lineTo(246.0f, 336.0f)
                horizontalLineToRelative(20.0f)
                lineToRelative(45.6f, 176.0f)
                lineTo(368.0f, 496.0f)
                lineTo(316.8f, 216.2f)
                curveTo(367.26f, 199.93f, 416.0f, 183.53f, 464.0f, 164.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 112.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 56.0f, -56.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, true, 256.0f, 112.0f)
                close()
            }
        }
        .build()
        return _accessibilitySharp!!
    }

private var _accessibilitySharp: ImageVector? = null
