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

public val MaterialDesignIcons.HeadDotsHorizontal: ImageVector
    get() {
        if (_headDotsHorizontal != null) {
            return _headDotsHorizontal!!
        }
        _headDotsHorizontal = Builder(name = "HeadDotsHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                curveTo(9.23f, 3.0f, 6.19f, 5.95f, 6.0f, 9.66f)
                lineTo(4.08f, 12.19f)
                curveTo(3.84f, 12.5f, 4.08f, 13.0f, 4.5f, 13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.0f)
                curveTo(6.0f, 17.11f, 6.89f, 18.0f, 8.0f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.31f)
                curveTo(18.37f, 15.19f, 20.0f, 12.8f, 20.0f, 10.0f)
                curveTo(20.0f, 6.14f, 16.88f, 3.0f, 13.0f, 3.0f)
                moveTo(10.0f, 11.0f)
                curveTo(9.45f, 11.0f, 9.0f, 10.55f, 9.0f, 10.0f)
                reflectiveCurveTo(9.45f, 9.0f, 10.0f, 9.0f)
                reflectiveCurveTo(11.0f, 9.45f, 11.0f, 10.0f)
                reflectiveCurveTo(10.55f, 11.0f, 10.0f, 11.0f)
                moveTo(13.0f, 11.0f)
                curveTo(12.45f, 11.0f, 12.0f, 10.55f, 12.0f, 10.0f)
                reflectiveCurveTo(12.45f, 9.0f, 13.0f, 9.0f)
                reflectiveCurveTo(14.0f, 9.45f, 14.0f, 10.0f)
                reflectiveCurveTo(13.55f, 11.0f, 13.0f, 11.0f)
                moveTo(16.0f, 11.0f)
                curveTo(15.45f, 11.0f, 15.0f, 10.55f, 15.0f, 10.0f)
                reflectiveCurveTo(15.45f, 9.0f, 16.0f, 9.0f)
                reflectiveCurveTo(17.0f, 9.45f, 17.0f, 10.0f)
                reflectiveCurveTo(16.55f, 11.0f, 16.0f, 11.0f)
                close()
            }
        }
        .build()
        return _headDotsHorizontal!!
    }

private var _headDotsHorizontal: ImageVector? = null
