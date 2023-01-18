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

public val BoldGroup.TextStrikethrough: ImageVector
    get() {
        if (_textStrikethrough != null) {
            return _textStrikethrough!!
        }
        _textStrikethrough = Builder(name = "TextStrikethrough", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(185.9f)
                arcTo(41.8f, 41.8f, 0.0f, false, true, 196.0f, 168.0f)
                curveToRelative(0.0f, 14.5f, -7.8f, 28.3f, -21.4f, 38.0f)
                reflectiveCurveToRelative(-29.2f, 14.0f, -46.6f, 14.0f)
                reflectiveCurveToRelative(-34.0f, -5.0f, -46.6f, -14.0f)
                reflectiveCurveTo(60.0f, 182.5f, 60.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                curveToRelative(0.0f, 15.2f, 20.1f, 28.0f, 44.0f, 28.0f)
                reflectiveCurveToRelative(44.0f, -12.8f, 44.0f, -28.0f)
                curveToRelative(0.0f, -12.8f, -9.3f, -20.2f, -35.3f, -28.0f)
                horizontalLineTo(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineTo(216.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 128.0f)
                close()
                moveTo(75.1f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                curveToRelative(0.0f, -16.0f, 17.6f, -28.0f, 40.9f, -28.0f)
                curveToRelative(18.0f, 0.0f, 33.2f, 7.4f, 38.7f, 18.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 21.6f, -10.5f)
                curveTo(178.6f, 48.4f, 155.5f, 36.0f, 128.0f, 36.0f)
                curveTo(91.0f, 36.0f, 63.1f, 58.4f, 63.1f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 75.1f, 100.0f)
                close()
            }
        }
        .build()
        return _textStrikethrough!!
    }

private var _textStrikethrough: ImageVector? = null
