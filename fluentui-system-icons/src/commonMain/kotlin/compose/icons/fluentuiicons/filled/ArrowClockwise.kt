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

public val FilledGroup.ArrowClockwise: ImageVector
    get() {
        if (_arrowClockwise != null) {
            return _arrowClockwise!!
        }
        _arrowClockwise = Builder(name = "ArrowClockwise", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.75f)
                curveTo(7.9959f, 4.75f, 4.75f, 7.9959f, 4.75f, 12.0f)
                curveTo(4.75f, 16.0041f, 7.9959f, 19.25f, 12.0f, 19.25f)
                curveTo(16.0041f, 19.25f, 19.25f, 16.0041f, 19.25f, 12.0f)
                curveTo(19.25f, 11.7144f, 19.2335f, 11.4326f, 19.2014f, 11.1556f)
                curveTo(19.1333f, 10.5685f, 19.5593f, 10.0f, 20.1504f, 10.0f)
                curveTo(20.666f, 10.0f, 21.1193f, 10.3581f, 21.1817f, 10.8699f)
                curveTo(21.2268f, 11.2403f, 21.25f, 11.6174f, 21.25f, 12.0f)
                curveTo(21.25f, 17.1086f, 17.1086f, 21.25f, 12.0f, 21.25f)
                curveTo(6.8914f, 21.25f, 2.75f, 17.1086f, 2.75f, 12.0f)
                curveTo(2.75f, 6.8914f, 6.8914f, 2.75f, 12.0f, 2.75f)
                curveTo(14.1731f, 2.75f, 16.1712f, 3.4994f, 17.75f, 4.7538f)
                verticalLineTo(4.25f)
                curveTo(17.75f, 3.6977f, 18.1977f, 3.25f, 18.75f, 3.25f)
                curveTo(19.3023f, 3.25f, 19.75f, 3.6977f, 19.75f, 4.25f)
                verticalLineTo(6.9483f)
                curveTo(19.7612f, 6.9655f, 19.7724f, 6.9827f, 19.7835f, 7.0f)
                horizontalLineTo(19.75f)
                verticalLineTo(7.25f)
                curveTo(19.75f, 7.8023f, 19.3023f, 8.25f, 18.75f, 8.25f)
                horizontalLineTo(15.75f)
                curveTo(15.1977f, 8.25f, 14.75f, 7.8023f, 14.75f, 7.25f)
                curveTo(14.75f, 6.6977f, 15.1977f, 6.25f, 15.75f, 6.25f)
                horizontalLineTo(16.4165f)
                curveTo(15.1936f, 5.3093f, 13.6621f, 4.75f, 12.0f, 4.75f)
                close()
            }
        }
        .build()
        return _arrowClockwise!!
    }

private var _arrowClockwise: ImageVector? = null
