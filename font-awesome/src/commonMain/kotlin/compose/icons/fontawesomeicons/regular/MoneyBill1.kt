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

public val RegularGroup.MoneyBill1: ImageVector
    get() {
        if (_moneyBill1 != null) {
            return _moneyBill1!!
        }
        _moneyBill1 = Builder(name = "MoneyBill1", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 256.0f)
                curveTo(400.0f, 317.9f, 349.9f, 368.0f, 288.0f, 368.0f)
                curveTo(226.1f, 368.0f, 176.0f, 317.9f, 176.0f, 256.0f)
                curveTo(176.0f, 194.1f, 226.1f, 144.0f, 288.0f, 144.0f)
                curveTo(349.9f, 144.0f, 400.0f, 194.1f, 400.0f, 256.0f)
                close()
                moveTo(272.0f, 224.0f)
                verticalLineTo(288.0f)
                horizontalLineTo(264.0f)
                curveTo(255.2f, 288.0f, 248.0f, 295.2f, 248.0f, 304.0f)
                curveTo(248.0f, 312.8f, 255.2f, 320.0f, 264.0f, 320.0f)
                horizontalLineTo(312.0f)
                curveTo(320.8f, 320.0f, 328.0f, 312.8f, 328.0f, 304.0f)
                curveTo(328.0f, 295.2f, 320.8f, 288.0f, 312.0f, 288.0f)
                horizontalLineTo(304.0f)
                verticalLineTo(208.0f)
                curveTo(304.0f, 199.2f, 296.8f, 192.0f, 288.0f, 192.0f)
                horizontalLineTo(272.0f)
                curveTo(263.2f, 192.0f, 256.0f, 199.2f, 256.0f, 208.0f)
                curveTo(256.0f, 216.8f, 263.2f, 224.0f, 272.0f, 224.0f)
                close()
                moveTo(0.0f, 128.0f)
                curveTo(0.0f, 92.65f, 28.65f, 64.0f, 64.0f, 64.0f)
                horizontalLineTo(512.0f)
                curveTo(547.3f, 64.0f, 576.0f, 92.65f, 576.0f, 128.0f)
                verticalLineTo(384.0f)
                curveTo(576.0f, 419.3f, 547.3f, 448.0f, 512.0f, 448.0f)
                horizontalLineTo(64.0f)
                curveTo(28.65f, 448.0f, 0.0f, 419.3f, 0.0f, 384.0f)
                verticalLineTo(128.0f)
                close()
                moveTo(48.0f, 176.0f)
                verticalLineTo(336.0f)
                curveTo(83.35f, 336.0f, 112.0f, 364.7f, 112.0f, 400.0f)
                horizontalLineTo(464.0f)
                curveTo(464.0f, 364.7f, 492.7f, 336.0f, 528.0f, 336.0f)
                verticalLineTo(176.0f)
                curveTo(492.7f, 176.0f, 464.0f, 147.3f, 464.0f, 112.0f)
                horizontalLineTo(112.0f)
                curveTo(112.0f, 147.3f, 83.35f, 176.0f, 48.0f, 176.0f)
                close()
            }
        }
        .build()
        return _moneyBill1!!
    }

private var _moneyBill1: ImageVector? = null
