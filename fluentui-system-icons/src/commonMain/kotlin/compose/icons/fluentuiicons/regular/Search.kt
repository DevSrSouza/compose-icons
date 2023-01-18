package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }
        _search = Builder(name = "Search", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.75f)
                curveTo(14.0041f, 2.75f, 17.25f, 5.9959f, 17.25f, 10.0f)
                curveTo(17.25f, 11.7319f, 16.6427f, 13.3219f, 15.6295f, 14.5688f)
                lineTo(20.5303f, 19.4697f)
                curveTo(20.8232f, 19.7626f, 20.8232f, 20.2374f, 20.5303f, 20.5303f)
                curveTo(20.2641f, 20.7966f, 19.8474f, 20.8208f, 19.5538f, 20.6029f)
                lineTo(19.4697f, 20.5303f)
                lineTo(14.5688f, 15.6295f)
                curveTo(13.3219f, 16.6427f, 11.7319f, 17.25f, 10.0f, 17.25f)
                curveTo(5.9959f, 17.25f, 2.75f, 14.0041f, 2.75f, 10.0f)
                curveTo(2.75f, 5.9959f, 5.9959f, 2.75f, 10.0f, 2.75f)
                close()
                moveTo(10.0f, 4.25f)
                curveTo(6.8244f, 4.25f, 4.25f, 6.8244f, 4.25f, 10.0f)
                curveTo(4.25f, 13.1756f, 6.8244f, 15.75f, 10.0f, 15.75f)
                curveTo(13.1756f, 15.75f, 15.75f, 13.1756f, 15.75f, 10.0f)
                curveTo(15.75f, 6.8244f, 13.1756f, 4.25f, 10.0f, 4.25f)
                close()
            }
        }
        .build()
        return _search!!
    }

private var _search: ImageVector? = null
