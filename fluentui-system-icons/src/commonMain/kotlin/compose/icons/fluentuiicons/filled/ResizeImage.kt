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

public val FilledGroup.ResizeImage: ImageVector
    get() {
        if (_resizeImage != null) {
            return _resizeImage!!
        }
        _resizeImage = Builder(name = "ResizeImage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 3.0f)
                curveTo(11.0f, 2.4477f, 10.5523f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 2.0f, 2.0f, 3.4551f, 2.0f, 5.25f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 10.5523f, 2.4477f, 11.0f, 3.0f, 11.0f)
                curveTo(3.5523f, 11.0f, 4.0f, 10.5523f, 4.0f, 10.0f)
                verticalLineTo(5.25f)
                curveTo(4.0f, 4.5596f, 4.5596f, 4.0f, 5.25f, 4.0f)
                horizontalLineTo(10.0f)
                curveTo(10.5523f, 4.0f, 11.0f, 3.5523f, 11.0f, 3.0f)
                close()
                moveTo(14.0f, 2.0f)
                curveTo(13.4477f, 2.0f, 13.0f, 2.4477f, 13.0f, 3.0f)
                curveTo(13.0f, 3.5523f, 13.4477f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(18.75f)
                curveTo(19.4404f, 4.0f, 20.0f, 4.5596f, 20.0f, 5.25f)
                verticalLineTo(10.0f)
                curveTo(20.0f, 10.5523f, 20.4477f, 11.0f, 21.0f, 11.0f)
                curveTo(21.5523f, 11.0f, 22.0f, 10.5523f, 22.0f, 10.0f)
                verticalLineTo(5.25f)
                curveTo(22.0f, 3.4551f, 20.5449f, 2.0f, 18.75f, 2.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(14.0f, 22.0f)
                curveTo(13.4477f, 22.0f, 13.0f, 21.5523f, 13.0f, 21.0f)
                curveTo(13.0f, 20.4477f, 13.4477f, 20.0f, 14.0f, 20.0f)
                horizontalLineTo(18.75f)
                curveTo(19.4404f, 20.0f, 20.0f, 19.4404f, 20.0f, 18.75f)
                verticalLineTo(14.0f)
                curveTo(20.0f, 13.4477f, 20.4477f, 13.0f, 21.0f, 13.0f)
                curveTo(21.5523f, 13.0f, 22.0f, 13.4477f, 22.0f, 14.0f)
                verticalLineTo(18.75f)
                curveTo(22.0f, 20.5449f, 20.5449f, 22.0f, 18.75f, 22.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveTo(2.3431f, 12.0f, 1.0f, 13.3431f, 1.0f, 15.0f)
                verticalLineTo(20.0f)
                curveTo(1.0f, 20.5564f, 1.1515f, 21.0773f, 1.4154f, 21.524f)
                lineTo(4.909f, 18.0303f)
                curveTo(5.7877f, 17.1516f, 7.2123f, 17.1517f, 8.091f, 18.0303f)
                lineTo(11.5846f, 21.524f)
                curveTo(11.8486f, 21.0773f, 12.0f, 20.5564f, 12.0f, 20.0f)
                verticalLineTo(15.0f)
                curveTo(12.0f, 13.3431f, 10.6569f, 12.0f, 9.0f, 12.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(4.0f, 23.0f)
                curveTo(3.4436f, 23.0f, 2.9227f, 22.8486f, 2.476f, 22.5846f)
                lineTo(5.9697f, 19.091f)
                curveTo(6.2626f, 18.7981f, 6.7374f, 18.7981f, 7.0303f, 19.091f)
                lineTo(10.524f, 22.5846f)
                curveTo(10.0773f, 22.8486f, 9.5564f, 23.0f, 9.0f, 23.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(9.0f, 16.0f)
                curveTo(8.4477f, 16.0f, 8.0f, 15.5523f, 8.0f, 15.0f)
                curveTo(8.0f, 14.4477f, 8.4477f, 14.0f, 9.0f, 14.0f)
                curveTo(9.5523f, 14.0f, 10.0f, 14.4477f, 10.0f, 15.0f)
                curveTo(10.0f, 15.5523f, 9.5523f, 16.0f, 9.0f, 16.0f)
                close()
            }
        }
        .build()
        return _resizeImage!!
    }

private var _resizeImage: ImageVector? = null
