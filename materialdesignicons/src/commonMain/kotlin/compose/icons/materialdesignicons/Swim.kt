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

public val MaterialDesignIcons.Swim: ImageVector
    get() {
        if (_swim != null) {
            return _swim!!
        }
        _swim = Builder(name = "Swim", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 18.0f)
                curveTo(4.22f, 17.0f, 6.44f, 16.0f, 8.67f, 16.0f)
                curveTo(10.89f, 16.0f, 13.11f, 18.0f, 15.33f, 18.0f)
                curveTo(17.56f, 18.0f, 19.78f, 16.0f, 22.0f, 16.0f)
                verticalLineTo(19.0f)
                curveTo(19.78f, 19.0f, 17.56f, 21.0f, 15.33f, 21.0f)
                curveTo(13.11f, 21.0f, 10.89f, 19.0f, 8.67f, 19.0f)
                curveTo(6.44f, 19.0f, 4.22f, 20.0f, 2.0f, 21.0f)
                verticalLineTo(18.0f)
                moveTo(8.67f, 13.0f)
                curveTo(7.89f, 13.0f, 7.12f, 13.12f, 6.35f, 13.32f)
                lineTo(11.27f, 9.88f)
                lineTo(10.23f, 8.64f)
                curveTo(10.09f, 8.47f, 10.0f, 8.24f, 10.0f, 8.0f)
                curveTo(10.0f, 7.66f, 10.17f, 7.35f, 10.44f, 7.17f)
                lineTo(16.16f, 3.17f)
                lineTo(17.31f, 4.8f)
                lineTo(12.47f, 8.19f)
                lineTo(17.7f, 14.42f)
                curveTo(16.91f, 14.75f, 16.12f, 15.0f, 15.33f, 15.0f)
                curveTo(13.11f, 15.0f, 10.89f, 13.0f, 8.67f, 13.0f)
                moveTo(18.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 7.0f)
                close()
            }
        }
        .build()
        return _swim!!
    }

private var _swim: ImageVector? = null
