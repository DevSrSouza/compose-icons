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

public val MaterialDesignIcons.WaterCheck: ImageVector
    get() {
        if (_waterCheck != null) {
            return _waterCheck!!
        }
        _waterCheck = Builder(name = "WaterCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.75f, 16.25f)
                lineTo(17.0f, 21.0f)
                lineTo(14.25f, 18.0f)
                lineTo(15.41f, 16.84f)
                lineTo(17.0f, 18.43f)
                lineTo(20.59f, 14.84f)
                lineTo(21.75f, 16.25f)
                moveTo(17.62f, 12.0f)
                curveTo(16.31f, 8.1f, 12.0f, 3.25f, 12.0f, 3.25f)
                reflectiveCurveTo(6.0f, 10.0f, 6.0f, 14.0f)
                curveTo(6.0f, 17.31f, 8.69f, 20.0f, 12.0f, 20.0f)
                horizontalLineTo(12.34f)
                curveTo(12.12f, 19.36f, 12.0f, 18.7f, 12.0f, 18.0f)
                curveTo(12.0f, 14.82f, 14.5f, 12.22f, 17.62f, 12.0f)
                close()
            }
        }
        .build()
        return _waterCheck!!
    }

private var _waterCheck: ImageVector? = null
