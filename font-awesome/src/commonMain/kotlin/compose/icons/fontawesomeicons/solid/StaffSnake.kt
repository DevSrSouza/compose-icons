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

public val SolidGroup.StaffSnake: ImageVector
    get() {
        if (_staffSnake != null) {
            return _staffSnake!!
        }
        _staffSnake = Builder(name = "StaffSnake", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.6f, 43.2f)
                lineToRelative(-0.1f, 4.8f)
                horizontalLineTo(288.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, 43.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(-43.0f, 96.0f, -96.0f, 96.0f)
                horizontalLineTo(248.0f)
                verticalLineTo(160.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                horizontalLineTo(248.0f)
                horizontalLineTo(220.0f)
                lineToRelative(-4.5f, 144.0f)
                horizontalLineTo(256.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, 43.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(-43.0f, 96.0f, -96.0f, 96.0f)
                horizontalLineTo(240.0f)
                verticalLineTo(384.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                horizontalLineTo(213.0f)
                lineToRelative(-3.1f, 99.5f)
                lineTo(208.5f, 495.0f)
                lineToRelative(0.0f, 1.0f)
                curveToRelative(-0.3f, 8.9f, -7.6f, 16.0f, -16.5f, 16.0f)
                reflectiveCurveToRelative(-16.2f, -7.1f, -16.5f, -16.0f)
                lineToRelative(0.0f, -1.0f)
                lineToRelative(-1.0f, -31.0f)
                horizontalLineTo(136.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, -17.9f, -40.0f, -40.0f)
                reflectiveCurveToRelative(17.9f, -40.0f, 40.0f, -40.0f)
                horizontalLineToRelative(36.0f)
                lineToRelative(-1.0f, -32.0f)
                horizontalLineTo(152.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                curveToRelative(0.0f, -47.6f, 34.6f, -87.1f, 80.0f, -94.7f)
                verticalLineTo(256.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(16.5f)
                lineTo(164.0f, 128.0f)
                horizontalLineTo(136.0f)
                horizontalLineTo(122.6f)
                curveToRelative(-9.0f, 18.9f, -28.3f, 32.0f, -50.6f, 32.0f)
                horizontalLineTo(56.0f)
                curveToRelative(-30.9f, 0.0f, -56.0f, -25.1f, -56.0f, -56.0f)
                reflectiveCurveTo(25.1f, 48.0f, 56.0f, 48.0f)
                horizontalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                horizontalLineToRelative(89.5f)
                lineToRelative(-0.1f, -4.8f)
                lineTo(161.0f, 32.0f)
                curveToRelative(0.0f, -0.7f, 0.0f, -1.3f, 0.0f, -1.9f)
                curveToRelative(0.5f, -16.6f, 14.1f, -30.0f, 31.0f, -30.0f)
                reflectiveCurveToRelative(30.5f, 13.4f, 31.0f, 30.0f)
                curveToRelative(0.0f, 0.6f, 0.0f, 1.3f, 0.0f, 1.9f)
                lineToRelative(-0.4f, 11.2f)
                close()
                moveTo(64.0f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, -32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, 32.0f)
                close()
            }
        }
        .build()
        return _staffSnake!!
    }

private var _staffSnake: ImageVector? = null
