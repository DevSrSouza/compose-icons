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

public val MaterialDesignIcons.UmbrellaClosedVariant: ImageVector
    get() {
        if (_umbrellaClosedVariant != null) {
            return _umbrellaClosedVariant!!
        }
        _umbrellaClosedVariant = Builder(name = "UmbrellaClosedVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 7.0f)
                lineTo(13.0f, 6.0f)
                verticalLineTo(3.5f)
                curveTo(13.0f, 3.2f, 13.2f, 3.0f, 13.5f, 3.0f)
                reflectiveCurveTo(14.0f, 3.2f, 14.0f, 3.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.5f)
                curveTo(16.0f, 2.1f, 14.9f, 1.0f, 13.5f, 1.0f)
                reflectiveCurveTo(11.0f, 2.1f, 11.0f, 3.5f)
                verticalLineTo(6.0f)
                lineTo(9.0f, 7.0f)
                lineTo(6.0f, 6.0f)
                lineTo(11.1f, 21.3f)
                curveTo(11.4f, 22.2f, 12.7f, 22.2f, 13.0f, 21.3f)
                curveTo(14.6f, 16.2f, 18.0f, 6.0f, 18.0f, 6.0f)
                lineTo(15.0f, 7.0f)
                moveTo(11.0f, 15.0f)
                lineTo(9.0f, 8.9f)
                lineTo(9.7f, 9.1f)
                lineTo(11.0f, 8.1f)
                verticalLineTo(15.0f)
                moveTo(13.0f, 8.1f)
                lineTo(14.3f, 9.1f)
                lineTo(15.0f, 8.9f)
                lineTo(13.0f, 15.0f)
                verticalLineTo(8.1f)
                close()
            }
        }
        .build()
        return _umbrellaClosedVariant!!
    }

private var _umbrellaClosedVariant: ImageVector? = null
