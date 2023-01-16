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

public val MaterialDesignIcons.PhoneLock: ImageVector
    get() {
        if (_phoneLock != null) {
            return _phoneLock!!
        }
        _phoneLock = Builder(name = "PhoneLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.2f, 4.0f)
                horizontalLineTo(15.8f)
                verticalLineTo(3.5f)
                curveTo(15.8f, 2.56f, 16.56f, 1.8f, 17.5f, 1.8f)
                curveTo(18.44f, 1.8f, 19.2f, 2.56f, 19.2f, 3.5f)
                moveTo(20.0f, 4.0f)
                verticalLineTo(3.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 17.5f, 1.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 15.0f, 3.5f)
                verticalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 5.0f)
                verticalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 10.0f)
                horizontalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 9.0f)
                verticalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 4.0f)
                moveTo(20.0f, 15.5f)
                curveTo(18.75f, 15.5f, 17.55f, 15.3f, 16.43f, 14.93f)
                curveTo(16.08f, 14.82f, 15.69f, 14.9f, 15.41f, 15.18f)
                lineTo(13.21f, 17.38f)
                curveTo(10.38f, 15.94f, 8.06f, 13.62f, 6.62f, 10.79f)
                lineTo(8.82f, 8.59f)
                curveTo(9.1f, 8.31f, 9.18f, 7.92f, 9.07f, 7.57f)
                curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.5f, 3.0f)
                horizontalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 4.0f)
                arcTo(17.0f, 17.0f, 0.0f, false, false, 20.0f, 21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 20.0f)
                verticalLineTo(16.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 15.5f)
                close()
            }
        }
        .build()
        return _phoneLock!!
    }

private var _phoneLock: ImageVector? = null
