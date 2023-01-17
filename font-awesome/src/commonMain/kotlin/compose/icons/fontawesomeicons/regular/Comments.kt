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

public val RegularGroup.Comments: ImageVector
    get() {
        if (_comments != null) {
            return _comments!!
        }
        _comments = Builder(name = "Comments", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 0.0f)
                curveTo(322.9f, 0.0f, 416.0f, 78.8f, 416.0f, 176.0f)
                curveTo(416.0f, 273.2f, 322.9f, 352.0f, 208.0f, 352.0f)
                curveTo(189.3f, 352.0f, 171.2f, 349.7f, 153.9f, 345.8f)
                curveTo(123.3f, 364.8f, 79.13f, 384.0f, 24.95f, 384.0f)
                curveTo(14.97f, 384.0f, 5.93f, 378.1f, 2.018f, 368.9f)
                curveTo(-1.896f, 359.7f, -0.007f, 349.1f, 6.739f, 341.9f)
                curveTo(7.26f, 341.5f, 29.38f, 317.4f, 45.73f, 285.9f)
                curveTo(17.18f, 255.8f, 0.0f, 217.6f, 0.0f, 176.0f)
                curveTo(0.0f, 78.8f, 93.13f, 0.0f, 208.0f, 0.0f)
                close()
                moveTo(164.6f, 298.1f)
                curveTo(179.2f, 302.3f, 193.8f, 304.0f, 208.0f, 304.0f)
                curveTo(296.2f, 304.0f, 368.0f, 246.6f, 368.0f, 176.0f)
                curveTo(368.0f, 105.4f, 296.2f, 48.0f, 208.0f, 48.0f)
                curveTo(119.8f, 48.0f, 48.0f, 105.4f, 48.0f, 176.0f)
                curveTo(48.0f, 211.2f, 65.71f, 237.2f, 80.57f, 252.9f)
                lineTo(104.1f, 277.8f)
                lineTo(88.31f, 308.1f)
                curveTo(84.74f, 314.1f, 80.73f, 321.9f, 76.55f, 328.5f)
                curveTo(94.26f, 323.4f, 111.7f, 315.5f, 128.7f, 304.1f)
                lineTo(145.4f, 294.6f)
                lineTo(164.6f, 298.1f)
                close()
                moveTo(441.6f, 128.2f)
                curveTo(552.0f, 132.4f, 640.0f, 209.5f, 640.0f, 304.0f)
                curveTo(640.0f, 345.6f, 622.8f, 383.8f, 594.3f, 413.9f)
                curveTo(610.6f, 445.4f, 632.7f, 469.5f, 633.3f, 469.9f)
                curveTo(640.0f, 477.1f, 641.9f, 487.7f, 637.1f, 496.9f)
                curveTo(634.1f, 506.1f, 625.0f, 512.0f, 615.0f, 512.0f)
                curveTo(560.9f, 512.0f, 516.7f, 492.8f, 486.1f, 473.8f)
                curveTo(468.8f, 477.7f, 450.7f, 480.0f, 432.0f, 480.0f)
                curveTo(350.0f, 480.0f, 279.1f, 439.8f, 245.2f, 381.5f)
                curveTo(262.5f, 379.2f, 279.1f, 375.3f, 294.9f, 369.9f)
                curveTo(322.9f, 407.1f, 373.9f, 432.0f, 432.0f, 432.0f)
                curveTo(446.2f, 432.0f, 460.8f, 430.3f, 475.4f, 426.1f)
                lineTo(494.6f, 422.6f)
                lineTo(511.3f, 432.1f)
                curveTo(528.3f, 443.5f, 545.7f, 451.4f, 563.5f, 456.5f)
                curveTo(559.3f, 449.9f, 555.3f, 442.1f, 551.7f, 436.1f)
                lineTo(535.9f, 405.8f)
                lineTo(559.4f, 380.9f)
                curveTo(574.3f, 365.3f, 592.0f, 339.2f, 592.0f, 304.0f)
                curveTo(592.0f, 237.7f, 528.7f, 183.1f, 447.1f, 176.6f)
                lineTo(448.0f, 176.0f)
                curveTo(448.0f, 159.5f, 445.8f, 143.5f, 441.6f, 128.2f)
                horizontalLineTo(441.6f)
                close()
            }
        }
        .build()
        return _comments!!
    }

private var _comments: ImageVector? = null
