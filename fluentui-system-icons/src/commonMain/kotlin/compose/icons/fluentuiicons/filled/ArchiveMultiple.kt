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

public val FilledGroup.ArchiveMultiple: ImageVector
    get() {
        if (_archiveMultiple != null) {
            return _archiveMultiple!!
        }
        _archiveMultiple = Builder(name = "ArchiveMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.75f, 2.0f)
                curveTo(3.7835f, 2.0f, 3.0f, 2.7835f, 3.0f, 3.75f)
                verticalLineTo(5.25f)
                curveTo(3.0f, 6.2165f, 3.7835f, 7.0f, 4.75f, 7.0f)
                horizontalLineTo(18.25f)
                curveTo(19.2165f, 7.0f, 20.0f, 6.2165f, 20.0f, 5.25f)
                verticalLineTo(3.75f)
                curveTo(20.0f, 2.7835f, 19.2165f, 2.0f, 18.25f, 2.0f)
                horizontalLineTo(4.75f)
                close()
                moveTo(19.0f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.75f)
                curveTo(4.0f, 17.8211f, 5.6789f, 19.5f, 7.75f, 19.5f)
                horizontalLineTo(15.25f)
                curveTo(17.3211f, 19.5f, 19.0f, 17.8211f, 19.0f, 15.75f)
                verticalLineTo(8.0f)
                close()
                moveTo(9.0f, 11.25f)
                curveTo(9.0f, 10.8358f, 9.3358f, 10.5f, 9.75f, 10.5f)
                horizontalLineTo(13.2272f)
                curveTo(13.6414f, 10.5f, 13.9772f, 10.8358f, 13.9772f, 11.25f)
                curveTo(13.9772f, 11.6642f, 13.6414f, 12.0f, 13.2272f, 12.0f)
                horizontalLineTo(9.75f)
                curveTo(9.3358f, 12.0f, 9.0f, 11.6642f, 9.0f, 11.25f)
                close()
                moveTo(21.5003f, 11.75f)
                curveTo(21.5003f, 10.5232f, 20.9111f, 9.4339f, 20.0003f, 8.7498f)
                verticalLineTo(16.25f)
                curveTo(20.0003f, 18.5973f, 18.0975f, 20.5f, 15.7503f, 20.5f)
                horizontalLineTo(10.2503f)
                lineTo(10.243f, 20.5f)
                horizontalLineTo(7.25f)
                curveTo(7.9342f, 21.4109f, 9.0234f, 22.0f, 10.2503f, 22.0f)
                horizontalLineTo(15.7503f)
                curveTo(18.9259f, 22.0f, 21.5003f, 19.4257f, 21.5003f, 16.25f)
                verticalLineTo(11.75f)
                close()
            }
        }
        .build()
        return _archiveMultiple!!
    }

private var _archiveMultiple: ImageVector? = null
