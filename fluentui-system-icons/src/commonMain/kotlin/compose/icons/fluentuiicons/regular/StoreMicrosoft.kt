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

public val RegularGroup.StoreMicrosoft: ImageVector
    get() {
        if (_storeMicrosoft != null) {
            return _storeMicrosoft!!
        }
        _storeMicrosoft = Builder(name = "StoreMicrosoft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 9.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(11.5f)
                close()
                moveTo(11.5f, 17.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.5f)
                horizontalLineTo(11.5f)
                close()
                moveTo(16.0f, 9.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(16.0f)
                close()
                moveTo(16.0f, 17.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(17.5f)
                horizontalLineTo(16.0f)
                close()
                moveTo(8.0f, 6.0f)
                verticalLineTo(3.75f)
                curveTo(8.0f, 2.7835f, 8.7835f, 2.0f, 9.75f, 2.0f)
                horizontalLineTo(14.25f)
                curveTo(15.2165f, 2.0f, 16.0f, 2.7835f, 16.0f, 3.75f)
                verticalLineTo(6.0f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 6.0f, 22.0f, 6.3358f, 22.0f, 6.75f)
                verticalLineTo(18.25f)
                curveTo(22.0f, 19.7688f, 20.7688f, 21.0f, 19.25f, 21.0f)
                horizontalLineTo(4.75f)
                curveTo(3.2312f, 21.0f, 2.0f, 19.7688f, 2.0f, 18.25f)
                verticalLineTo(6.75f)
                curveTo(2.0f, 6.3358f, 2.3358f, 6.0f, 2.75f, 6.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(9.5f, 3.75f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(3.75f)
                curveTo(14.5f, 3.6119f, 14.3881f, 3.5f, 14.25f, 3.5f)
                horizontalLineTo(9.75f)
                curveTo(9.6119f, 3.5f, 9.5f, 3.6119f, 9.5f, 3.75f)
                close()
                moveTo(3.5f, 18.25f)
                curveTo(3.5f, 18.9404f, 4.0596f, 19.5f, 4.75f, 19.5f)
                horizontalLineTo(19.25f)
                curveTo(19.9404f, 19.5f, 20.5f, 18.9404f, 20.5f, 18.25f)
                verticalLineTo(7.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(18.25f)
                close()
            }
        }
        .build()
        return _storeMicrosoft!!
    }

private var _storeMicrosoft: ImageVector? = null
