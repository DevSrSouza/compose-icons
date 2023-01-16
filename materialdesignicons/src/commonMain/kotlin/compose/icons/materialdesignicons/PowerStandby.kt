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

public val MaterialDesignIcons.PowerStandby: ImageVector
    get() {
        if (_powerStandby != null) {
            return _powerStandby!!
        }
        _powerStandby = Builder(name = "PowerStandby", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0f)
                moveTo(17.83f, 5.17f)
                lineTo(16.41f, 6.59f)
                curveTo(18.05f, 7.91f, 19.0f, 9.9f, 19.0f, 12.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 19.0f)
                curveTo(8.14f, 19.0f, 5.0f, 15.88f, 5.0f, 12.0f)
                curveTo(5.0f, 9.91f, 5.95f, 7.91f, 7.58f, 6.58f)
                lineTo(6.17f, 5.17f)
                curveTo(2.38f, 8.39f, 1.92f, 14.07f, 5.14f, 17.86f)
                curveTo(8.36f, 21.64f, 14.04f, 22.1f, 17.83f, 18.88f)
                curveTo(19.85f, 17.17f, 21.0f, 14.65f, 21.0f, 12.0f)
                curveTo(21.0f, 9.37f, 19.84f, 6.87f, 17.83f, 5.17f)
                close()
            }
        }
        .build()
        return _powerStandby!!
    }

private var _powerStandby: ImageVector? = null
