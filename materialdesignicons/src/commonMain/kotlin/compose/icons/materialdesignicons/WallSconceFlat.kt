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

public val MaterialDesignIcons.WallSconceFlat: ImageVector
    get() {
        if (_wallSconceFlat != null) {
            return _wallSconceFlat!!
        }
        _wallSconceFlat = Builder(name = "WallSconceFlat", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                moveTo(5.27f, 13.32f)
                lineTo(3.5f, 15.09f)
                lineTo(4.91f, 16.5f)
                lineTo(6.68f, 14.73f)
                lineTo(5.27f, 13.32f)
                moveTo(18.73f, 13.32f)
                lineTo(17.32f, 14.73f)
                lineTo(19.09f, 16.5f)
                lineTo(20.5f, 15.09f)
                lineTo(18.73f, 13.32f)
                moveTo(11.0f, 16.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _wallSconceFlat!!
    }

private var _wallSconceFlat: ImageVector? = null
