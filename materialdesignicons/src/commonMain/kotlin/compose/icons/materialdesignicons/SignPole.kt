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

public val MaterialDesignIcons.SignPole: ImageVector
    get() {
        if (_signPole != null) {
            return _signPole!!
        }
        _signPole = Builder(name = "SignPole", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 3.0f)
                lineTo(12.0f, 2.0f)
                lineTo(13.0f, 3.0f)
                verticalLineTo(20.0f)
                curveTo(14.11f, 20.0f, 15.0f, 20.9f, 15.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 20.9f, 9.9f, 20.0f, 11.0f, 20.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _signPole!!
    }

private var _signPole: ImageVector? = null
