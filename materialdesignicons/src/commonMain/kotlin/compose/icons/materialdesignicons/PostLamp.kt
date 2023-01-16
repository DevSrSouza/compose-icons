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

public val MaterialDesignIcons.PostLamp: ImageVector
    get() {
        if (_postLamp != null) {
            return _postLamp!!
        }
        _postLamp = Builder(name = "PostLamp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.0f)
                lineTo(13.0f, 1.0f)
                horizontalLineTo(11.0f)
                lineTo(10.0f, 3.0f)
                lineTo(5.0f, 6.0f)
                horizontalLineTo(7.0f)
                lineTo(8.0f, 14.0f)
                lineTo(10.0f, 16.0f)
                lineTo(10.5f, 17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.5f)
                lineTo(14.0f, 16.0f)
                lineTo(16.0f, 14.0f)
                lineTo(17.0f, 6.0f)
                horizontalLineTo(19.0f)
                lineTo(14.0f, 3.0f)
                moveTo(14.16f, 13.0f)
                horizontalLineTo(9.84f)
                lineTo(9.0f, 6.0f)
                horizontalLineTo(15.0f)
                lineTo(14.16f, 13.0f)
                close()
            }
        }
        .build()
        return _postLamp!!
    }

private var _postLamp: ImageVector? = null
