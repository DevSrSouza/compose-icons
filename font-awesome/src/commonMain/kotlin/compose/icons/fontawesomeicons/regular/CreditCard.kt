package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.CreditCard: ImageVector
    get() {
        if (_creditCard != null) {
            return _creditCard!!
        }
        _creditCard = Builder(name = "CreditCard", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 336.0f)
                curveTo(181.3f, 336.0f, 192.0f, 346.7f, 192.0f, 360.0f)
                curveTo(192.0f, 373.3f, 181.3f, 384.0f, 168.0f, 384.0f)
                horizontalLineTo(120.0f)
                curveTo(106.7f, 384.0f, 96.0f, 373.3f, 96.0f, 360.0f)
                curveTo(96.0f, 346.7f, 106.7f, 336.0f, 120.0f, 336.0f)
                horizontalLineTo(168.0f)
                close()
                moveTo(360.0f, 336.0f)
                curveTo(373.3f, 336.0f, 384.0f, 346.7f, 384.0f, 360.0f)
                curveTo(384.0f, 373.3f, 373.3f, 384.0f, 360.0f, 384.0f)
                horizontalLineTo(248.0f)
                curveTo(234.7f, 384.0f, 224.0f, 373.3f, 224.0f, 360.0f)
                curveTo(224.0f, 346.7f, 234.7f, 336.0f, 248.0f, 336.0f)
                horizontalLineTo(360.0f)
                close()
                moveTo(512.0f, 32.0f)
                curveTo(547.3f, 32.0f, 576.0f, 60.65f, 576.0f, 96.0f)
                verticalLineTo(416.0f)
                curveTo(576.0f, 451.3f, 547.3f, 480.0f, 512.0f, 480.0f)
                horizontalLineTo(64.0f)
                curveTo(28.65f, 480.0f, 0.0f, 451.3f, 0.0f, 416.0f)
                verticalLineTo(96.0f)
                curveTo(0.0f, 60.65f, 28.65f, 32.0f, 64.0f, 32.0f)
                horizontalLineTo(512.0f)
                close()
                moveTo(512.0f, 80.0f)
                horizontalLineTo(64.0f)
                curveTo(55.16f, 80.0f, 48.0f, 87.16f, 48.0f, 96.0f)
                verticalLineTo(128.0f)
                horizontalLineTo(528.0f)
                verticalLineTo(96.0f)
                curveTo(528.0f, 87.16f, 520.8f, 80.0f, 512.0f, 80.0f)
                close()
                moveTo(528.0f, 224.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(416.0f)
                curveTo(48.0f, 424.8f, 55.16f, 432.0f, 64.0f, 432.0f)
                horizontalLineTo(512.0f)
                curveTo(520.8f, 432.0f, 528.0f, 424.8f, 528.0f, 416.0f)
                verticalLineTo(224.0f)
                close()
            }
        }
        .build()
        return _creditCard!!
    }

private var _creditCard: ImageVector? = null
