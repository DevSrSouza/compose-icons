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

public val MaterialDesignIcons.GoogleKeep: ImageVector
    get() {
        if (_googleKeep != null) {
            return _googleKeep!!
        }
        _googleKeep = Builder(name = "GoogleKeep", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 2.0f, 22.0f, 2.9f, 22.0f, 4.0f)
                verticalLineTo(17.33f)
                lineTo(17.33f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 22.0f, 2.0f, 21.11f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 2.9f, 2.9f, 2.0f, 4.0f, 2.0f)
                moveTo(17.0f, 17.0f)
                verticalLineTo(20.25f)
                lineTo(20.25f, 17.0f)
                horizontalLineTo(17.0f)
                moveTo(10.0f, 19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                curveTo(16.21f, 12.09f, 17.0f, 10.64f, 17.0f, 9.0f)
                curveTo(17.0f, 6.24f, 14.76f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(7.0f, 6.24f, 7.0f, 9.0f)
                curveTo(7.0f, 10.64f, 7.79f, 12.09f, 9.0f, 13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                moveTo(14.0f, 17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                moveTo(12.0f, 5.0f)
                curveTo(14.21f, 5.0f, 16.0f, 6.79f, 16.0f, 9.0f)
                curveTo(16.0f, 10.5f, 15.2f, 11.77f, 14.0f, 12.46f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.46f)
                curveTo(8.8f, 11.77f, 8.0f, 10.5f, 8.0f, 9.0f)
                curveTo(8.0f, 6.79f, 9.79f, 5.0f, 12.0f, 5.0f)
                close()
            }
        }
        .build()
        return _googleKeep!!
    }

private var _googleKeep: ImageVector? = null
