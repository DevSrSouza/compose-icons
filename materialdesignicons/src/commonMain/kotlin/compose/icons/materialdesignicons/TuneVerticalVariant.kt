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

public val MaterialDesignIcons.TuneVerticalVariant: ImageVector
    get() {
        if (_tuneVerticalVariant != null) {
            return _tuneVerticalVariant!!
        }
        _tuneVerticalVariant = Builder(name = "TuneVerticalVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 12.14f)
                verticalLineTo(2.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.14f)
                curveTo(4.28f, 12.59f, 3.0f, 14.14f, 3.0f, 16.0f)
                reflectiveCurveTo(4.28f, 19.41f, 6.0f, 19.86f)
                verticalLineTo(22.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(19.86f)
                curveTo(9.72f, 19.41f, 11.0f, 17.86f, 11.0f, 16.0f)
                reflectiveCurveTo(9.72f, 12.59f, 8.0f, 12.14f)
                moveTo(7.0f, 14.0f)
                curveTo(8.1f, 14.0f, 9.0f, 14.9f, 9.0f, 16.0f)
                reflectiveCurveTo(8.1f, 18.0f, 7.0f, 18.0f)
                curveTo(5.9f, 18.0f, 5.0f, 17.1f, 5.0f, 16.0f)
                reflectiveCurveTo(5.9f, 14.0f, 7.0f, 14.0f)
                moveTo(18.0f, 2.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(4.14f)
                curveTo(14.28f, 4.59f, 13.0f, 6.14f, 13.0f, 8.0f)
                reflectiveCurveTo(14.28f, 11.41f, 16.0f, 11.86f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.86f)
                curveTo(19.72f, 11.41f, 21.0f, 9.86f, 21.0f, 8.0f)
                reflectiveCurveTo(19.72f, 4.59f, 18.0f, 4.14f)
                verticalLineTo(2.0f)
                moveTo(17.0f, 6.0f)
                curveTo(18.1f, 6.0f, 19.0f, 6.9f, 19.0f, 8.0f)
                reflectiveCurveTo(18.1f, 10.0f, 17.0f, 10.0f)
                curveTo(15.9f, 10.0f, 15.0f, 9.1f, 15.0f, 8.0f)
                reflectiveCurveTo(15.9f, 6.0f, 17.0f, 6.0f)
                close()
            }
        }
        .build()
        return _tuneVerticalVariant!!
    }

private var _tuneVerticalVariant: ImageVector? = null
