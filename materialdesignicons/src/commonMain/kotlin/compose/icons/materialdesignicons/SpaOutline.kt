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

public val MaterialDesignIcons.SpaOutline: ImageVector
    get() {
        if (_spaOutline != null) {
            return _spaOutline!!
        }
        _spaOutline = Builder(name = "SpaOutline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 9.63f)
                curveTo(14.21f, 10.32f, 13.03f, 11.2f, 12.0f, 12.26f)
                curveTo(10.97f, 11.19f, 9.79f, 10.31f, 8.5f, 9.63f)
                curveTo(8.74f, 6.86f, 9.92f, 4.14f, 12.06f, 2.0f)
                curveTo(14.18f, 4.12f, 15.31f, 6.84f, 15.5f, 9.63f)
                moveTo(12.0f, 15.45f)
                curveTo(14.15f, 12.17f, 17.82f, 10.0f, 22.0f, 10.0f)
                curveTo(22.0f, 20.0f, 12.68f, 21.88f, 12.0f, 22.0f)
                curveTo(11.32f, 21.89f, 2.0f, 20.0f, 2.0f, 10.0f)
                curveTo(6.18f, 10.0f, 9.85f, 12.17f, 12.0f, 15.45f)
                moveTo(12.05f, 5.19f)
                curveTo(11.39f, 6.23f, 10.93f, 7.38f, 10.68f, 8.58f)
                lineTo(12.0f, 9.55f)
                lineTo(13.35f, 8.57f)
                curveTo(13.12f, 7.37f, 12.68f, 6.22f, 12.05f, 5.19f)
                moveTo(12.0f, 19.97f)
                curveTo(12.0f, 19.97f, 18.0f, 19.0f, 19.74f, 12.25f)
                curveTo(14.0f, 14.0f, 12.0f, 19.1f, 12.0f, 19.1f)
                curveTo(12.0f, 19.1f, 9.0f, 13.0f, 4.26f, 12.26f)
                curveTo(6.0f, 19.0f, 12.0f, 19.97f, 12.0f, 19.97f)
                close()
            }
        }
        .build()
        return _spaOutline!!
    }

private var _spaOutline: ImageVector? = null
