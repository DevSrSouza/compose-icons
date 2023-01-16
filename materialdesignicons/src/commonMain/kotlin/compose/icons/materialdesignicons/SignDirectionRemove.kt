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

public val MaterialDesignIcons.SignDirectionRemove: ImageVector
    get() {
        if (_signDirectionRemove != null) {
            return _signDirectionRemove!!
        }
        _signDirectionRemove = Builder(name = "SignDirectionRemove", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 20.0f)
                horizontalLineTo(13.09f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 13.81f, 22.0f)
                horizontalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(3.5f)
                lineTo(6.0f, 9.5f)
                lineTo(3.5f, 7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.0f)
                lineTo(12.0f, 2.0f)
                lineTo(13.0f, 3.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.0f)
                lineTo(20.5f, 9.5f)
                lineTo(18.0f, 12.0f)
                horizontalLineTo(13.0f)
                moveTo(21.12f, 15.46f)
                lineTo(19.0f, 17.59f)
                lineTo(16.88f, 15.46f)
                lineTo(15.46f, 16.88f)
                lineTo(17.59f, 19.0f)
                lineTo(15.46f, 21.12f)
                lineTo(16.88f, 22.54f)
                lineTo(19.0f, 20.41f)
                lineTo(21.12f, 22.54f)
                lineTo(22.54f, 21.12f)
                lineTo(20.41f, 19.0f)
                lineTo(22.54f, 16.88f)
                close()
            }
        }
        .build()
        return _signDirectionRemove!!
    }

private var _signDirectionRemove: ImageVector? = null
