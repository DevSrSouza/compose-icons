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

public val SimpleIcons.Humblebundle: ImageVector
    get() {
        if (_humblebundle != null) {
            return _humblebundle!!
        }
        _humblebundle = Builder(name = "Humblebundle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.895f, 19.341f)
                curveToRelative(-3.384f, 0.0f, 1.826f, -19.186f, 1.826f, -19.186f)
                lineTo(16.233f, 0.151f)
                reflectiveCurveToRelative(-1.427f, 4.515f, -2.37f, 9.533f)
                horizontalLineToRelative(-3.005f)
                curveToRelative(0.078f, -1.032f, 0.116f, -2.076f, 0.099f, -3.114f)
                curveToRelative(-0.135f, -8.26f, -4.974f, -6.73f, -7.14f, -4.835f)
                curveTo(1.758f, 3.538f, 0.033f, 6.962f, 0.0f, 9.6f)
                curveToRelative(0.328f, -0.016f, 1.624f, -0.022f, 1.624f, -0.022f)
                reflectiveCurveTo(2.702f, 4.66f, 6.086f, 4.66f)
                curveToRelative(3.385f, 0.0f, -1.834f, 19.187f, -1.834f, 19.187f)
                lineToRelative(3.49f, 0.002f)
                reflectiveCurveToRelative(1.803f, -5.136f, 2.7f, -10.872f)
                lineToRelative(2.87f, -0.017f)
                curveToRelative(-0.167f, 1.485f, -0.22f, 3.124f, -0.196f, 4.646f)
                curveToRelative(0.136f, 8.26f, 4.956f, 6.488f, 7.122f, 4.593f)
                curveToRelative(2.166f, -1.896f, 3.782f, -5.9f, 3.762f, -7.822f)
                curveToRelative(0.002f, -0.002f, -1.645f, 0.013f, -1.665f, 0.013f)
                curveToRelative(0.006f, 0.152f, -1.056f, 4.951f, -4.44f, 4.951f)
                close()
            }
        }
        .build()
        return _humblebundle!!
    }

private var _humblebundle: ImageVector? = null
