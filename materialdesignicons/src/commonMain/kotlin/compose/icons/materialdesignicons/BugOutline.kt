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

public val MaterialDesignIcons.BugOutline: ImageVector
    get() {
        if (_bugOutline != null) {
            return _bugOutline!!
        }
        _bugOutline = Builder(name = "BugOutline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                horizontalLineTo(17.19f)
                curveTo(16.74f, 7.2f, 16.12f, 6.5f, 15.37f, 6.0f)
                lineTo(17.0f, 4.41f)
                lineTo(15.59f, 3.0f)
                lineTo(13.42f, 5.17f)
                curveTo(12.96f, 5.06f, 12.5f, 5.0f, 12.0f, 5.0f)
                curveTo(11.5f, 5.0f, 11.05f, 5.06f, 10.59f, 5.17f)
                lineTo(8.41f, 3.0f)
                lineTo(7.0f, 4.41f)
                lineTo(8.62f, 6.0f)
                curveTo(7.87f, 6.5f, 7.26f, 7.21f, 6.81f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.09f)
                curveTo(6.03f, 10.33f, 6.0f, 10.66f, 6.0f, 11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                curveTo(6.0f, 15.34f, 6.03f, 15.67f, 6.09f, 16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.81f)
                curveTo(8.47f, 20.87f, 12.14f, 21.84f, 15.0f, 20.18f)
                curveTo(15.91f, 19.66f, 16.67f, 18.9f, 17.19f, 18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.91f)
                curveTo(17.97f, 15.67f, 18.0f, 15.34f, 18.0f, 15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                curveTo(18.0f, 10.66f, 17.97f, 10.33f, 17.91f, 10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                moveTo(16.0f, 15.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 19.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 15.0f)
                verticalLineTo(11.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 7.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 11.0f)
                verticalLineTo(15.0f)
                moveTo(14.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                moveTo(10.0f, 14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _bugOutline!!
    }

private var _bugOutline: ImageVector? = null
