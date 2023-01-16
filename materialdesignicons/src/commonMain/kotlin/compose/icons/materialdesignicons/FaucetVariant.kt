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

public val MaterialDesignIcons.FaucetVariant: ImageVector
    get() {
        if (_faucetVariant != null) {
            return _faucetVariant!!
        }
        _faucetVariant = Builder(name = "FaucetVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 19.9f, 3.9f, 19.0f, 5.0f, 19.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 19.0f, 21.0f, 19.89f, 21.0f, 21.0f)
                moveTo(19.0f, 7.0f)
                curveTo(19.0f, 5.39f, 17.93f, 3.0f, 15.0f, 3.0f)
                reflectiveCurveTo(11.0f, 5.39f, 11.0f, 7.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                curveTo(13.0f, 6.54f, 13.17f, 5.0f, 15.0f, 5.0f)
                reflectiveCurveTo(17.0f, 6.54f, 17.0f, 7.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                moveTo(7.0f, 12.0f)
                curveTo(6.45f, 12.0f, 6.0f, 12.45f, 6.0f, 13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                curveTo(8.0f, 12.45f, 7.55f, 12.0f, 7.0f, 12.0f)
                moveTo(21.0f, 14.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                curveTo(18.0f, 12.45f, 17.55f, 12.0f, 17.0f, 12.0f)
                reflectiveCurveTo(16.0f, 12.45f, 16.0f, 13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _faucetVariant!!
    }

private var _faucetVariant: ImageVector? = null
