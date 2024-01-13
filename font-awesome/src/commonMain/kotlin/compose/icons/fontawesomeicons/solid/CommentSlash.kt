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

public val SolidGroup.CommentSlash: ImageVector
    get() {
        if (_commentSlash != null) {
            return _commentSlash!!
        }
        _commentSlash = Builder(name = "CommentSlash", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.8f, 5.1f)
                curveTo(28.4f, -3.1f, 13.3f, -1.2f, 5.1f, 9.2f)
                reflectiveCurveTo(-1.2f, 34.7f, 9.2f, 42.9f)
                lineToRelative(592.0f, 464.0f)
                curveToRelative(10.4f, 8.2f, 25.5f, 6.3f, 33.7f, -4.1f)
                reflectiveCurveToRelative(6.3f, -25.5f, -4.1f, -33.7f)
                lineTo(512.9f, 376.7f)
                curveTo(552.2f, 340.2f, 576.0f, 292.3f, 576.0f, 240.0f)
                curveTo(576.0f, 125.1f, 461.4f, 32.0f, 320.0f, 32.0f)
                curveToRelative(-67.7f, 0.0f, -129.3f, 21.4f, -175.1f, 56.3f)
                lineTo(38.8f, 5.1f)
                close()
                moveTo(424.0f, 430.1f)
                lineTo(82.9f, 161.3f)
                curveTo(70.7f, 185.6f, 64.0f, 212.2f, 64.0f, 240.0f)
                curveToRelative(0.0f, 45.1f, 17.7f, 86.8f, 47.7f, 120.9f)
                curveToRelative(-1.9f, 24.5f, -11.4f, 46.3f, -21.4f, 62.9f)
                curveToRelative(-5.5f, 9.2f, -11.1f, 16.6f, -15.2f, 21.6f)
                curveToRelative(-2.1f, 2.5f, -3.7f, 4.4f, -4.9f, 5.7f)
                curveToRelative(-0.6f, 0.6f, -1.0f, 1.1f, -1.3f, 1.4f)
                lineToRelative(-0.3f, 0.3f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-4.6f, 4.6f, -5.9f, 11.4f, -3.4f, 17.4f)
                curveToRelative(2.5f, 6.0f, 8.3f, 9.9f, 14.8f, 9.9f)
                curveToRelative(28.7f, 0.0f, 57.6f, -8.9f, 81.6f, -19.3f)
                curveToRelative(22.9f, -10.0f, 42.4f, -21.9f, 54.3f, -30.6f)
                curveToRelative(31.8f, 11.5f, 67.0f, 17.9f, 104.1f, 17.9f)
                curveToRelative(37.0f, 0.0f, 72.3f, -6.4f, 104.1f, -17.9f)
                close()
            }
        }
        .build()
        return _commentSlash!!
    }

private var _commentSlash: ImageVector? = null
