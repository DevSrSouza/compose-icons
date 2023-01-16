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

public val MaterialDesignIcons.HumanWalker: ImageVector
    get() {
        if (_humanWalker != null) {
            return _humanWalker!!
        }
        _humanWalker = Builder(name = "HumanWalker", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(13.1f, 2.0f, 14.0f, 2.9f, 14.0f, 4.0f)
                reflectiveCurveTo(13.1f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveTo(10.0f, 5.1f, 10.0f, 4.0f)
                reflectiveCurveTo(10.9f, 2.0f, 12.0f, 2.0f)
                moveTo(19.8f, 17.7f)
                lineTo(19.2f, 11.3f)
                curveTo(19.1f, 10.5f, 18.5f, 10.0f, 17.7f, 10.0f)
                horizontalLineTo(16.0f)
                curveTo(14.5f, 10.0f, 13.1f, 9.5f, 12.2f, 8.6f)
                lineTo(10.2f, 6.6f)
                curveTo(10.1f, 6.4f, 9.6f, 6.0f, 8.8f, 6.0f)
                curveTo(8.3f, 6.0f, 7.8f, 6.2f, 7.4f, 6.6f)
                lineTo(4.1f, 9.9f)
                curveTo(3.6f, 10.6f, 3.6f, 11.5f, 3.9f, 12.0f)
                lineTo(5.3f, 14.8f)
                lineTo(2.2f, 18.8f)
                lineTo(3.8f, 20.0f)
                lineTo(7.5f, 15.3f)
                lineTo(7.2f, 14.0f)
                lineTo(8.0f, 14.8f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.9f)
                lineTo(7.9f, 11.8f)
                lineTo(10.3f, 9.4f)
                curveTo(11.2f, 10.3f, 12.0f, 11.2f, 13.9f, 11.7f)
                lineTo(13.0f, 20.0f)
                horizontalLineTo(14.5f)
                lineTo(14.9f, 16.5f)
                horizontalLineTo(18.1f)
                lineTo(18.2f, 17.7f)
                curveTo(17.8f, 18.0f, 17.5f, 18.4f, 17.5f, 19.0f)
                curveTo(17.5f, 19.8f, 18.2f, 20.5f, 19.0f, 20.5f)
                reflectiveCurveTo(20.5f, 19.8f, 20.5f, 19.0f)
                curveTo(20.5f, 18.5f, 20.2f, 18.0f, 19.8f, 17.7f)
                moveTo(15.1f, 15.0f)
                lineTo(15.5f, 11.5f)
                horizontalLineTo(17.5f)
                lineTo(17.9f, 15.0f)
                horizontalLineTo(15.1f)
                close()
            }
        }
        .build()
        return _humanWalker!!
    }

private var _humanWalker: ImageVector? = null
