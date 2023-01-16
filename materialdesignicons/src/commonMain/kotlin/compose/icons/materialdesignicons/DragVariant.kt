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

public val MaterialDesignIcons.DragVariant: ImageVector
    get() {
        if (_dragVariant != null) {
            return _dragVariant!!
        }
        _dragVariant = Builder(name = "DragVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.67f, 12.0f)
                lineTo(18.18f, 16.5f)
                lineTo(15.67f, 14.0f)
                lineTo(17.65f, 12.0f)
                lineTo(15.67f, 10.04f)
                lineTo(18.18f, 7.53f)
                lineTo(22.67f, 12.0f)
                moveTo(12.0f, 1.33f)
                lineTo(16.47f, 5.82f)
                lineTo(13.96f, 8.33f)
                lineTo(12.0f, 6.35f)
                lineTo(10.0f, 8.33f)
                lineTo(7.5f, 5.82f)
                lineTo(12.0f, 1.33f)
                moveTo(12.0f, 22.67f)
                lineTo(7.53f, 18.18f)
                lineTo(10.04f, 15.67f)
                lineTo(12.0f, 17.65f)
                lineTo(14.0f, 15.67f)
                lineTo(16.5f, 18.18f)
                lineTo(12.0f, 22.67f)
                moveTo(1.33f, 12.0f)
                lineTo(5.82f, 7.5f)
                lineTo(8.33f, 10.0f)
                lineTo(6.35f, 12.0f)
                lineTo(8.33f, 13.96f)
                lineTo(5.82f, 16.47f)
                lineTo(1.33f, 12.0f)
                moveTo(12.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return _dragVariant!!
    }

private var _dragVariant: ImageVector? = null
