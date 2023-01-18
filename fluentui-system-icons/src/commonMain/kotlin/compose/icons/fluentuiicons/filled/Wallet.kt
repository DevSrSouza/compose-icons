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

public val FilledGroup.Wallet: ImageVector
    get() {
        if (_wallet != null) {
            return _wallet!!
        }
        _wallet = Builder(name = "Wallet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.0f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(18.25f)
                curveTo(20.0449f, 21.0f, 21.5f, 19.5449f, 21.5f, 17.75f)
                verticalLineTo(9.25f)
                curveTo(21.5f, 7.7132f, 20.4333f, 6.4255f, 19.0f, 6.087f)
                verticalLineTo(5.25f)
                curveTo(19.0f, 4.0074f, 17.9926f, 3.0f, 16.75f, 3.0f)
                horizontalLineTo(5.25f)
                curveTo(4.0919f, 3.0f, 3.1381f, 3.875f, 3.0137f, 5.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(5.25f, 6.0f)
                curveTo(4.8358f, 6.0f, 4.5f, 5.6642f, 4.5f, 5.25f)
                curveTo(4.5f, 4.8358f, 4.8358f, 4.5f, 5.25f, 4.5f)
                horizontalLineTo(16.75f)
                curveTo(17.1642f, 4.5f, 17.5f, 4.8358f, 17.5f, 5.25f)
                verticalLineTo(6.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(16.25f, 13.0f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 13.0f, 19.0f, 13.3358f, 19.0f, 13.75f)
                curveTo(19.0f, 14.1642f, 18.6642f, 14.5f, 18.25f, 14.5f)
                horizontalLineTo(16.25f)
                curveTo(15.8358f, 14.5f, 15.5f, 14.1642f, 15.5f, 13.75f)
                curveTo(15.5f, 13.3358f, 15.8358f, 13.0f, 16.25f, 13.0f)
                close()
            }
        }
        .build()
        return _wallet!!
    }

private var _wallet: ImageVector? = null
