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

public val IonIcons.HeartSharp: ImageVector
    get() {
        if (_heartSharp != null) {
            return _heartSharp!!
        }
        _heartSharp = Builder(name = "HeartSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 448.0f)
                lineToRelative(-9.0f, -6.0f)
                curveToRelative(-42.78f, -28.57f, -96.91f, -60.86f, -137.0f, -108.32f)
                curveToRelative(-42.25f, -50.0f, -62.52f, -101.35f, -62.0f, -157.0f)
                curveTo(48.63f, 114.54f, 98.46f, 64.0f, 159.08f, 64.0f)
                curveToRelative(48.11f, 0.0f, 80.1f, 28.0f, 96.92f, 48.21f)
                curveTo(272.82f, 92.0f, 304.81f, 64.0f, 352.92f, 64.0f)
                curveTo(413.54f, 64.0f, 463.37f, 114.54f, 464.0f, 176.65f)
                curveToRelative(0.56f, 55.68f, -19.71f, 107.0f, -62.0f, 157.0f)
                curveTo(361.91f, 381.14f, 307.78f, 413.43f, 265.0f, 442.0f)
                close()
            }
        }
        .build()
        return _heartSharp!!
    }

private var _heartSharp: ImageVector? = null
