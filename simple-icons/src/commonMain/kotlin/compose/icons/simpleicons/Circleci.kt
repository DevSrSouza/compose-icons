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

public val SimpleIcons.Circleci: ImageVector
    get() {
        if (_circleci != null) {
            return _circleci!!
        }
        _circleci = Builder(name = "Circleci", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.963f, 12.0f)
                curveToRelative(0.0f, -1.584f, 1.284f, -2.855f, 2.855f, -2.855f)
                curveToRelative(1.572f, 0.0f, 2.856f, 1.284f, 2.856f, 2.855f)
                curveToRelative(0.0f, 1.572f, -1.284f, 2.856f, -2.856f, 2.856f)
                curveToRelative(-1.57f, 0.0f, -2.855f, -1.284f, -2.855f, -2.856f)
                close()
                moveTo(11.818f, 0.0f)
                curveTo(6.215f, 0.0f, 1.522f, 3.84f, 0.19f, 9.025f)
                curveToRelative(-0.01f, 0.036f, -0.01f, 0.07f, -0.01f, 0.12f)
                curveToRelative(0.0f, 0.313f, 0.252f, 0.576f, 0.575f, 0.576f)
                lineTo(5.59f, 9.721f)
                curveToRelative(0.23f, 0.0f, 0.433f, -0.13f, 0.517f, -0.333f)
                curveToRelative(0.997f, -2.16f, 3.18f, -3.672f, 5.712f, -3.672f)
                curveToRelative(3.466f, 0.0f, 6.286f, 2.82f, 6.286f, 6.287f)
                curveToRelative(0.0f, 3.47f, -2.82f, 6.29f, -6.29f, 6.29f)
                curveToRelative(-2.53f, 0.0f, -4.714f, -1.5f, -5.71f, -3.673f)
                curveToRelative(-0.097f, -0.19f, -0.29f, -0.336f, -0.517f, -0.336f)
                lineTo(0.755f, 14.284f)
                curveToRelative(-0.312f, 0.0f, -0.575f, 0.253f, -0.575f, 0.576f)
                curveToRelative(0.0f, 0.037f, 0.014f, 0.072f, 0.014f, 0.12f)
                curveTo(1.514f, 20.16f, 6.214f, 24.0f, 11.818f, 24.0f)
                curveToRelative(6.624f, 0.0f, 12.0f, -5.375f, 12.0f, -12.0f)
                curveToRelative(0.0f, -6.623f, -5.376f, -12.0f, -12.0f, -12.0f)
                close()
            }
        }
        .build()
        return _circleci!!
    }

private var _circleci: ImageVector? = null
