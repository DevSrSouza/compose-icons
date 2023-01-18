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

public val RegularGroup.ArrowParagraph: ImageVector
    get() {
        if (_arrowParagraph != null) {
            return _arrowParagraph!!
        }
        _arrowParagraph = Builder(name = "ArrowParagraph", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.25f, 2.0f)
                curveTo(21.6642f, 2.0f, 22.0f, 2.3358f, 22.0f, 2.75f)
                verticalLineTo(6.75f)
                curveTo(22.0f, 8.2688f, 20.7688f, 9.5f, 19.25f, 9.5f)
                horizontalLineTo(13.5607f)
                lineTo(16.2803f, 12.2197f)
                curveTo(16.5732f, 12.5126f, 16.5732f, 12.9874f, 16.2803f, 13.2803f)
                curveTo(15.9874f, 13.5732f, 15.5126f, 13.5732f, 15.2197f, 13.2803f)
                lineTo(11.2197f, 9.2803f)
                curveTo(10.9268f, 8.9874f, 10.9268f, 8.5126f, 11.2197f, 8.2197f)
                lineTo(15.2197f, 4.2197f)
                curveTo(15.5126f, 3.9268f, 15.9874f, 3.9268f, 16.2803f, 4.2197f)
                curveTo(16.5732f, 4.5126f, 16.5732f, 4.9874f, 16.2803f, 5.2803f)
                lineTo(13.5607f, 8.0f)
                horizontalLineTo(19.25f)
                curveTo(19.9404f, 8.0f, 20.5f, 7.4404f, 20.5f, 6.75f)
                verticalLineTo(2.75f)
                curveTo(20.5f, 2.3358f, 20.8358f, 2.0f, 21.25f, 2.0f)
                close()
                moveTo(7.7197f, 11.2197f)
                curveTo(7.4268f, 11.5126f, 7.4268f, 11.9874f, 7.7197f, 12.2803f)
                lineTo(10.4393f, 15.0f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 15.0f, 2.0f, 15.3358f, 2.0f, 15.75f)
                curveTo(2.0f, 16.1642f, 2.3358f, 16.5f, 2.75f, 16.5f)
                horizontalLineTo(10.4393f)
                lineTo(7.7197f, 19.2197f)
                curveTo(7.4268f, 19.5126f, 7.4268f, 19.9874f, 7.7197f, 20.2803f)
                curveTo(8.0126f, 20.5732f, 8.4874f, 20.5732f, 8.7803f, 20.2803f)
                lineTo(12.7803f, 16.2803f)
                curveTo(13.0732f, 15.9874f, 13.0732f, 15.5126f, 12.7803f, 15.2197f)
                lineTo(8.7803f, 11.2197f)
                curveTo(8.4874f, 10.9268f, 8.0126f, 10.9268f, 7.7197f, 11.2197f)
                close()
            }
        }
        .build()
        return _arrowParagraph!!
    }

private var _arrowParagraph: ImageVector? = null
