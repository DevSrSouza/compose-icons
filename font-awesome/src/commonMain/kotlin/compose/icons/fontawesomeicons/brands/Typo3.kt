package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Typo3: ImageVector
    get() {
        if (_typo3 != null) {
            return _typo3!!
        }
        _typo3 = Builder(name = "Typo3", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.7f, 78.4f)
                curveToRelative(0.0f, -24.7f, 5.4f, -32.4f, 13.9f, -39.4f)
                curveToRelative(-69.5f, 8.5f, -149.3f, 34.0f, -176.3f, 66.4f)
                curveToRelative(-5.4f, 7.7f, -9.3f, 20.8f, -9.3f, 37.1f)
                curveTo(7.0f, 246.0f, 113.8f, 480.0f, 191.1f, 480.0f)
                curveToRelative(36.3f, 0.0f, 97.3f, -59.5f, 146.7f, -139.0f)
                curveToRelative(-7.0f, 2.3f, -11.6f, 2.3f, -18.5f, 2.3f)
                curveToRelative(-57.2f, 0.0f, -140.6f, -198.5f, -140.6f, -264.9f)
                close()
                moveTo(301.5f, 32.0f)
                curveToRelative(-30.1f, 0.0f, -41.7f, 5.4f, -41.7f, 36.3f)
                curveToRelative(0.0f, 66.4f, 53.8f, 198.5f, 101.7f, 198.5f)
                curveToRelative(26.3f, 0.0f, 78.8f, -99.7f, 78.8f, -182.3f)
                curveToRelative(0.0f, -40.9f, -67.0f, -52.5f, -138.8f, -52.5f)
                close()
            }
        }
        .build()
        return _typo3!!
    }

private var _typo3: ImageVector? = null
