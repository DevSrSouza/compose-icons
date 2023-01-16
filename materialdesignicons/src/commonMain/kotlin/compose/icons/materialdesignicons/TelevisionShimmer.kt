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

public val MaterialDesignIcons.TelevisionShimmer: ImageVector
    get() {
        if (_televisionShimmer != null) {
            return _televisionShimmer!!
        }
        _televisionShimmer = Builder(name = "TelevisionShimmer", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(21.0f)
                moveTo(21.0f, 3.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 3.0f, 1.0f, 3.9f, 1.0f, 5.0f)
                verticalLineTo(17.0f)
                curveTo(1.0f, 18.11f, 1.9f, 19.0f, 3.0f, 19.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(21.0f)
                curveTo(22.11f, 19.0f, 23.0f, 18.11f, 23.0f, 17.0f)
                verticalLineTo(5.0f)
                curveTo(23.0f, 3.9f, 22.11f, 3.0f, 21.0f, 3.0f)
                moveTo(15.0f, 6.5f)
                lineTo(14.38f, 7.87f)
                lineTo(13.0f, 8.5f)
                lineTo(14.38f, 9.13f)
                lineTo(15.0f, 10.5f)
                lineTo(15.63f, 9.13f)
                lineTo(17.0f, 8.5f)
                lineTo(15.63f, 7.87f)
                lineTo(15.0f, 6.5f)
                moveTo(10.5f, 8.5f)
                lineTo(9.41f, 10.91f)
                lineTo(7.0f, 12.0f)
                lineTo(9.41f, 13.09f)
                lineTo(10.5f, 15.5f)
                lineTo(11.6f, 13.09f)
                lineTo(14.0f, 12.0f)
                lineTo(11.6f, 10.91f)
                lineTo(10.5f, 8.5f)
            }
        }
        .build()
        return _televisionShimmer!!
    }

private var _televisionShimmer: ImageVector? = null
