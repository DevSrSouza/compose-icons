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

public val SolidGroup.UpDown: ImageVector
    get() {
        if (_upDown != null) {
            return _upDown!!
        }
        _upDown = Builder(name = "UpDown", defaultWidth = 256.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 256.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(145.6f, 7.7f)
                curveTo(141.0f, 2.8f, 134.7f, 0.0f, 128.0f, 0.0f)
                reflectiveCurveToRelative(-13.0f, 2.8f, -17.6f, 7.7f)
                lineToRelative(-104.0f, 112.0f)
                curveToRelative(-6.5f, 7.0f, -8.2f, 17.2f, -4.4f, 25.9f)
                reflectiveCurveTo(14.5f, 160.0f, 24.0f, 160.0f)
                horizontalLineTo(80.0f)
                verticalLineTo(352.0f)
                horizontalLineTo(24.0f)
                curveToRelative(-9.5f, 0.0f, -18.2f, 5.7f, -22.0f, 14.4f)
                reflectiveCurveToRelative(-2.1f, 18.9f, 4.4f, 25.9f)
                lineToRelative(104.0f, 112.0f)
                curveToRelative(4.5f, 4.9f, 10.9f, 7.7f, 17.6f, 7.7f)
                reflectiveCurveToRelative(13.0f, -2.8f, 17.6f, -7.7f)
                lineToRelative(104.0f, -112.0f)
                curveToRelative(6.5f, -7.0f, 8.2f, -17.2f, 4.4f, -25.9f)
                reflectiveCurveToRelative(-12.5f, -14.4f, -22.0f, -14.4f)
                horizontalLineTo(176.0f)
                verticalLineTo(160.0f)
                horizontalLineToRelative(56.0f)
                curveToRelative(9.5f, 0.0f, 18.2f, -5.7f, 22.0f, -14.4f)
                reflectiveCurveToRelative(2.1f, -18.9f, -4.4f, -25.9f)
                lineToRelative(-104.0f, -112.0f)
                close()
            }
        }
        .build()
        return _upDown!!
    }

private var _upDown: ImageVector? = null
