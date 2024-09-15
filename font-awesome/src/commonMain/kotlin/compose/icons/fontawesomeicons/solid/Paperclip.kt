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

public val SolidGroup.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(name = "Paperclip", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(43.25f, 466.14f)
                curveToRelative(-58.43f, -60.29f, -57.34f, -157.51f, 1.39f, -217.58f)
                lineTo(254.39f, 34.0f)
                curveToRelative(44.32f, -45.33f, 116.35f, -45.34f, 160.67f, 0.0f)
                curveToRelative(43.89f, 44.89f, 43.94f, 117.33f, 0.0f, 162.28f)
                lineTo(232.21f, 383.13f)
                curveToRelative(-29.85f, 30.54f, -78.63f, 30.11f, -107.98f, -1.0f)
                curveToRelative(-28.27f, -29.97f, -27.37f, -77.47f, 1.45f, -106.95f)
                lineToRelative(143.74f, -146.84f)
                curveToRelative(6.18f, -6.31f, 16.31f, -6.42f, 22.63f, -0.24f)
                lineToRelative(22.86f, 22.38f)
                curveToRelative(6.32f, 6.18f, 6.42f, 16.31f, 0.24f, 22.63f)
                lineTo(171.43f, 319.93f)
                curveToRelative(-4.93f, 5.05f, -5.24f, 13.43f, -0.65f, 18.29f)
                curveToRelative(4.37f, 4.63f, 11.24f, 4.71f, 15.69f, 0.17f)
                lineToRelative(182.85f, -186.85f)
                curveToRelative(19.61f, -20.06f, 19.61f, -52.72f, -0.01f, -72.8f)
                curveToRelative(-19.19f, -19.63f, -49.96f, -19.64f, -69.15f, 0.0f)
                lineTo(90.39f, 293.3f)
                curveToRelative(-34.76f, 35.56f, -35.3f, 93.12f, -1.19f, 128.31f)
                curveToRelative(34.01f, 35.09f, 88.99f, 35.14f, 123.06f, 0.29f)
                lineToRelative(172.06f, -176.0f)
                curveToRelative(6.18f, -6.32f, 16.31f, -6.43f, 22.63f, -0.26f)
                lineToRelative(22.88f, 22.36f)
                curveToRelative(6.32f, 6.18f, 6.43f, 16.31f, 0.26f, 22.63f)
                lineToRelative(-172.06f, 176.0f)
                curveToRelative(-59.58f, 60.94f, -155.94f, 60.22f, -214.77f, -0.49f)
                close()
            }
        }
        .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
