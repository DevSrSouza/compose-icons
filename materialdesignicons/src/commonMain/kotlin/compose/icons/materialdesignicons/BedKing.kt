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

public val MaterialDesignIcons.BedKing: ImageVector
    get() {
        if (_bedKing != null) {
            return _bedKing!!
        }
        _bedKing = Builder(name = "BedKing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 5.0f)
                curveTo(5.47f, 5.0f, 5.0f, 5.21f, 4.59f, 5.6f)
                reflectiveCurveTo(4.0f, 6.45f, 4.0f, 7.0f)
                verticalLineTo(10.0f)
                curveTo(3.45f, 10.0f, 3.0f, 10.19f, 2.6f, 10.59f)
                reflectiveCurveTo(2.0f, 11.47f, 2.0f, 12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.33f)
                lineTo(4.0f, 19.0f)
                horizontalLineTo(5.0f)
                lineTo(5.67f, 17.0f)
                horizontalLineTo(18.33f)
                lineTo(19.0f, 19.0f)
                horizontalLineTo(20.0f)
                lineTo(20.67f, 17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.0f)
                curveTo(22.0f, 11.47f, 21.79f, 11.0f, 21.4f, 10.59f)
                curveTo(21.0f, 10.19f, 20.55f, 10.0f, 20.0f, 10.0f)
                verticalLineTo(7.0f)
                curveTo(20.0f, 6.45f, 19.81f, 6.0f, 19.41f, 5.6f)
                reflectiveCurveTo(18.53f, 5.0f, 18.0f, 5.0f)
                moveTo(6.0f, 7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.0f)
                moveTo(13.0f, 7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _bedKing!!
    }

private var _bedKing: ImageVector? = null
