package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.IntegratedCircuitChip: ImageVector
    get() {
        if (_integratedCircuitChip != null) {
            return _integratedCircuitChip!!
        }
        _integratedCircuitChip = Builder(name = "IntegratedCircuitChip", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 4.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 4.0f, 22.0f, 4.89f, 22.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.59f)
                lineTo(16.0f, 10.59f)
                verticalLineTo(14.59f)
                lineTo(14.0f, 16.59f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(16.59f)
                lineTo(8.0f, 14.59f)
                verticalLineTo(9.41f)
                lineTo(10.0f, 7.41f)
                verticalLineTo(4.0f)
                moveTo(18.0f, 11.41f)
                verticalLineTo(14.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.41f)
                lineTo(18.0f, 11.41f)
                moveTo(6.59f, 8.0f)
                lineTo(8.0f, 6.59f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 4.0f, 2.0f, 4.89f, 2.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.59f)
                moveTo(6.0f, 14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0f)
                moveTo(8.0f, 17.41f)
                lineTo(6.59f, 16.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.11f, 2.89f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.41f)
                moveTo(17.41f, 16.0f)
                lineTo(16.0f, 17.41f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 20.0f, 22.0f, 19.11f, 22.0f, 18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.41f)
                close()
            }
        }
        .build()
        return _integratedCircuitChip!!
    }

private var _integratedCircuitChip: ImageVector? = null
