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

public val FilledGroup.StoreMicrosoft: ImageVector
    get() {
        if (_storeMicrosoft != null) {
            return _storeMicrosoft!!
        }
        _storeMicrosoft = Builder(name = "StoreMicrosoft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.75f)
                verticalLineTo(6.0f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 6.0f, 2.0f, 6.3358f, 2.0f, 6.75f)
                verticalLineTo(18.25f)
                curveTo(2.0f, 19.7688f, 3.2312f, 21.0f, 4.75f, 21.0f)
                horizontalLineTo(19.25f)
                curveTo(20.7688f, 21.0f, 22.0f, 19.7688f, 22.0f, 18.25f)
                verticalLineTo(6.75f)
                curveTo(22.0f, 6.3358f, 21.6642f, 6.0f, 21.25f, 6.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.75f)
                curveTo(16.0f, 2.7835f, 15.2165f, 2.0f, 14.25f, 2.0f)
                horizontalLineTo(9.75f)
                curveTo(8.7835f, 2.0f, 8.0f, 2.7835f, 8.0f, 3.75f)
                close()
                moveTo(9.75f, 3.5f)
                horizontalLineTo(14.25f)
                curveTo(14.3881f, 3.5f, 14.5f, 3.6119f, 14.5f, 3.75f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(3.75f)
                curveTo(9.5f, 3.6119f, 9.6119f, 3.5f, 9.75f, 3.5f)
                close()
                moveTo(8.0f, 13.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(11.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(8.0f, 17.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(17.5f)
                horizontalLineTo(8.0f)
                close()
                moveTo(16.0f, 13.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(12.5f, 17.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.5f)
                horizontalLineTo(12.5f)
                close()
            }
        }
        .build()
        return _storeMicrosoft!!
    }

private var _storeMicrosoft: ImageVector? = null
