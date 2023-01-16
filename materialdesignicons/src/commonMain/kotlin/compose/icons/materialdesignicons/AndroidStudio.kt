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

public val MaterialDesignIcons.AndroidStudio: ImageVector
    get() {
        if (_androidStudio != null) {
            return _androidStudio!!
        }
        _androidStudio = Builder(name = "AndroidStudio", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.0f, 5.5f)
                verticalLineTo(9.0f)
                lineTo(14.56f, 9.44f)
                lineTo(16.2f, 12.28f)
                curveTo(17.31f, 11.19f, 18.0f, 9.68f, 18.0f, 8.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 10.42f, 18.93f, 12.59f, 17.23f, 14.06f)
                lineTo(20.37f, 19.5f)
                lineTo(20.5f, 21.72f)
                lineTo(18.63f, 20.5f)
                lineTo(15.56f, 15.17f)
                curveTo(14.5f, 15.7f, 13.28f, 16.0f, 12.0f, 16.0f)
                curveTo(10.72f, 16.0f, 9.5f, 15.7f, 8.44f, 15.17f)
                lineTo(5.37f, 20.5f)
                lineTo(3.5f, 21.72f)
                lineTo(3.63f, 19.5f)
                lineTo(9.44f, 9.44f)
                lineTo(9.0f, 9.0f)
                verticalLineTo(5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                moveTo(9.44f, 13.43f)
                curveTo(10.22f, 13.8f, 11.09f, 14.0f, 12.0f, 14.0f)
                curveTo(12.91f, 14.0f, 13.78f, 13.8f, 14.56f, 13.43f)
                lineTo(13.1f, 10.9f)
                horizontalLineTo(13.09f)
                curveTo(12.47f, 11.5f, 11.53f, 11.5f, 10.91f, 10.9f)
                horizontalLineTo(10.9f)
                lineTo(9.44f, 13.43f)
                moveTo(12.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 6.0f)
                close()
            }
        }
        .build()
        return _androidStudio!!
    }

private var _androidStudio: ImageVector? = null
