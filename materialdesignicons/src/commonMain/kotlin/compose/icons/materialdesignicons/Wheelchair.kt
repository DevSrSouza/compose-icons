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

public val MaterialDesignIcons.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) {
            return _wheelchair!!
        }
        _wheelchair = Builder(name = "Wheelchair", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 16.0f)
                lineTo(15.32f, 17.76f)
                curveTo(14.32f, 19.68f, 12.31f, 21.0f, 10.0f, 21.0f)
                curveTo(6.69f, 21.0f, 4.0f, 18.31f, 4.0f, 15.0f)
                curveTo(4.0f, 12.57f, 5.46f, 10.5f, 7.55f, 9.55f)
                lineTo(7.76f, 11.72f)
                curveTo(6.71f, 12.44f, 6.0f, 13.63f, 6.0f, 15.0f)
                curveTo(6.0f, 17.21f, 7.79f, 19.0f, 10.0f, 19.0f)
                curveTo(11.86f, 19.0f, 13.41f, 17.72f, 13.86f, 16.0f)
                horizontalLineTo(14.0f)
                moveTo(19.55f, 16.11f)
                lineTo(18.3f, 16.73f)
                lineTo(15.5f, 13.0f)
                horizontalLineTo(10.91f)
                lineTo(10.71f, 11.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.5f)
                lineTo(10.2f, 6.0f)
                curveTo(11.21f, 5.88f, 12.0f, 5.04f, 12.0f, 4.0f)
                curveTo(12.0f, 2.9f, 11.11f, 2.0f, 10.0f, 2.0f)
                reflectiveCurveTo(8.0f, 2.9f, 8.0f, 4.0f)
                curveTo(8.0f, 4.03f, 8.0f, 4.07f, 8.0f, 4.1f)
                horizontalLineTo(8.0f)
                lineTo(9.1f, 15.0f)
                horizontalLineTo(14.5f)
                lineTo(17.7f, 19.27f)
                lineTo(20.45f, 17.9f)
                lineTo(19.55f, 16.11f)
                close()
            }
        }
        .build()
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
