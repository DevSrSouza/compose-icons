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

public val MaterialDesignIcons.GuyFawkesMask: ImageVector
    get() {
        if (_guyFawkesMask != null) {
            return _guyFawkesMask!!
        }
        _guyFawkesMask = Builder(name = "GuyFawkesMask", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 13.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 3.0f, 13.0f)
                lineTo(3.03f, 4.43f)
                curveTo(5.68f, 2.88f, 8.76f, 2.0f, 12.05f, 2.0f)
                curveTo(15.3f, 2.0f, 18.36f, 2.87f, 21.0f, 4.38f)
                verticalLineTo(13.0f)
                moveTo(13.0f, 19.93f)
                curveTo(16.39f, 19.44f, 19.0f, 16.5f, 19.0f, 13.0f)
                verticalLineTo(5.59f)
                curveTo(16.9f, 4.57f, 14.54f, 4.0f, 12.05f, 4.0f)
                curveTo(9.5f, 4.0f, 7.08f, 4.6f, 4.94f, 5.66f)
                lineTo(5.0f, 13.0f)
                curveTo(5.0f, 16.5f, 7.63f, 19.44f, 11.0f, 19.93f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.93f)
                moveTo(11.0f, 16.0f)
                horizontalLineTo(8.0f)
                lineTo(6.0f, 13.0f)
                lineTo(9.0f, 14.0f)
                horizontalLineTo(10.0f)
                lineTo(11.0f, 13.0f)
                horizontalLineTo(13.0f)
                lineTo(14.0f, 14.0f)
                horizontalLineTo(15.0f)
                lineTo(18.0f, 13.0f)
                lineTo(16.0f, 16.0f)
                horizontalLineTo(13.0f)
                lineTo(12.0f, 15.0f)
                lineTo(11.0f, 16.0f)
                moveTo(6.0f, 9.03f)
                curveTo(6.64f, 8.4f, 7.5f, 8.05f, 8.5f, 8.05f)
                curveTo(9.45f, 8.05f, 10.34f, 8.4f, 11.0f, 9.03f)
                curveTo(10.34f, 9.65f, 9.45f, 10.0f, 8.5f, 10.0f)
                curveTo(7.5f, 10.0f, 6.64f, 9.65f, 6.0f, 9.03f)
                moveTo(13.0f, 9.03f)
                curveTo(13.64f, 8.4f, 14.5f, 8.05f, 15.5f, 8.05f)
                curveTo(16.45f, 8.05f, 17.34f, 8.4f, 18.0f, 9.03f)
                curveTo(17.34f, 9.65f, 16.45f, 10.0f, 15.5f, 10.0f)
                curveTo(14.5f, 10.0f, 13.64f, 9.65f, 13.0f, 9.03f)
                close()
            }
        }
        .build()
        return _guyFawkesMask!!
    }

private var _guyFawkesMask: ImageVector? = null
