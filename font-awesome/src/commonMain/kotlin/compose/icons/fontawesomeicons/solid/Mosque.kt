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

public val SolidGroup.Mosque: ImageVector
    get() {
        if (_mosque != null) {
            return _mosque!!
        }
        _mosque = Builder(name = "Mosque", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 0.0f)
                curveToRelative(5.0f, 0.0f, 9.8f, 2.4f, 12.8f, 6.4f)
                curveToRelative(34.7f, 46.3f, 78.1f, 74.9f, 133.5f, 111.5f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(5.2f, 3.4f, 10.5f, 7.0f, 16.0f, 10.6f)
                curveToRelative(28.9f, 19.2f, 45.7f, 51.7f, 45.7f, 86.1f)
                curveToRelative(0.0f, 28.6f, -11.3f, 54.5f, -29.8f, 73.4f)
                horizontalLineTo(221.8f)
                curveToRelative(-18.4f, -19.0f, -29.8f, -44.9f, -29.8f, -73.4f)
                curveToRelative(0.0f, -34.4f, 16.7f, -66.9f, 45.7f, -86.1f)
                curveToRelative(5.4f, -3.6f, 10.8f, -7.1f, 16.0f, -10.6f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveTo(309.1f, 81.3f, 352.5f, 52.7f, 387.2f, 6.4f)
                curveToRelative(3.0f, -4.0f, 7.8f, -6.4f, 12.8f, -6.4f)
                close()
                moveTo(288.0f, 512.0f)
                verticalLineTo(440.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                verticalLineToRelative(72.0f)
                horizontalLineTo(192.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(352.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineTo(608.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(560.0f)
                verticalLineTo(440.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                verticalLineToRelative(72.0f)
                horizontalLineTo(448.0f)
                verticalLineTo(454.0f)
                curveToRelative(0.0f, -19.0f, -8.4f, -37.0f, -23.0f, -49.2f)
                lineTo(400.0f, 384.0f)
                lineToRelative(-25.0f, 20.8f)
                curveTo(360.4f, 417.0f, 352.0f, 435.0f, 352.0f, 454.0f)
                verticalLineToRelative(58.0f)
                horizontalLineTo(288.0f)
                close()
                moveTo(70.4f, 5.2f)
                curveToRelative(5.7f, -4.3f, 13.5f, -4.3f, 19.2f, 0.0f)
                lineToRelative(16.0f, 12.0f)
                curveTo(139.8f, 42.9f, 160.0f, 83.2f, 160.0f, 126.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-2.0f)
                curveTo(0.0f, 83.2f, 20.2f, 42.9f, 54.4f, 17.2f)
                lineToRelative(16.0f, -12.0f)
                close()
                moveTo(0.0f, 160.0f)
                horizontalLineTo(160.0f)
                verticalLineTo(296.6f)
                curveToRelative(-19.1f, 11.1f, -32.0f, 31.7f, -32.0f, 55.4f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, 9.6f, 2.1f, 18.6f, 5.8f, 26.8f)
                curveToRelative(-6.6f, 3.4f, -14.0f, 5.2f, -21.8f, 5.2f)
                horizontalLineTo(48.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                verticalLineTo(176.0f)
                verticalLineTo(160.0f)
                close()
            }
        }
        .build()
        return _mosque!!
    }

private var _mosque: ImageVector? = null
