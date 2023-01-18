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

public val IonIcons.CutSharp: ImageVector
    get() {
        if (_cutSharp != null) {
            return _cutSharp!!
        }
        _cutSharp = Builder(name = "CutSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 128.0f)
                lineTo(432.0f, 128.0f)
                lineTo(233.06f, 198.46f)
                lineToRelative(-59.13f, -31.59f)
                arcToRelative(72.16f, 72.16f, 0.0f, true, false, -25.69f, 41.47f)
                lineToRelative(52.2f, 31.72f)
                lineTo(192.0f, 277.0f)
                lineToRelative(-43.64f, 26.76f)
                arcToRelative(71.74f, 71.74f, 0.0f, true, false, 24.79f, 38.0f)
                lineTo(480.0f, 160.0f)
                close()
                moveTo(103.48f, 192.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 103.48f, 192.0f)
                close()
                moveTo(103.48f, 400.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 103.48f, 400.0f)
                close()
                moveTo(255.48f, 256.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 255.48f, 256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(343.79f, 259.87f)
                lineToRelative(-83.74f, 48.18f)
                lineToRelative(171.95f, 59.95f)
                lineToRelative(47.99f, 0.0f)
                lineToRelative(0.01f, -32.0f)
                lineToRelative(-136.21f, -76.13f)
                close()
            }
        }
        .build()
        return _cutSharp!!
    }

private var _cutSharp: ImageVector? = null
