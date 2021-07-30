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

public val SimpleIcons.Hbo: ImageVector
    get() {
        if (_hbo != null) {
            return _hbo!!
        }
        _hbo = Builder(name = "Hbo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.042f, 16.896f)
                lineTo(4.414f, 16.896f)
                verticalLineToRelative(-3.754f)
                lineTo(2.708f, 13.142f)
                verticalLineToRelative(3.754f)
                lineTo(0.01f, 16.896f)
                lineTo(0.0f, 7.22f)
                horizontalLineToRelative(2.708f)
                verticalLineToRelative(3.6f)
                horizontalLineToRelative(1.706f)
                verticalLineToRelative(-3.6f)
                horizontalLineToRelative(2.628f)
                close()
                moveTo(19.085f, 16.942f)
                curveTo(21.795f, 16.94f, 24.0f, 14.689f, 24.0f, 11.978f)
                arcToRelative(4.89f, 4.89f, 0.0f, false, false, -4.915f, -4.92f)
                curveToRelative(-2.707f, -0.002f, -4.09f, 1.991f, -4.432f, 2.795f)
                curveToRelative(0.003f, -1.207f, -1.187f, -2.632f, -2.58f, -2.634f)
                lineTo(7.59f, 7.219f)
                verticalLineToRelative(9.674f)
                lineToRelative(4.181f, 0.001f)
                curveToRelative(1.686f, 0.0f, 2.886f, -1.46f, 2.888f, -2.713f)
                curveToRelative(0.385f, 0.788f, 1.72f, 2.762f, 4.427f, 2.76f)
                close()
                moveTo(11.42f, 13.006f)
                curveToRelative(0.387f, 0.0f, 0.692f, 0.382f, 0.692f, 0.817f)
                curveToRelative(0.0f, 0.435f, -0.305f, 0.817f, -0.692f, 0.817f)
                horizontalLineToRelative(-1.33f)
                verticalLineToRelative(-1.634f)
                close()
                moveTo(11.425f, 9.373f)
                curveToRelative(0.387f, 0.0f, 0.692f, 0.382f, 0.692f, 0.817f)
                curveToRelative(0.0f, 0.436f, -0.305f, 0.818f, -0.692f, 0.818f)
                horizontalLineToRelative(-1.33f)
                lineTo(10.095f, 9.373f)
                close()
                moveTo(13.195f, 11.98f)
                curveToRelative(0.305f, -0.039f, 0.813f, -0.387f, 0.992f, -0.61f)
                curveToRelative(-0.063f, 0.276f, -0.068f, 1.074f, 0.006f, 1.35f)
                curveToRelative(-0.204f, -0.314f, -0.688f, -0.701f, -0.998f, -0.74f)
                close()
                moveTo(16.625f, 11.98f)
                arcToRelative(2.462f, 2.462f, 0.0f, true, true, 4.924f, 0.0f)
                arcToRelative(2.462f, 2.462f, 0.0f, false, true, -4.925f, 0.0f)
                close()
                moveTo(19.087f, 13.916f)
                arcToRelative(1.936f, 1.936f, 0.0f, true, false, 0.0f, -3.872f)
                arcToRelative(1.936f, 1.936f, 0.0f, false, false, 0.0f, 3.872f)
                close()
            }
        }
        .build()
        return _hbo!!
    }

private var _hbo: ImageVector? = null
