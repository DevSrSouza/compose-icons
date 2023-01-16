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

public val MaterialDesignIcons.AccountClock: ImageVector
    get() {
        if (_accountClock != null) {
            return _accountClock!!
        }
        _accountClock = Builder(name = "AccountClock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.63f, 14.1f)
                curveTo(12.23f, 10.58f, 16.38f, 9.03f, 19.9f, 10.63f)
                curveTo(23.42f, 12.23f, 24.97f, 16.38f, 23.37f, 19.9f)
                curveTo(22.24f, 22.4f, 19.75f, 24.0f, 17.0f, 24.0f)
                curveTo(14.3f, 24.0f, 11.83f, 22.44f, 10.67f, 20.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(18.0f)
                curveTo(1.06f, 16.86f, 1.84f, 15.93f, 3.34f, 15.18f)
                curveTo(4.84f, 14.43f, 6.72f, 14.04f, 9.0f, 14.0f)
                curveTo(9.57f, 14.0f, 10.11f, 14.05f, 10.63f, 14.1f)
                verticalLineTo(14.1f)
                moveTo(9.0f, 4.0f)
                curveTo(10.12f, 4.03f, 11.06f, 4.42f, 11.81f, 5.17f)
                curveTo(12.56f, 5.92f, 12.93f, 6.86f, 12.93f, 8.0f)
                curveTo(12.93f, 9.14f, 12.56f, 10.08f, 11.81f, 10.83f)
                curveTo(11.06f, 11.58f, 10.12f, 11.95f, 9.0f, 11.95f)
                curveTo(7.88f, 11.95f, 6.94f, 11.58f, 6.19f, 10.83f)
                curveTo(5.44f, 10.08f, 5.07f, 9.14f, 5.07f, 8.0f)
                curveTo(5.07f, 6.86f, 5.44f, 5.92f, 6.19f, 5.17f)
                curveTo(6.94f, 4.42f, 7.88f, 4.03f, 9.0f, 4.0f)
                moveTo(17.0f, 22.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 22.0f, 17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 17.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 17.0f, 22.0f)
                moveTo(16.0f, 14.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(16.82f)
                lineTo(19.94f, 18.23f)
                lineTo(19.19f, 19.53f)
                lineTo(16.0f, 17.69f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _accountClock!!
    }

private var _accountClock: ImageVector? = null
