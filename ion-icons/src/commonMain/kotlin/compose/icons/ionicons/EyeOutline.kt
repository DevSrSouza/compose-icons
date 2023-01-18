package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.EyeOutline: ImageVector
    get() {
        if (_eyeOutline != null) {
            return _eyeOutline!!
        }
        _eyeOutline = Builder(name = "EyeOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(255.66f, 112.0f)
                curveToRelative(-77.94f, 0.0f, -157.89f, 45.11f, -220.83f, 135.33f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -0.27f, 17.77f)
                curveTo(82.92f, 340.8f, 161.8f, 400.0f, 255.66f, 400.0f)
                curveTo(348.5f, 400.0f, 429.0f, 340.62f, 477.45f, 264.75f)
                arcToRelative(16.14f, 16.14f, 0.0f, false, false, 0.0f, -17.47f)
                curveTo(428.89f, 172.28f, 347.8f, 112.0f, 255.66f, 112.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-80.0f, 0.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 160.0f, 0.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, -160.0f, 0.0f)
            }
        }
        .build()
        return _eyeOutline!!
    }

private var _eyeOutline: ImageVector? = null
