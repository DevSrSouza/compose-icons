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

public val MaterialDesignIcons.BellCircleOutline: ImageVector
    get() {
        if (_bellCircleOutline != null) {
            return _bellCircleOutline!!
        }
        _bellCircleOutline = Builder(name = "BellCircleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                lineTo(8.0f, 14.0f)
                verticalLineTo(11.39f)
                curveTo(8.0f, 10.3f, 8.27f, 9.34f, 8.79f, 8.53f)
                curveTo(9.3f, 7.72f, 10.04f, 7.21f, 11.0f, 7.0f)
                verticalLineTo(6.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 5.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 6.5f)
                verticalLineTo(7.0f)
                curveTo(13.96f, 7.21f, 14.7f, 7.72f, 15.21f, 8.53f)
                curveTo(15.73f, 9.34f, 16.0f, 10.3f, 16.0f, 11.39f)
                verticalLineTo(14.0f)
                lineTo(17.0f, 15.0f)
                verticalLineTo(16.0f)
                moveTo(13.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 17.0f)
                horizontalLineTo(13.5f)
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _bellCircleOutline!!
    }

private var _bellCircleOutline: ImageVector? = null
