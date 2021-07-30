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

public val SolidGroup.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 144.0f)
                verticalLineToRelative(288.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(48.0f, 480.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(0.0f, 144.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(88.0f)
                lineToRelative(12.3f, -32.9f)
                curveToRelative(7.0f, -18.7f, 24.9f, -31.1f, 44.9f, -31.1f)
                horizontalLineToRelative(125.5f)
                curveToRelative(20.0f, 0.0f, 37.9f, 12.4f, 44.9f, 31.1f)
                lineTo(376.0f, 96.0f)
                horizontalLineToRelative(88.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                close()
                moveTo(376.0f, 288.0f)
                curveToRelative(0.0f, -66.2f, -53.8f, -120.0f, -120.0f, -120.0f)
                reflectiveCurveToRelative(-120.0f, 53.8f, -120.0f, 120.0f)
                reflectiveCurveToRelative(53.8f, 120.0f, 120.0f, 120.0f)
                reflectiveCurveToRelative(120.0f, -53.8f, 120.0f, -120.0f)
                close()
                moveTo(344.0f, 288.0f)
                curveToRelative(0.0f, 48.5f, -39.5f, 88.0f, -88.0f, 88.0f)
                reflectiveCurveToRelative(-88.0f, -39.5f, -88.0f, -88.0f)
                reflectiveCurveToRelative(39.5f, -88.0f, 88.0f, -88.0f)
                reflectiveCurveToRelative(88.0f, 39.5f, 88.0f, 88.0f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
