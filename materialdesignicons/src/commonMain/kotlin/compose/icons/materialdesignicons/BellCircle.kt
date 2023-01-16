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

public val MaterialDesignIcons.BellCircle: ImageVector
    get() {
        if (_bellCircle != null) {
            return _bellCircle!!
        }
        _bellCircle = Builder(name = "BellCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(17.0f, 16.0f)
                verticalLineTo(15.0f)
                lineTo(16.0f, 14.0f)
                verticalLineTo(11.39f)
                curveTo(16.0f, 10.3f, 15.73f, 9.34f, 15.21f, 8.53f)
                curveTo(14.7f, 7.72f, 13.96f, 7.21f, 13.0f, 7.0f)
                verticalLineTo(6.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 5.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 6.5f)
                verticalLineTo(7.0f)
                curveTo(10.04f, 7.21f, 9.3f, 7.72f, 8.79f, 8.53f)
                curveTo(8.27f, 9.34f, 8.0f, 10.3f, 8.0f, 11.39f)
                verticalLineTo(14.0f)
                lineTo(7.0f, 15.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.0f)
                moveTo(13.5f, 17.0f)
                horizontalLineTo(10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 17.0f)
                close()
            }
        }
        .build()
        return _bellCircle!!
    }

private var _bellCircle: ImageVector? = null
