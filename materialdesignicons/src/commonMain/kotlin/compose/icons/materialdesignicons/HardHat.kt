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

public val MaterialDesignIcons.HardHat: ImageVector
    get() {
        if (_hardHat != null) {
            return _hardHat!!
        }
        _hardHat = Builder(name = "HardHat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.87f, 12.15f)
                lineTo(9.0f, 6.46f)
                curveTo(10.95f, 5.84f, 13.05f, 5.84f, 15.0f, 6.46f)
                lineTo(14.13f, 12.15f)
                curveTo(14.06f, 12.64f, 13.63f, 13.0f, 13.13f, 13.0f)
                horizontalLineTo(10.86f)
                curveTo(10.37f, 13.0f, 9.94f, 12.64f, 9.87f, 12.15f)
                moveTo(22.0f, 16.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 15.21f, 21.53f, 14.5f, 20.8f, 14.17f)
                curveTo(20.32f, 11.86f, 18.96f, 9.83f, 17.0f, 8.5f)
                lineTo(15.24f, 13.34f)
                curveTo(15.1f, 13.74f, 14.72f, 14.0f, 14.3f, 14.0f)
                horizontalLineTo(9.7f)
                curveTo(9.28f, 14.0f, 8.9f, 13.74f, 8.76f, 13.34f)
                lineTo(7.0f, 8.5f)
                curveTo(5.04f, 9.83f, 3.68f, 11.86f, 3.2f, 14.16f)
                curveTo(2.47f, 14.5f, 2.0f, 15.2f, 2.0f, 16.0f)
                lineTo(8.45f, 17.84f)
                curveTo(8.81f, 17.94f, 9.18f, 18.0f, 9.55f, 18.0f)
                horizontalLineTo(14.43f)
                curveTo(14.8f, 18.0f, 15.17f, 17.94f, 15.53f, 17.84f)
                lineTo(22.0f, 16.0f)
                close()
            }
        }
        .build()
        return _hardHat!!
    }

private var _hardHat: ImageVector? = null
