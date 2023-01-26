package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.SentimentVerySatisfied: ImageVector
    get() {
        if (_sentimentVerySatisfied != null) {
            return _sentimentVerySatisfied!!
        }
        _sentimentVerySatisfied = Builder(name = "SentimentVerySatisfied", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.88f, 9.94f)
                lineToRelative(0.53f, 0.53f)
                curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0.0f)
                curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0.0f, -1.06f)
                lineToRelative(-0.88f, -0.88f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(-0.89f, 0.88f)
                curveToRelative(-0.29f, 0.29f, -0.29f, 0.77f, 0.0f, 1.06f)
                curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0.0f)
                lineToRelative(0.53f, -0.53f)
                close()
                moveTo(12.0f, 17.5f)
                curveToRelative(2.03f, 0.0f, 3.8f, -1.11f, 4.75f, -2.75f)
                curveToRelative(0.19f, -0.33f, -0.05f, -0.75f, -0.44f, -0.75f)
                lineTo(7.69f, 14.0f)
                curveToRelative(-0.38f, 0.0f, -0.63f, 0.42f, -0.44f, 0.75f)
                curveToRelative(0.95f, 1.64f, 2.72f, 2.75f, 4.75f, 2.75f)
                close()
                moveTo(13.53f, 10.47f)
                curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0.0f)
                lineToRelative(0.53f, -0.53f)
                lineToRelative(0.53f, 0.53f)
                curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0.0f)
                curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0.0f, -1.06f)
                lineToRelative(-0.88f, -0.88f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(-0.88f, 0.88f)
                curveToRelative(-0.3f, 0.29f, -0.3f, 0.77f, -0.01f, 1.06f)
                close()
                moveTo(11.99f, 2.0f)
                curveTo(6.47f, 2.0f, 2.0f, 6.47f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f)
                reflectiveCurveTo(22.0f, 17.53f, 22.0f, 12.0f)
                reflectiveCurveTo(17.52f, 2.0f, 11.99f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f)
                reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.58f, 8.0f, -8.0f, 8.0f)
                close()
            }
        }
        .build()
        return _sentimentVerySatisfied!!
    }

private var _sentimentVerySatisfied: ImageVector? = null
