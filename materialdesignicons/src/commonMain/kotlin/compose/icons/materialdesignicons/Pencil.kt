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

public val MaterialDesignIcons.Pencil: ImageVector
    get() {
        if (_pencil != null) {
            return _pencil!!
        }
        _pencil = Builder(name = "Pencil", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.71f, 7.04f)
                curveTo(21.1f, 6.65f, 21.1f, 6.0f, 20.71f, 5.63f)
                lineTo(18.37f, 3.29f)
                curveTo(18.0f, 2.9f, 17.35f, 2.9f, 16.96f, 3.29f)
                lineTo(15.12f, 5.12f)
                lineTo(18.87f, 8.87f)
                moveTo(3.0f, 17.25f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.75f)
                lineTo(17.81f, 9.93f)
                lineTo(14.06f, 6.18f)
                lineTo(3.0f, 17.25f)
                close()
            }
        }
        .build()
        return _pencil!!
    }

private var _pencil: ImageVector? = null
