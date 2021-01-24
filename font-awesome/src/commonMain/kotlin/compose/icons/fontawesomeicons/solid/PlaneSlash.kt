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

public val SolidGroup.PlaneSlash: ImageVector
    get() {
        if (_planeSlash != null) {
            return _planeSlash!!
        }
        _planeSlash = Builder(name = "PlaneSlash", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.48f, 147.88f)
                lineTo(64.0f, 256.0f)
                lineTo(32.48f, 364.13f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 384.0f)
                horizontalLineTo(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 12.8f, -6.41f)
                lineTo(144.0f, 320.0f)
                horizontalLineTo(246.85f)
                lineToRelative(-49.0f, 171.59f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 213.2f, 512.0f)
                horizontalLineToRelative(65.5f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.89f, -8.06f)
                lineToRelative(66.6f, -116.54f)
                lineTo(34.35f, 136.34f)
                arcTo(15.47f, 15.47f, 0.0f, false, false, 32.48f, 147.88f)
                close()
                moveTo(633.82f, 458.09f)
                lineTo(455.14f, 320.0f)
                horizontalLineTo(512.0f)
                curveToRelative(35.34f, 0.0f, 96.0f, -28.66f, 96.0f, -64.0f)
                reflectiveCurveToRelative(-60.66f, -64.0f, -96.0f, -64.0f)
                horizontalLineTo(397.7f)
                lineTo(292.61f, 8.06f)
                curveTo(290.06f, 3.61f, 283.84f, 0.0f, 278.71f, 0.0f)
                horizontalLineTo(213.2f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.38f, 20.39f)
                lineToRelative(36.94f, 129.29f)
                lineTo(45.46f, 3.38f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 23.0f, 6.19f)
                lineTo(3.37f, 31.45f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 6.18f, 53.91f)
                lineTo(594.54f, 508.63f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 617.0f, 505.81f)
                lineToRelative(19.64f, -25.26f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 633.82f, 458.09f)
                close()
            }
        }
        .build()
        return _planeSlash!!
    }

private var _planeSlash: ImageVector? = null
