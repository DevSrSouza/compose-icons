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

public val RegularGroup.TabInPrivate: ImageVector
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
                moveTo(4.5f, 5.75f)
                verticalLineTo(6.793f)
                lineTo(6.793f, 4.5f)
                horizontalLineTo(5.75f)
                curveTo(5.0596f, 4.5f, 4.5f, 5.0596f, 4.5f, 5.75f)
                close()
                moveTo(4.5f, 8.2072f)
                verticalLineTo(10.793f)
                lineTo(10.793f, 4.5f)
                horizontalLineTo(8.2072f)
                lineTo(4.5f, 8.2072f)
                close()
                moveTo(12.2072f, 4.5f)
                lineTo(4.5f, 12.2072f)
                verticalLineTo(14.793f)
                lineTo(14.793f, 4.5f)
                horizontalLineTo(12.2072f)
                close()
                moveTo(16.2072f, 4.5f)
                lineTo(4.5f, 16.2072f)
                verticalLineTo(18.25f)
                curveTo(4.5f, 18.4112f, 4.5305f, 18.5653f, 4.5861f, 18.7069f)
                lineTo(18.7069f, 4.5861f)
                curveTo(18.5653f, 4.5305f, 18.4112f, 4.5f, 18.25f, 4.5f)
                horizontalLineTo(16.2072f)
                close()
                moveTo(19.4139f, 5.2933f)
                lineTo(5.2933f, 19.4139f)
                curveTo(5.4347f, 19.4695f, 5.5888f, 19.5f, 5.75f, 19.5f)
                horizontalLineTo(7.793f)
                lineTo(19.5f, 7.793f)
                verticalLineTo(5.75f)
                curveTo(19.5f, 5.5888f, 19.4695f, 5.4347f, 19.4139f, 5.2933f)
                close()
                moveTo(19.5f, 9.2072f)
                lineTo(9.2072f, 19.5f)
                horizontalLineTo(11.793f)
                lineTo(19.5f, 11.793f)
                verticalLineTo(9.2072f)
                close()
                moveTo(19.5f, 13.2072f)
                lineTo(13.2072f, 19.5f)
                horizontalLineTo(15.793f)
                lineTo(19.5f, 15.793f)
                verticalLineTo(13.2072f)
                close()
                moveTo(19.5f, 17.2072f)
                lineTo(17.2072f, 19.5f)
                horizontalLineTo(18.25f)
                curveTo(18.9404f, 19.5f, 19.5f, 18.9404f, 19.5f, 18.25f)
                verticalLineTo(17.2072f)
                close()
            }
        }
        .build()
        return _tabInPrivate!!
    }

private var _tabInPrivate: ImageVector? = null
