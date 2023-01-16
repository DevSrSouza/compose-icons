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

public val MaterialDesignIcons.HumanNonBinary: ImageVector
    get() {
        if (_humanNonBinary != null) {
            return _humanNonBinary!!
        }
        _humanNonBinary = Builder(name = "HumanNonBinary", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(13.11f, 2.0f, 14.0f, 2.9f, 14.0f, 4.0f)
                reflectiveCurveTo(13.11f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveTo(10.0f, 5.11f, 10.0f, 4.0f)
                reflectiveCurveTo(10.9f, 2.0f, 12.0f, 2.0f)
                moveTo(13.91f, 8.41f)
                curveTo(13.66f, 7.59f, 12.9f, 7.0f, 12.0f, 7.0f)
                horizontalLineTo(10.5f)
                curveTo(9.4f, 7.0f, 8.5f, 7.9f, 8.5f, 9.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.5f)
                lineTo(13.91f, 8.41f)
                close()
            }
        }
        .build()
        return _humanNonBinary!!
    }

private var _humanNonBinary: ImageVector? = null
