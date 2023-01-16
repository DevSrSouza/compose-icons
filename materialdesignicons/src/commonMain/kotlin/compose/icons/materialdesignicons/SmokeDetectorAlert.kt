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

public val MaterialDesignIcons.SmokeDetectorAlert: ImageVector
    get() {
        if (_smokeDetectorAlert != null) {
            return _smokeDetectorAlert!!
        }
        _smokeDetectorAlert = Builder(name = "SmokeDetectorAlert", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 18.0f)
                curveTo(13.3f, 18.0f, 16.0f, 15.3f, 16.0f, 12.0f)
                curveTo(16.0f, 8.7f, 13.3f, 6.0f, 10.0f, 6.0f)
                curveTo(6.7f, 6.0f, 4.0f, 8.7f, 4.0f, 12.0f)
                curveTo(4.0f, 15.3f, 6.7f, 18.0f, 10.0f, 18.0f)
                moveTo(17.0f, 3.0f)
                curveTo(18.1f, 3.0f, 19.0f, 3.9f, 19.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(19.0f, 20.1f, 18.1f, 21.0f, 17.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 21.0f, 1.0f, 20.1f, 1.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(1.0f, 3.9f, 1.9f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(17.0f)
                moveTo(6.0f, 12.0f)
                curveTo(6.0f, 9.8f, 7.8f, 8.0f, 10.0f, 8.0f)
                reflectiveCurveTo(14.0f, 9.8f, 14.0f, 12.0f)
                reflectiveCurveTo(12.2f, 16.0f, 10.0f, 16.0f)
                reflectiveCurveTo(6.0f, 14.2f, 6.0f, 12.0f)
                moveTo(23.0f, 7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(8.0f)
                moveTo(23.0f, 15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _smokeDetectorAlert!!
    }

private var _smokeDetectorAlert: ImageVector? = null
