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

public val FilledGroup.History: ImageVector
    get() {
        if (_history != null) {
            return _history!!
        }
        _history = Builder(name = "History", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.25f, 12.0f)
                curveTo(19.25f, 7.9959f, 16.0041f, 4.75f, 12.0f, 4.75f)
                curveTo(10.3379f, 4.75f, 8.8064f, 5.3093f, 7.5835f, 6.25f)
                horizontalLineTo(8.25f)
                curveTo(8.8023f, 6.25f, 9.25f, 6.6977f, 9.25f, 7.25f)
                curveTo(9.25f, 7.8023f, 8.8023f, 8.25f, 8.25f, 8.25f)
                horizontalLineTo(5.25f)
                curveTo(4.6977f, 8.25f, 4.25f, 7.8023f, 4.25f, 7.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.2165f)
                lineTo(4.25f, 6.9483f)
                verticalLineTo(4.25f)
                curveTo(4.25f, 3.6977f, 4.6977f, 3.25f, 5.25f, 3.25f)
                curveTo(5.8023f, 3.25f, 6.25f, 3.6977f, 6.25f, 4.25f)
                verticalLineTo(4.7538f)
                curveTo(7.8288f, 3.4994f, 9.8269f, 2.75f, 12.0f, 2.75f)
                curveTo(17.1086f, 2.75f, 21.25f, 6.8914f, 21.25f, 12.0f)
                curveTo(21.25f, 17.1086f, 17.1086f, 21.25f, 12.0f, 21.25f)
                curveTo(6.8914f, 21.25f, 2.75f, 17.1086f, 2.75f, 12.0f)
                curveTo(2.75f, 11.6174f, 2.7732f, 11.2403f, 2.8183f, 10.8699f)
                curveTo(2.8807f, 10.3581f, 3.334f, 10.0f, 3.8496f, 10.0f)
                curveTo(4.4407f, 10.0f, 4.8667f, 10.5685f, 4.7986f, 11.1556f)
                curveTo(4.7665f, 11.4326f, 4.75f, 11.7144f, 4.75f, 12.0f)
                curveTo(4.75f, 16.0041f, 7.9959f, 19.25f, 12.0f, 19.25f)
                curveTo(16.0041f, 19.25f, 19.25f, 16.0041f, 19.25f, 12.0f)
                close()
                moveTo(13.0f, 8.0f)
                curveTo(13.0f, 7.4477f, 12.5523f, 7.0f, 12.0f, 7.0f)
                curveTo(11.4477f, 7.0f, 11.0f, 7.4477f, 11.0f, 8.0f)
                verticalLineTo(13.0f)
                curveTo(11.0f, 13.5523f, 11.4477f, 14.0f, 12.0f, 14.0f)
                horizontalLineTo(15.0f)
                curveTo(15.5523f, 14.0f, 16.0f, 13.5523f, 16.0f, 13.0f)
                curveTo(16.0f, 12.4477f, 15.5523f, 12.0f, 15.0f, 12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _history!!
    }

private var _history: ImageVector? = null
