package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.TextStrikethrough: ImageVector
    get() {
        if (_textStrikethrough != null) {
            return _textStrikethrough!!
        }
        _textStrikethrough = Builder(name = "TextStrikethrough", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(175.9f)
                curveToRelative(9.2f, 7.1f, 16.1f, 17.2f, 16.1f, 32.0f)
                reflectiveCurveToRelative(-7.0f, 25.7f, -19.8f, 34.8f)
                reflectiveCurveTo(144.6f, 216.0f, 128.0f, 216.0f)
                reflectiveCurveToRelative(-32.3f, -4.7f, -44.2f, -13.2f)
                reflectiveCurveTo(64.0f, 181.3f, 64.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                curveToRelative(0.0f, 17.3f, 22.0f, 32.0f, 48.0f, 32.0f)
                reflectiveCurveToRelative(48.0f, -14.7f, 48.0f, -32.0f)
                curveToRelative(0.0f, -14.9f, -10.5f, -23.6f, -38.8f, -32.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 128.0f)
                close()
                moveTo(76.3f, 104.0f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, false, 2.5f, -0.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.1f, -10.1f)
                arcToRelative(19.2f, 19.2f, 0.0f, false, true, -0.8f, -5.5f)
                curveToRelative(0.0f, -18.2f, 19.3f, -32.0f, 44.9f, -32.0f)
                curveToRelative(19.5f, 0.0f, 36.1f, 8.3f, 42.3f, 21.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 181.0f, 80.7f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 184.7f, 70.0f)
                curveToRelative(-9.0f, -18.5f, -30.7f, -30.0f, -56.7f, -30.0f)
                curveTo(93.3f, 40.0f, 67.1f, 60.6f, 67.1f, 88.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 1.6f, 10.5f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 76.3f, 104.0f)
                close()
            }
        }
        .build()
        return _textStrikethrough!!
    }

private var _textStrikethrough: ImageVector? = null
