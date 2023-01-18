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

public val IonIcons.Airplane: ImageVector
    get() {
        if (_airplane != null) {
            return _airplane!!
        }
        _airplane = Builder(name = "Airplane", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.62f, 464.0f)
                horizontalLineTo(160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -14.57f, -22.6f)
                lineToRelative(64.46f, -142.25f)
                lineTo(113.1f, 297.0f)
                lineTo(77.8f, 339.77f)
                curveTo(71.07f, 348.23f, 65.7f, 352.0f, 52.0f, 352.0f)
                horizontalLineTo(34.08f)
                arcToRelative(17.66f, 17.66f, 0.0f, false, true, -14.7f, -7.06f)
                curveToRelative(-2.38f, -3.21f, -4.72f, -8.65f, -2.44f, -16.41f)
                lineToRelative(19.82f, -71.0f)
                curveToRelative(0.15f, -0.53f, 0.33f, -1.06f, 0.53f, -1.58f)
                arcToRelative(0.38f, 0.38f, 0.0f, false, false, 0.0f, -0.15f)
                arcToRelative(14.82f, 14.82f, 0.0f, false, true, -0.53f, -1.59f)
                lineTo(16.92f, 182.76f)
                curveToRelative(-2.15f, -7.61f, 0.2f, -12.93f, 2.56f, -16.06f)
                arcToRelative(16.83f, 16.83f, 0.0f, false, true, 13.6f, -6.7f)
                horizontalLineTo(52.0f)
                curveToRelative(10.23f, 0.0f, 20.16f, 4.59f, 26.0f, 12.0f)
                lineToRelative(34.57f, 42.05f)
                lineToRelative(97.32f, -1.44f)
                lineToRelative(-64.44f, -142.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 160.0f, 48.0f)
                horizontalLineToRelative(26.91f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, true, 19.35f, 9.8f)
                lineToRelative(125.05f, 152.0f)
                lineToRelative(57.77f, -1.52f)
                curveToRelative(4.23f, -0.23f, 15.95f, -0.31f, 18.66f, -0.31f)
                curveTo(463.0f, 208.0f, 496.0f, 225.94f, 496.0f, 256.0f)
                curveToRelative(0.0f, 9.46f, -3.78f, 27.0f, -29.07f, 38.16f)
                curveToRelative(-14.93f, 6.6f, -34.85f, 9.94f, -59.21f, 9.94f)
                curveToRelative(-2.68f, 0.0f, -14.37f, -0.08f, -18.66f, -0.31f)
                lineToRelative(-57.76f, -1.54f)
                lineToRelative(-125.36f, 152.0f)
                arcTo(25.0f, 25.0f, 0.0f, false, true, 186.62f, 464.0f)
                close()
            }
        }
        .build()
        return _airplane!!
    }

private var _airplane: ImageVector? = null
