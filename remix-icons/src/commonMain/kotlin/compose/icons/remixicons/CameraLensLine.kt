package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.CameraLensLine: ImageVector
    get() {
        if (_cameraLensLine != null) {
            return _cameraLensLine!!
        }
        _cameraLensLine = Builder(name = "CameraLensLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.858f, 19.71f)
                lineTo(12.0f, 16.0f)
                lineTo(5.07f, 16.0f)
                arcToRelative(8.018f, 8.018f, 0.0f, false, false, 4.788f, 3.71f)
                close()
                moveTo(4.252f, 14.0f)
                horizontalLineToRelative(4.284f)
                lineTo(5.07f, 7.999f)
                arcTo(7.963f, 7.963f, 0.0f, false, false, 4.0f, 12.0f)
                curveToRelative(0.0f, 0.69f, 0.088f, 1.36f, 0.252f, 2.0f)
                close()
                moveTo(6.395f, 6.292f)
                lineTo(8.535f, 10.0f)
                lineTo(12.0f, 4.0f)
                arcToRelative(7.974f, 7.974f, 0.0f, false, false, -5.605f, 2.292f)
                close()
                moveTo(14.142f, 4.29f)
                lineTo(12.0f, 8.0f)
                horizontalLineToRelative(6.93f)
                arcToRelative(8.018f, 8.018f, 0.0f, false, false, -4.788f, -3.71f)
                close()
                moveTo(19.748f, 10.0f)
                horizontalLineToRelative(-4.284f)
                lineToRelative(3.465f, 6.001f)
                arcTo(7.963f, 7.963f, 0.0f, false, false, 20.0f, 12.0f)
                curveToRelative(0.0f, -0.69f, -0.088f, -1.36f, -0.252f, -2.0f)
                close()
                moveTo(17.605f, 17.708f)
                lineTo(15.465f, 14.0f)
                lineTo(12.0f, 20.0f)
                arcToRelative(7.974f, 7.974f, 0.0f, false, false, 5.605f, -2.292f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(13.155f, 10.0f)
                horizontalLineToRelative(-2.31f)
                lineToRelative(-1.154f, 2.0f)
                lineToRelative(1.154f, 2.0f)
                horizontalLineToRelative(2.31f)
                lineToRelative(1.154f, -2.0f)
                lineToRelative(-1.154f, -2.0f)
                close()
            }
        }
        .build()
        return _cameraLensLine!!
    }

private var _cameraLensLine: ImageVector? = null
