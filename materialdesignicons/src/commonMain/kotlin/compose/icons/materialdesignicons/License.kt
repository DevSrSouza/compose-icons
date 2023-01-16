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

public val MaterialDesignIcons.License: ImageVector
    get() {
        if (_license != null) {
            return _license!!
        }
        _license = Builder(name = "License", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 10.0f)
                arcTo(3.04f, 3.04f, 0.0f, false, true, 12.0f, 7.0f)
                arcTo(3.04f, 3.04f, 0.0f, false, true, 15.0f, 10.0f)
                arcTo(3.04f, 3.04f, 0.0f, false, true, 12.0f, 13.0f)
                arcTo(3.04f, 3.04f, 0.0f, false, true, 9.0f, 10.0f)
                moveTo(12.0f, 19.0f)
                lineTo(16.0f, 20.0f)
                verticalLineTo(16.92f)
                arcTo(7.54f, 7.54f, 0.0f, false, true, 12.0f, 18.0f)
                arcTo(7.54f, 7.54f, 0.0f, false, true, 8.0f, 16.92f)
                verticalLineTo(20.0f)
                moveTo(12.0f, 4.0f)
                arcTo(5.78f, 5.78f, 0.0f, false, false, 7.76f, 5.74f)
                arcTo(5.78f, 5.78f, 0.0f, false, false, 6.0f, 10.0f)
                arcTo(5.78f, 5.78f, 0.0f, false, false, 7.76f, 14.23f)
                arcTo(5.78f, 5.78f, 0.0f, false, false, 12.0f, 16.0f)
                arcTo(5.78f, 5.78f, 0.0f, false, false, 16.24f, 14.23f)
                arcTo(5.78f, 5.78f, 0.0f, false, false, 18.0f, 10.0f)
                arcTo(5.78f, 5.78f, 0.0f, false, false, 16.24f, 5.74f)
                arcTo(5.78f, 5.78f, 0.0f, false, false, 12.0f, 4.0f)
                moveTo(20.0f, 10.0f)
                arcTo(8.04f, 8.04f, 0.0f, false, true, 19.43f, 12.8f)
                arcTo(7.84f, 7.84f, 0.0f, false, true, 18.0f, 15.28f)
                verticalLineTo(23.0f)
                lineTo(12.0f, 21.0f)
                lineTo(6.0f, 23.0f)
                verticalLineTo(15.28f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 4.0f, 10.0f)
                arcTo(7.68f, 7.68f, 0.0f, false, true, 6.33f, 4.36f)
                arcTo(7.73f, 7.73f, 0.0f, false, true, 12.0f, 2.0f)
                arcTo(7.73f, 7.73f, 0.0f, false, true, 17.67f, 4.36f)
                arcTo(7.68f, 7.68f, 0.0f, false, true, 20.0f, 10.0f)
                close()
            }
        }
        .build()
        return _license!!
    }

private var _license: ImageVector? = null
