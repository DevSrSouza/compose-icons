package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.HighlighterCircle: ImageVector
    get() {
        if (_highlighterCircle != null) {
            return _highlighterCircle!!
        }
        _highlighterCircle = Builder(name = "HighlighterCircle", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.4f, 51.6f)
                arcTo(108.2f, 108.2f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.2f, 108.2f, 0.0f, false, false, 204.4f, 51.6f)
                close()
                moveTo(140.0f, 136.0f)
                lineTo(116.0f, 136.0f)
                lineTo(116.0f, 111.4f)
                lineToRelative(24.0f, -12.0f)
                close()
                moveTo(100.0f, 207.2f)
                lineTo(100.0f, 160.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(47.2f)
                arcToRelative(84.1f, 84.1f, 0.0f, false, true, -56.0f, 0.0f)
                close()
                moveTo(187.4f, 187.4f)
                curveToRelative(-2.4f, 2.3f, -4.8f, 4.5f, -7.4f, 6.6f)
                lineTo(180.0f, 156.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -16.0f, -19.6f)
                lineTo(164.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -5.7f, -10.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -11.7f, -0.5f)
                lineToRelative(-48.0f, 24.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 92.0f, 104.0f)
                verticalLineToRelative(32.4f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 76.0f, 156.0f)
                verticalLineToRelative(38.0f)
                curveToRelative(-2.6f, -2.1f, -5.0f, -4.3f, -7.4f, -6.6f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 118.8f, 0.0f)
                close()
            }
        }
        .build()
        return _highlighterCircle!!
    }

private var _highlighterCircle: ImageVector? = null
