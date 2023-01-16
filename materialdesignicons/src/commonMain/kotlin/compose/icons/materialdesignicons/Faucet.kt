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

public val MaterialDesignIcons.Faucet: ImageVector
    get() {
        if (_faucet != null) {
            return _faucet!!
        }
        _faucet = Builder(name = "Faucet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.28f)
                lineTo(19.0f, 14.0f)
                moveTo(19.0f, 13.0f)
                curveTo(19.0f, 11.9f, 18.0f, 11.0f, 16.8f, 11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.91f)
                lineTo(19.0f, 13.0f)
                moveTo(5.0f, 9.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(7.0f)
                lineTo(15.36f, 5.21f)
                curveTo(15.74f, 5.09f, 16.0f, 4.73f, 16.0f, 4.33f)
                curveTo(16.0f, 3.68f, 15.36f, 3.23f, 14.75f, 3.45f)
                lineTo(5.0f, 7.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _faucet!!
    }

private var _faucet: ImageVector? = null
