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

public val MaterialDesignIcons.ChiliAlert: ImageVector
    get() {
        if (_chiliAlert != null) {
            return _chiliAlert!!
        }
        _chiliAlert = Builder(name = "ChiliAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.25f, 7.5f)
                lineTo(7.73f, 6.63f)
                curveTo(8.26f, 5.7f, 9.03f, 5.0f, 9.94f, 4.69f)
                curveTo(9.8f, 4.29f, 9.44f, 4.0f, 9.0f, 4.0f)
                verticalLineTo(2.0f)
                curveTo(10.54f, 2.0f, 11.79f, 3.16f, 11.97f, 4.65f)
                curveTo(12.91f, 4.94f, 13.72f, 5.66f, 14.27f, 6.63f)
                lineTo(12.75f, 7.5f)
                lineTo(11.0f, 6.5f)
                lineTo(9.25f, 7.5f)
                moveTo(14.0f, 8.28f)
                lineTo(12.75f, 9.0f)
                lineTo(11.0f, 8.0f)
                lineTo(9.25f, 9.0f)
                lineTo(8.0f, 8.28f)
                curveTo(7.4f, 8.63f, 7.0f, 9.27f, 7.0f, 10.0f)
                verticalLineTo(11.0f)
                curveTo(7.0f, 20.0f, 15.0f, 22.0f, 15.0f, 22.0f)
                verticalLineTo(10.0f)
                curveTo(15.0f, 9.27f, 14.6f, 8.63f, 14.0f, 8.28f)
                moveTo(17.0f, 7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                moveTo(17.0f, 17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _chiliAlert!!
    }

private var _chiliAlert: ImageVector? = null
