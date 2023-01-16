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

public val MaterialDesignIcons.SyncOff: ImageVector
    get() {
        if (_syncOff != null) {
            return _syncOff!!
        }
        _syncOff = Builder(name = "SyncOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                lineTo(16.24f, 7.76f)
                curveTo(17.32f, 8.85f, 18.0f, 10.34f, 18.0f, 12.0f)
                curveTo(18.0f, 13.0f, 17.75f, 13.94f, 17.32f, 14.77f)
                lineTo(18.78f, 16.23f)
                curveTo(19.55f, 15.0f, 20.0f, 13.56f, 20.0f, 12.0f)
                curveTo(20.0f, 9.79f, 19.09f, 7.8f, 17.64f, 6.36f)
                lineTo(20.0f, 4.0f)
                moveTo(2.86f, 5.41f)
                lineTo(5.22f, 7.77f)
                curveTo(4.45f, 9.0f, 4.0f, 10.44f, 4.0f, 12.0f)
                curveTo(4.0f, 14.21f, 4.91f, 16.2f, 6.36f, 17.64f)
                lineTo(4.0f, 20.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                lineTo(7.76f, 16.24f)
                curveTo(6.68f, 15.15f, 6.0f, 13.66f, 6.0f, 12.0f)
                curveTo(6.0f, 11.0f, 6.25f, 10.06f, 6.68f, 9.23f)
                lineTo(14.76f, 17.31f)
                curveTo(14.5f, 17.44f, 14.26f, 17.56f, 14.0f, 17.65f)
                verticalLineTo(19.74f)
                curveTo(14.79f, 19.53f, 15.54f, 19.2f, 16.22f, 18.78f)
                lineTo(18.58f, 21.14f)
                lineTo(19.85f, 19.87f)
                lineTo(4.14f, 4.14f)
                lineTo(2.86f, 5.41f)
                moveTo(10.0f, 6.35f)
                verticalLineTo(4.26f)
                curveTo(9.2f, 4.47f, 8.45f, 4.8f, 7.77f, 5.22f)
                lineTo(9.23f, 6.68f)
                curveTo(9.5f, 6.56f, 9.73f, 6.44f, 10.0f, 6.35f)
                close()
            }
        }
        .build()
        return _syncOff!!
    }

private var _syncOff: ImageVector? = null
