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

public val MaterialDesignIcons.TelevisionAmbientLight: ImageVector
    get() {
        if (_televisionAmbientLight != null) {
            return _televisionAmbientLight!!
        }
        _televisionAmbientLight = Builder(name = "TelevisionAmbientLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 11.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                moveTo(3.0f, 14.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.0f)
                moveTo(5.0f, 5.12f)
                lineTo(2.88f, 3.0f)
                lineTo(1.46f, 4.41f)
                lineTo(3.59f, 6.54f)
                lineTo(5.0f, 5.12f)
                moveTo(10.0f, 5.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.0f)
                moveTo(24.0f, 9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(9.0f)
                moveTo(16.0f, 5.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.0f)
                moveTo(20.41f, 6.54f)
                lineTo(22.54f, 4.42f)
                lineTo(21.12f, 3.0f)
                lineTo(19.0f, 5.12f)
                lineTo(20.41f, 6.54f)
                moveTo(24.0f, 14.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(14.0f)
                moveTo(19.0f, 9.0f)
                verticalLineTo(16.0f)
                curveTo(19.0f, 17.1f, 18.1f, 18.0f, 17.0f, 18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 18.0f, 5.0f, 17.1f, 5.0f, 16.0f)
                verticalLineTo(9.0f)
                curveTo(5.0f, 7.9f, 5.9f, 7.0f, 7.0f, 7.0f)
                horizontalLineTo(17.0f)
                curveTo(18.1f, 7.0f, 19.0f, 7.9f, 19.0f, 9.0f)
                moveTo(17.0f, 9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                moveTo(19.0f, 19.88f)
                lineTo(21.12f, 22.0f)
                lineTo(22.54f, 20.59f)
                lineTo(20.41f, 18.47f)
                lineTo(19.0f, 19.88f)
                moveTo(3.59f, 18.46f)
                lineTo(1.47f, 20.59f)
                lineTo(2.88f, 22.0f)
                lineTo(5.0f, 19.88f)
                lineTo(3.59f, 18.46f)
                close()
            }
        }
        .build()
        return _televisionAmbientLight!!
    }

private var _televisionAmbientLight: ImageVector? = null
