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

public val MaterialDesignIcons.Beach: ImageVector
    get() {
        if (_beach != null) {
            return _beach!!
        }
        _beach = Builder(name = "Beach", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 18.54f)
                curveTo(17.13f, 18.21f, 19.5f, 18.0f, 22.0f, 18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                curveTo(5.0f, 21.35f, 8.2f, 19.86f, 13.0f, 18.9f)
                verticalLineTo(12.4f)
                curveTo(12.16f, 12.65f, 11.45f, 13.21f, 11.0f, 13.95f)
                curveTo(10.39f, 12.93f, 9.27f, 12.25f, 8.0f, 12.25f)
                curveTo(6.73f, 12.25f, 5.61f, 12.93f, 5.0f, 13.95f)
                curveTo(5.03f, 10.37f, 8.5f, 7.43f, 13.0f, 7.04f)
                verticalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 7.0f)
                verticalLineTo(7.04f)
                curveTo(19.5f, 7.43f, 22.96f, 10.37f, 23.0f, 13.95f)
                curveTo(22.39f, 12.93f, 21.27f, 12.25f, 20.0f, 12.25f)
                curveTo(18.73f, 12.25f, 17.61f, 12.93f, 17.0f, 13.95f)
                curveTo(16.55f, 13.21f, 15.84f, 12.65f, 15.0f, 12.39f)
                verticalLineTo(18.54f)
                moveTo(7.0f, 2.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 2.0f, 7.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _beach!!
    }

private var _beach: ImageVector? = null
