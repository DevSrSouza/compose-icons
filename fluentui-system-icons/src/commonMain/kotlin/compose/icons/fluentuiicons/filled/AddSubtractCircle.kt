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

public val FilledGroup.AddSubtractCircle: ImageVector
    get() {
        if (_addSubtractCircle != null) {
            return _addSubtractCircle!!
        }
        _addSubtractCircle = Builder(name = "AddSubtractCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.75f, 14.5f)
                curveTo(13.3358f, 14.5f, 13.0f, 14.8358f, 13.0f, 15.25f)
                curveTo(13.0f, 15.6642f, 13.3358f, 16.0f, 13.75f, 16.0f)
                horizontalLineTo(17.25f)
                curveTo(17.6642f, 16.0f, 18.0f, 15.6642f, 18.0f, 15.25f)
                curveTo(18.0f, 14.8358f, 17.6642f, 14.5f, 17.25f, 14.5f)
                horizontalLineTo(13.75f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(18.5174f, 6.5432f)
                curveTo(19.7549f, 8.0197f, 20.5f, 9.9228f, 20.5f, 12.0f)
                curveTo(20.5f, 16.6944f, 16.6944f, 20.5f, 12.0f, 20.5f)
                curveTo(9.9228f, 20.5f, 8.0197f, 19.7549f, 6.5432f, 18.5174f)
                lineTo(18.5174f, 6.5432f)
                close()
                moveTo(6.0f, 8.75f)
                curveTo(6.0f, 8.3358f, 6.3358f, 8.0f, 6.75f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.75f)
                curveTo(8.0f, 6.3358f, 8.3358f, 6.0f, 8.75f, 6.0f)
                curveTo(9.1642f, 6.0f, 9.5f, 6.3358f, 9.5f, 6.75f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.75f)
                curveTo(11.1642f, 8.0f, 11.5f, 8.3358f, 11.5f, 8.75f)
                curveTo(11.5f, 9.1642f, 11.1642f, 9.5f, 10.75f, 9.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(10.75f)
                curveTo(9.5f, 11.1642f, 9.1642f, 11.5f, 8.75f, 11.5f)
                curveTo(8.3358f, 11.5f, 8.0f, 11.1642f, 8.0f, 10.75f)
                verticalLineTo(9.5f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 9.5f, 6.0f, 9.1642f, 6.0f, 8.75f)
                close()
            }
        }
        .build()
        return _addSubtractCircle!!
    }

private var _addSubtractCircle: ImageVector? = null
