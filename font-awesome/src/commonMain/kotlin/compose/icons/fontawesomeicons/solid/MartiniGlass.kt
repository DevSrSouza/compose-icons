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

public val SolidGroup.MartiniGlass: ImageVector
    get() {
        if (_martiniGlass != null) {
            return _martiniGlass!!
        }
        _martiniGlass = Builder(name = "MartiniGlass", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 0.0f)
                curveTo(19.1f, 0.0f, 7.4f, 7.8f, 2.4f, 19.8f)
                reflectiveCurveToRelative(-2.2f, 25.7f, 6.9f, 34.9f)
                lineTo(224.0f, 269.3f)
                verticalLineTo(448.0f)
                horizontalLineTo(160.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(96.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(288.0f)
                verticalLineTo(269.3f)
                lineTo(502.6f, 54.6f)
                curveToRelative(9.2f, -9.2f, 11.9f, -22.9f, 6.9f, -34.9f)
                reflectiveCurveTo(492.9f, 0.0f, 480.0f, 0.0f)
                horizontalLineTo(32.0f)
                close()
                moveTo(173.3f, 128.0f)
                lineToRelative(-64.0f, -64.0f)
                horizontalLineTo(402.7f)
                lineToRelative(-64.0f, 64.0f)
                horizontalLineTo(173.3f)
                close()
            }
        }
        .build()
        return _martiniGlass!!
    }

private var _martiniGlass: ImageVector? = null
