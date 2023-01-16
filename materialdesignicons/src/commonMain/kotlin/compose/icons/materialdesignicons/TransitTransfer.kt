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

public val MaterialDesignIcons.TransitTransfer: ImageVector
    get() {
        if (_transitTransfer != null) {
            return _transitTransfer!!
        }
        _transitTransfer = Builder(name = "TransitTransfer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 15.5f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(18.75f)
                lineTo(14.0f, 16.25f)
                lineTo(16.5f, 13.75f)
                verticalLineTo(15.5f)
                moveTo(19.5f, 19.75f)
                verticalLineTo(18.0f)
                lineTo(22.0f, 20.5f)
                lineTo(19.5f, 23.0f)
                verticalLineTo(21.25f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.75f)
                horizontalLineTo(19.5f)
                moveTo(9.5f, 5.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.5f, 3.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.5f, 1.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.5f, 3.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.5f, 5.5f)
                moveTo(5.75f, 8.9f)
                lineTo(4.0f, 9.65f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(8.3f)
                lineTo(7.25f, 6.15f)
                curveTo(7.5f, 6.05f, 7.75f, 6.0f, 8.0f, 6.0f)
                curveTo(8.7f, 6.0f, 9.35f, 6.35f, 9.7f, 6.95f)
                lineTo(10.65f, 8.55f)
                curveTo(11.55f, 10.0f, 13.15f, 11.0f, 15.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(12.8f, 13.0f, 10.85f, 12.0f, 9.55f, 10.4f)
                lineTo(8.95f, 13.4f)
                lineTo(11.0f, 15.45f)
                verticalLineTo(23.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.0f)
                lineTo(6.85f, 15.0f)
                lineTo(5.1f, 23.0f)
                horizontalLineTo(3.0f)
                lineTo(5.75f, 8.9f)
                close()
            }
        }
        .build()
        return _transitTransfer!!
    }

private var _transitTransfer: ImageVector? = null
