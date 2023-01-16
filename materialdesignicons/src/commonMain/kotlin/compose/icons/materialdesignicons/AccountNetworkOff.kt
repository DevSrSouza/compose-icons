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

public val MaterialDesignIcons.AccountNetworkOff: ImageVector
    get() {
        if (_accountNetworkOff != null) {
            return _accountNetworkOff!!
        }
        _accountNetworkOff = Builder(name = "AccountNetworkOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.03f, 9.83f)
                lineTo(8.67f, 5.47f)
                curveTo(9.11f, 4.04f, 10.43f, 3.0f, 12.0f, 3.0f)
                curveTo(13.93f, 3.0f, 15.5f, 4.57f, 15.5f, 6.5f)
                curveTo(15.5f, 8.07f, 14.46f, 9.39f, 13.03f, 9.83f)
                moveTo(19.0f, 15.5f)
                curveTo(19.0f, 14.26f, 17.7f, 13.17f, 15.75f, 12.55f)
                lineTo(19.0f, 15.8f)
                verticalLineTo(15.5f)
                moveTo(22.0f, 22.0f)
                horizontalLineTo(21.57f)
                lineTo(20.84f, 22.73f)
                lineTo(20.11f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 22.55f, 14.55f, 23.0f, 14.0f, 23.0f)
                horizontalLineTo(10.0f)
                curveTo(9.45f, 23.0f, 9.0f, 22.55f, 9.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 19.45f, 9.45f, 19.0f, 10.0f, 19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.5f)
                curveTo(5.0f, 13.88f, 7.22f, 12.5f, 10.23f, 12.12f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.0f, 21.34f)
                verticalLineTo(21.35f)
                lineTo(22.11f, 21.46f)
                lineTo(22.0f, 21.57f)
                verticalLineTo(22.0f)
                moveTo(18.11f, 20.0f)
                lineTo(15.11f, 17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                curveTo(14.55f, 19.0f, 15.0f, 19.45f, 15.0f, 20.0f)
                horizontalLineTo(18.11f)
                close()
            }
        }
        .build()
        return _accountNetworkOff!!
    }

private var _accountNetworkOff: ImageVector? = null
