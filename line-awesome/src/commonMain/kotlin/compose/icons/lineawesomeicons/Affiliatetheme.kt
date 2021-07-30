package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Affiliatetheme: ImageVector
    get() {
        if (_affiliatetheme != null) {
            return _affiliatetheme!!
        }
        _affiliatetheme = Builder(name = "Affiliatetheme", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.1035f, 5.0f)
                curveTo(10.2368f, 5.0156f, 7.3763f, 6.9496f, 5.0371f, 9.9551f)
                curveTo(2.1581f, 13.6541f, 1.1473f, 17.5593f, 2.7813f, 18.6953f)
                curveTo(4.4152f, 19.8213f, 8.0839f, 17.7332f, 10.9629f, 14.0352f)
                curveTo(13.8419f, 10.3362f, 14.8527f, 6.4326f, 13.2188f, 5.3066f)
                curveTo(12.9124f, 5.0955f, 12.5343f, 4.9964f, 12.1035f, 5.0f)
                close()
                moveTo(29.9844f, 11.0f)
                curveTo(26.1834f, 17.359f, 20.0884f, 20.5416f, 16.3594f, 18.2656f)
                curveTo(15.0754f, 17.4796f, 14.2851f, 15.815f, 13.9941f, 14.0f)
                curveTo(12.0181f, 17.66f, 8.208f, 20.903f, 4.0f, 22.0f)
                curveTo(6.681f, 25.188f, 10.8385f, 27.0f, 15.3145f, 27.0f)
                curveTo(23.4015f, 27.0f, 29.9609f, 20.3782f, 29.9609f, 12.2012f)
                curveTo(29.9709f, 11.7422f, 30.0274f, 11.437f, 29.9844f, 11.0f)
                close()
            }
        }
        .build()
        return _affiliatetheme!!
    }

private var _affiliatetheme: ImageVector? = null
