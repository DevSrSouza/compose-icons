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

public val MaterialDesignIcons.Cone: ImageVector
    get() {
        if (_cone != null) {
            return _cone!!
        }
        _cone = Builder(name = "Cone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.62f, 16.68f)
                horizontalLineTo(21.62f)
                lineTo(12.85f, 2.5f)
                curveTo(12.66f, 2.16f, 12.33f, 2.0f, 12.0f, 2.0f)
                curveTo(11.67f, 2.0f, 11.34f, 2.16f, 11.15f, 2.47f)
                lineTo(2.38f, 16.65f)
                horizontalLineTo(2.4f)
                curveTo(2.15f, 17.04f, 2.0f, 17.5f, 2.0f, 18.0f)
                curveTo(2.0f, 19.5f, 3.3f, 22.0f, 12.0f, 22.0f)
                curveTo(15.74f, 22.0f, 22.0f, 21.5f, 22.0f, 18.0f)
                curveTo(22.0f, 17.61f, 21.91f, 17.15f, 21.62f, 16.68f)
                moveTo(12.0f, 4.9f)
                lineTo(18.0f, 14.58f)
                curveTo(16.53f, 14.23f, 14.6f, 14.0f, 12.0f, 14.0f)
                curveTo(10.25f, 14.0f, 7.96f, 14.12f, 6.0f, 14.6f)
                lineTo(12.0f, 4.9f)
                moveTo(12.0f, 20.0f)
                curveTo(7.58f, 20.0f, 4.0f, 19.11f, 4.0f, 18.0f)
                curveTo(4.0f, 16.9f, 7.58f, 16.0f, 12.0f, 16.0f)
                reflectiveCurveTo(20.0f, 16.9f, 20.0f, 18.0f)
                curveTo(20.0f, 19.11f, 16.42f, 20.0f, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _cone!!
    }

private var _cone: ImageVector? = null
