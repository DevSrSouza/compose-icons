package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.CloudUploadAlt: ImageVector
    get() {
        if (_cloudUploadAlt != null) {
            return _cloudUploadAlt!!
        }
        _cloudUploadAlt = Builder(name = "CloudUploadAlt", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(537.6f, 226.6f)
                curveToRelative(4.1f, -10.7f, 6.4f, -22.4f, 6.4f, -34.6f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                curveToRelative(-19.7f, 0.0f, -38.1f, 6.0f, -53.3f, 16.2f)
                curveTo(367.0f, 64.2f, 315.3f, 32.0f, 256.0f, 32.0f)
                curveToRelative(-88.4f, 0.0f, -160.0f, 71.6f, -160.0f, 160.0f)
                curveToRelative(0.0f, 2.7f, 0.1f, 5.4f, 0.2f, 8.1f)
                curveTo(40.2f, 219.8f, 0.0f, 273.2f, 0.0f, 336.0f)
                curveToRelative(0.0f, 79.5f, 64.5f, 144.0f, 144.0f, 144.0f)
                horizontalLineToRelative(368.0f)
                curveToRelative(70.7f, 0.0f, 128.0f, -57.3f, 128.0f, -128.0f)
                curveToRelative(0.0f, -61.9f, -44.0f, -113.6f, -102.4f, -125.4f)
                close()
                moveTo(393.4f, 288.0f)
                horizontalLineTo(328.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                horizontalLineToRelative(-48.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                verticalLineTo(288.0f)
                horizontalLineToRelative(-65.4f)
                curveToRelative(-14.3f, 0.0f, -21.4f, -17.2f, -11.3f, -27.3f)
                lineToRelative(105.4f, -105.4f)
                curveToRelative(6.2f, -6.2f, 16.4f, -6.2f, 22.6f, 0.0f)
                lineToRelative(105.4f, 105.4f)
                curveToRelative(10.1f, 10.1f, 2.9f, 27.3f, -11.3f, 27.3f)
                close()
            }
        }
        .build()
        return _cloudUploadAlt!!
    }

private var _cloudUploadAlt: ImageVector? = null
