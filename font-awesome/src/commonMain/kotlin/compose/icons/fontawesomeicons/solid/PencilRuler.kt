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

public val SolidGroup.PencilRuler: ImageVector
    get() {
        if (_pencilRuler != null) {
            return _pencilRuler!!
        }
        _pencilRuler = Builder(name = "PencilRuler", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(109.46f, 244.04f)
                lineToRelative(134.58f, -134.56f)
                lineToRelative(-44.12f, -44.12f)
                lineToRelative(-61.68f, 61.68f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, true, -11.21f, 0.0f)
                lineToRelative(-11.21f, -11.21f)
                curveToRelative(-3.1f, -3.1f, -3.1f, -8.12f, 0.0f, -11.21f)
                lineToRelative(61.68f, -61.68f)
                lineToRelative(-33.64f, -33.65f)
                curveTo(131.47f, -3.1f, 111.39f, -3.1f, 99.0f, 9.29f)
                lineTo(9.29f, 99.0f)
                curveToRelative(-12.38f, 12.39f, -12.39f, 32.47f, 0.0f, 44.86f)
                lineToRelative(100.17f, 100.18f)
                close()
                moveTo(497.93f, 127.24f)
                curveToRelative(18.76f, -18.76f, 18.75f, -49.17f, 0.0f, -67.93f)
                lineToRelative(-45.25f, -45.25f)
                curveToRelative(-18.76f, -18.76f, -49.18f, -18.76f, -67.95f, 0.0f)
                lineToRelative(-46.02f, 46.01f)
                lineToRelative(113.2f, 113.2f)
                lineToRelative(46.02f, -46.03f)
                close()
                moveTo(316.08f, 82.71f)
                lineToRelative(-297.0f, 296.96f)
                lineTo(0.32f, 487.11f)
                curveToRelative(-2.53f, 14.49f, 10.09f, 27.11f, 24.59f, 24.56f)
                lineToRelative(107.45f, -18.84f)
                lineTo(429.28f, 195.9f)
                lineTo(316.08f, 82.71f)
                close()
                moveTo(502.71f, 368.14f)
                lineToRelative(-33.64f, -33.64f)
                lineToRelative(-61.68f, 61.68f)
                curveToRelative(-3.1f, 3.1f, -8.12f, 3.1f, -11.21f, 0.0f)
                lineToRelative(-11.21f, -11.21f)
                curveToRelative(-3.09f, -3.1f, -3.09f, -8.12f, 0.0f, -11.21f)
                lineToRelative(61.68f, -61.68f)
                lineToRelative(-44.14f, -44.14f)
                lineTo(267.93f, 402.5f)
                lineToRelative(100.21f, 100.2f)
                curveToRelative(12.39f, 12.39f, 32.47f, 12.39f, 44.86f, 0.0f)
                lineToRelative(89.71f, -89.7f)
                curveToRelative(12.39f, -12.39f, 12.39f, -32.47f, 0.0f, -44.86f)
                close()
            }
        }
        .build()
        return _pencilRuler!!
    }

private var _pencilRuler: ImageVector? = null
