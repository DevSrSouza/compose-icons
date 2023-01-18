package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.HeartStraight: ImageVector
    get() {
        if (_heartStraight != null) {
            return _heartStraight!!
        }
        _heartStraight = Builder(name = "HeartStraight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.3f, 136.5f)
                lineToRelative(-81.0f, 81.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -22.6f, 0.0f)
                lineTo(33.6f, 134.4f)
                arcToRelative(59.9f, 59.9f, 0.0f, false, true, 2.3f, -87.0f)
                curveToRelative(23.3f, -21.1f, 61.3f, -19.1f, 84.6f, 4.3f)
                lineToRelative(7.5f, 7.4f)
                lineToRelative(9.6f, -9.5f)
                arcTo(60.4f, 60.4f, 0.0f, false, true, 181.5f, 32.0f)
                arcToRelative(59.8f, 59.8f, 0.0f, false, true, 43.1f, 19.9f)
                curveTo(245.6f, 75.2f, 243.7f, 113.2f, 220.3f, 136.5f)
                close()
            }
        }
        .build()
        return _heartStraight!!
    }

private var _heartStraight: ImageVector? = null
