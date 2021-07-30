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

public val SolidGroup.Mercury: ImageVector
    get() {
        if (_mercury != null) {
            return _mercury!!
        }
        _mercury = Builder(name = "Mercury", defaultWidth = 288.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 288.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 208.0f)
                curveToRelative(0.0f, -44.2f, -19.9f, -83.7f, -51.2f, -110.1f)
                curveToRelative(2.5f, -1.8f, 4.9f, -3.8f, 7.2f, -5.8f)
                curveToRelative(24.7f, -21.2f, 39.8f, -48.8f, 43.2f, -78.8f)
                curveToRelative(0.9f, -7.1f, -4.7f, -13.3f, -11.9f, -13.3f)
                horizontalLineToRelative(-40.5f)
                curveTo(229.0f, 0.0f, 224.1f, 4.1f, 223.0f, 9.8f)
                curveToRelative(-2.4f, 12.5f, -9.6f, 24.3f, -20.7f, 33.8f)
                curveTo(187.0f, 56.8f, 166.3f, 64.0f, 144.0f, 64.0f)
                reflectiveCurveToRelative(-43.0f, -7.2f, -58.4f, -20.4f)
                curveTo(74.5f, 34.1f, 67.4f, 22.3f, 64.9f, 9.8f)
                curveTo(63.8f, 4.1f, 58.9f, 0.0f, 53.2f, 0.0f)
                lineTo(12.7f, 0.0f)
                curveTo(5.5f, 0.0f, -0.1f, 6.2f, 0.8f, 13.3f)
                curveTo(4.2f, 43.4f, 19.2f, 71.0f, 44.0f, 92.2f)
                curveToRelative(2.3f, 2.0f, 4.7f, 3.9f, 7.2f, 5.8f)
                curveTo(19.9f, 124.3f, 0.0f, 163.8f, 0.0f, 208.0f)
                curveToRelative(0.0f, 68.5f, 47.9f, 125.9f, 112.0f, 140.4f)
                lineTo(112.0f, 400.0f)
                lineTo(76.0f, 400.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, 5.4f, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.6f, 5.4f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(36.0f)
                curveToRelative(0.0f, 6.6f, 5.4f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                verticalLineToRelative(-36.0f)
                horizontalLineToRelative(36.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.6f, -5.4f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-36.0f)
                verticalLineToRelative(-51.6f)
                curveToRelative(64.1f, -14.5f, 112.0f, -71.9f, 112.0f, -140.4f)
                close()
                moveTo(64.0f, 208.0f)
                curveToRelative(0.0f, -44.1f, 35.9f, -80.0f, 80.0f, -80.0f)
                reflectiveCurveToRelative(80.0f, 35.9f, 80.0f, 80.0f)
                reflectiveCurveToRelative(-35.9f, 80.0f, -80.0f, 80.0f)
                reflectiveCurveToRelative(-80.0f, -35.9f, -80.0f, -80.0f)
                close()
            }
        }
        .build()
        return _mercury!!
    }

private var _mercury: ImageVector? = null
