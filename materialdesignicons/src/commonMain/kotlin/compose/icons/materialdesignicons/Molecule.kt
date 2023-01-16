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

public val MaterialDesignIcons.Molecule: ImageVector
    get() {
        if (_molecule != null) {
            return _molecule!!
        }
        _molecule = Builder(name = "Molecule", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.27f, 10.0f)
                lineTo(9.0f, 7.0f)
                horizontalLineTo(14.42f)
                lineTo(15.58f, 5.0f)
                lineTo(15.5f, 4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.0f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.5f, 4.5f)
                curveTo(18.5f, 5.21f, 18.0f, 5.81f, 17.33f, 5.96f)
                lineTo(16.37f, 7.63f)
                lineTo(17.73f, 10.0f)
                lineTo(18.59f, 8.5f)
                lineTo(18.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 21.5f, 8.0f)
                curveTo(21.5f, 8.71f, 21.0f, 9.3f, 20.35f, 9.46f)
                lineTo(18.89f, 12.0f)
                lineTo(20.62f, 15.0f)
                curveTo(21.39f, 15.07f, 22.0f, 15.71f, 22.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.5f, 18.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.0f, 16.5f)
                verticalLineTo(16.24f)
                lineTo(17.73f, 14.0f)
                lineTo(16.37f, 16.37f)
                lineTo(17.33f, 18.04f)
                curveTo(18.0f, 18.19f, 18.5f, 18.79f, 18.5f, 19.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.0f, 21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.5f, 19.5f)
                lineTo(15.58f, 19.0f)
                lineTo(14.42f, 17.0f)
                horizontalLineTo(10.58f)
                lineTo(9.42f, 19.0f)
                lineTo(9.5f, 19.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 19.5f)
                curveTo(6.5f, 18.79f, 7.0f, 18.19f, 7.67f, 18.04f)
                lineTo(8.63f, 16.37f)
                lineTo(4.38f, 9.0f)
                curveTo(3.61f, 8.93f, 3.0f, 8.29f, 3.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 7.5f)
                curveTo(6.0f, 7.59f, 6.0f, 7.68f, 6.0f, 7.76f)
                lineTo(7.27f, 10.0f)
                moveTo(10.15f, 9.0f)
                lineTo(8.42f, 12.0f)
                lineTo(10.15f, 15.0f)
                horizontalLineTo(14.85f)
                lineTo(16.58f, 12.0f)
                lineTo(14.85f, 9.0f)
                horizontalLineTo(10.15f)
                close()
            }
        }
        .build()
        return _molecule!!
    }

private var _molecule: ImageVector? = null
