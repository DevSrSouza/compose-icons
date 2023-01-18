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

public val IonIcons.Chatbubble: ImageVector
    get() {
        if (_chatbubble != null) {
            return _chatbubble!!
        }
        _chatbubble = Builder(name = "Chatbubble", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(76.83f, 480.0f)
                arcToRelative(25.69f, 25.69f, 0.0f, false, true, -25.57f, -25.74f)
                arcToRelative(29.13f, 29.13f, 0.0f, false, true, 1.2f, -7.63f)
                lineTo(70.88f, 380.0f)
                curveToRelative(0.77f, -2.46f, -0.1f, -4.94f, -1.23f, -6.9f)
                lineToRelative(-0.22f, -0.4f)
                curveToRelative(-0.08f, -0.13f, -0.46f, -0.66f, -0.73f, -1.05f)
                reflectiveCurveToRelative(-0.58f, -0.81f, -0.86f, -1.22f)
                lineToRelative(-0.19f, -0.27f)
                arcTo(215.66f, 215.66f, 0.0f, false, true, 32.0f, 251.37f)
                curveToRelative(-0.18f, -57.59f, 22.35f, -112.0f, 63.46f, -153.28f)
                curveTo(138.0f, 55.47f, 194.9f, 32.0f, 255.82f, 32.0f)
                arcTo(227.4f, 227.4f, 0.0f, false, true, 398.0f, 81.84f)
                curveToRelative(39.45f, 31.75f, 66.87f, 76.0f, 77.21f, 124.68f)
                arcToRelative(213.5f, 213.5f, 0.0f, false, true, 4.78f, 45.0f)
                curveToRelative(0.0f, 58.93f, -22.64f, 114.28f, -63.76f, 155.87f)
                curveToRelative(-41.48f, 42.0f, -97.18f, 65.06f, -156.83f, 65.06f)
                curveToRelative(-21.0f, 0.0f, -47.87f, -5.36f, -60.77f, -9.0f)
                curveToRelative(-15.52f, -4.34f, -30.23f, -10.0f, -31.85f, -10.6f)
                arcToRelative(15.12f, 15.12f, 0.0f, false, false, -5.37f, -1.0f)
                arcToRelative(14.75f, 14.75f, 0.0f, false, false, -5.8f, 1.15f)
                lineToRelative(-0.85f, 0.33f)
                lineTo(87.28f, 477.71f)
                arcTo(29.44f, 29.44f, 0.0f, false, true, 76.83f, 480.0f)
                close()
                moveTo(74.83f, 448.2f)
                close()
                moveTo(87.48f, 380.0f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _chatbubble!!
    }

private var _chatbubble: ImageVector? = null
