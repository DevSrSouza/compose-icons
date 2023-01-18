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

public val IonIcons.ChatbubbleEllipses: ImageVector
    get() {
        if (_chatbubbleEllipses != null) {
            return _chatbubbleEllipses!!
        }
        _chatbubbleEllipses = Builder(name = "ChatbubbleEllipses", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(398.0f, 81.84f)
                arcTo(227.4f, 227.4f, 0.0f, false, false, 255.82f, 32.0f)
                curveTo(194.9f, 32.0f, 138.0f, 55.47f, 95.46f, 98.09f)
                curveTo(54.35f, 139.33f, 31.82f, 193.78f, 32.0f, 251.37f)
                arcTo(215.66f, 215.66f, 0.0f, false, false, 67.65f, 370.13f)
                lineToRelative(0.19f, 0.27f)
                curveToRelative(0.28f, 0.41f, 0.57f, 0.82f, 0.86f, 1.22f)
                reflectiveCurveToRelative(0.65f, 0.92f, 0.73f, 1.05f)
                lineToRelative(0.22f, 0.4f)
                curveToRelative(1.13f, 2.0f, 2.0f, 4.44f, 1.23f, 6.9f)
                lineTo(52.46f, 446.63f)
                arcToRelative(29.13f, 29.13f, 0.0f, false, false, -1.2f, 7.63f)
                arcTo(25.69f, 25.69f, 0.0f, false, false, 76.83f, 480.0f)
                arcToRelative(29.44f, 29.44f, 0.0f, false, false, 10.45f, -2.29f)
                lineToRelative(67.49f, -24.36f)
                lineToRelative(0.85f, -0.33f)
                arcToRelative(14.75f, 14.75f, 0.0f, false, true, 5.8f, -1.15f)
                arcToRelative(15.12f, 15.12f, 0.0f, false, true, 5.37f, 1.0f)
                curveToRelative(1.62f, 0.63f, 16.33f, 6.26f, 31.85f, 10.6f)
                curveToRelative(12.9f, 3.6f, 39.74f, 9.0f, 60.77f, 9.0f)
                curveToRelative(59.65f, 0.0f, 115.35f, -23.1f, 156.83f, -65.06f)
                curveTo(457.36f, 365.77f, 480.0f, 310.42f, 480.0f, 251.49f)
                arcToRelative(213.5f, 213.5f, 0.0f, false, false, -4.78f, -45.0f)
                curveTo(464.88f, 157.87f, 437.46f, 113.59f, 398.0f, 81.84f)
                close()
                moveTo(87.48f, 380.0f)
                horizontalLineToRelative(0.0f)
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
        return _chatbubbleEllipses!!
    }

private var _chatbubbleEllipses: ImageVector? = null
