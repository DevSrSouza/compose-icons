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

public val MaterialDesignIcons.SmokeDetectorOutline: ImageVector
    get() {
        if (_smokeDetectorOutline != null) {
            return _smokeDetectorOutline!!
        }
        _smokeDetectorOutline = Builder(name = "SmokeDetectorOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.89f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.89f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 21.0f, 21.0f, 20.11f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.11f, 3.0f, 19.0f, 3.0f)
                moveTo(19.0f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                moveTo(12.0f, 18.0f)
                curveTo(15.31f, 18.0f, 18.0f, 15.31f, 18.0f, 12.0f)
                curveTo(18.0f, 8.68f, 15.31f, 6.0f, 12.0f, 6.0f)
                curveTo(8.68f, 6.0f, 6.0f, 8.68f, 6.0f, 12.0f)
                curveTo(6.0f, 15.31f, 8.69f, 18.0f, 12.0f, 18.0f)
                moveTo(12.0f, 8.0f)
                curveTo(14.21f, 8.0f, 16.0f, 9.79f, 16.0f, 12.0f)
                reflectiveCurveTo(14.21f, 16.0f, 12.0f, 16.0f)
                reflectiveCurveTo(8.0f, 14.21f, 8.0f, 12.0f)
                reflectiveCurveTo(9.79f, 8.0f, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _smokeDetectorOutline!!
    }

private var _smokeDetectorOutline: ImageVector? = null