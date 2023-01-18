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

public val RegularGroup.Compose: ImageVector
    get() {
        if (_compose != null) {
            return _compose!!
        }
        _compose = Builder(name = "Compose", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7803f, 3.2803f)
                curveTo(22.0732f, 2.9874f, 22.0732f, 2.5126f, 21.7803f, 2.2197f)
                curveTo(21.4874f, 1.9268f, 21.0125f, 1.9268f, 20.7196f, 2.2197f)
                lineTo(10.7197f, 12.2197f)
                lineTo(10.25f, 13.75f)
                lineTo(11.7803f, 13.2803f)
                lineTo(21.7803f, 3.2803f)
                close()
                moveTo(6.25f, 3.0f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 21.0f, 21.0f, 19.5449f, 21.0f, 17.75f)
                verticalLineTo(9.75f)
                curveTo(21.0f, 9.3358f, 20.6642f, 9.0f, 20.25f, 9.0f)
                curveTo(19.8358f, 9.0f, 19.5f, 9.3358f, 19.5f, 9.75f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.7165f, 18.7165f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 19.5f, 4.5f, 18.7165f, 4.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.2835f, 5.2835f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(14.25f)
                curveTo(14.6642f, 4.5f, 15.0f, 4.1642f, 15.0f, 3.75f)
                curveTo(15.0f, 3.3358f, 14.6642f, 3.0f, 14.25f, 3.0f)
                horizontalLineTo(6.25f)
                close()
            }
        }
        .build()
        return _compose!!
    }

private var _compose: ImageVector? = null
