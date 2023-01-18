package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.HighlighterCircle: ImageVector
    get() {
        if (_highlighterCircle != null) {
            return _highlighterCircle!!
        }
        _highlighterCircle = Builder(name = "HighlighterCircle", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.1f, 200.1f)
                close()
                moveTo(230.0f, 128.0f)
                arcTo(102.0f, 102.0f, 0.0f, false, true, 55.9f, 200.1f)
                arcTo(102.0f, 102.0f, 0.0f, true, true, 200.1f, 55.9f)
                arcTo(101.1f, 101.1f, 0.0f, false, true, 230.0f, 128.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.7f, 90.7f, 0.0f, false, false, 34.0f, -6.6f)
                lineTo(162.0f, 152.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(96.0f, 150.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(59.4f)
                arcTo(90.7f, 90.7f, 0.0f, false, false, 128.0f, 218.0f)
                close()
                moveTo(146.0f, 81.7f)
                lineToRelative(-36.0f, 18.0f)
                lineTo(110.0f, 138.0f)
                horizontalLineToRelative(36.0f)
                close()
                moveTo(191.6f, 191.6f)
                arcTo(89.5f, 89.5f, 0.0f, true, false, 82.0f, 205.4f)
                lineTo(82.0f, 152.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, -14.0f)
                horizontalLineToRelative(2.0f)
                lineTo(98.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.3f, -5.4f)
                lineToRelative(48.0f, -24.0f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, 5.9f, 0.3f)
                arcTo(6.1f, 6.1f, 0.0f, false, true, 158.0f, 72.0f)
                verticalLineToRelative(66.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, 14.0f)
                verticalLineToRelative(53.4f)
                arcToRelative(89.2f, 89.2f, 0.0f, false, false, 17.6f, -13.8f)
                close()
            }
        }
        .build()
        return _highlighterCircle!!
    }

private var _highlighterCircle: ImageVector? = null
