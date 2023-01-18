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

public val IonIcons.ChatbubbleEllipsesSharp: ImageVector
    get() {
        if (_chatbubbleEllipsesSharp != null) {
            return _chatbubbleEllipsesSharp!!
        }
        _chatbubbleEllipsesSharp = Builder(name = "ChatbubbleEllipsesSharp", defaultWidth =
                512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight =
                512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(475.22f, 206.52f)
                curveTo(464.88f, 157.87f, 437.46f, 113.59f, 398.0f, 81.84f)
                arcTo(227.4f, 227.4f, 0.0f, false, false, 255.82f, 32.0f)
                curveTo(194.9f, 32.0f, 138.0f, 55.47f, 95.46f, 98.09f)
                curveTo(54.35f, 139.33f, 31.82f, 193.78f, 32.0f, 251.37f)
                arcTo(215.66f, 215.66f, 0.0f, false, false, 67.65f, 370.13f)
                lineTo(72.0f, 376.18f)
                lineTo(48.0f, 480.0f)
                lineToRelative(114.8f, -28.56f)
                reflectiveCurveToRelative(2.3f, 0.77f, 4.0f, 1.42f)
                reflectiveCurveToRelative(16.33f, 6.26f, 31.85f, 10.6f)
                curveToRelative(12.9f, 3.6f, 39.74f, 9.0f, 60.77f, 9.0f)
                curveToRelative(59.65f, 0.0f, 115.35f, -23.1f, 156.83f, -65.06f)
                curveTo(457.36f, 365.77f, 480.0f, 310.42f, 480.0f, 251.49f)
                arcTo(213.5f, 213.5f, 0.0f, false, false, 475.22f, 206.52f)
                close()
                moveTo(160.0f, 288.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 160.0f, 288.0f)
                close()
                moveTo(256.0f, 288.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 256.0f, 288.0f)
                close()
                moveTo(352.0f, 288.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 352.0f, 288.0f)
                close()
            }
        }
        .build()
        return _chatbubbleEllipsesSharp!!
    }

private var _chatbubbleEllipsesSharp: ImageVector? = null
