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

public val IonIcons.Pulse: ImageVector
    get() {
        if (_pulse != null) {
            return _pulse!!
        }
        _pulse = Builder(name = "Pulse", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 272.0f)
                arcToRelative(48.09f, 48.09f, 0.0f, false, false, -45.25f, 32.0f)
                horizontalLineTo(347.53f)
                lineToRelative(-28.35f, -85.06f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -30.56f, 0.66f)
                lineTo(244.11f, 375.36f)
                lineToRelative(-52.33f, -314.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -31.3f, -1.25f)
                lineTo(99.51f, 304.0f)
                horizontalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.52f, -12.12f)
                lineToRelative(45.34f, -181.37f)
                lineToRelative(51.36f, 308.12f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 239.1f, 464.0f)
                curveToRelative(0.3f, 0.0f, 0.6f, 0.0f, 0.91f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.37f, -11.6f)
                lineToRelative(49.8f, -174.28f)
                lineToRelative(15.64f, 46.94f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 336.0f, 336.0f)
                horizontalLineToRelative(50.75f)
                arcTo(48.0f, 48.0f, 0.0f, true, false, 432.0f, 272.0f)
                close()
            }
        }
        .build()
        return _pulse!!
    }

private var _pulse: ImageVector? = null
