package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.ArrowLongUpC: ImageVector
    get() {
        if (_arrowLongUpC != null) {
            return _arrowLongUpC!!
        }
        _arrowLongUpC = Builder(name = "ArrowLongUpC", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.7575f, 5.2308f)
                lineTo(12.0321f, 1.0203f)
                lineTo(16.2425f, 5.2949f)
                lineTo(14.8177f, 6.6984f)
                lineTo(13.0141f, 4.8674f)
                lineTo(12.9427f, 17.1555f)
                curveTo(14.1054f, 17.5732f, 14.9345f, 18.6881f, 14.9283f, 19.994f)
                curveTo(14.9204f, 21.6508f, 13.5709f, 22.9876f, 11.9141f, 22.9797f)
                curveTo(10.2572f, 22.9718f, 8.9205f, 21.6223f, 8.9284f, 19.9655f)
                curveTo(8.9346f, 18.6589f, 9.7751f, 17.5514f, 10.9427f, 17.1454f)
                lineTo(11.0142f, 4.8302f)
                lineTo(9.161f, 6.6556f)
                lineTo(7.7575f, 5.2308f)
                close()
                moveTo(11.9331f, 18.9797f)
                curveTo(11.3808f, 18.9771f, 10.931f, 19.4227f, 10.9283f, 19.975f)
                curveTo(10.9257f, 20.5273f, 11.3713f, 20.9771f, 11.9236f, 20.9797f)
                curveTo(12.4759f, 20.9823f, 12.9257f, 20.5367f, 12.9283f, 19.9845f)
                curveTo(12.9309f, 19.4322f, 12.4853f, 18.9824f, 11.9331f, 18.9797f)
                close()
            }
        }
        .build()
        return _arrowLongUpC!!
    }

private var _arrowLongUpC: ImageVector? = null
