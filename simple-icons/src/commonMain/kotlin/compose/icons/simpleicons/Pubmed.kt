package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Pubmed: ImageVector
    get() {
        if (_pubmed != null) {
            return _pubmed!!
        }
        _pubmed = Builder(name = "Pubmed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.23f, 7.982f)
                lineToRelative(0.006f, -1.005f)
                curveTo(7.846f, 1.417f, 5.096f, 0.0f, 5.096f, 0.0f)
                lineToRelative(0.048f, 2.291f)
                curveTo(3.73f, 1.056f, 2.6f, 1.444f, 2.6f, 1.444f)
                lineToRelative(0.118f, 15.307f)
                reflectiveCurveToRelative(4.218f, -1.796f, 5.428f, 5.505f)
                curveTo(10.238f, 13.535f, 21.401f, 24.0f, 21.401f, 24.0f)
                lineTo(21.401f, 9.0f)
                reflectiveCurveTo(10.52f, -0.18f, 8.231f, 7.982f)
                close()
                moveTo(18.02f, 17.923f)
                lineToRelative(-1.046f, -5.232f)
                lineToRelative(-1.904f, 4.507f)
                horizontalLineToRelative(-0.96f)
                lineToRelative(-1.72f, -4.301f)
                lineToRelative(-1.046f, 5.04f)
                lineTo(9.321f, 17.937f)
                lineToRelative(2.093f, -9.39f)
                horizontalLineToRelative(0.802f)
                lineToRelative(2.491f, 5.543f)
                lineToRelative(2.508f, -5.557f)
                horizontalLineToRelative(0.869f)
                lineToRelative(2.075f, 9.39f)
                horizontalLineToRelative(-2.138f)
                close()
            }
        }
        .build()
        return _pubmed!!
    }

private var _pubmed: ImageVector? = null
