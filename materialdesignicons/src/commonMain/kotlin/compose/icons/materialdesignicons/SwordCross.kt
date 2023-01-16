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

public val MaterialDesignIcons.SwordCross: ImageVector
    get() {
        if (_swordCross != null) {
            return _swordCross!!
        }
        _swordCross = Builder(name = "SwordCross", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.2f, 2.44f)
                lineTo(18.1f, 14.34f)
                lineTo(20.22f, 12.22f)
                lineTo(21.63f, 13.63f)
                lineTo(19.16f, 16.1f)
                lineTo(22.34f, 19.28f)
                curveTo(22.73f, 19.67f, 22.73f, 20.3f, 22.34f, 20.69f)
                lineTo(21.63f, 21.4f)
                curveTo(21.24f, 21.79f, 20.61f, 21.79f, 20.22f, 21.4f)
                lineTo(17.0f, 18.23f)
                lineTo(14.56f, 20.7f)
                lineTo(13.15f, 19.29f)
                lineTo(15.27f, 17.17f)
                lineTo(3.37f, 5.27f)
                verticalLineTo(2.44f)
                horizontalLineTo(6.2f)
                moveTo(15.89f, 10.0f)
                lineTo(20.63f, 5.26f)
                verticalLineTo(2.44f)
                horizontalLineTo(17.8f)
                lineTo(13.06f, 7.18f)
                lineTo(15.89f, 10.0f)
                moveTo(10.94f, 15.0f)
                lineTo(8.11f, 12.13f)
                lineTo(5.9f, 14.34f)
                lineTo(3.78f, 12.22f)
                lineTo(2.37f, 13.63f)
                lineTo(4.84f, 16.1f)
                lineTo(1.66f, 19.29f)
                curveTo(1.27f, 19.68f, 1.27f, 20.31f, 1.66f, 20.7f)
                lineTo(2.37f, 21.41f)
                curveTo(2.76f, 21.8f, 3.39f, 21.8f, 3.78f, 21.41f)
                lineTo(7.0f, 18.23f)
                lineTo(9.44f, 20.7f)
                lineTo(10.85f, 19.29f)
                lineTo(8.73f, 17.17f)
                lineTo(10.94f, 15.0f)
                close()
            }
        }
        .build()
        return _swordCross!!
    }

private var _swordCross: ImageVector? = null
