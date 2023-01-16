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

public val MaterialDesignIcons.WallSconceOutline: ImageVector
    get() {
        if (_wallSconceOutline != null) {
            return _wallSconceOutline!!
        }
        _wallSconceOutline = Builder(name = "WallSconceOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7f, 6.0f)
                lineTo(15.92f, 11.0f)
                horizontalLineTo(10.08f)
                lineTo(12.3f, 6.0f)
                horizontalLineTo(13.7f)
                moveTo(15.0f, 4.0f)
                horizontalLineTo(11.0f)
                lineTo(7.0f, 13.0f)
                horizontalLineTo(19.0f)
                lineTo(15.0f, 4.0f)
                moveTo(4.0f, 14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _wallSconceOutline!!
    }

private var _wallSconceOutline: ImageVector? = null
