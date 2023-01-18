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

public val FilledGroup.BuildingBank: ImageVector
    get() {
        if (_buildingBank != null) {
            return _buildingBank!!
        }
        _buildingBank = Builder(name = "BuildingBank", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9684f, 2.3247f)
                curveTo(11.583f, 1.8762f, 12.417f, 1.8762f, 13.0316f, 2.3247f)
                lineTo(20.4534f, 7.7406f)
                curveTo(21.4299f, 8.4531f, 20.9268f, 9.9984f, 19.7189f, 10.0003f)
                horizontalLineTo(4.2811f)
                curveTo(3.0732f, 9.9984f, 2.5701f, 8.4531f, 3.5466f, 7.7406f)
                lineTo(10.9684f, 2.3247f)
                close()
                moveTo(13.0f, 6.2503f)
                curveTo(13.0f, 5.6981f, 12.5523f, 5.2503f, 12.0f, 5.2503f)
                curveTo(11.4477f, 5.2503f, 11.0f, 5.6981f, 11.0f, 6.2503f)
                curveTo(11.0f, 6.8026f, 11.4477f, 7.2503f, 12.0f, 7.2503f)
                curveTo(12.5523f, 7.2503f, 13.0f, 6.8026f, 13.0f, 6.2503f)
                close()
                moveTo(11.25f, 16.0003f)
                horizontalLineTo(9.25f)
                verticalLineTo(11.0003f)
                horizontalLineTo(11.25f)
                verticalLineTo(16.0003f)
                close()
                moveTo(14.75f, 16.0003f)
                horizontalLineTo(12.75f)
                verticalLineTo(11.0003f)
                horizontalLineTo(14.75f)
                verticalLineTo(16.0003f)
                close()
                moveTo(18.5f, 16.0003f)
                horizontalLineTo(16.25f)
                verticalLineTo(11.0003f)
                horizontalLineTo(18.5f)
                verticalLineTo(16.0003f)
                close()
                moveTo(18.75f, 17.0003f)
                horizontalLineTo(5.25f)
                curveTo(4.0074f, 17.0003f, 3.0f, 18.0077f, 3.0f, 19.2503f)
                verticalLineTo(19.7503f)
                curveTo(3.0f, 20.1645f, 3.3358f, 20.5003f, 3.75f, 20.5003f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 20.5003f, 21.0f, 20.1645f, 21.0f, 19.7503f)
                verticalLineTo(19.2503f)
                curveTo(21.0f, 18.0077f, 19.9926f, 17.0003f, 18.75f, 17.0003f)
                close()
                moveTo(7.75f, 16.0003f)
                horizontalLineTo(5.5f)
                verticalLineTo(11.0003f)
                horizontalLineTo(7.75f)
                verticalLineTo(16.0003f)
                close()
            }
        }
        .build()
        return _buildingBank!!
    }

private var _buildingBank: ImageVector? = null
