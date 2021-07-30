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

public val SolidGroup.CameraRetro: ImageVector
    get() {
        if (_cameraRetro != null) {
            return _cameraRetro!!
        }
        _cameraRetro = Builder(name = "CameraRetro", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 32.0f)
                curveTo(21.5f, 32.0f, 0.0f, 53.5f, 0.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(416.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(512.0f, 80.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineTo(48.0f, 32.0f)
                close()
                moveTo(48.0f, 64.0f)
                horizontalLineToRelative(106.0f)
                curveToRelative(3.3f, 0.0f, 6.0f, 2.7f, 6.0f, 6.0f)
                verticalLineToRelative(20.0f)
                curveToRelative(0.0f, 3.3f, -2.7f, 6.0f, -6.0f, 6.0f)
                lineTo(38.0f, 96.0f)
                curveToRelative(-3.3f, 0.0f, -6.0f, -2.7f, -6.0f, -6.0f)
                lineTo(32.0f, 80.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                close()
                moveTo(474.0f, 160.0f)
                lineTo(38.0f, 160.0f)
                curveToRelative(-3.3f, 0.0f, -6.0f, -2.7f, -6.0f, -6.0f)
                verticalLineToRelative(-36.0f)
                curveToRelative(0.0f, -3.3f, 2.7f, -6.0f, 6.0f, -6.0f)
                horizontalLineToRelative(138.0f)
                lineToRelative(30.2f, -45.3f)
                curveToRelative(1.1f, -1.7f, 3.0f, -2.7f, 5.0f, -2.7f)
                lineTo(464.0f, 64.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(74.0f)
                curveToRelative(0.0f, 3.3f, -2.7f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(256.0f, 424.0f)
                curveToRelative(-66.2f, 0.0f, -120.0f, -53.8f, -120.0f, -120.0f)
                reflectiveCurveToRelative(53.8f, -120.0f, 120.0f, -120.0f)
                reflectiveCurveToRelative(120.0f, 53.8f, 120.0f, 120.0f)
                reflectiveCurveToRelative(-53.8f, 120.0f, -120.0f, 120.0f)
                close()
                moveTo(256.0f, 216.0f)
                curveToRelative(-48.5f, 0.0f, -88.0f, 39.5f, -88.0f, 88.0f)
                reflectiveCurveToRelative(39.5f, 88.0f, 88.0f, 88.0f)
                reflectiveCurveToRelative(88.0f, -39.5f, 88.0f, -88.0f)
                reflectiveCurveToRelative(-39.5f, -88.0f, -88.0f, -88.0f)
                close()
                moveTo(208.0f, 320.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                curveToRelative(-17.6f, 0.0f, -32.0f, 14.4f, -32.0f, 32.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _cameraRetro!!
    }

private var _cameraRetro: ImageVector? = null
