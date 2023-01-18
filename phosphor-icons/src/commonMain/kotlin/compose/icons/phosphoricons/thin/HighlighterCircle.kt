package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.HighlighterCircle: ImageVector
    get() {
        if (_highlighterCircle != null) {
            return _highlighterCircle!!
        }
        _highlighterCircle = Builder(name = "HighlighterCircle", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.7f, 57.3f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 57.3f, 198.7f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 198.7f, 57.3f)
                close()
                moveTo(92.0f, 212.7f)
                lineTo(92.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(60.7f)
                arcToRelative(92.4f, 92.4f, 0.0f, false, true, -72.0f, 0.0f)
                close()
                moveTo(148.0f, 140.0f)
                lineTo(108.0f, 140.0f)
                lineTo(108.0f, 98.5f)
                lineToRelative(40.0f, -20.0f)
                close()
                moveTo(193.1f, 193.1f)
                arcTo(93.4f, 93.4f, 0.0f, false, true, 172.0f, 208.8f)
                lineTo(172.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(156.0f, 72.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -1.9f, -3.4f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -3.9f, -0.2f)
                lineToRelative(-48.0f, 24.0f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 100.0f, 96.0f)
                verticalLineToRelative(44.0f)
                lineTo(96.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(56.8f)
                arcToRelative(93.4f, 93.4f, 0.0f, false, true, -21.1f, -15.7f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 130.2f, 0.0f)
                close()
            }
        }
        .build()
        return _highlighterCircle!!
    }

private var _highlighterCircle: ImageVector? = null
