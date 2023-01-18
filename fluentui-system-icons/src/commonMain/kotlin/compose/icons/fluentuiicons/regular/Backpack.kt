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

public val RegularGroup.Backpack: ImageVector
    get() {
        if (_backpack != null) {
            return _backpack!!
        }
        _backpack = Builder(name = "Backpack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.4167f, 8.0f)
                curveTo(9.082f, 8.0f, 8.0f, 9.082f, 8.0f, 10.4167f)
                curveTo(8.0f, 11.2911f, 8.7089f, 12.0f, 9.5833f, 12.0f)
                horizontalLineTo(14.4167f)
                curveTo(15.2911f, 12.0f, 16.0f, 11.2911f, 16.0f, 10.4167f)
                curveTo(16.0f, 9.082f, 14.918f, 8.0f, 13.5833f, 8.0f)
                horizontalLineTo(10.4167f)
                close()
                moveTo(9.5f, 10.4167f)
                curveTo(9.5f, 9.9104f, 9.9104f, 9.5f, 10.4167f, 9.5f)
                horizontalLineTo(13.5833f)
                curveTo(14.0896f, 9.5f, 14.5f, 9.9104f, 14.5f, 10.4167f)
                curveTo(14.5f, 10.4627f, 14.4627f, 10.5f, 14.4167f, 10.5f)
                horizontalLineTo(9.5833f)
                curveTo(9.5373f, 10.5f, 9.5f, 10.4627f, 9.5f, 10.4167f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(10.0387f, 2.0f, 8.4291f, 3.5057f, 8.264f, 5.4241f)
                curveTo(5.7279f, 6.7659f, 4.0f, 9.4312f, 4.0f, 12.5f)
                verticalLineTo(18.75f)
                curveTo(4.0f, 20.5449f, 5.4551f, 22.0f, 7.25f, 22.0f)
                horizontalLineTo(16.75f)
                curveTo(18.5449f, 22.0f, 20.0f, 20.5449f, 20.0f, 18.75f)
                verticalLineTo(12.5f)
                curveTo(20.0f, 9.4312f, 18.2721f, 6.7659f, 15.736f, 5.4241f)
                curveTo(15.5709f, 3.5057f, 13.9613f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(18.5f, 14.0f)
                horizontalLineTo(5.5f)
                verticalLineTo(12.5f)
                curveTo(5.5f, 8.9101f, 8.4101f, 6.0f, 12.0f, 6.0f)
                curveTo(15.5899f, 6.0f, 18.5f, 8.9101f, 18.5f, 12.5f)
                verticalLineTo(14.0f)
                close()
                moveTo(8.0f, 17.25f)
                curveTo(8.0f, 17.6642f, 8.3358f, 18.0f, 8.75f, 18.0f)
                curveTo(9.1642f, 18.0f, 9.5f, 17.6642f, 9.5f, 17.25f)
                verticalLineTo(15.7143f)
                horizontalLineTo(18.5f)
                verticalLineTo(18.75f)
                curveTo(18.5f, 19.7165f, 17.7165f, 20.5f, 16.75f, 20.5f)
                horizontalLineTo(7.25f)
                curveTo(6.2835f, 20.5f, 5.5f, 19.7165f, 5.5f, 18.75f)
                verticalLineTo(15.7143f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.25f)
                close()
                moveTo(12.0f, 4.5f)
                curveTo(11.3023f, 4.5f, 10.6255f, 4.5893f, 9.9804f, 4.7571f)
                curveTo(10.3472f, 4.0124f, 11.1137f, 3.5f, 12.0f, 3.5f)
                curveTo(12.8863f, 3.5f, 13.6528f, 4.0124f, 14.0196f, 4.7571f)
                curveTo(13.3745f, 4.5893f, 12.6977f, 4.5f, 12.0f, 4.5f)
                close()
            }
        }
        .build()
        return _backpack!!
    }

private var _backpack: ImageVector? = null
