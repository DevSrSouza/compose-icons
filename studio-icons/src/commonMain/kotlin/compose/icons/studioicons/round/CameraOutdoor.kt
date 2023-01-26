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

public val RoundGroup.CameraOutdoor: ImageVector
    get() {
        if (_cameraOutdoor != null) {
            return _cameraOutdoor!!
        }
        _cameraOutdoor = Builder(name = "CameraOutdoor", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                lineToRelative(1.27f, 0.67f)
                curveTo(19.6f, 16.85f, 20.0f, 16.61f, 20.0f, 16.23f)
                verticalLineToRelative(-2.46f)
                curveToRelative(0.0f, -0.38f, -0.4f, -0.62f, -0.73f, -0.44f)
                lineTo(18.0f, 14.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(10.8f, 3.9f)
                lineToRelative(-6.0f, 4.5f)
                curveTo(4.3f, 8.78f, 4.0f, 9.37f, 4.0f, 10.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-9.0f)
                lineToRelative(6.0f, -4.5f)
                lineToRelative(6.0f, 4.5f)
                lineToRelative(0.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.63f, -0.3f, -1.22f, -0.8f, -1.6f)
                lineToRelative(-6.0f, -4.5f)
                curveTo(12.49f, 3.37f, 11.51f, 3.37f, 10.8f, 3.9f)
                close()
            }
        }
        .build()
        return _cameraOutdoor!!
    }

private var _cameraOutdoor: ImageVector? = null
