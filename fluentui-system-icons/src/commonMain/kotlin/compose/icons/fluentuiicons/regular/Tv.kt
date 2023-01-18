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

public val RegularGroup.Tv: ImageVector
    get() {
        if (_tv != null) {
            return _tv!!
        }
        _tv = Builder(name = "Tv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.75f, 4.0f)
                curveTo(3.2312f, 4.0f, 2.0f, 5.2312f, 2.0f, 6.75f)
                verticalLineTo(15.25f)
                curveTo(2.0f, 16.7688f, 3.2312f, 18.0f, 4.75f, 18.0f)
                horizontalLineTo(19.25f)
                curveTo(20.7688f, 18.0f, 22.0f, 16.7688f, 22.0f, 15.25f)
                verticalLineTo(6.75f)
                curveTo(22.0f, 5.2312f, 20.7688f, 4.0f, 19.25f, 4.0f)
                horizontalLineTo(4.75f)
                close()
                moveTo(3.5f, 6.75f)
                curveTo(3.5f, 6.0596f, 4.0596f, 5.5f, 4.75f, 5.5f)
                horizontalLineTo(19.25f)
                curveTo(19.9404f, 5.5f, 20.5f, 6.0596f, 20.5f, 6.75f)
                verticalLineTo(15.25f)
                curveTo(20.5f, 15.9404f, 19.9404f, 16.5f, 19.25f, 16.5f)
                horizontalLineTo(4.75f)
                curveTo(4.0596f, 16.5f, 3.5f, 15.9404f, 3.5f, 15.25f)
                verticalLineTo(6.75f)
                close()
                moveTo(5.75f, 19.5f)
                curveTo(5.3358f, 19.5f, 5.0f, 19.8358f, 5.0f, 20.25f)
                curveTo(5.0f, 20.6642f, 5.3358f, 21.0f, 5.75f, 21.0f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 21.0f, 19.0f, 20.6642f, 19.0f, 20.25f)
                curveTo(19.0f, 19.8358f, 18.6642f, 19.5f, 18.25f, 19.5f)
                horizontalLineTo(5.75f)
                close()
            }
        }
        .build()
        return _tv!!
    }

private var _tv: ImageVector? = null
