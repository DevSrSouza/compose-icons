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

public val MaterialDesignIcons.PlayBoxLockOpenOutline: ImageVector
    get() {
        if (_playBoxLockOpenOutline != null) {
            return _playBoxLockOpenOutline!!
        }
        _playBoxLockOpenOutline = Builder(name = "PlayBoxLockOpenOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 17.3f)
                verticalLineTo(20.8f)
                curveTo(23.0f, 21.4f, 22.4f, 22.0f, 21.7f, 22.0f)
                horizontalLineTo(16.2f)
                curveTo(15.6f, 22.0f, 15.0f, 21.4f, 15.0f, 20.7f)
                verticalLineTo(17.2f)
                curveTo(15.0f, 16.6f, 15.6f, 16.0f, 16.2f, 16.0f)
                verticalLineTo(13.5f)
                curveTo(16.2f, 12.1f, 17.6f, 11.0f, 19.0f, 11.0f)
                curveTo(20.4f, 11.0f, 21.8f, 12.1f, 21.8f, 13.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(20.5f)
                verticalLineTo(13.5f)
                curveTo(20.5f, 12.7f, 19.8f, 12.2f, 19.0f, 12.2f)
                curveTo(18.2f, 12.2f, 17.5f, 12.7f, 17.5f, 13.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.8f)
                curveTo(22.4f, 16.0f, 23.0f, 16.6f, 23.0f, 17.3f)
                moveTo(18.0f, 5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 21.0f, 2.0f, 20.1f, 2.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(2.0f, 3.89f, 2.89f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1f, 3.0f, 20.0f, 3.89f, 20.0f, 5.0f)
                verticalLineTo(9.1f)
                lineTo(19.0f, 9.0f)
                lineTo(18.0f, 9.1f)
                verticalLineTo(5.0f)
                moveTo(9.0f, 8.0f)
                lineTo(14.0f, 12.0f)
                lineTo(9.0f, 16.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _playBoxLockOpenOutline!!
    }

private var _playBoxLockOpenOutline: ImageVector? = null
