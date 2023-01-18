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

public val RegularGroup.PaddingRight: ImageVector
    get() {
        if (_paddingRight != null) {
            return _paddingRight!!
        }
        _paddingRight = Builder(name = "PaddingRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 4.5f)
                curveTo(3.1642f, 4.5f, 3.5f, 4.8358f, 3.5f, 5.25f)
                lineTo(3.5f, 18.25f)
                curveTo(3.5f, 18.6642f, 3.1642f, 19.0f, 2.75f, 19.0f)
                curveTo(2.3358f, 19.0f, 2.0f, 18.6642f, 2.0f, 18.25f)
                verticalLineTo(5.25f)
                curveTo(2.0f, 4.8358f, 2.3358f, 4.5f, 2.75f, 4.5f)
                close()
                moveTo(21.25f, 4.5f)
                curveTo(21.6642f, 4.5f, 22.0f, 4.8358f, 22.0f, 5.25f)
                verticalLineTo(6.1167f)
                curveTo(22.0f, 6.5309f, 21.6642f, 6.8667f, 21.25f, 6.8667f)
                curveTo(20.8358f, 6.8667f, 20.5f, 6.5309f, 20.5f, 6.1167f)
                verticalLineTo(5.25f)
                curveTo(20.5f, 4.8358f, 20.8358f, 4.5f, 21.25f, 4.5f)
                close()
                moveTo(21.25f, 7.9667f)
                curveTo(21.6642f, 7.9667f, 22.0f, 8.3025f, 22.0f, 8.7167f)
                verticalLineTo(10.45f)
                curveTo(22.0f, 10.8642f, 21.6642f, 11.2f, 21.25f, 11.2f)
                curveTo(20.8358f, 11.2f, 20.5f, 10.8642f, 20.5f, 10.45f)
                verticalLineTo(8.7167f)
                curveTo(20.5f, 8.3025f, 20.8358f, 7.9667f, 21.25f, 7.9667f)
                close()
                moveTo(21.25f, 12.3f)
                curveTo(21.6642f, 12.3f, 22.0f, 12.6358f, 22.0f, 13.05f)
                verticalLineTo(14.7833f)
                curveTo(22.0f, 15.1975f, 21.6642f, 15.5333f, 21.25f, 15.5333f)
                curveTo(20.8358f, 15.5333f, 20.5f, 15.1975f, 20.5f, 14.7833f)
                verticalLineTo(13.05f)
                curveTo(20.5f, 12.6358f, 20.8358f, 12.3f, 21.25f, 12.3f)
                close()
                moveTo(21.25f, 16.6333f)
                curveTo(21.6642f, 16.6333f, 22.0f, 16.9691f, 22.0f, 17.3833f)
                verticalLineTo(18.25f)
                curveTo(22.0f, 18.6642f, 21.6642f, 19.0f, 21.25f, 19.0f)
                curveTo(20.8358f, 19.0f, 20.5f, 18.6642f, 20.5f, 18.25f)
                verticalLineTo(17.3833f)
                curveTo(20.5f, 16.9691f, 20.8358f, 16.6333f, 21.25f, 16.6333f)
                close()
                moveTo(18.7803f, 12.2803f)
                curveTo(19.0732f, 11.9874f, 19.0732f, 11.5126f, 18.7803f, 11.2197f)
                lineTo(13.7803f, 6.2197f)
                curveTo(13.4874f, 5.9268f, 13.0126f, 5.9268f, 12.7197f, 6.2197f)
                curveTo(12.4268f, 6.5126f, 12.4268f, 6.9874f, 12.7197f, 7.2803f)
                lineTo(16.4393f, 11.0f)
                lineTo(5.75f, 11.0f)
                curveTo(5.3358f, 11.0f, 5.0f, 11.3358f, 5.0f, 11.75f)
                curveTo(5.0f, 12.1642f, 5.3358f, 12.5f, 5.75f, 12.5f)
                lineTo(16.4393f, 12.5f)
                lineTo(12.7197f, 16.2197f)
                curveTo(12.4268f, 16.5126f, 12.4268f, 16.9874f, 12.7197f, 17.2803f)
                curveTo(13.0126f, 17.5732f, 13.4874f, 17.5732f, 13.7803f, 17.2803f)
                lineTo(18.7803f, 12.2803f)
                close()
            }
        }
        .build()
        return _paddingRight!!
    }

private var _paddingRight: ImageVector? = null
