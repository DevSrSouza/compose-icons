package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.SentimentVerySatisfied: ImageVector
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
                lineTo(9.94f, 11.0f)
                lineTo(11.0f, 9.94f)
                lineTo(8.88f, 7.82f)
                lineTo(6.76f, 9.94f)
                lineTo(7.82f, 11.0f)
                close()
                moveTo(12.0f, 17.5f)
                curveToRelative(2.33f, 0.0f, 4.31f, -1.46f, 5.11f, -3.5f)
                lineTo(6.89f, 14.0f)
                curveToRelative(0.8f, 2.04f, 2.78f, 3.5f, 5.11f, 3.5f)
                close()
                moveTo(13.0f, 9.94f)
                lineTo(14.06f, 11.0f)
                lineToRelative(1.06f, -1.06f)
                lineTo(16.18f, 11.0f)
                lineToRelative(1.06f, -1.06f)
                lineToRelative(-2.12f, -2.12f)
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
