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

public val SolidGroup.UpDownLeftRight: ImageVector
    get() {
        if (_upDownLeftRight != null) {
            return _upDownLeftRight!!
        }
        _upDownLeftRight = Builder(name = "UpDownLeftRight", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(278.6f, 9.4f)
                curveToRelative(-12.5f, -12.5f, -32.8f, -12.5f, -45.3f, 0.0f)
                lineToRelative(-64.0f, 64.0f)
                curveToRelative(-9.2f, 9.2f, -11.9f, 22.9f, -6.9f, 34.9f)
                reflectiveCurveToRelative(16.6f, 19.8f, 29.6f, 19.8f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(96.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(192.0f)
                curveToRelative(0.0f, -12.9f, -7.8f, -24.6f, -19.8f, -29.6f)
                reflectiveCurveToRelative(-25.7f, -2.2f, -34.9f, 6.9f)
                lineToRelative(-64.0f, 64.0f)
                curveToRelative(-12.5f, 12.5f, -12.5f, 32.8f, 0.0f, 45.3f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(9.2f, 9.2f, 22.9f, 11.9f, 34.9f, 6.9f)
                reflectiveCurveToRelative(19.8f, -16.6f, 19.8f, -29.6f)
                verticalLineTo(288.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(96.0f)
                horizontalLineTo(192.0f)
                curveToRelative(-12.9f, 0.0f, -24.6f, 7.8f, -29.6f, 19.8f)
                reflectiveCurveToRelative(-2.2f, 25.7f, 6.9f, 34.9f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(12.5f, 12.5f, 32.8f, 12.5f, 45.3f, 0.0f)
                lineToRelative(64.0f, -64.0f)
                curveToRelative(9.2f, -9.2f, 11.9f, -22.9f, 6.9f, -34.9f)
                reflectiveCurveToRelative(-16.6f, -19.8f, -29.6f, -19.8f)
                horizontalLineTo(288.0f)
                verticalLineTo(288.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 12.9f, 7.8f, 24.6f, 19.8f, 29.6f)
                reflectiveCurveToRelative(25.7f, 2.2f, 34.9f, -6.9f)
                lineToRelative(64.0f, -64.0f)
                curveToRelative(12.5f, -12.5f, 12.5f, -32.8f, 0.0f, -45.3f)
                lineToRelative(-64.0f, -64.0f)
                curveToRelative(-9.2f, -9.2f, -22.9f, -11.9f, -34.9f, -6.9f)
                reflectiveCurveToRelative(-19.8f, 16.6f, -19.8f, 29.6f)
                verticalLineToRelative(32.0f)
                horizontalLineTo(288.0f)
                verticalLineTo(128.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(12.9f, 0.0f, 24.6f, -7.8f, 29.6f, -19.8f)
                reflectiveCurveToRelative(2.2f, -25.7f, -6.9f, -34.9f)
                lineToRelative(-64.0f, -64.0f)
                close()
            }
        }
        .build()
        return _upDownLeftRight!!
    }

private var _upDownLeftRight: ImageVector? = null
