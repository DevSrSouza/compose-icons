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

public val SolidGroup.Question: ImageVector
    get() {
        if (_question != null) {
            return _question!!
        }
        _question = Builder(name = "Question", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(202.02f, 0.0f)
                curveTo(122.2f, 0.0f, 70.5f, 32.7f, 29.91f, 91.03f)
                curveToRelative(-7.36f, 10.58f, -5.09f, 25.09f, 5.18f, 32.87f)
                lineToRelative(43.14f, 32.71f)
                curveToRelative(10.37f, 7.86f, 25.13f, 6.03f, 33.25f, -4.15f)
                curveToRelative(25.05f, -31.38f, 43.63f, -49.45f, 82.76f, -49.45f)
                curveToRelative(30.76f, 0.0f, 68.82f, 19.8f, 68.82f, 49.63f)
                curveToRelative(0.0f, 22.55f, -18.62f, 34.13f, -48.99f, 51.16f)
                curveToRelative(-35.42f, 19.86f, -82.3f, 44.58f, -82.3f, 106.4f)
                verticalLineTo(320.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(72.47f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.74f, 24.0f, -24.0f)
                verticalLineToRelative(-5.77f)
                curveToRelative(0.0f, -42.86f, 125.27f, -44.65f, 125.27f, -160.63f)
                curveTo(377.5f, 66.26f, 286.9f, 0.0f, 202.02f, 0.0f)
                close()
                moveTo(192.0f, 373.46f)
                curveToRelative(-38.2f, 0.0f, -69.27f, 31.08f, -69.27f, 69.27f)
                curveToRelative(0.0f, 38.19f, 31.08f, 69.27f, 69.27f, 69.27f)
                reflectiveCurveToRelative(69.27f, -31.08f, 69.27f, -69.27f)
                reflectiveCurveToRelative(-31.08f, -69.27f, -69.27f, -69.27f)
                close()
            }
        }
        .build()
        return _question!!
    }

private var _question: ImageVector? = null
