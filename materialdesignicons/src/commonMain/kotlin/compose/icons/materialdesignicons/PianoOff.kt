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

public val MaterialDesignIcons.PianoOff: ImageVector
    get() {
        if (_pianoOff != null) {
            return _pianoOff!!
        }
        _pianoOff = Builder(name = "PianoOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(2.0f, 3.89f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.11f, 2.9f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(20.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(8.0f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.89f)
                lineTo(6.8f, 8.69f)
                verticalLineTo(13.0f)
                curveTo(6.8f, 13.56f, 7.24f, 14.0f, 7.79f, 14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.0f)
                moveTo(15.0f, 20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.31f)
                curveTo(9.86f, 14.0f, 10.3f, 13.56f, 10.3f, 13.0f)
                verticalLineTo(12.19f)
                lineTo(15.0f, 16.89f)
                verticalLineTo(20.0f)
                moveTo(16.0f, 20.0f)
                verticalLineTo(17.89f)
                lineTo(18.11f, 20.0f)
                horizontalLineTo(16.0f)
                moveTo(10.3f, 7.1f)
                lineTo(5.2f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 2.0f, 22.0f, 2.9f, 22.0f, 4.0f)
                verticalLineTo(18.8f)
                lineTo(20.0f, 16.8f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.25f)
                verticalLineTo(13.0f)
                curveTo(17.25f, 13.3f, 17.13f, 13.55f, 16.93f, 13.73f)
                lineTo(13.75f, 10.55f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.3f)
                verticalLineTo(7.1f)
                close()
            }
        }
        .build()
        return _pianoOff!!
    }

private var _pianoOff: ImageVector? = null
