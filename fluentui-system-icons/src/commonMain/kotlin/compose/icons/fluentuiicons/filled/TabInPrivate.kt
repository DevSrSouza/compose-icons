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

public val FilledGroup.TabInPrivate: ImageVector
    get() {
        if (_tabInPrivate != null) {
            return _tabInPrivate!!
        }
        _tabInPrivate = Builder(name = "TabInPrivate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.75f, 3.0f)
                horizontalLineTo(18.25f)
                curveTo(19.7688f, 3.0f, 21.0f, 4.2312f, 21.0f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(21.0f, 19.7688f, 19.7688f, 21.0f, 18.25f, 21.0f)
                horizontalLineTo(5.75f)
                curveTo(4.2312f, 21.0f, 3.0f, 19.7688f, 3.0f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(3.0f, 4.2312f, 4.2312f, 3.0f, 5.75f, 3.0f)
                close()
                moveTo(5.0f, 5.75f)
                verticalLineTo(6.293f)
                lineTo(6.293f, 5.0f)
                horizontalLineTo(5.75f)
                curveTo(5.3358f, 5.0f, 5.0f, 5.3358f, 5.0f, 5.75f)
                close()
                moveTo(5.0f, 7.7072f)
                verticalLineTo(10.293f)
                lineTo(10.293f, 5.0f)
                horizontalLineTo(7.7072f)
                lineTo(5.0f, 7.7072f)
                close()
                moveTo(11.7072f, 5.0f)
                lineTo(5.0f, 11.7072f)
                verticalLineTo(14.293f)
                lineTo(14.293f, 5.0f)
                horizontalLineTo(11.7072f)
                close()
                moveTo(15.7072f, 5.0f)
                lineTo(5.0f, 15.7072f)
                verticalLineTo(18.25f)
                curveTo(5.0f, 18.264f, 5.0004f, 18.278f, 5.0012f, 18.2918f)
                lineTo(18.2918f, 5.0012f)
                curveTo(18.278f, 5.0004f, 18.264f, 5.0f, 18.25f, 5.0f)
                horizontalLineTo(15.7072f)
                close()
                moveTo(18.9989f, 5.7083f)
                lineTo(5.7083f, 18.9989f)
                curveTo(5.7221f, 18.9996f, 5.736f, 19.0f, 5.75f, 19.0f)
                horizontalLineTo(8.293f)
                lineTo(19.0f, 8.293f)
                verticalLineTo(5.75f)
                curveTo(19.0f, 5.736f, 18.9996f, 5.7221f, 18.9989f, 5.7083f)
                close()
                moveTo(19.0f, 9.7072f)
                lineTo(9.7072f, 19.0f)
                horizontalLineTo(12.293f)
                lineTo(19.0f, 12.293f)
                verticalLineTo(9.7072f)
                close()
                moveTo(19.0f, 13.7072f)
                lineTo(13.7072f, 19.0f)
                horizontalLineTo(16.293f)
                lineTo(19.0f, 16.293f)
                verticalLineTo(13.7072f)
                close()
                moveTo(19.0f, 17.7072f)
                lineTo(17.7072f, 19.0f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 19.0f, 19.0f, 18.6642f, 19.0f, 18.25f)
                verticalLineTo(17.7072f)
                close()
            }
        }
        .build()
        return _tabInPrivate!!
    }

private var _tabInPrivate: ImageVector? = null
