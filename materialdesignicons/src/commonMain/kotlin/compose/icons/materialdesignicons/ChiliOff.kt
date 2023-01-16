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

public val MaterialDesignIcons.ChiliOff: ImageVector
    get() {
        if (_chiliOff != null) {
            return _chiliOff!!
        }
        _chiliOff = Builder(name = "ChiliOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 8.28f)
                curveTo(15.6f, 8.63f, 16.0f, 9.27f, 16.0f, 10.0f)
                verticalLineTo(12.8f)
                lineTo(11.5f, 8.29f)
                lineTo(12.0f, 8.0f)
                lineTo(13.75f, 9.0f)
                lineTo(15.0f, 8.28f)
                moveTo(12.0f, 6.5f)
                lineTo(13.75f, 7.5f)
                lineTo(15.27f, 6.63f)
                curveTo(14.72f, 5.66f, 13.91f, 4.94f, 12.97f, 4.65f)
                curveTo(12.79f, 3.16f, 11.54f, 2.0f, 10.0f, 2.0f)
                verticalLineTo(4.0f)
                curveTo(10.44f, 4.0f, 10.8f, 4.29f, 10.94f, 4.69f)
                curveTo(10.26f, 4.92f, 9.66f, 5.37f, 9.17f, 5.97f)
                lineTo(10.54f, 7.34f)
                lineTo(12.0f, 6.5f)
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(8.0f, 9.9f)
                curveTo(8.0f, 9.94f, 8.0f, 9.97f, 8.0f, 10.0f)
                verticalLineTo(11.0f)
                curveTo(8.0f, 20.0f, 16.0f, 22.0f, 16.0f, 22.0f)
                verticalLineTo(17.89f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                close()
            }
        }
        .build()
        return _chiliOff!!
    }

private var _chiliOff: ImageVector? = null
