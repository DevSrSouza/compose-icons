package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.CameraIndoor: ImageVector
    get() {
        if (_cameraIndoor != null) {
            return _cameraIndoor!!
        }
        _cameraIndoor = Builder(name = "CameraIndoor", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.8f, 3.65f)
                lineToRelative(-6.0f, 4.5f)
                curveTo(4.3f, 8.53f, 4.0f, 9.12f, 4.0f, 9.75f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -0.63f, -0.3f, -1.22f, -0.8f, -1.6f)
                lineToRelative(-6.0f, -4.5f)
                curveTo(12.49f, 3.12f, 11.51f, 3.12f, 10.8f, 3.65f)
                close()
                moveTo(15.27f, 15.67f)
                lineTo(14.0f, 15.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(9.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineToRelative(1.27f, -0.67f)
                curveTo(15.6f, 12.15f, 16.0f, 12.39f, 16.0f, 12.77f)
                verticalLineToRelative(2.46f)
                curveTo(16.0f, 15.61f, 15.6f, 15.85f, 15.27f, 15.67f)
                close()
            }
        }
        .build()
        return _cameraIndoor!!
    }

private var _cameraIndoor: ImageVector? = null
