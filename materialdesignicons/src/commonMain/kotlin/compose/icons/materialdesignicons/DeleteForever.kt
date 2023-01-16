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

public val MaterialDesignIcons.DeleteForever: ImageVector
    get() {
        if (_deleteForever != null) {
            return _deleteForever!!
        }
        _deleteForever = Builder(name = "DeleteForever", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 21.0f)
                horizontalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 19.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(19.0f)
                moveTo(8.46f, 11.88f)
                lineTo(9.87f, 10.47f)
                lineTo(12.0f, 12.59f)
                lineTo(14.12f, 10.47f)
                lineTo(15.53f, 11.88f)
                lineTo(13.41f, 14.0f)
                lineTo(15.53f, 16.12f)
                lineTo(14.12f, 17.53f)
                lineTo(12.0f, 15.41f)
                lineTo(9.88f, 17.53f)
                lineTo(8.47f, 16.12f)
                lineTo(10.59f, 14.0f)
                lineTo(8.46f, 11.88f)
                moveTo(15.5f, 4.0f)
                lineTo(14.5f, 3.0f)
                horizontalLineTo(9.5f)
                lineTo(8.5f, 4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(15.5f)
                close()
            }
        }
        .build()
        return _deleteForever!!
    }

private var _deleteForever: ImageVector? = null
