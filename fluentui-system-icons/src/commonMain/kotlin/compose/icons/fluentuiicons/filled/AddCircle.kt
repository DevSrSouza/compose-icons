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

public val FilledGroup.AddCircle: ImageVector
    get() {
        if (_addCircle != null) {
            return _addCircle!!
        }
        _addCircle = Builder(name = "AddCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(11.6203f, 7.0f, 11.3065f, 7.2821f, 11.2568f, 7.6482f)
                lineTo(11.25f, 7.75f)
                verticalLineTo(11.25f)
                horizontalLineTo(7.75f)
                curveTo(7.3358f, 11.25f, 7.0f, 11.5858f, 7.0f, 12.0f)
                curveTo(7.0f, 12.3797f, 7.2821f, 12.6935f, 7.6482f, 12.7432f)
                lineTo(7.75f, 12.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(16.25f)
                curveTo(11.25f, 16.6642f, 11.5858f, 17.0f, 12.0f, 17.0f)
                curveTo(12.3797f, 17.0f, 12.6935f, 16.7178f, 12.7432f, 16.3518f)
                lineTo(12.75f, 16.25f)
                verticalLineTo(12.75f)
                horizontalLineTo(16.25f)
                curveTo(16.6642f, 12.75f, 17.0f, 12.4142f, 17.0f, 12.0f)
                curveTo(17.0f, 11.6203f, 16.7178f, 11.3065f, 16.3518f, 11.2568f)
                lineTo(16.25f, 11.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(7.75f)
                curveTo(12.75f, 7.3358f, 12.4142f, 7.0f, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _addCircle!!
    }

private var _addCircle: ImageVector? = null