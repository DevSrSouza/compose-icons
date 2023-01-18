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

public val IonIcons.Recording: ImageVector
    get() {
        if (_recording != null) {
            return _recording!!
        }
        _recording = Builder(name = "Recording", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(380.79f, 144.05f)
                curveTo(321.69f, 145.7f, 273.67f, 193.76f, 272.0f, 252.86f)
                arcToRelative(111.64f, 111.64f, 0.0f, false, false, 30.36f, 79.77f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 301.0f, 336.0f)
                horizontalLineTo(211.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.44f, -3.37f)
                arcTo(111.64f, 111.64f, 0.0f, false, false, 240.0f, 252.86f)
                curveToRelative(-1.63f, -59.1f, -49.65f, -107.16f, -108.75f, -108.81f)
                arcTo(112.12f, 112.12f, 0.0f, false, false, 16.0f, 255.53f)
                curveTo(15.75f, 317.77f, 67.0f, 368.0f, 129.24f, 368.0f)
                horizontalLineTo(382.76f)
                curveTo(445.0f, 368.0f, 496.25f, 317.77f, 496.0f, 255.53f)
                arcTo(112.12f, 112.12f, 0.0f, false, false, 380.79f, 144.05f)
                close()
            }
        }
        .build()
        return _recording!!
    }

private var _recording: ImageVector? = null
