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

public val MaterialDesignIcons.CameraFlip: ImageVector
    get() {
        if (_cameraFlip != null) {
            return _cameraFlip!!
        }
        _cameraFlip = Builder(name = "CameraFlip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                horizontalLineTo(17.0f)
                lineTo(15.0f, 3.0f)
                horizontalLineTo(9.0f)
                lineTo(7.0f, 5.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 5.0f, 2.0f, 5.9f, 2.0f, 7.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 20.11f, 2.9f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 21.0f, 22.0f, 20.11f, 22.0f, 19.0f)
                verticalLineTo(7.0f)
                curveTo(22.0f, 5.9f, 21.11f, 5.0f, 20.0f, 5.0f)
                moveTo(5.0f, 12.0f)
                horizontalLineTo(7.1f)
                curveTo(7.65f, 9.29f, 10.29f, 7.55f, 13.0f, 8.1f)
                curveTo(13.76f, 8.25f, 14.43f, 8.59f, 15.0f, 9.0f)
                lineTo(13.56f, 10.45f)
                curveTo(13.11f, 10.17f, 12.58f, 10.0f, 12.0f, 10.0f)
                curveTo(10.74f, 10.0f, 9.6f, 10.8f, 9.18f, 12.0f)
                horizontalLineTo(11.0f)
                lineTo(8.0f, 15.0f)
                lineTo(5.0f, 12.0f)
                moveTo(16.91f, 14.0f)
                curveTo(16.36f, 16.71f, 13.72f, 18.45f, 11.0f, 17.9f)
                curveTo(10.25f, 17.74f, 9.58f, 17.41f, 9.0f, 17.0f)
                lineTo(10.44f, 15.55f)
                curveTo(10.9f, 15.83f, 11.43f, 16.0f, 12.0f, 16.0f)
                curveTo(13.27f, 16.0f, 14.41f, 15.2f, 14.83f, 14.0f)
                horizontalLineTo(13.0f)
                lineTo(16.0f, 11.0f)
                lineTo(19.0f, 14.0f)
                horizontalLineTo(16.91f)
                close()
            }
        }
        .build()
        return _cameraFlip!!
    }

private var _cameraFlip: ImageVector? = null
