package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.RedditFill: ImageVector
    get() {
        if (_redditFill != null) {
            return _redditFill!!
        }
        _redditFill = Builder(name = "RedditFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(18.67f, 12.0f)
                arcToRelative(1.46f, 1.46f, 0.0f, false, false, -2.47f, -1.0f)
                arcToRelative(7.12f, 7.12f, 0.0f, false, false, -3.85f, -1.23f)
                lineTo(13.0f, 6.65f)
                lineToRelative(2.14f, 0.45f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.13f, -0.61f)
                lineTo(12.82f, 6.0f)
                arcToRelative(0.31f, 0.31f, 0.0f, false, false, -0.37f, 0.24f)
                lineToRelative(-0.74f, 3.47f)
                arcToRelative(7.14f, 7.14f, 0.0f, false, false, -3.9f, 1.23f)
                arcToRelative(1.46f, 1.46f, 0.0f, true, false, -1.61f, 2.39f)
                arcToRelative(2.87f, 2.87f, 0.0f, false, false, 0.0f, 0.44f)
                curveToRelative(0.0f, 2.24f, 2.61f, 4.06f, 5.83f, 4.06f)
                reflectiveCurveToRelative(5.83f, -1.82f, 5.83f, -4.06f)
                arcToRelative(2.87f, 2.87f, 0.0f, false, false, 0.0f, -0.44f)
                arcToRelative(1.46f, 1.46f, 0.0f, false, false, 0.81f, -1.33f)
                close()
                moveTo(8.67f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                close()
                moveTo(14.48f, 15.75f)
                arcToRelative(3.84f, 3.84f, 0.0f, false, true, -2.47f, 0.77f)
                arcToRelative(3.84f, 3.84f, 0.0f, false, true, -2.47f, -0.77f)
                arcToRelative(0.27f, 0.27f, 0.0f, false, true, 0.38f, -0.38f)
                arcTo(3.27f, 3.27f, 0.0f, false, false, 12.0f, 16.0f)
                arcToRelative(3.28f, 3.28f, 0.0f, false, false, 2.09f, -0.61f)
                arcToRelative(0.28f, 0.28f, 0.0f, true, true, 0.39f, 0.4f)
                verticalLineToRelative(-0.04f)
                close()
                moveTo(14.3f, 14.04f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.01f, 1.04f)
                lineToRelative(0.01f, -0.04f)
                close()
            }
        }
        .build()
        return _redditFill!!
    }

private var _redditFill: ImageVector? = null
