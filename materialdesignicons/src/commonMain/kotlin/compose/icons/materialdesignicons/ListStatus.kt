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

public val MaterialDesignIcons.ListStatus: ImageVector
    get() {
        if (_listStatus != null) {
            return _listStatus!!
        }
        _listStatus = Builder(name = "ListStatus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 11.0f)
                lineTo(13.0f, 7.5f)
                lineTo(14.4f, 6.1f)
                lineTo(16.5f, 8.2f)
                lineTo(20.7f, 4.0f)
                lineTo(22.1f, 5.4f)
                lineTo(16.5f, 11.0f)
                moveTo(11.0f, 7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                moveTo(21.0f, 13.4f)
                lineTo(19.6f, 12.0f)
                lineTo(17.0f, 14.6f)
                lineTo(14.4f, 12.0f)
                lineTo(13.0f, 13.4f)
                lineTo(15.6f, 16.0f)
                lineTo(13.0f, 18.6f)
                lineTo(14.4f, 20.0f)
                lineTo(17.0f, 17.4f)
                lineTo(19.6f, 20.0f)
                lineTo(21.0f, 18.6f)
                lineTo(18.4f, 16.0f)
                lineTo(21.0f, 13.4f)
                moveTo(11.0f, 15.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _listStatus!!
    }

private var _listStatus: ImageVector? = null
