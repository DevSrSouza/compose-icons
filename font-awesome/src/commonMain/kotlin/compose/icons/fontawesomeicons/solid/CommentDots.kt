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

public val SolidGroup.CommentDots: ImageVector
    get() {
        if (_commentDots != null) {
            return _commentDots!!
        }
        _commentDots = Builder(name = "CommentDots", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                curveTo(114.6f, 32.0f, 0.0f, 125.1f, 0.0f, 240.0f)
                curveToRelative(0.0f, 49.6f, 21.4f, 95.0f, 57.0f, 130.7f)
                curveTo(44.5f, 421.1f, 2.7f, 466.0f, 2.2f, 466.5f)
                curveToRelative(-2.2f, 2.3f, -2.8f, 5.7f, -1.5f, 8.7f)
                reflectiveCurveTo(4.8f, 480.0f, 8.0f, 480.0f)
                curveToRelative(66.3f, 0.0f, 116.0f, -31.8f, 140.6f, -51.4f)
                curveToRelative(32.7f, 12.3f, 69.0f, 19.4f, 107.4f, 19.4f)
                curveToRelative(141.4f, 0.0f, 256.0f, -93.1f, 256.0f, -208.0f)
                reflectiveCurveTo(397.4f, 32.0f, 256.0f, 32.0f)
                close()
                moveTo(128.0f, 272.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                close()
                moveTo(256.0f, 272.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                close()
                moveTo(384.0f, 272.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _commentDots!!
    }

private var _commentDots: ImageVector? = null
