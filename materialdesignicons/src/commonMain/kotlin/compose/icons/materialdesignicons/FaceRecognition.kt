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

public val MaterialDesignIcons.FaceRecognition: ImageVector
    get() {
        if (_faceRecognition != null) {
            return _faceRecognition!!
        }
        _faceRecognition = Builder(name = "FaceRecognition", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 11.75f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 7.75f, 13.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 9.0f, 14.25f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 10.25f, 13.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 9.0f, 11.75f)
                moveTo(15.0f, 11.75f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 13.75f, 13.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 15.0f, 14.25f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 16.25f, 13.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 15.0f, 11.75f)
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(12.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 4.0f, 12.0f)
                curveTo(3.97f, 11.71f, 3.97f, 11.43f, 4.0f, 11.14f)
                curveTo(6.38f, 10.1f, 8.27f, 8.17f, 9.26f, 5.77f)
                curveTo(11.13f, 8.42f, 14.17f, 10.0f, 17.42f, 10.0f)
                curveTo(18.18f, 10.0f, 18.93f, 9.91f, 19.67f, 9.74f)
                curveTo(20.92f, 14.0f, 18.5f, 18.43f, 14.26f, 19.67f)
                curveTo(13.5f, 19.89f, 12.76f, 20.0f, 12.0f, 20.0f)
                moveTo(0.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 0.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(2.0f)
                moveTo(24.0f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 24.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(22.0f)
                moveTo(2.0f, 24.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 0.0f, 22.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(2.0f)
                moveTo(22.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 24.0f, 2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _faceRecognition!!
    }

private var _faceRecognition: ImageVector? = null
