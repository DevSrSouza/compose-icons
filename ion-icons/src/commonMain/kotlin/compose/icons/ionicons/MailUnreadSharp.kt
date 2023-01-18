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

public val IonIcons.MailUnreadSharp: ImageVector
    get() {
        if (_mailUnreadSharp != null) {
            return _mailUnreadSharp!!
        }
        _mailUnreadSharp = Builder(name = "MailUnreadSharp", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(374.09f, 101.0f)
                curveToRelative(-0.11f, 0.23f, -0.21f, 0.46f, -0.31f, 0.7f)
                curveToRelative(-0.34f, 0.75f, -0.67f, 1.5f, -1.0f, 2.26f)
                lineToRelative(-0.36f, 0.9f)
                curveToRelative(-0.27f, 0.71f, -0.54f, 1.42f, -0.79f, 2.14f)
                curveToRelative(-0.12f, 0.35f, -0.24f, 0.7f, -0.35f, 1.0f)
                curveToRelative(-0.23f, 0.68f, -0.44f, 1.37f, -0.64f, 2.07f)
                lineToRelative(-0.33f, 1.15f)
                quadToRelative(-0.27f, 1.0f, -0.51f, 2.0f)
                curveToRelative(-0.1f, 0.41f, -0.2f, 0.82f, -0.28f, 1.23f)
                curveToRelative(-0.15f, 0.67f, -0.28f, 1.36f, -0.4f, 2.0f)
                curveToRelative(-0.08f, 0.42f, -0.16f, 0.84f, -0.23f, 1.27f)
                curveToRelative(-0.11f, 0.69f, -0.2f, 1.4f, -0.29f, 2.1f)
                curveToRelative(-0.05f, 0.42f, -0.11f, 0.83f, -0.16f, 1.25f)
                curveToRelative(-0.08f, 0.77f, -0.13f, 1.54f, -0.19f, 2.31f)
                curveToRelative(0.0f, 0.36f, -0.06f, 0.72f, -0.08f, 1.09f)
                curveToRelative(-0.06f, 1.13f, -0.09f, 2.27f, -0.09f, 3.41f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 1.0f, 0.0f, 2.0f, 0.07f, 2.94f)
                lineToRelative(0.0f, 0.62f)
                curveToRelative(0.05f, 0.95f, 0.12f, 1.89f, 0.21f, 2.83f)
                lineToRelative(0.06f, 0.46f)
                curveToRelative(0.09f, 0.87f, 0.2f, 1.72f, 0.32f, 2.57f)
                curveToRelative(0.0f, 0.15f, 0.0f, 0.31f, 0.07f, 0.46f)
                curveToRelative(0.14f, 0.92f, 0.31f, 1.84f, 0.49f, 2.75f)
                lineToRelative(0.12f, 0.59f)
                curveToRelative(0.2f, 0.92f, 0.4f, 1.84f, 0.64f, 2.75f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.23f, 0.92f, 0.5f, 1.82f, 0.77f, 2.71f)
                curveToRelative(0.06f, 0.19f, 0.12f, 0.38f, 0.17f, 0.57f)
                curveToRelative(0.28f, 0.88f, 0.57f, 1.74f, 0.88f, 2.59f)
                curveToRelative(0.05f, 0.15f, 0.11f, 0.29f, 0.16f, 0.43f)
                curveToRelative(0.29f, 0.78f, 0.6f, 1.55f, 0.92f, 2.32f)
                curveToRelative(0.05f, 0.14f, 0.11f, 0.28f, 0.17f, 0.42f)
                curveToRelative(0.35f, 0.83f, 0.73f, 1.65f, 1.11f, 2.47f)
                lineToRelative(0.27f, 0.53f)
                curveToRelative(0.4f, 0.82f, 0.81f, 1.64f, 1.24f, 2.44f)
                lineToRelative(0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(64.21f, 64.21f, 0.0f, false, false, 29.56f, 27.63f)
                lineToRelative(0.37f, 0.17f)
                curveToRelative(1.78f, 0.8f, 3.59f, 1.53f, 5.45f, 2.17f)
                lineToRelative(0.95f, 0.32f)
                lineToRelative(1.5f, 0.47f)
                curveToRelative(0.45f, 0.14f, 0.9f, 0.26f, 1.36f, 0.39f)
                lineToRelative(1.92f, 0.5f)
                curveToRelative(0.57f, 0.14f, 1.14f, 0.27f, 1.72f, 0.39f)
                lineToRelative(1.15f, 0.24f)
                lineToRelative(1.83f, 0.32f)
                lineToRelative(0.93f, 0.16f)
                curveToRelative(0.9f, 0.13f, 1.81f, 0.24f, 2.72f, 0.34f)
                lineToRelative(0.77f, 0.07f)
                curveToRelative(0.73f, 0.07f, 1.47f, 0.13f, 2.22f, 0.17f)
                lineToRelative(0.85f, 0.05f)
                curveToRelative(1.0f, 0.0f, 1.94f, 0.07f, 2.93f, 0.07f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.15f, 0.0f, 2.29f, 0.0f, 3.43f, -0.09f)
                lineToRelative(1.09f, -0.09f)
                curveToRelative(0.77f, 0.0f, 1.54f, -0.11f, 2.3f, -0.19f)
                curveToRelative(0.42f, 0.0f, 0.83f, -0.1f, 1.25f, -0.16f)
                curveToRelative(0.7f, -0.08f, 1.41f, -0.17f, 2.1f, -0.28f)
                lineToRelative(1.27f, -0.23f)
                curveToRelative(0.68f, -0.12f, 1.36f, -0.25f, 2.0f, -0.39f)
                lineToRelative(1.24f, -0.29f)
                curveToRelative(0.67f, -0.16f, 1.35f, -0.32f, 2.0f, -0.51f)
                curveToRelative(0.39f, -0.1f, 0.78f, -0.21f, 1.16f, -0.33f)
                curveToRelative(0.69f, -0.2f, 1.37f, -0.41f, 2.05f, -0.63f)
                lineToRelative(1.07f, -0.36f)
                curveToRelative(0.7f, -0.24f, 1.4f, -0.5f, 2.1f, -0.77f)
                lineToRelative(0.94f, -0.37f)
                curveToRelative(0.74f, -0.3f, 1.47f, -0.62f, 2.19f, -0.95f)
                lineToRelative(0.77f, -0.34f)
                curveToRelative(0.8f, -0.37f, 1.58f, -0.77f, 2.36f, -1.17f)
                curveToRelative(0.17f, -0.09f, 0.35f, -0.17f, 0.52f, -0.27f)
                curveToRelative(0.91f, -0.48f, 1.8f, -1.0f, 2.68f, -1.5f)
                lineToRelative(0.12f, -0.07f)
                arcToRelative(63.95f, 63.95f, 0.0f, true, false, -89.21f, -84.88f)
                lineToRelative(-0.21f, 0.39f)
                curveTo(374.9f, 99.34f, 374.48f, 100.17f, 374.09f, 101.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(371.51f, 202.43f)
                lineToRelative(-105.69f, 82.2f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -19.64f, 0.0f)
                lineTo(89.55f, 162.81f)
                lineToRelative(19.64f, -25.26f)
                lineTo(256.0f, 251.73f)
                lineToRelative(94.36f, -73.39f)
                arcTo(95.81f, 95.81f, 0.0f, false, true, 349.0f, 80.0f)
                horizontalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 96.0f)
                verticalLineTo(416.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(464.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(211.13f)
                arcToRelative(95.75f, 95.75f, 0.0f, false, true, -108.49f, -8.7f)
                close()
            }
        }
        .build()
        return _mailUnreadSharp!!
    }

private var _mailUnreadSharp: ImageVector? = null
