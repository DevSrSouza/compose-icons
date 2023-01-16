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

public val MaterialDesignIcons.Earth: ImageVector
    get() {
        if (_earth != null) {
            return _earth!!
        }
        _earth = Builder(name = "Earth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.9f, 17.39f)
                curveTo(17.64f, 16.59f, 16.89f, 16.0f, 16.0f, 16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 5.0f)
                verticalLineTo(4.59f)
                curveTo(17.93f, 5.77f, 20.0f, 8.64f, 20.0f, 12.0f)
                curveTo(20.0f, 14.08f, 19.2f, 15.97f, 17.9f, 17.39f)
                moveTo(11.0f, 19.93f)
                curveTo(7.05f, 19.44f, 4.0f, 16.08f, 4.0f, 12.0f)
                curveTo(4.0f, 11.38f, 4.08f, 10.78f, 4.21f, 10.21f)
                lineTo(9.0f, 15.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 18.0f)
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _earth!!
    }

private var _earth: ImageVector? = null
