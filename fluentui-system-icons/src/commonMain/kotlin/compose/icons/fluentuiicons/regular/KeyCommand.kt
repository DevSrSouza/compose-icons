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

public val RegularGroup.KeyCommand: ImageVector
    get() {
        if (_keyCommand != null) {
            return _keyCommand!!
        }
        _keyCommand = Builder(name = "KeyCommand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.25f, 4.5f)
                curveTo(7.2165f, 4.5f, 8.0f, 5.2835f, 8.0f, 6.25f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 8.0f, 4.5f, 7.2165f, 4.5f, 6.25f)
                curveTo(4.5f, 5.2835f, 5.2835f, 4.5f, 6.25f, 4.5f)
                close()
                moveTo(9.5f, 8.0f)
                verticalLineTo(6.25f)
                curveTo(9.5f, 4.4551f, 8.0449f, 3.0f, 6.25f, 3.0f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                curveTo(3.0f, 8.0449f, 4.4551f, 9.5f, 6.25f, 9.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 14.5f, 3.0f, 15.9551f, 3.0f, 17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                curveTo(8.0449f, 21.0f, 9.5f, 19.5449f, 9.5f, 17.75f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(17.75f)
                curveTo(14.5f, 19.5449f, 15.9551f, 21.0f, 17.75f, 21.0f)
                curveTo(19.5449f, 21.0f, 21.0f, 19.5449f, 21.0f, 17.75f)
                curveTo(21.0f, 15.9551f, 19.5449f, 14.5f, 17.75f, 14.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 9.5f, 21.0f, 8.0449f, 21.0f, 6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                curveTo(15.9551f, 3.0f, 14.5f, 4.4551f, 14.5f, 6.25f)
                verticalLineTo(8.0f)
                horizontalLineTo(9.5f)
                close()
                moveTo(9.5f, 9.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(9.5f)
                close()
                moveTo(16.0f, 8.0f)
                verticalLineTo(6.25f)
                curveTo(16.0f, 5.2835f, 16.7835f, 4.5f, 17.75f, 4.5f)
                curveTo(18.7165f, 4.5f, 19.5f, 5.2835f, 19.5f, 6.25f)
                curveTo(19.5f, 7.2165f, 18.7165f, 8.0f, 17.75f, 8.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(16.0f, 16.0f)
                horizontalLineTo(17.75f)
                curveTo(18.7165f, 16.0f, 19.5f, 16.7835f, 19.5f, 17.75f)
                curveTo(19.5f, 18.7165f, 18.7165f, 19.5f, 17.75f, 19.5f)
                curveTo(16.7835f, 19.5f, 16.0f, 18.7165f, 16.0f, 17.75f)
                verticalLineTo(16.0f)
                close()
                moveTo(8.0f, 16.0f)
                verticalLineTo(17.75f)
                curveTo(8.0f, 18.7165f, 7.2165f, 19.5f, 6.25f, 19.5f)
                curveTo(5.2835f, 19.5f, 4.5f, 18.7165f, 4.5f, 17.75f)
                curveTo(4.5f, 16.7835f, 5.2835f, 16.0f, 6.25f, 16.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _keyCommand!!
    }

private var _keyCommand: ImageVector? = null
