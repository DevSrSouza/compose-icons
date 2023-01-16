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

public val MaterialDesignIcons.PodiumBronze: ImageVector
    get() {
        if (_podiumBronze != null) {
            return _podiumBronze!!
        }
        _podiumBronze = Builder(name = "PodiumBronze", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 13.09f)
                lineTo(6.45f, 14.58f)
                lineTo(5.8f, 11.77f)
                lineTo(8.0f, 9.89f)
                lineTo(5.11f, 9.64f)
                lineTo(4.0f, 7.0f)
                lineTo(2.87f, 9.64f)
                lineTo(0.0f, 9.89f)
                lineTo(2.18f, 11.77f)
                lineTo(1.5f, 14.58f)
                lineTo(4.0f, 13.09f)
                moveTo(7.0f, 23.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(23.0f)
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
                moveTo(17.0f, 13.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                moveTo(21.0f, 21.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _podiumBronze!!
    }

private var _podiumBronze: ImageVector? = null
