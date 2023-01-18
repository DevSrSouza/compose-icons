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

public val ThinGroup.TextStrikethrough: ImageVector
    get() {
        if (_textStrikethrough != null) {
            return _textStrikethrough!!
        }
        _textStrikethrough = Builder(name = "TextStrikethrough", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(161.2f)
                curveToRelative(15.4f, 7.2f, 26.8f, 17.8f, 26.8f, 36.0f)
                curveToRelative(0.0f, 24.3f, -26.9f, 44.0f, -60.0f, 44.0f)
                reflectiveCurveToRelative(-60.0f, -19.7f, -60.0f, -44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                curveToRelative(0.0f, 19.9f, 23.3f, 36.0f, 52.0f, 36.0f)
                reflectiveCurveToRelative(52.0f, -16.1f, 52.0f, -36.0f)
                reflectiveCurveToRelative(-16.1f, -28.3f, -42.2f, -36.0f)
                horizontalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(216.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 128.0f)
                close()
                moveTo(76.3f, 100.0f)
                lineToRelative(1.3f, -0.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.5f, -5.0f)
                arcToRelative(24.8f, 24.8f, 0.0f, false, true, -1.0f, -6.8f)
                curveToRelative(0.0f, -20.5f, 21.0f, -36.0f, 48.9f, -36.0f)
                curveToRelative(21.3f, 0.0f, 38.9f, 8.9f, 45.9f, 23.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.4f, 1.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 1.8f, -5.3f)
                curveTo(172.8f, 54.6f, 152.4f, 44.0f, 128.0f, 44.0f)
                curveTo(95.6f, 44.0f, 71.1f, 62.9f, 71.1f, 88.0f)
                arcToRelative(30.1f, 30.1f, 0.0f, false, false, 1.4f, 9.2f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 76.3f, 100.0f)
                close()
            }
        }
        .build()
        return _textStrikethrough!!
    }

private var _textStrikethrough: ImageVector? = null
