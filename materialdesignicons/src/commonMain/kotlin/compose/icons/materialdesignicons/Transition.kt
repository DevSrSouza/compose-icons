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

public val MaterialDesignIcons.Transition: ImageVector
    get() {
        if (_transition != null) {
            return _transition!!
        }
        _transition = Builder(name = "Transition", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 22.0f, 9.0f)
                curveTo(22.0f, 11.71f, 20.46f, 14.05f, 18.22f, 15.22f)
                curveTo(17.55f, 16.5f, 16.5f, 17.55f, 15.22f, 18.22f)
                curveTo(14.05f, 20.46f, 11.71f, 22.0f, 9.0f, 22.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 2.0f, 15.0f)
                curveTo(2.0f, 12.29f, 3.54f, 9.95f, 5.78f, 8.78f)
                curveTo(6.45f, 7.5f, 7.5f, 6.45f, 8.78f, 5.78f)
                curveTo(9.95f, 3.54f, 12.29f, 2.0f, 15.0f, 2.0f)
                moveTo(12.0f, 19.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 5.0f, 12.0f)
                curveTo(4.37f, 12.84f, 4.0f, 13.87f, 4.0f, 15.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 9.0f, 20.0f)
                curveTo(10.13f, 20.0f, 11.16f, 19.63f, 12.0f, 19.0f)
                moveTo(15.0f, 16.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 8.0f, 9.0f)
                horizontalLineTo(8.0f)
                curveTo(7.37f, 9.84f, 7.0f, 10.87f, 7.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 17.0f)
                curveTo(13.13f, 17.0f, 14.16f, 16.63f, 15.0f, 16.0f)
                verticalLineTo(16.0f)
                moveTo(15.0f, 4.0f)
                curveTo(13.87f, 4.0f, 12.84f, 4.37f, 12.0f, 5.0f)
                verticalLineTo(5.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 19.0f, 12.0f)
                horizontalLineTo(19.0f)
                curveTo(19.63f, 11.16f, 20.0f, 10.13f, 20.0f, 9.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 15.0f, 4.0f)
                moveTo(10.0f, 9.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 15.0f, 14.0f)
                curveTo(15.6f, 14.0f, 16.17f, 13.9f, 16.7f, 13.7f)
                curveTo(16.9f, 13.17f, 17.0f, 12.6f, 17.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 7.0f)
                curveTo(11.4f, 7.0f, 10.83f, 7.1f, 10.3f, 7.3f)
                curveTo(10.1f, 7.83f, 10.0f, 8.4f, 10.0f, 9.0f)
                close()
            }
        }
        .build()
        return _transition!!
    }

private var _transition: ImageVector? = null
