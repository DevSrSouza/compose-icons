package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 272.0f)
                moveToRelative(-64.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 128.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, -128.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 144.0f)
                horizontalLineTo(373.0f)
                curveToRelative(-3.0f, 0.0f, -6.72f, -1.94f, -9.62f, -5.0f)
                lineTo(337.44f, 98.06f)
                arcToRelative(15.52f, 15.52f, 0.0f, false, false, -1.37f, -1.85f)
                curveTo(327.11f, 85.76f, 315.0f, 80.0f, 302.0f, 80.0f)
                horizontalLineTo(210.0f)
                curveToRelative(-13.0f, 0.0f, -25.11f, 5.76f, -34.07f, 16.21f)
                arcToRelative(15.52f, 15.52f, 0.0f, false, false, -1.37f, 1.85f)
                lineToRelative(-25.94f, 41.0f)
                curveToRelative(-2.22f, 2.42f, -5.34f, 5.0f, -8.62f, 5.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(100.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(80.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, -48.0f, 48.0f)
                verticalLineTo(384.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, 48.0f, 48.0f)
                horizontalLineTo(432.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, 48.0f, -48.0f)
                verticalLineTo(192.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, false, 432.0f, 144.0f)
                close()
                moveTo(256.0f, 368.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 96.0f, -96.0f)
                arcTo(96.11f, 96.11f, 0.0f, false, true, 256.0f, 368.0f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
