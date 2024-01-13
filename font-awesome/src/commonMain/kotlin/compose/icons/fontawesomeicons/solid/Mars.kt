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

public val SolidGroup.Mars: ImageVector
    get() {
        if (_mars != null) {
            return _mars!!
        }
        _mars = Builder(name = "Mars", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(289.8f, 46.8f)
                curveToRelative(3.7f, -9.0f, 12.5f, -14.8f, 22.2f, -14.8f)
                horizontalLineTo(424.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                verticalLineTo(168.0f)
                curveToRelative(0.0f, 9.7f, -5.8f, 18.5f, -14.8f, 22.2f)
                reflectiveCurveToRelative(-19.3f, 1.7f, -26.2f, -5.2f)
                lineToRelative(-33.4f, -33.4f)
                lineTo(321.0f, 204.2f)
                curveToRelative(19.5f, 28.4f, 31.0f, 62.7f, 31.0f, 99.8f)
                curveToRelative(0.0f, 97.2f, -78.8f, 176.0f, -176.0f, 176.0f)
                reflectiveCurveTo(0.0f, 401.2f, 0.0f, 304.0f)
                reflectiveCurveToRelative(78.8f, -176.0f, 176.0f, -176.0f)
                curveToRelative(37.0f, 0.0f, 71.4f, 11.4f, 99.8f, 31.0f)
                lineToRelative(52.6f, -52.6f)
                lineTo(295.0f, 73.0f)
                curveToRelative(-6.9f, -6.9f, -8.9f, -17.2f, -5.2f, -26.2f)
                close()
                moveTo(400.0f, 80.0f)
                lineToRelative(0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(0.0f)
                close()
                moveTo(176.0f, 416.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, false, 0.0f, -224.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, false, 0.0f, 224.0f)
                close()
            }
        }
        .build()
        return _mars!!
    }

private var _mars: ImageVector? = null
