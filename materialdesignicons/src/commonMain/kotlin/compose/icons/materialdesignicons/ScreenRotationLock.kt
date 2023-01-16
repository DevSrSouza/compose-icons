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

public val MaterialDesignIcons.ScreenRotationLock: ImageVector
    get() {
        if (_screenRotationLock != null) {
            return _screenRotationLock!!
        }
        _screenRotationLock = Builder(name = "ScreenRotationLock", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.8f, 2.5f)
                curveTo(16.8f, 1.56f, 17.56f, 0.8f, 18.5f, 0.8f)
                curveTo(19.44f, 0.8f, 20.2f, 1.56f, 20.2f, 2.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.8f)
                verticalLineTo(2.5f)
                moveTo(16.0f, 9.0f)
                horizontalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.0f, 8.0f)
                verticalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 3.0f)
                verticalLineTo(2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.5f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.0f, 2.5f)
                verticalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 4.0f)
                verticalLineTo(8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 9.0f)
                moveTo(8.47f, 20.5f)
                curveTo(5.2f, 18.94f, 2.86f, 15.76f, 2.5f, 12.0f)
                horizontalLineTo(1.0f)
                curveTo(1.5f, 18.16f, 6.66f, 23.0f, 12.95f, 23.0f)
                lineTo(13.61f, 22.97f)
                lineTo(9.8f, 19.15f)
                lineTo(8.47f, 20.5f)
                moveTo(23.25f, 12.77f)
                lineTo(20.68f, 10.2f)
                lineTo(19.27f, 11.61f)
                lineTo(21.5f, 13.83f)
                lineTo(15.83f, 19.5f)
                lineTo(4.5f, 8.17f)
                lineTo(10.17f, 2.5f)
                lineTo(12.27f, 4.61f)
                lineTo(13.68f, 3.2f)
                lineTo(11.23f, 0.75f)
                curveTo(10.64f, 0.16f, 9.69f, 0.16f, 9.11f, 0.75f)
                lineTo(2.75f, 7.11f)
                curveTo(2.16f, 7.7f, 2.16f, 8.65f, 2.75f, 9.23f)
                lineTo(14.77f, 21.25f)
                curveTo(15.36f, 21.84f, 16.31f, 21.84f, 16.89f, 21.25f)
                lineTo(23.25f, 14.89f)
                curveTo(23.84f, 14.3f, 23.84f, 13.35f, 23.25f, 12.77f)
                close()
            }
        }
        .build()
        return _screenRotationLock!!
    }

private var _screenRotationLock: ImageVector? = null
