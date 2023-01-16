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

public val MaterialDesignIcons.CubeScan: ImageVector
    get() {
        if (_cubeScan != null) {
            return _cubeScan!!
        }
        _cubeScan = Builder(name = "CubeScan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.5f)
                curveTo(22.0f, 20.89f, 21.84f, 21.24f, 21.54f, 21.54f)
                curveTo(21.24f, 21.84f, 20.89f, 22.0f, 20.5f, 22.0f)
                horizontalLineTo(17.0f)
                moveTo(7.0f, 22.0f)
                horizontalLineTo(3.5f)
                curveTo(3.11f, 22.0f, 2.76f, 21.84f, 2.46f, 21.54f)
                curveTo(2.16f, 21.24f, 2.0f, 20.89f, 2.0f, 20.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(22.0f)
                moveTo(17.0f, 2.0f)
                horizontalLineTo(20.5f)
                curveTo(20.89f, 2.0f, 21.24f, 2.16f, 21.54f, 2.46f)
                curveTo(21.84f, 2.76f, 22.0f, 3.11f, 22.0f, 3.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(2.0f)
                moveTo(7.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.5f)
                curveTo(2.0f, 3.11f, 2.16f, 2.76f, 2.46f, 2.46f)
                curveTo(2.76f, 2.16f, 3.11f, 2.0f, 3.5f, 2.0f)
                horizontalLineTo(7.0f)
                moveTo(13.0f, 17.25f)
                lineTo(17.0f, 14.95f)
                verticalLineTo(10.36f)
                lineTo(13.0f, 12.66f)
                verticalLineTo(17.25f)
                moveTo(12.0f, 10.92f)
                lineTo(16.0f, 8.63f)
                lineTo(12.0f, 6.28f)
                lineTo(8.0f, 8.63f)
                lineTo(12.0f, 10.92f)
                moveTo(7.0f, 14.95f)
                lineTo(11.0f, 17.25f)
                verticalLineTo(12.66f)
                lineTo(7.0f, 10.36f)
                verticalLineTo(14.95f)
                moveTo(18.23f, 7.59f)
                curveTo(18.73f, 7.91f, 19.0f, 8.34f, 19.0f, 8.91f)
                verticalLineTo(15.23f)
                curveTo(19.0f, 15.8f, 18.73f, 16.23f, 18.23f, 16.55f)
                lineTo(12.75f, 19.73f)
                curveTo(12.25f, 20.05f, 11.75f, 20.05f, 11.25f, 19.73f)
                lineTo(5.77f, 16.55f)
                curveTo(5.27f, 16.23f, 5.0f, 15.8f, 5.0f, 15.23f)
                verticalLineTo(8.91f)
                curveTo(5.0f, 8.34f, 5.27f, 7.91f, 5.77f, 7.59f)
                lineTo(11.25f, 4.41f)
                curveTo(11.5f, 4.28f, 11.75f, 4.22f, 12.0f, 4.22f)
                curveTo(12.25f, 4.22f, 12.5f, 4.28f, 12.75f, 4.41f)
                lineTo(18.23f, 7.59f)
                close()
            }
        }
        .build()
        return _cubeScan!!
    }

private var _cubeScan: ImageVector? = null
