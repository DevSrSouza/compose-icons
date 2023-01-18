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

public val RegularGroup.DrawerSubtract: ImageVector
    get() {
        if (_drawerSubtract != null) {
            return _drawerSubtract!!
        }
        _drawerSubtract = Builder(name = "DrawerSubtract", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.5f)
                curveTo(22.0f, 3.4624f, 19.5376f, 1.0f, 16.5f, 1.0f)
                curveTo(13.4624f, 1.0f, 11.0f, 3.4624f, 11.0f, 6.5f)
                curveTo(11.0f, 9.5376f, 13.4624f, 12.0f, 16.5f, 12.0f)
                curveTo(19.5376f, 12.0f, 22.0f, 9.5376f, 22.0f, 6.5f)
                close()
                moveTo(13.4956f, 7.0f)
                curveTo(13.2197f, 7.0f, 12.9961f, 6.7762f, 12.9961f, 6.5f)
                curveTo(12.9961f, 6.2239f, 13.2197f, 6.0f, 13.4956f, 6.0f)
                horizontalLineTo(19.4966f)
                curveTo(19.7725f, 6.0f, 19.9961f, 6.2239f, 19.9961f, 6.5f)
                curveTo(19.9961f, 6.7762f, 19.7725f, 7.0f, 19.4966f, 7.0f)
                horizontalLineTo(13.4956f)
                close()
                moveTo(21.0f, 11.1904f)
                curveTo(20.5557f, 11.6168f, 20.051f, 11.9806f, 19.5f, 12.2678f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.9423f)
                curveTo(14.56f, 14.0f, 14.25f, 14.31f, 14.25f, 14.6923f)
                verticalLineTo(14.75f)
                curveTo(14.25f, 15.9926f, 13.2426f, 17.0f, 12.0f, 17.0f)
                curveTo(10.7574f, 17.0f, 9.75f, 15.9926f, 9.75f, 14.75f)
                verticalLineTo(14.6923f)
                curveTo(9.75f, 14.31f, 9.44f, 14.0f, 9.0577f, 14.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(10.7322f)
                curveTo(10.4876f, 9.0307f, 10.2986f, 8.5278f, 10.1739f, 8.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(7.25f)
                curveTo(4.5f, 6.2835f, 5.2835f, 5.5f, 6.25f, 5.5f)
                horizontalLineTo(10.0764f)
                curveTo(10.1572f, 4.9768f, 10.3004f, 4.4742f, 10.4982f, 4.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 4.0f, 3.0f, 5.4551f, 3.0f, 7.25f)
                verticalLineTo(18.75f)
                curveTo(3.0f, 20.5449f, 4.4551f, 22.0f, 6.25f, 22.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 22.0f, 21.0f, 20.5449f, 21.0f, 18.75f)
                verticalLineTo(11.1904f)
                close()
                moveTo(19.5f, 15.5f)
                verticalLineTo(18.75f)
                curveTo(19.5f, 19.7165f, 18.7165f, 20.5f, 17.75f, 20.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 20.5f, 4.5f, 19.7165f, 4.5f, 18.75f)
                verticalLineTo(15.5f)
                horizontalLineTo(8.325f)
                curveTo(8.6725f, 17.2117f, 10.1858f, 18.5f, 12.0f, 18.5f)
                curveTo(13.8142f, 18.5f, 15.3275f, 17.2117f, 15.675f, 15.5f)
                horizontalLineTo(19.5f)
                close()
            }
        }
        .build()
        return _drawerSubtract!!
    }

private var _drawerSubtract: ImageVector? = null
