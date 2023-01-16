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

public val MaterialDesignIcons.AlertOctagram: ImageVector
    get() {
        if (_alertOctagram != null) {
            return _alertOctagram!!
        }
        _alertOctagram = Builder(name = "AlertOctagram", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.2f, 16.06f)
                lineTo(3.88f, 12.0f)
                lineTo(2.2f, 7.94f)
                lineTo(6.26f, 6.26f)
                lineTo(7.94f, 2.2f)
                lineTo(12.0f, 3.88f)
                lineTo(16.06f, 2.2f)
                lineTo(17.74f, 6.26f)
                lineTo(21.8f, 7.94f)
                lineTo(20.12f, 12.0f)
                lineTo(21.8f, 16.06f)
                lineTo(17.74f, 17.74f)
                lineTo(16.06f, 21.8f)
                lineTo(12.0f, 20.12f)
                lineTo(7.94f, 21.8f)
                lineTo(6.26f, 17.74f)
                lineTo(2.2f, 16.06f)
                moveTo(13.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                moveTo(13.0f, 13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _alertOctagram!!
    }

private var _alertOctagram: ImageVector? = null
