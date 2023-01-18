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

public val RegularGroup.Save: ImageVector
    get() {
        if (_save != null) {
            return _save!!
        }
        _save = Builder(name = "Save", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.75f)
                curveTo(3.0f, 4.2312f, 4.2312f, 3.0f, 5.75f, 3.0f)
                horizontalLineTo(15.7145f)
                curveTo(16.5764f, 3.0f, 17.4031f, 3.3424f, 18.0126f, 3.9519f)
                lineTo(20.0481f, 5.9874f)
                curveTo(20.6576f, 6.5969f, 21.0f, 7.4236f, 21.0f, 8.2855f)
                verticalLineTo(18.25f)
                curveTo(21.0f, 19.7688f, 19.7688f, 21.0f, 18.25f, 21.0f)
                horizontalLineTo(5.75f)
                curveTo(4.2312f, 21.0f, 3.0f, 19.7688f, 3.0f, 18.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(5.75f, 4.5f)
                curveTo(5.0596f, 4.5f, 4.5f, 5.0596f, 4.5f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(4.5f, 18.9404f, 5.0596f, 19.5f, 5.75f, 19.5f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.25f)
                curveTo(6.0f, 13.0074f, 7.0074f, 12.0f, 8.25f, 12.0f)
                horizontalLineTo(15.75f)
                curveTo(16.9926f, 12.0f, 18.0f, 13.0074f, 18.0f, 14.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(18.25f)
                curveTo(18.9404f, 19.5f, 19.5f, 18.9404f, 19.5f, 18.25f)
                verticalLineTo(8.2855f)
                curveTo(19.5f, 7.8214f, 19.3156f, 7.3763f, 18.9874f, 7.0481f)
                lineTo(16.9519f, 5.0126f)
                curveTo(16.6918f, 4.7525f, 16.3582f, 4.5827f, 16.0f, 4.5234f)
                verticalLineTo(7.25f)
                curveTo(16.0f, 8.4926f, 14.9926f, 9.5f, 13.75f, 9.5f)
                horizontalLineTo(9.25f)
                curveTo(8.0074f, 9.5f, 7.0f, 8.4926f, 7.0f, 7.25f)
                verticalLineTo(4.5f)
                horizontalLineTo(5.75f)
                close()
                moveTo(16.5f, 19.5f)
                verticalLineTo(14.25f)
                curveTo(16.5f, 13.8358f, 16.1642f, 13.5f, 15.75f, 13.5f)
                horizontalLineTo(8.25f)
                curveTo(7.8358f, 13.5f, 7.5f, 13.8358f, 7.5f, 14.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(16.5f)
                close()
                moveTo(8.5f, 4.5f)
                verticalLineTo(7.25f)
                curveTo(8.5f, 7.6642f, 8.8358f, 8.0f, 9.25f, 8.0f)
                horizontalLineTo(13.75f)
                curveTo(14.1642f, 8.0f, 14.5f, 7.6642f, 14.5f, 7.25f)
                verticalLineTo(4.5f)
                horizontalLineTo(8.5f)
                close()
            }
        }
        .build()
        return _save!!
    }

private var _save: ImageVector? = null
