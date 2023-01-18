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

public val FilledGroup.BookLetter: ImageVector
    get() {
        if (_bookLetter != null) {
            return _bookLetter!!
        }
        _bookLetter = Builder(name = "BookLetter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 8.7427f)
                lineTo(13.6202f, 11.5f)
                horizontalLineTo(11.3799f)
                lineTo(12.5f, 8.7427f)
                close()
                moveTo(4.0f, 4.5f)
                verticalLineTo(19.5f)
                curveTo(4.0f, 20.8807f, 5.1193f, 22.0f, 6.5f, 22.0f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 22.0f, 20.5f, 21.6642f, 20.5f, 21.25f)
                curveTo(20.5f, 20.8358f, 20.1642f, 20.5f, 19.75f, 20.5f)
                horizontalLineTo(6.5f)
                curveTo(5.9477f, 20.5f, 5.5f, 20.0523f, 5.5f, 19.5f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 19.5f, 20.5f, 19.1642f, 20.5f, 18.75f)
                verticalLineTo(4.5f)
                curveTo(20.5f, 3.1193f, 19.3807f, 2.0f, 18.0f, 2.0f)
                horizontalLineTo(6.5f)
                curveTo(5.1193f, 2.0f, 4.0f, 3.1193f, 4.0f, 4.5f)
                close()
                moveTo(12.5f, 6.0f)
                curveTo(12.8052f, 6.0f, 13.08f, 6.1849f, 13.1949f, 6.4677f)
                lineTo(16.4449f, 14.4677f)
                curveTo(16.6008f, 14.8515f, 16.4161f, 15.2889f, 16.0323f, 15.4448f)
                curveTo(15.6485f, 15.6007f, 15.2111f, 15.416f, 15.0552f, 15.0323f)
                lineTo(14.2296f, 13.0f)
                horizontalLineTo(10.7705f)
                lineTo(9.9449f, 15.0323f)
                curveTo(9.789f, 15.416f, 9.3515f, 15.6007f, 8.9677f, 15.4448f)
                curveTo(8.584f, 15.2889f, 8.3993f, 14.8515f, 8.5552f, 14.4677f)
                lineTo(11.8052f, 6.4677f)
                curveTo(11.92f, 6.1849f, 12.1948f, 6.0f, 12.5f, 6.0f)
                close()
            }
        }
        .build()
        return _bookLetter!!
    }

private var _bookLetter: ImageVector? = null
