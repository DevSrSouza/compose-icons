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

public val SolidGroup.Maximize: ImageVector
    get() {
        if (_maximize != null) {
            return _maximize!!
        }
        _maximize = Builder(name = "Maximize", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 32.0f)
                horizontalLineTo(56.0f)
                curveTo(42.7f, 32.0f, 32.0f, 42.7f, 32.0f, 56.0f)
                verticalLineTo(200.0f)
                curveToRelative(0.0f, 9.7f, 5.8f, 18.5f, 14.8f, 22.2f)
                reflectiveCurveToRelative(19.3f, 1.7f, 26.2f, -5.2f)
                lineToRelative(40.0f, -40.0f)
                lineToRelative(79.0f, 79.0f)
                lineToRelative(-79.0f, 79.0f)
                lineTo(73.0f, 295.0f)
                curveToRelative(-6.9f, -6.9f, -17.2f, -8.9f, -26.2f, -5.2f)
                reflectiveCurveTo(32.0f, 302.3f, 32.0f, 312.0f)
                verticalLineTo(456.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineTo(200.0f)
                curveToRelative(9.7f, 0.0f, 18.5f, -5.8f, 22.2f, -14.8f)
                reflectiveCurveToRelative(1.7f, -19.3f, -5.2f, -26.2f)
                lineToRelative(-40.0f, -40.0f)
                lineToRelative(79.0f, -79.0f)
                lineToRelative(79.0f, 79.0f)
                lineToRelative(-40.0f, 40.0f)
                curveToRelative(-6.9f, 6.9f, -8.9f, 17.2f, -5.2f, 26.2f)
                reflectiveCurveToRelative(12.5f, 14.8f, 22.2f, 14.8f)
                horizontalLineTo(456.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                verticalLineTo(312.0f)
                curveToRelative(0.0f, -9.7f, -5.8f, -18.5f, -14.8f, -22.2f)
                reflectiveCurveToRelative(-19.3f, -1.7f, -26.2f, 5.2f)
                lineToRelative(-40.0f, 40.0f)
                lineToRelative(-79.0f, -79.0f)
                lineToRelative(79.0f, -79.0f)
                lineToRelative(40.0f, 40.0f)
                curveToRelative(6.9f, 6.9f, 17.2f, 8.9f, 26.2f, 5.2f)
                reflectiveCurveToRelative(14.8f, -12.5f, 14.8f, -22.2f)
                verticalLineTo(56.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                horizontalLineTo(312.0f)
                curveToRelative(-9.7f, 0.0f, -18.5f, 5.8f, -22.2f, 14.8f)
                reflectiveCurveToRelative(-1.7f, 19.3f, 5.2f, 26.2f)
                lineToRelative(40.0f, 40.0f)
                lineToRelative(-79.0f, 79.0f)
                lineToRelative(-79.0f, -79.0f)
                lineToRelative(40.0f, -40.0f)
                curveToRelative(6.9f, -6.9f, 8.9f, -17.2f, 5.2f, -26.2f)
                reflectiveCurveTo(209.7f, 32.0f, 200.0f, 32.0f)
                close()
            }
        }
        .build()
        return _maximize!!
    }

private var _maximize: ImageVector? = null
