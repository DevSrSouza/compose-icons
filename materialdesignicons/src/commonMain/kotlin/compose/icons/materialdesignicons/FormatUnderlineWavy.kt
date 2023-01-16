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

public val MaterialDesignIcons.FormatUnderlineWavy: ImageVector
    get() {
        if (_formatUnderlineWavy != null) {
            return _formatUnderlineWavy!!
        }
        _formatUnderlineWavy = Builder(name = "FormatUnderlineWavy", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                curveTo(15.31f, 17.0f, 18.0f, 14.31f, 18.0f, 11.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(11.0f)
                curveTo(15.5f, 12.93f, 13.93f, 14.5f, 12.0f, 14.5f)
                reflectiveCurveTo(8.5f, 12.93f, 8.5f, 11.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                curveTo(6.0f, 14.31f, 8.69f, 17.0f, 12.0f, 17.0f)
                moveTo(20.0f, 22.0f)
                curveTo(18.6f, 22.0f, 17.8f, 21.3f, 17.3f, 20.7f)
                curveTo(16.8f, 20.2f, 16.6f, 20.0f, 16.0f, 20.0f)
                reflectiveCurveTo(15.2f, 20.2f, 14.7f, 20.7f)
                curveTo(14.2f, 21.3f, 13.4f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(9.8f, 21.3f, 9.3f, 20.7f)
                curveTo(8.8f, 20.2f, 8.6f, 20.0f, 8.0f, 20.0f)
                reflectiveCurveTo(7.2f, 20.2f, 6.7f, 20.7f)
                curveTo(6.2f, 21.3f, 5.4f, 22.0f, 4.0f, 22.0f)
                verticalLineTo(20.0f)
                curveTo(4.6f, 20.0f, 4.8f, 19.8f, 5.3f, 19.3f)
                curveTo(5.8f, 18.7f, 6.6f, 18.0f, 8.0f, 18.0f)
                reflectiveCurveTo(10.2f, 18.7f, 10.7f, 19.3f)
                curveTo(11.2f, 19.8f, 11.4f, 20.0f, 12.0f, 20.0f)
                reflectiveCurveTo(12.8f, 19.8f, 13.3f, 19.3f)
                curveTo(13.8f, 18.7f, 14.6f, 18.0f, 16.0f, 18.0f)
                reflectiveCurveTo(18.2f, 18.7f, 18.7f, 19.3f)
                curveTo(19.2f, 19.8f, 19.4f, 20.0f, 20.0f, 20.0f)
                verticalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _formatUnderlineWavy!!
    }

private var _formatUnderlineWavy: ImageVector? = null
