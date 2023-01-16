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

public val MaterialDesignIcons.NewBox: ImageVector
    get() {
        if (_newBox != null) {
            return _newBox!!
        }
        _newBox = Builder(name = "NewBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                curveTo(21.11f, 4.0f, 22.0f, 4.89f, 22.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 19.11f, 21.11f, 20.0f, 20.0f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 20.0f, 2.0f, 19.11f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.89f, 2.89f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(20.0f)
                moveTo(8.5f, 15.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.25f)
                verticalLineTo(12.5f)
                lineTo(4.75f, 9.0f)
                horizontalLineTo(3.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.75f)
                verticalLineTo(11.5f)
                lineTo(7.3f, 15.0f)
                horizontalLineTo(8.5f)
                moveTo(13.5f, 10.26f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(13.75f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.64f)
                horizontalLineTo(13.5f)
                verticalLineTo(11.38f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.26f)
                horizontalLineTo(13.5f)
                moveTo(20.5f, 14.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.25f)
                verticalLineTo(13.5f)
                horizontalLineTo(18.13f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.88f)
                verticalLineTo(13.5f)
                horizontalLineTo(15.75f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.5f, 15.0f)
                horizontalLineTo(19.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.5f, 14.0f)
                close()
            }
        }
        .build()
        return _newBox!!
    }

private var _newBox: ImageVector? = null
