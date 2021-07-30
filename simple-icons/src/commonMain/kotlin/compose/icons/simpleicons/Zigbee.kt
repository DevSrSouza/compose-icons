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

public val SimpleIcons.Zigbee: ImageVector
    get() {
        if (_zigbee != null) {
            return _zigbee!!
        }
        _zigbee = Builder(name = "Zigbee", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.988f, 0.0f)
                arcToRelative(11.85f, 11.85f, 0.0f, false, false, -8.617f, 3.696f)
                curveToRelative(7.02f, -0.875f, 11.401f, -0.583f, 13.289f, -0.34f)
                curveToRelative(3.752f, 0.583f, 3.558f, 3.404f, 3.558f, 3.404f)
                lineTo(8.237f, 19.112f)
                curveToRelative(2.299f, 0.22f, 6.897f, 0.366f, 13.796f, -0.631f)
                arcToRelative(11.86f, 11.86f, 0.0f, false, false, 1.912f, -6.469f)
                curveTo(23.945f, 5.374f, 18.595f, 0.0f, 11.988f, 0.0f)
                close()
                moveTo(12.22f, 4.31f)
                curveToRelative(-2.451f, -0.014f, -5.772f, 0.146f, -9.963f, 0.723f)
                curveTo(0.854f, 7.003f, 0.055f, 9.41f, 0.055f, 12.012f)
                curveTo(0.055f, 18.626f, 5.38f, 24.0f, 11.988f, 24.0f)
                curveToRelative(3.63f, 0.0f, 6.85f, -1.63f, 9.053f, -4.182f)
                curveToRelative(-7.286f, 0.948f, -11.813f, 0.631f, -13.75f, 0.388f)
                curveToRelative(-3.775f, -0.56f, -3.557f, -3.404f, -3.557f, -3.404f)
                lineTo(15.691f, 4.474f)
                arcToRelative(38.635f, 38.635f, 0.0f, false, false, -3.471f, -0.163f)
                close()
            }
        }
        .build()
        return _zigbee!!
    }

private var _zigbee: ImageVector? = null
