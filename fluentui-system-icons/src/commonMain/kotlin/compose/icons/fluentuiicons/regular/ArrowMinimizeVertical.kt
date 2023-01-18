package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ArrowMinimizeVertical: ImageVector
    get() {
        if (_arrowMinimizeVertical != null) {
            return _arrowMinimizeVertical!!
        }
        _arrowMinimizeVertical = Builder(name = "ArrowMinimizeVertical", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.75f, 2.0f)
                curveTo(12.1642f, 2.0f, 12.5f, 2.3358f, 12.5f, 2.75f)
                verticalLineTo(6.9393f)
                lineTo(13.7197f, 5.7197f)
                curveTo(14.0126f, 5.4268f, 14.4874f, 5.4268f, 14.7803f, 5.7197f)
                curveTo(15.0732f, 6.0126f, 15.0732f, 6.4874f, 14.7803f, 6.7803f)
                lineTo(12.2803f, 9.2803f)
                curveTo(11.9874f, 9.5732f, 11.5126f, 9.5732f, 11.2197f, 9.2803f)
                lineTo(8.7197f, 6.7803f)
                curveTo(8.4268f, 6.4874f, 8.4268f, 6.0126f, 8.7197f, 5.7197f)
                curveTo(9.0126f, 5.4268f, 9.4874f, 5.4268f, 9.7803f, 5.7197f)
                lineTo(11.0f, 6.9393f)
                verticalLineTo(2.75f)
                curveTo(11.0f, 2.3358f, 11.3358f, 2.0f, 11.75f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 11.75f)
                curveTo(4.0f, 11.3358f, 4.3358f, 11.0f, 4.75f, 11.0f)
                horizontalLineTo(19.25f)
                curveTo(19.6642f, 11.0f, 20.0f, 11.3358f, 20.0f, 11.75f)
                curveTo(20.0f, 12.1642f, 19.6642f, 12.5f, 19.25f, 12.5f)
                horizontalLineTo(4.75f)
                curveTo(4.3358f, 12.5f, 4.0f, 12.1642f, 4.0f, 11.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7197f, 17.7803f)
                curveTo(14.0126f, 18.0732f, 14.4874f, 18.0732f, 14.7803f, 17.7803f)
                curveTo(15.0732f, 17.4874f, 15.0732f, 17.0126f, 14.7803f, 16.7197f)
                lineTo(12.2803f, 14.2197f)
                curveTo(11.9874f, 13.9268f, 11.5126f, 13.9268f, 11.2197f, 14.2197f)
                lineTo(8.7197f, 16.7197f)
                curveTo(8.4268f, 17.0126f, 8.4268f, 17.4874f, 8.7197f, 17.7803f)
                curveTo(9.0126f, 18.0732f, 9.4874f, 18.0732f, 9.7803f, 17.7803f)
                lineTo(11.0f, 16.5607f)
                lineTo(11.0f, 21.25f)
                curveTo(11.0f, 21.6642f, 11.3358f, 22.0f, 11.75f, 22.0f)
                curveTo(12.1642f, 22.0f, 12.5f, 21.6642f, 12.5f, 21.25f)
                verticalLineTo(16.5607f)
                lineTo(13.7197f, 17.7803f)
                close()
            }
        }
        .build()
        return _arrowMinimizeVertical!!
    }

private var _arrowMinimizeVertical: ImageVector? = null
