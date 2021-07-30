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

public val CssGgIcons.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.738f, 19.9964f)
                curveTo(14.8186f, 19.9988f, 14.8994f, 20.0f, 14.9806f, 20.0f)
                curveTo(19.3989f, 20.0f, 22.9806f, 16.4183f, 22.9806f, 12.0f)
                curveTo(22.9806f, 7.5817f, 19.3989f, 4.0f, 14.9806f, 4.0f)
                curveTo(12.4542f, 4.0f, 10.2013f, 5.1711f, 8.7352f, 7.0f)
                horizontalLineTo(7.5194f)
                curveTo(3.9296f, 7.0f, 1.0194f, 9.9101f, 1.0194f, 13.5f)
                curveTo(1.0194f, 17.0899f, 3.9296f, 20.0f, 7.5194f, 20.0f)
                horizontalLineTo(14.5194f)
                curveTo(14.5926f, 20.0f, 14.6654f, 19.9988f, 14.738f, 19.9964f)
                close()
                moveTo(16.6913f, 17.721f)
                curveTo(19.0415f, 16.9522f, 20.9806f, 14.6815f, 20.9806f, 12.0f)
                curveTo(20.9806f, 8.6863f, 18.2943f, 6.0f, 14.9806f, 6.0f)
                curveTo(11.6669f, 6.0f, 8.9806f, 8.6863f, 8.9806f, 12.0f)
                horizontalLineTo(6.9806f)
                curveTo(6.9806f, 10.9391f, 7.1871f, 9.9264f, 7.5621f, 9.0f)
                horizontalLineTo(7.5194f)
                curveTo(5.0341f, 9.0f, 3.0194f, 11.0147f, 3.0194f, 13.5f)
                curveTo(3.0194f, 15.9853f, 5.0341f, 18.0f, 7.5194f, 18.0f)
                horizontalLineTo(14.5194f)
                curveTo(15.0691f, 18.0f, 15.9041f, 17.9014f, 16.6913f, 17.721f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
