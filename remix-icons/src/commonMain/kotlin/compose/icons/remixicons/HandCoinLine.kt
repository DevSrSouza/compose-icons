package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.HandCoinLine: ImageVector
    get() {
        if (_handCoinLine != null) {
            return _handCoinLine!!
        }
        _handCoinLine = Builder(name = "HandCoinLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, true, 4.33f, 1.5f)
                horizontalLineToRelative(2.17f)
                curveToRelative(1.333f, 0.0f, 2.53f, 0.58f, 3.354f, 1.5f)
                lineTo(19.0f, 13.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.516f, 2.851f)
                curveTo(21.151f, 18.972f, 17.322f, 21.0f, 13.0f, 21.0f)
                curveToRelative(-2.79f, 0.0f, -5.15f, -0.603f, -7.06f, -1.658f)
                arcTo(0.998f, 0.998f, 0.0f, false, true, 5.0f, 20.0f)
                lineTo(2.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(6.001f, 12.0f)
                lineTo(6.0f, 17.022f)
                lineToRelative(0.045f, 0.032f)
                curveTo(7.84f, 18.314f, 10.178f, 19.0f, 13.0f, 19.0f)
                curveToRelative(3.004f, 0.0f, 5.799f, -1.156f, 7.835f, -3.13f)
                lineToRelative(0.133f, -0.133f)
                lineToRelative(-0.12f, -0.1f)
                arcToRelative(2.994f, 2.994f, 0.0f, false, false, -1.643f, -0.63f)
                lineTo(19.0f, 15.0f)
                horizontalLineToRelative(-2.111f)
                curveToRelative(0.072f, 0.322f, 0.111f, 0.656f, 0.111f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(6.79f, -0.001f)
                lineToRelative(-0.034f, -0.078f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, -2.092f, -1.416f)
                lineTo(12.5f, 13.5f)
                lineTo(9.57f, 13.5f)
                arcTo(4.985f, 4.985f, 0.0f, false, false, 6.002f, 12.0f)
                close()
                moveTo(4.0f, 11.0f)
                lineTo(3.0f, 11.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(18.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                close()
                moveTo(18.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(11.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                close()
                moveTo(11.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _handCoinLine!!
    }

private var _handCoinLine: ImageVector? = null
