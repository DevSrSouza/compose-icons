package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Medal: ImageVector
    get() {
        if (_medal != null) {
            return _medal!!
        }
        _medal = Builder(name = "Medal", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.75f, 130.75f)
                lineTo(154.62f, 15.54f)
                arcTo(31.997f, 31.997f, 0.0f, false, false, 127.18f, 0.0f)
                lineTo(16.03f, 0.0f)
                curveTo(3.08f, 0.0f, -4.5f, 14.57f, 2.92f, 25.18f)
                lineToRelative(111.27f, 158.96f)
                curveToRelative(29.72f, -27.77f, 67.52f, -46.83f, 109.56f, -53.39f)
                close()
                moveTo(495.97f, 0.0f)
                lineTo(384.82f, 0.0f)
                curveToRelative(-11.24f, 0.0f, -21.66f, 5.9f, -27.44f, 15.54f)
                lineToRelative(-69.13f, 115.21f)
                curveToRelative(42.04f, 6.56f, 79.84f, 25.62f, 109.56f, 53.38f)
                lineTo(509.08f, 25.18f)
                curveTo(516.5f, 14.57f, 508.92f, 0.0f, 495.97f, 0.0f)
                close()
                moveTo(256.0f, 160.0f)
                curveToRelative(-97.2f, 0.0f, -176.0f, 78.8f, -176.0f, 176.0f)
                reflectiveCurveToRelative(78.8f, 176.0f, 176.0f, 176.0f)
                reflectiveCurveToRelative(176.0f, -78.8f, 176.0f, -176.0f)
                reflectiveCurveToRelative(-78.8f, -176.0f, -176.0f, -176.0f)
                close()
                moveTo(348.52f, 317.26f)
                lineToRelative(-37.93f, 36.96f)
                lineToRelative(8.97f, 52.22f)
                curveToRelative(1.6f, 9.36f, -8.26f, 16.51f, -16.65f, 12.09f)
                lineTo(256.0f, 393.88f)
                lineToRelative(-46.9f, 24.65f)
                curveToRelative(-8.4f, 4.45f, -18.25f, -2.74f, -16.65f, -12.09f)
                lineToRelative(8.97f, -52.22f)
                lineToRelative(-37.93f, -36.96f)
                curveToRelative(-6.82f, -6.64f, -3.05f, -18.23f, 6.35f, -19.59f)
                lineToRelative(52.43f, -7.64f)
                lineToRelative(23.43f, -47.52f)
                curveToRelative(2.11f, -4.28f, 6.19f, -6.39f, 10.28f, -6.39f)
                curveToRelative(4.11f, 0.0f, 8.22f, 2.14f, 10.33f, 6.39f)
                lineToRelative(23.43f, 47.52f)
                lineToRelative(52.43f, 7.64f)
                curveToRelative(9.4f, 1.36f, 13.17f, 12.95f, 6.35f, 19.59f)
                close()
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null
