package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Chatbot: ImageVector
    get() {
        if (_chatbot != null) {
            return _chatbot!!
        }
        _chatbot = Builder(name = "Chatbot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.999f, 0.0f)
                curveToRelative(-2.25f, 0.0f, -4.5f, 0.06f, -6.6f, 0.21f)
                arcToRelative(5.57f, 5.57f, 0.0f, false, false, -5.19f, 5.1f)
                curveToRelative(-0.24f, 3.21f, -0.27f, 6.39f, -0.06f, 9.6f)
                arcToRelative(5.644f, 5.644f, 0.0f, false, false, 5.7f, 5.19f)
                horizontalLineToRelative(3.15f)
                verticalLineToRelative(-3.9f)
                horizontalLineToRelative(-3.15f)
                curveToRelative(-0.93f, 0.03f, -1.74f, -0.63f, -1.83f, -1.56f)
                curveToRelative(-0.18f, -3.0f, -0.15f, -6.0f, 0.06f, -9.0f)
                curveToRelative(0.06f, -0.84f, 0.72f, -1.47f, 1.56f, -1.53f)
                curveToRelative(2.04f, -0.15f, 4.2f, -0.21f, 6.36f, -0.21f)
                reflectiveCurveToRelative(4.32f, 0.09f, 6.36f, 0.18f)
                curveToRelative(0.81f, 0.06f, 1.5f, 0.69f, 1.56f, 1.53f)
                curveToRelative(0.24f, 3.0f, 0.24f, 6.0f, 0.06f, 9.0f)
                curveToRelative(-0.12f, 0.93f, -0.9f, 1.62f, -1.83f, 1.59f)
                horizontalLineToRelative(-3.15f)
                lineToRelative(-6.0f, 3.9f)
                lineTo(8.999f, 24.0f)
                lineToRelative(6.0f, -3.9f)
                horizontalLineToRelative(3.15f)
                curveToRelative(2.97f, 0.03f, 5.46f, -2.25f, 5.7f, -5.19f)
                curveToRelative(0.21f, -3.18f, 0.18f, -6.39f, -0.03f, -9.57f)
                arcToRelative(5.57f, 5.57f, 0.0f, false, false, -5.19f, -5.1f)
                curveToRelative(-2.13f, -0.18f, -4.38f, -0.24f, -6.63f, -0.24f)
                close()
                moveTo(6.959f, 8.76f)
                curveToRelative(-0.36f, 0.0f, -0.66f, 0.3f, -0.66f, 0.66f)
                verticalLineToRelative(2.34f)
                curveToRelative(0.0f, 0.33f, 0.18f, 0.63f, 0.48f, 0.78f)
                curveToRelative(1.62f, 0.78f, 3.42f, 1.2f, 5.22f, 1.26f)
                curveToRelative(1.8f, -0.06f, 3.6f, -0.48f, 5.22f, -1.26f)
                curveToRelative(0.3f, -0.15f, 0.48f, -0.45f, 0.48f, -0.78f)
                lineTo(17.699f, 9.42f)
                curveToRelative(0.0f, -0.09f, -0.03f, -0.15f, -0.09f, -0.21f)
                arcToRelative(0.648f, 0.648f, 0.0f, false, false, -0.87f, -0.36f)
                curveToRelative(-1.5f, 0.66f, -3.12f, 1.02f, -4.77f, 1.05f)
                curveToRelative(-1.65f, -0.03f, -3.27f, -0.42f, -4.77f, -1.08f)
                arcToRelative(0.566f, 0.566f, 0.0f, false, false, -0.24f, -0.06f)
                close()
            }
        }
        .build()
        return _chatbot!!
    }

private var _chatbot: ImageVector? = null
