package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Typo3: ImageVector
    get() {
        if (_typo3 != null) {
            return _typo3!!
        }
        _typo3 = Builder(name = "Typo3", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.7f, 6.5f)
                curveTo(11.8f, 9.0f, 13.2f, 13.0f, 14.6f, 16.0f)
                curveToRelative(1.8f, 3.8f, 3.4f, 5.6f, 4.7f, 6.5f)
                curveTo(17.0f, 25.6f, 15.0f, 27.0f, 14.4f, 27.0f)
                reflectiveCurveToRelative(-2.6f, -1.5f, -5.0f, -6.3f)
                curveTo(7.4f, 16.8f, 6.0f, 12.4f, 6.0f, 9.9f)
                curveTo(6.0f, 9.4f, 6.1f, 9.1f, 6.1f, 9.0f)
                curveTo(6.9f, 8.2f, 9.0f, 7.2f, 11.7f, 6.5f)
                moveTo(14.4f, 4.0f)
                curveTo(10.5f, 4.5f, 6.0f, 5.9f, 4.5f, 7.8f)
                curveTo(4.2f, 8.2f, 4.0f, 8.9f, 4.0f, 9.9f)
                curveTo(4.0f, 15.7f, 10.0f, 29.0f, 14.4f, 29.0f)
                curveToRelative(2.0f, 0.0f, 5.5f, -3.4f, 8.3f, -7.9f)
                curveToRelative(-0.4f, 0.1f, -0.7f, 0.1f, -1.1f, 0.1f)
                curveToRelative(-3.2f, 0.0f, -7.9f, -11.3f, -7.9f, -15.0f)
                curveTo(13.7f, 4.8f, 14.0f, 4.4f, 14.4f, 4.0f)
                lineTo(14.4f, 4.0f)
                close()
                moveTo(20.3f, 6.0f)
                curveToRelative(4.4f, 0.0f, 5.5f, 0.8f, 5.7f, 1.0f)
                curveToRelative(0.0f, 3.3f, -1.7f, 6.7f, -2.6f, 7.8f)
                curveTo(22.1f, 13.6f, 20.0f, 9.0f, 20.0f, 6.0f)
                curveTo(20.1f, 6.0f, 20.2f, 6.0f, 20.3f, 6.0f)
                moveTo(20.3f, 4.0f)
                curveTo(18.6f, 4.0f, 18.0f, 4.3f, 18.0f, 6.0f)
                curveToRelative(0.0f, 3.7f, 3.0f, 11.0f, 5.6f, 11.0f)
                curveToRelative(1.5f, 0.0f, 4.4f, -5.5f, 4.4f, -10.1f)
                curveTo(28.0f, 4.6f, 24.3f, 4.0f, 20.3f, 4.0f)
                lineTo(20.3f, 4.0f)
                close()
            }
        }
        .build()
        return _typo3!!
    }

private var _typo3: ImageVector? = null
