package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Hashtag: ImageVector
    get() {
        if (_hashtag != null) {
            return _hashtag!!
        }
        _hashtag = Builder(name = "Hashtag", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(181.3f, 32.4f)
                curveToRelative(17.4f, 2.9f, 29.2f, 19.4f, 26.3f, 36.8f)
                lineTo(197.8f, 128.0f)
                horizontalLineToRelative(95.1f)
                lineToRelative(11.5f, -69.3f)
                curveToRelative(2.9f, -17.4f, 19.4f, -29.2f, 36.8f, -26.3f)
                reflectiveCurveToRelative(29.2f, 19.4f, 26.3f, 36.8f)
                lineTo(357.8f, 128.0f)
                horizontalLineTo(416.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(347.1f)
                lineTo(325.8f, 320.0f)
                horizontalLineTo(384.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(315.1f)
                lineToRelative(-11.5f, 69.3f)
                curveToRelative(-2.9f, 17.4f, -19.4f, 29.2f, -36.8f, 26.3f)
                reflectiveCurveToRelative(-29.2f, -19.4f, -26.3f, -36.8f)
                lineToRelative(9.8f, -58.7f)
                horizontalLineTo(155.1f)
                lineToRelative(-11.5f, 69.3f)
                curveToRelative(-2.9f, 17.4f, -19.4f, 29.2f, -36.8f, 26.3f)
                reflectiveCurveToRelative(-29.2f, -19.4f, -26.3f, -36.8f)
                lineTo(90.2f, 384.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(68.9f)
                lineToRelative(21.3f, -128.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(68.9f)
                lineToRelative(11.5f, -69.3f)
                curveToRelative(2.9f, -17.4f, 19.4f, -29.2f, 36.8f, -26.3f)
                close()
                moveTo(187.1f, 192.0f)
                lineTo(165.8f, 320.0f)
                horizontalLineToRelative(95.1f)
                lineToRelative(21.3f, -128.0f)
                horizontalLineTo(187.1f)
                close()
            }
        }
        .build()
        return _hashtag!!
    }

private var _hashtag: ImageVector? = null
