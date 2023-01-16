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

public val MaterialDesignIcons.GoogleCirclesGroup: ImageVector
    get() {
        if (_googleCirclesGroup != null) {
            return _googleCirclesGroup!!
        }
        _googleCirclesGroup = Builder(name = "GoogleCirclesGroup", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 12.0f)
                curveTo(3.0f, 13.11f, 3.9f, 14.0f, 5.0f, 14.0f)
                curveTo(6.11f, 14.0f, 7.0f, 13.11f, 7.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 10.0f)
                moveTo(5.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 1.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 5.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 9.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 5.0f, 16.0f)
                moveTo(10.5f, 11.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.0f)
                lineTo(18.0f, 12.0f)
                lineTo(14.0f, 16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(11.0f)
                moveTo(5.0f, 6.0f)
                curveTo(4.55f, 6.0f, 4.11f, 6.05f, 3.69f, 6.14f)
                curveTo(5.63f, 3.05f, 9.08f, 1.0f, 13.0f, 1.0f)
                curveTo(19.08f, 1.0f, 24.0f, 5.92f, 24.0f, 12.0f)
                curveTo(24.0f, 18.08f, 19.08f, 23.0f, 13.0f, 23.0f)
                curveTo(9.08f, 23.0f, 5.63f, 20.95f, 3.69f, 17.86f)
                curveTo(4.11f, 17.95f, 4.55f, 18.0f, 5.0f, 18.0f)
                curveTo(5.8f, 18.0f, 6.56f, 17.84f, 7.25f, 17.56f)
                curveTo(8.71f, 19.07f, 10.74f, 20.0f, 13.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 21.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 13.0f, 4.0f)
                curveTo(10.74f, 4.0f, 8.71f, 4.93f, 7.25f, 6.44f)
                curveTo(6.56f, 6.16f, 5.8f, 6.0f, 5.0f, 6.0f)
                close()
            }
        }
        .build()
        return _googleCirclesGroup!!
    }

private var _googleCirclesGroup: ImageVector? = null
