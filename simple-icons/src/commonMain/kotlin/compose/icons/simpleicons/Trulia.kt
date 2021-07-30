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

public val SimpleIcons.Trulia: ImageVector
    get() {
        if (_trulia != null) {
            return _trulia!!
        }
        _trulia = Builder(name = "Trulia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(8.19f, 0.021f, 5.729f, 2.58f, 5.729f, 6.445f)
                curveToRelative(0.0f, 3.201f, 2.088f, 5.94f, 3.277f, 10.1f)
                curveToRelative(0.684f, 2.385f, 1.052f, 5.303f, 1.242f, 7.455f)
                horizontalLineToRelative(3.504f)
                curveToRelative(0.192f, -2.152f, 0.558f, -5.07f, 1.241f, -7.455f)
                curveToRelative(1.189f, -4.16f, 3.277f, -6.898f, 3.277f, -10.1f)
                curveTo(18.271f, 2.58f, 15.81f, 0.021f, 12.0f, 0.0f)
                close()
                moveTo(12.02f, 9.852f)
                curveToRelative(-1.584f, 0.0f, -2.869f, -1.286f, -2.869f, -2.869f)
                curveToRelative(0.0f, -1.582f, 1.285f, -2.867f, 2.869f, -2.867f)
                curveToRelative(1.585f, 0.0f, 2.869f, 1.283f, 2.869f, 2.867f)
                reflectiveCurveToRelative(-1.285f, 2.869f, -2.869f, 2.869f)
                close()
            }
        }
        .build()
        return _trulia!!
    }

private var _trulia: ImageVector? = null
