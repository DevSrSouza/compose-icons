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

public val MaterialDesignIcons.BullseyeArrow: ImageVector
    get() {
        if (_bullseyeArrow != null) {
            return _bullseyeArrow!!
        }
        _bullseyeArrow = Builder(name = "BullseyeArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                curveTo(22.0f, 10.84f, 21.79f, 9.69f, 21.39f, 8.61f)
                lineTo(19.79f, 10.21f)
                curveTo(19.93f, 10.8f, 20.0f, 11.4f, 20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 4.0f)
                curveTo(12.6f, 4.0f, 13.2f, 4.07f, 13.79f, 4.21f)
                lineTo(15.4f, 2.6f)
                curveTo(14.31f, 2.21f, 13.16f, 2.0f, 12.0f, 2.0f)
                moveTo(19.0f, 2.0f)
                lineTo(15.0f, 6.0f)
                verticalLineTo(7.5f)
                lineTo(12.45f, 10.05f)
                curveTo(12.3f, 10.0f, 12.15f, 10.0f, 12.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 12.0f)
                curveTo(14.0f, 11.85f, 14.0f, 11.7f, 13.95f, 11.55f)
                lineTo(16.5f, 9.0f)
                horizontalLineTo(18.0f)
                lineTo(22.0f, 5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(2.0f)
                moveTo(12.0f, 6.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 6.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 12.0f, 18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 18.0f, 12.0f)
                horizontalLineTo(16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 8.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _bullseyeArrow!!
    }

private var _bullseyeArrow: ImageVector? = null
