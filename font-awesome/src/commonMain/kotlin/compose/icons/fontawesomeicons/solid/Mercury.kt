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
        _mercury = Builder(name = "Mercury", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.1f, 7.0f)
                curveTo(85.8f, -4.0f, 106.0f, -1.8f, 117.0f, 12.0f)
                curveToRelative(17.6f, 22.0f, 44.7f, 36.0f, 75.0f, 36.0f)
                reflectiveCurveToRelative(57.3f, -14.0f, 75.0f, -36.0f)
                curveToRelative(11.1f, -13.8f, 31.2f, -16.0f, 45.0f, -5.0f)
                reflectiveCurveToRelative(16.0f, 31.2f, 5.0f, 45.0f)
                curveToRelative(-7.8f, 9.7f, -16.6f, 18.4f, -26.4f, 26.1f)
                curveTo(337.3f, 109.7f, 368.0f, 163.3f, 368.0f, 224.0f)
                curveToRelative(0.0f, 89.1f, -66.2f, 162.7f, -152.0f, 174.4f)
                verticalLineTo(424.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                horizontalLineTo(216.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                verticalLineTo(472.0f)
                horizontalLineTo(136.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                horizontalLineToRelative(32.0f)
                verticalLineTo(398.4f)
                curveTo(82.2f, 386.7f, 16.0f, 313.1f, 16.0f, 224.0f)
                curveToRelative(0.0f, -60.7f, 30.7f, -114.3f, 77.5f, -145.9f)
                curveTo(83.7f, 70.5f, 74.9f, 61.7f, 67.1f, 52.0f)
                curveToRelative(-11.1f, -13.8f, -8.8f, -33.9f, 5.0f, -45.0f)
                close()
                moveTo(80.0f, 224.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, false, 224.0f, 0.0f)
                arcTo(112.0f, 112.0f, 0.0f, true, false, 80.0f, 224.0f)
                close()
            }
        }
        .build()
        return _mercury!!
    }

private var _mercury: ImageVector? = null
