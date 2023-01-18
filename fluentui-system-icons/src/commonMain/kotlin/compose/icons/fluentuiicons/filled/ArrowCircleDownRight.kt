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

public val FilledGroup.ArrowCircleDownRight: ImageVector
    get() {
        if (_arrowCircleDownRight != null) {
            return _arrowCircleDownRight!!
        }
        _arrowCircleDownRight = Builder(name = "ArrowCircleDownRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(14.5f, 8.75f)
                curveTo(14.5f, 8.3358f, 14.8358f, 8.0f, 15.25f, 8.0f)
                curveTo(15.6642f, 8.0f, 16.0f, 8.3358f, 16.0f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(16.0f, 15.6642f, 15.6642f, 16.0f, 15.25f, 16.0f)
                horizontalLineTo(8.75f)
                curveTo(8.3358f, 16.0f, 8.0f, 15.6642f, 8.0f, 15.25f)
                curveTo(8.0f, 14.8358f, 8.3358f, 14.5f, 8.75f, 14.5f)
                horizontalLineTo(13.4904f)
                lineTo(8.2223f, 9.2829f)
                curveTo(7.9279f, 8.9914f, 7.9256f, 8.5166f, 8.2171f, 8.2223f)
                curveTo(8.5086f, 7.9279f, 8.9834f, 7.9256f, 9.2777f, 8.2171f)
                lineTo(14.5f, 13.3888f)
                verticalLineTo(8.75f)
                close()
            }
        }
        .build()
        return _arrowCircleDownRight!!
    }

private var _arrowCircleDownRight: ImageVector? = null
