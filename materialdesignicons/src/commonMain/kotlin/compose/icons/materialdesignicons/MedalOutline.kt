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

public val MaterialDesignIcons.MedalOutline: ImageVector
    get() {
        if (_medalOutline != null) {
            return _medalOutline!!
        }
        _medalOutline = Builder(name = "MedalOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.94f, 19.5f)
                lineTo(12.0f, 17.77f)
                lineTo(9.06f, 19.5f)
                lineTo(9.84f, 16.16f)
                lineTo(7.25f, 13.92f)
                lineTo(10.66f, 13.63f)
                lineTo(12.0f, 10.5f)
                lineTo(13.34f, 13.63f)
                lineTo(16.75f, 13.92f)
                lineTo(14.16f, 16.16f)
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                lineTo(8.86f, 7.64f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 15.14f, 7.64f)
                lineTo(20.0f, 4.0f)
                moveTo(18.0f, 15.0f)
                arcTo(6.0f, 6.0f, 0.0f, true, true, 10.82f, 9.12f)
                arcTo(5.86f, 5.86f, 0.0f, false, true, 13.18f, 9.12f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 18.0f, 15.0f)
                moveTo(12.63f, 7.0f)
                horizontalLineTo(11.37f)
                lineTo(7.37f, 4.0f)
                horizontalLineTo(16.71f)
                close()
            }
        }
        .build()
        return _medalOutline!!
    }

private var _medalOutline: ImageVector? = null
