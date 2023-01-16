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

public val MaterialDesignIcons.SignDirectionMinus: ImageVector
    get() {
        if (_signDirectionMinus != null) {
            return _signDirectionMinus!!
        }
        _signDirectionMinus = Builder(name = "SignDirectionMinus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 9.5f)
                lineTo(18.0f, 12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
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
                moveTo(23.0f, 18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                close()
            }
        }
        .build()
        return _signDirectionMinus!!
    }

private var _signDirectionMinus: ImageVector? = null
