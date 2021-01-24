package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                moveTo(202.021f, 0.0f)
                curveTo(122.202f, 0.0f, 70.503f, 32.703f, 29.914f, 91.026f)
                curveToRelative(-7.363f, 10.58f, -5.093f, 25.086f, 5.178f, 32.874f)
                lineToRelative(43.138f, 32.709f)
                curveToRelative(10.373f, 7.865f, 25.132f, 6.026f, 33.253f, -4.148f)
                curveToRelative(25.049f, -31.381f, 43.63f, -49.449f, 82.757f, -49.449f)
                curveToRelative(30.764f, 0.0f, 68.816f, 19.799f, 68.816f, 49.631f)
                curveToRelative(0.0f, 22.552f, -18.617f, 34.134f, -48.993f, 51.164f)
                curveToRelative(-35.423f, 19.86f, -82.299f, 44.576f, -82.299f, 106.405f)
                verticalLineTo(320.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(72.471f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                verticalLineToRelative(-5.773f)
                curveToRelative(0.0f, -42.86f, 125.268f, -44.645f, 125.268f, -160.627f)
                curveTo(377.504f, 66.256f, 286.902f, 0.0f, 202.021f, 0.0f)
                close()
                moveTo(192.0f, 373.459f)
                curveToRelative(-38.196f, 0.0f, -69.271f, 31.075f, -69.271f, 69.271f)
                curveToRelative(0.0f, 38.195f, 31.075f, 69.27f, 69.271f, 69.27f)
                reflectiveCurveToRelative(69.271f, -31.075f, 69.271f, -69.271f)
                reflectiveCurveToRelative(-31.075f, -69.27f, -69.271f, -69.27f)
                close()
            }
        }
        .build()
        return _question!!
    }

private var _question: ImageVector? = null
