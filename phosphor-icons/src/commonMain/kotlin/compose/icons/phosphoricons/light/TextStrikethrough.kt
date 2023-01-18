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

public val LightGroup.TextStrikethrough: ImageVector
    get() {
        if (_textStrikethrough != null) {
            return _textStrikethrough!!
        }
        _textStrikethrough = Builder(name = "TextStrikethrough", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(169.4f)
                curveToRelative(11.3f, 6.9f, 20.6f, 17.4f, 20.6f, 34.0f)
                curveToRelative(0.0f, 25.4f, -27.8f, 46.0f, -62.0f, 46.0f)
                reflectiveCurveToRelative(-62.0f, -20.6f, -62.0f, -46.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                curveToRelative(0.0f, 18.7f, 22.4f, 34.0f, 50.0f, 34.0f)
                reflectiveCurveToRelative(50.0f, -15.3f, 50.0f, -34.0f)
                reflectiveCurveToRelative(-15.5f, -26.6f, -40.5f, -34.0f)
                horizontalLineTo(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(216.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 128.0f)
                close()
                moveTo(76.3f, 102.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 1.9f, -0.3f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 82.0f, 94.1f)
                arcToRelative(19.5f, 19.5f, 0.0f, false, true, -0.9f, -6.1f)
                curveToRelative(0.0f, -19.4f, 20.2f, -34.0f, 46.9f, -34.0f)
                curveToRelative(20.3f, 0.0f, 37.6f, 8.7f, 44.1f, 22.1f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 8.1f, 2.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.7f, -8.0f)
                curveTo(174.2f, 53.1f, 153.2f, 42.0f, 128.0f, 42.0f)
                curveTo(94.4f, 42.0f, 69.1f, 61.8f, 69.1f, 88.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, 1.5f, 9.9f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 76.3f, 102.0f)
                close()
            }
        }
        .build()
        return _textStrikethrough!!
    }

private var _textStrikethrough: ImageVector? = null
