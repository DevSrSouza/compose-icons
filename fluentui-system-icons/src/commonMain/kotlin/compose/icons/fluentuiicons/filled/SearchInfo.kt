package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.SearchInfo: ImageVector
    get() {
        if (_searchInfo != null) {
            return _searchInfo!!
        }
        _searchInfo = Builder(name = "SearchInfo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.25f, 10.0f)
                curveTo(17.25f, 5.9959f, 14.0041f, 2.75f, 10.0f, 2.75f)
                curveTo(5.9959f, 2.75f, 2.75f, 5.9959f, 2.75f, 10.0f)
                curveTo(2.75f, 14.0041f, 5.9959f, 17.25f, 10.0f, 17.25f)
                curveTo(11.7319f, 17.25f, 13.3219f, 16.6427f, 14.5688f, 15.6295f)
                lineTo(19.4697f, 20.5303f)
                lineTo(19.5538f, 20.6029f)
                curveTo(19.8474f, 20.8208f, 20.2641f, 20.7966f, 20.5303f, 20.5303f)
                curveTo(20.8232f, 20.2374f, 20.8232f, 19.7626f, 20.5303f, 19.4697f)
                lineTo(15.6295f, 14.5688f)
                curveTo(16.6427f, 13.3219f, 17.25f, 11.7319f, 17.25f, 10.0f)
                close()
                moveTo(11.0f, 7.0f)
                curveTo(11.0f, 7.5523f, 10.5523f, 8.0f, 10.0f, 8.0f)
                curveTo(9.4477f, 8.0f, 9.0f, 7.5523f, 9.0f, 7.0f)
                curveTo(9.0f, 6.4477f, 9.4477f, 6.0f, 10.0f, 6.0f)
                curveTo(10.5523f, 6.0f, 11.0f, 6.4477f, 11.0f, 7.0f)
                close()
                moveTo(10.0f, 9.0f)
                curveTo(10.4142f, 9.0f, 10.75f, 9.3358f, 10.75f, 9.75f)
                verticalLineTo(13.25f)
                curveTo(10.75f, 13.6642f, 10.4142f, 14.0f, 10.0f, 14.0f)
                curveTo(9.5858f, 14.0f, 9.25f, 13.6642f, 9.25f, 13.25f)
                verticalLineTo(9.75f)
                curveTo(9.25f, 9.3358f, 9.5858f, 9.0f, 10.0f, 9.0f)
                close()
            }
        }
        .build()
        return _searchInfo!!
    }

private var _searchInfo: ImageVector? = null
