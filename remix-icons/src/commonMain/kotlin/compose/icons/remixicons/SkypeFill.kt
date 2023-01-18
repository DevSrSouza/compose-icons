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

public val RemixIcons.SkypeFill: ImageVector
    get() {
        if (_skypeFill != null) {
            return _skypeFill!!
        }
        _skypeFill = Builder(name = "SkypeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.31f, 20.4f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -9.71f, -9.71f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, true, 7.09f, -7.09f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 9.71f, 9.71f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, true, -7.09f, 7.09f)
                close()
                moveTo(12.052f, 17.156f)
                horizontalLineToRelative(-0.04f)
                curveToRelative(2.872f, 0.0f, 4.303f, -1.386f, 4.303f, -3.243f)
                curveToRelative(0.0f, -1.198f, -0.551f, -2.471f, -2.726f, -2.958f)
                lineToRelative(-1.983f, -0.44f)
                curveToRelative(-0.755f, -0.172f, -1.622f, -0.4f, -1.622f, -1.115f)
                reflectiveCurveToRelative(0.62f, -1.213f, 1.724f, -1.213f)
                curveToRelative(2.23f, 0.0f, 2.027f, 1.528f, 3.131f, 1.528f)
                curveToRelative(0.576f, 0.0f, 1.093f, -0.342f, 1.093f, -0.93f)
                curveToRelative(0.0f, -1.37f, -2.197f, -2.4f, -4.056f, -2.4f)
                curveToRelative(-2.021f, 0.0f, -4.173f, 0.859f, -4.173f, 3.144f)
                curveToRelative(0.0f, 1.098f, 0.394f, 2.27f, 2.56f, 2.813f)
                lineToRelative(2.689f, 0.671f)
                curveToRelative(0.816f, 0.202f, 1.018f, 0.659f, 1.018f, 1.072f)
                curveToRelative(0.0f, 0.687f, -0.684f, 1.358f, -1.918f, 1.358f)
                curveToRelative(-2.417f, 0.0f, -2.078f, -1.857f, -3.374f, -1.857f)
                curveToRelative(-0.58f, 0.0f, -1.003f, 0.398f, -1.003f, 0.971f)
                curveToRelative(0.0f, 1.114f, 1.352f, 2.598f, 4.377f, 2.598f)
                close()
            }
        }
        .build()
        return _skypeFill!!
    }

private var _skypeFill: ImageVector? = null
