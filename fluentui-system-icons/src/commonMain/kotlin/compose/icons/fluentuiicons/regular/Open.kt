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

public val RegularGroup.Open: ImageVector
    get() {
        if (_open != null) {
            return _open!!
        }
        _open = Builder(name = "Open", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.2499f, 4.5f)
                curveTo(5.2834f, 4.5f, 4.5f, 5.2835f, 4.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.7165f, 5.2834f, 19.5f, 6.2499f, 19.5f)
                horizontalLineTo(17.7496f)
                curveTo(18.7161f, 19.5f, 19.4996f, 18.7165f, 19.4996f, 17.75f)
                verticalLineTo(13.75f)
                curveTo(19.4996f, 13.3358f, 19.8354f, 13.0f, 20.2496f, 13.0f)
                curveTo(20.6638f, 13.0f, 20.9995f, 13.3358f, 20.9995f, 13.75f)
                verticalLineTo(17.75f)
                curveTo(20.9995f, 19.5449f, 19.5445f, 21.0f, 17.7496f, 21.0f)
                horizontalLineTo(6.2499f)
                curveTo(4.455f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.4551f, 4.455f, 3.0f, 6.2499f, 3.0f)
                horizontalLineTo(10.2498f)
                curveTo(10.664f, 3.0f, 10.9998f, 3.3358f, 10.9998f, 3.75f)
                curveTo(10.9998f, 4.1642f, 10.664f, 4.5f, 10.2498f, 4.5f)
                horizontalLineTo(6.2499f)
                close()
                moveTo(12.9997f, 3.75f)
                curveTo(12.9997f, 3.3358f, 13.3355f, 3.0f, 13.7497f, 3.0f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 3.0f, 21.0f, 3.3358f, 21.0f, 3.75f)
                verticalLineTo(10.25f)
                curveTo(21.0f, 10.6642f, 20.6642f, 11.0f, 20.25f, 11.0f)
                curveTo(19.8358f, 11.0f, 19.5f, 10.6642f, 19.5f, 10.25f)
                verticalLineTo(5.5607f)
                lineTo(14.28f, 10.7804f)
                curveTo(13.9871f, 11.0732f, 13.5123f, 11.0732f, 13.2194f, 10.7803f)
                curveTo(12.9265f, 10.4874f, 12.9265f, 10.0125f, 13.2194f, 9.7196f)
                lineTo(18.4395f, 4.5f)
                horizontalLineTo(13.7497f)
                curveTo(13.3355f, 4.5f, 12.9997f, 4.1642f, 12.9997f, 3.75f)
                close()
            }
        }
        .build()
        return _open!!
    }

private var _open: ImageVector? = null
