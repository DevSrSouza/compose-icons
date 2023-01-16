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

public val MaterialDesignIcons.BottleWineOutline: ImageVector
    get() {
        if (_bottleWineOutline != null) {
            return _bottleWineOutline!!
        }
        _bottleWineOutline = Builder(name = "BottleWineOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 2.0f)
                curveTo(11.22f, 2.0f, 11.0f, 2.22f, 11.0f, 2.5f)
                verticalLineTo(7.0f)
                curveTo(10.93f, 7.0f, 10.85f, 7.0f, 10.78f, 7.03f)
                curveTo(9.82f, 7.27f, 9.21f, 8.0f, 8.76f, 8.89f)
                curveTo(8.3f, 9.76f, 8.0f, 10.84f, 8.0f, 12.0f)
                curveTo(8.05f, 15.0f, 8.0f, 18.03f, 8.0f, 21.0f)
                curveTo(8.0f, 21.55f, 8.45f, 22.0f, 9.0f, 22.0f)
                curveTo(11.0f, 22.0f, 13.0f, 22.0f, 15.0f, 22.0f)
                curveTo(15.55f, 22.0f, 16.0f, 21.55f, 16.0f, 21.0f)
                curveTo(16.04f, 18.0f, 16.0f, 15.0f, 16.0f, 12.0f)
                curveTo(16.0f, 10.84f, 15.74f, 9.76f, 15.28f, 8.88f)
                curveTo(14.83f, 8.0f, 14.22f, 7.27f, 13.26f, 7.04f)
                curveTo(13.18f, 7.0f, 13.05f, 7.0f, 13.0f, 7.0f)
                verticalLineTo(2.5f)
                curveTo(13.0f, 2.22f, 12.78f, 2.0f, 12.5f, 2.0f)
                moveTo(12.0f, 8.85f)
                curveTo(12.32f, 8.85f, 12.63f, 8.9f, 12.78f, 9.0f)
                curveTo(12.85f, 9.03f, 13.2f, 9.26f, 13.5f, 9.81f)
                curveTo(13.78f, 10.37f, 14.0f, 11.17f, 14.0f, 12.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                curveTo(10.0f, 11.17f, 10.22f, 10.37f, 10.5f, 9.81f)
                curveTo(10.8f, 9.26f, 11.15f, 9.03f, 11.22f, 9.0f)
                curveTo(11.36f, 8.9f, 11.68f, 8.85f, 12.0f, 8.85f)
                close()
            }
        }
        .build()
        return _bottleWineOutline!!
    }

private var _bottleWineOutline: ImageVector? = null
