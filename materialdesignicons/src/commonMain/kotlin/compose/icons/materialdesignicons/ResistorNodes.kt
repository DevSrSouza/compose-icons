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

public val MaterialDesignIcons.ResistorNodes: ImageVector
    get() {
        if (_resistorNodes != null) {
            return _resistorNodes!!
        }
        _resistorNodes = Builder(name = "ResistorNodes", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 11.0f)
                horizontalLineTo(3.67f)
                curveTo(4.08f, 9.83f, 5.19f, 9.0f, 6.5f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.5f, 12.0f)
                curveTo(9.5f, 12.65f, 9.29f, 13.25f, 8.94f, 13.74f)
                lineTo(10.07f, 15.35f)
                lineTo(13.11f, 4.0f)
                lineTo(14.61f, 6.13f)
                lineTo(16.7f, 9.11f)
                lineTo(17.5f, 9.0f)
                curveTo(18.81f, 9.0f, 19.92f, 9.83f, 20.33f, 11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.33f)
                curveTo(19.92f, 14.17f, 18.81f, 15.0f, 17.5f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 14.5f, 12.0f)
                curveTo(14.5f, 11.35f, 14.71f, 10.75f, 15.06f, 10.26f)
                lineTo(13.93f, 8.65f)
                lineTo(10.89f, 20.0f)
                lineTo(7.3f, 14.89f)
                curveTo(7.05f, 14.96f, 6.78f, 15.0f, 6.5f, 15.0f)
                curveTo(5.19f, 15.0f, 4.08f, 14.17f, 3.67f, 13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                moveTo(17.5f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.0f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.0f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.5f, 10.5f)
                moveTo(6.5f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.0f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.0f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 10.5f)
                close()
            }
        }
        .build()
        return _resistorNodes!!
    }

private var _resistorNodes: ImageVector? = null
