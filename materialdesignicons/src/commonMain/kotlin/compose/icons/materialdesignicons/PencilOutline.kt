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

public val MaterialDesignIcons.PencilOutline: ImageVector
    get() {
        if (_pencilOutline != null) {
            return _pencilOutline!!
        }
        _pencilOutline = Builder(name = "PencilOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.06f, 9.0f)
                lineTo(15.0f, 9.94f)
                lineTo(5.92f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.08f)
                lineTo(14.06f, 9.0f)
                moveTo(17.66f, 3.0f)
                curveTo(17.41f, 3.0f, 17.15f, 3.1f, 16.96f, 3.29f)
                lineTo(15.13f, 5.12f)
                lineTo(18.88f, 8.87f)
                lineTo(20.71f, 7.04f)
                curveTo(21.1f, 6.65f, 21.1f, 6.0f, 20.71f, 5.63f)
                lineTo(18.37f, 3.29f)
                curveTo(18.17f, 3.09f, 17.92f, 3.0f, 17.66f, 3.0f)
                moveTo(14.06f, 6.19f)
                lineTo(3.0f, 17.25f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.75f)
                lineTo(17.81f, 9.94f)
                lineTo(14.06f, 6.19f)
                close()
            }
        }
        .build()
        return _pencilOutline!!
    }

private var _pencilOutline: ImageVector? = null
