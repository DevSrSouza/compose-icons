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

public val SimpleIcons.Typo3: ImageVector
    get() {
        if (_typo3 != null) {
            return _typo3!!
        }
        _typo3 = Builder(name = "Typo3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.08f, 16.539f)
                curveToRelative(-0.356f, 0.105f, -0.64f, 0.144f, -1.012f, 0.144f)
                curveToRelative(-3.048f, 0.0f, -7.524f, -10.652f, -7.524f, -14.197f)
                curveToRelative(0.0f, -1.305f, 0.31f, -1.74f, 0.745f, -2.114f)
                curveTo(6.56f, 0.808f, 2.082f, 2.177f, 0.651f, 3.917f)
                curveToRelative(-0.31f, 0.436f, -0.497f, 1.12f, -0.497f, 1.99f)
                curveTo(0.154f, 11.442f, 6.06f, 24.0f, 10.228f, 24.0f)
                curveToRelative(1.928f, 0.0f, 5.178f, -3.168f, 7.852f, -7.46f)
                moveTo(16.134f, 0.0f)
                curveToRelative(3.855f, 0.0f, 7.713f, 0.622f, 7.713f, 2.798f)
                curveToRelative(0.0f, 4.415f, -2.8f, 9.765f, -4.23f, 9.765f)
                curveToRelative(-2.549f, 0.0f, -5.72f, -7.09f, -5.72f, -10.635f)
                curveTo(13.897f, 0.31f, 14.518f, 0.0f, 16.134f, 0.0f)
            }
        }
        .build()
        return _typo3!!
    }

private var _typo3: ImageVector? = null
