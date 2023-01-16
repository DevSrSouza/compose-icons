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

public val MaterialDesignIcons.MagnetOn: ImageVector
    get() {
        if (_magnetOn != null) {
            return _magnetOn!!
        }
        _magnetOn = Builder(name = "MagnetOn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 7.0f)
                verticalLineTo(13.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 21.0f, 13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 18.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.0f, 13.0f)
                verticalLineTo(7.0f)
                moveTo(17.0f, 5.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(17.0f)
                moveTo(3.0f, 5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(3.0f)
                moveTo(13.0f, 1.5f)
                lineTo(9.0f, 9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.5f)
                lineTo(15.0f, 7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(1.5f)
                close()
            }
        }
        .build()
        return _magnetOn!!
    }

private var _magnetOn: ImageVector? = null
