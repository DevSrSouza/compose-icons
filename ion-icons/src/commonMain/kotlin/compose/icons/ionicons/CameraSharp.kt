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

public val IonIcons.CameraSharp: ImageVector
    get() {
        if (_cameraSharp != null) {
            return _cameraSharp!!
        }
        _cameraSharp = Builder(name = "CameraSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
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
                moveTo(456.0f, 144.0f)
                horizontalLineTo(373.0f)
                curveToRelative(-3.0f, 0.0f, -6.72f, -1.94f, -9.62f, -5.0f)
                lineToRelative(-27.28f, -42.8f)
                curveTo(325.0f, 80.0f, 320.0f, 80.0f, 302.0f, 80.0f)
                horizontalLineTo(210.0f)
                curveToRelative(-18.0f, 0.0f, -24.0f, 0.0f, -34.07f, 16.21f)
                lineTo(148.62f, 139.0f)
                curveToRelative(-2.22f, 2.42f, -5.34f, 5.0f, -8.62f, 5.0f)
                verticalLineTo(128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineTo(92.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(56.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, 24.0f)
                verticalLineTo(408.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineTo(456.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                verticalLineTo(168.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 456.0f, 144.0f)
                close()
                moveTo(260.51f, 367.9f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 91.39f, -91.39f)
                arcTo(96.11f, 96.11f, 0.0f, false, true, 260.51f, 367.9f)
                close()
            }
        }
        .build()
        return _cameraSharp!!
    }

private var _cameraSharp: ImageVector? = null
