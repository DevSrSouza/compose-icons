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

public val MaterialDesignIcons.PodiumSilver: ImageVector
    get() {
        if (_podiumSilver != null) {
            return _podiumSilver!!
        }
        _podiumSilver = Builder(name = "PodiumSilver", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.09f)
                lineTo(22.45f, 11.58f)
                lineTo(21.8f, 8.77f)
                lineTo(24.0f, 6.89f)
                lineTo(21.11f, 6.64f)
                lineTo(20.0f, 4.0f)
                lineTo(18.87f, 6.64f)
                lineTo(16.0f, 6.89f)
                lineTo(18.18f, 8.77f)
                lineTo(17.5f, 11.58f)
                lineTo(20.0f, 10.09f)
                moveTo(23.0f, 23.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(23.0f)
                moveTo(1.0f, 17.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(1.0f)
                moveTo(5.0f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.0f)
                moveTo(9.0f, 10.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                moveTo(13.0f, 21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _podiumSilver!!
    }

private var _podiumSilver: ImageVector? = null
