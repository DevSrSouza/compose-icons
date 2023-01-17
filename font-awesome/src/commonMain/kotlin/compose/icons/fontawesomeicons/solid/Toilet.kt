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
        _toilet = Builder(name = "Toilet", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                curveTo(10.7f, 0.0f, 0.0f, 10.7f, 0.0f, 24.0f)
                reflectiveCurveTo(10.7f, 48.0f, 24.0f, 48.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(196.9f)
                curveToRelative(-1.9f, 1.4f, -3.8f, 2.9f, -5.6f, 4.4f)
                curveTo(10.9f, 214.5f, 0.0f, 232.9f, 0.0f, 256.0f)
                curveToRelative(0.0f, 46.9f, 14.3f, 84.1f, 37.0f, 112.5f)
                curveToRelative(14.2f, 17.7f, 31.1f, 31.3f, 48.5f, 41.8f)
                lineTo(65.6f, 469.9f)
                curveToRelative(-3.3f, 9.8f, -1.6f, 20.5f, 4.4f, 28.8f)
                reflectiveCurveToRelative(15.7f, 13.3f, 26.0f, 13.3f)
                horizontalLineTo(352.0f)
                curveToRelative(10.3f, 0.0f, 19.9f, -4.9f, 26.0f, -13.3f)
                reflectiveCurveToRelative(7.7f, -19.1f, 4.4f, -28.8f)
                lineToRelative(-19.8f, -59.5f)
                curveToRelative(17.4f, -10.5f, 34.3f, -24.1f, 48.5f, -41.8f)
                curveToRelative(22.7f, -28.4f, 37.0f, -65.5f, 37.0f, -112.5f)
                curveToRelative(0.0f, -23.1f, -10.9f, -41.5f, -26.4f, -54.6f)
                curveToRelative(-1.8f, -1.5f, -3.7f, -3.0f, -5.6f, -4.4f)
                verticalLineTo(48.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                horizontalLineTo(24.0f)
                close()
                moveTo(384.0f, 256.3f)
                curveToRelative(0.0f, 1.0f, -0.3f, 2.6f, -3.8f, 5.6f)
                curveToRelative(-4.8f, 4.1f, -14.0f, 9.0f, -29.3f, 13.4f)
                curveTo(320.5f, 284.0f, 276.1f, 288.0f, 224.0f, 288.0f)
                reflectiveCurveToRelative(-96.5f, -4.0f, -126.9f, -12.8f)
                curveToRelative(-15.3f, -4.4f, -24.5f, -9.3f, -29.3f, -13.4f)
                curveToRelative(-3.5f, -3.0f, -3.8f, -4.6f, -3.8f, -5.6f)
                lineToRelative(0.0f, -0.3f)
                lineToRelative(0.0f, -0.1f)
                curveToRelative(0.0f, -1.0f, 0.0f, -2.5f, 3.8f, -5.8f)
                curveToRelative(4.8f, -4.1f, 14.0f, -9.0f, 29.3f, -13.4f)
                curveTo(127.5f, 228.0f, 171.9f, 224.0f, 224.0f, 224.0f)
                reflectiveCurveToRelative(96.5f, 4.0f, 126.9f, 12.8f)
                curveToRelative(15.3f, 4.4f, 24.5f, 9.3f, 29.3f, 13.4f)
                curveToRelative(3.8f, 3.2f, 3.8f, 4.8f, 3.8f, 5.8f)
                lineToRelative(0.0f, 0.1f)
                lineToRelative(0.0f, 0.3f)
                close()
                moveTo(328.2f, 384.0f)
                lineToRelative(-0.2f, 0.5f)
                lineToRelative(0.0f, -0.5f)
                horizontalLineToRelative(0.2f)
                close()
                moveTo(112.0f, 64.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(112.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _toilet!!
    }

private var _toilet: ImageVector? = null
