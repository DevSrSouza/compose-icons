package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.BeakerSharp: ImageVector
    get() {
        if (_beakerSharp != null) {
            return _beakerSharp!!
        }
        _beakerSharp = Builder(name = "BeakerSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(453.55f, 54.7f)
                lineTo(464.0f, 32.0f)
                lineToRelative(-335.6f, 0.0f)
                curveToRelative(-27.74f, 0.0f, -49.0f, 6.57f, -63.31f, 19.51f)
                curveTo(54.39f, 61.27f, 48.0f, 74.89f, 48.0f, 88.0f)
                verticalLineToRelative(24.0f)
                horizontalLineTo(64.0f)
                curveToRelative(31.0f, 0.0f, 32.0f, 16.79f, 32.0f, 35.0f)
                verticalLineTo(460.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(428.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(96.0f)
                curveTo(448.0f, 78.84f, 450.28f, 61.86f, 453.55f, 54.7f)
                close()
                moveTo(416.0f, 96.0f)
                verticalLineToRelative(64.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(138.0f)
                curveToRelative(0.0f, -36.15f, -21.0f, -51.0f, -41.77f, -53.46f)
                curveTo(89.0f, 70.0f, 105.7f, 64.05f, 128.4f, 64.05f)
                horizontalLineTo(418.32f)
                arcTo(221.83f, 221.83f, 0.0f, false, false, 416.0f, 96.0f)
                close()
            }
        }
        .build()
        return _beakerSharp!!
    }

private var _beakerSharp: ImageVector? = null
