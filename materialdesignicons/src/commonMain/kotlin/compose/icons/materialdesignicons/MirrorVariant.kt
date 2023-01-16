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

public val MaterialDesignIcons.MirrorVariant: ImageVector
    get() {
        if (_mirrorVariant != null) {
            return _mirrorVariant!!
        }
        _mirrorVariant = Builder(name = "MirrorVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.29f, 10.28f)
                lineTo(11.53f, 7.03f)
                lineTo(12.59f, 8.09f)
                lineTo(9.35f, 11.34f)
                lineTo(8.29f, 10.28f)
                moveTo(8.7f, 14.61f)
                lineTo(14.36f, 8.95f)
                lineTo(15.42f, 10.0f)
                lineTo(9.76f, 15.67f)
                lineTo(8.7f, 14.61f)
                moveTo(14.17f, 3.0f)
                lineTo(18.0f, 6.83f)
                verticalLineTo(17.17f)
                lineTo(14.17f, 21.0f)
                horizontalLineTo(9.83f)
                lineTo(6.0f, 17.17f)
                verticalLineTo(6.83f)
                lineTo(9.83f, 3.0f)
                horizontalLineTo(14.17f)
                moveTo(15.0f, 1.0f)
                horizontalLineTo(9.0f)
                lineTo(4.0f, 6.0f)
                verticalLineTo(18.0f)
                lineTo(9.0f, 23.0f)
                horizontalLineTo(15.0f)
                lineTo(20.0f, 18.0f)
                verticalLineTo(6.0f)
                lineTo(15.0f, 1.0f)
                close()
            }
        }
        .build()
        return _mirrorVariant!!
    }

private var _mirrorVariant: ImageVector? = null
