package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Turbo: ImageVector
    get() {
        if (_turbo != null) {
            return _turbo!!
        }
        _turbo = Builder(name = "Turbo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.2672f, 0.0f)
                horizontalLineTo(0.7368f)
                arcTo(0.7368f, 0.7368f, 0.0f, false, false, 0.0f, 0.7368f)
                verticalLineToRelative(3.0906f)
                horizontalLineToRelative(12.0f)
                arcToRelative(8.1766f, 8.1766f, 0.0f, false, true, 6.8025f, 12.7049f)
                horizontalLineToRelative(5.1776f)
                verticalLineTo(0.7368f)
                arcTo(0.7328f, 0.7328f, 0.0f, false, false, 23.2672f, 0.0f)
                close()
                moveTo(3.8274f, 12.0f)
                arcToRelative(8.1527f, 8.1527f, 0.0f, false, true, 1.3701f, -4.5324f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(15.7995f)
                arcTo(0.7328f, 0.7328f, 0.0f, false, false, 0.7368f, 24.0f)
                horizontalLineToRelative(22.5304f)
                arcTo(0.7328f, 0.7328f, 0.0f, false, false, 24.0f, 23.2672f)
                verticalLineToRelative(-3.0946f)
                horizontalLineTo(12.0f)
                arcTo(8.1726f, 8.1726f, 0.0f, false, true, 3.8274f, 12.0f)
                close()
                moveTo(17.9422f, 11.7929f)
                arcToRelative(9.2121f, 9.2121f, 0.0f, false, true, -2.2821f, 0.5536f)
                arcToRelative(3.9827f, 3.9827f, 0.0f, false, false, -0.0239f, -0.92f)
                arcToRelative(9.7418f, 9.7418f, 0.0f, false, false, 1.9635f, -2.314f)
                arcToRelative(0.8817f, 0.8817f, 0.0f, false, false, -1.4895f, -0.9439f)
                arcToRelative(8.762f, 8.762f, 0.0f, false, true, -1.2147f, 1.5493f)
                arcToRelative(3.6123f, 3.6123f, 0.0f, false, false, -0.7567f, -0.7209f)
                arcToRelative(7.2645f, 7.2645f, 0.0f, false, false, -0.1235f, -1.5453f)
                arcToRelative(12.4341f, 12.4341f, 0.0f, false, false, -0.5616f, -2.0113f)
                arcToRelative(0.8802f, 0.8802f, 0.0f, false, false, -1.1311f, -0.5257f)
                arcToRelative(0.8404f, 0.8404f, 0.0f, false, false, -0.3226f, 0.2031f)
                arcToRelative(0.8881f, 0.8881f, 0.0f, false, false, -0.2071f, 0.928f)
                curveToRelative(0.0797f, 0.2111f, 0.1474f, 0.3983f, 0.2071f, 0.6094f)
                curveToRelative(0.0876f, 0.2828f, 0.1593f, 0.5496f, 0.2191f, 0.7965f)
                arcToRelative(7.5234f, 7.5234f, 0.0f, false, true, 0.1275f, 0.912f)
                arcToRelative(3.4331f, 3.4331f, 0.0f, false, false, -0.916f, 0.0239f)
                arcTo(9.7657f, 9.7657f, 0.0f, false, false, 9.1125f, 6.4202f)
                arcToRelative(0.8842f, 0.8842f, 0.0f, false, false, -0.9439f, 1.4935f)
                arcToRelative(8.7899f, 8.7899f, 0.0f, false, true, 1.5533f, 1.1948f)
                arcToRelative(3.7239f, 3.7239f, 0.0f, false, false, -0.7249f, 0.7567f)
                arcToRelative(9.4988f, 9.4988f, 0.0f, false, false, -3.5566f, 0.689f)
                arcToRelative(0.882f, 0.882f, 0.0f, false, false, 0.6054f, 1.6568f)
                arcToRelative(9.2718f, 9.2718f, 0.0f, false, true, 2.318f, -0.5695f)
                curveToRelative(0.0f, 0.1195f, -0.0199f, 0.239f, -0.0199f, 0.3584f)
                arcToRelative(3.6761f, 3.6761f, 0.0f, false, false, 0.0438f, 0.5576f)
                arcToRelative(9.6621f, 9.6621f, 0.0f, false, false, -1.9675f, 2.314f)
                arcToRelative(0.8802f, 0.8802f, 0.0f, false, false, 0.7448f, 1.3541f)
                arcToRelative(0.8762f, 0.8762f, 0.0f, false, false, 0.7488f, -0.3983f)
                arcToRelative(8.6027f, 8.6027f, 0.0f, false, true, 1.1948f, -1.5493f)
                arcToRelative(3.9549f, 3.9549f, 0.0f, false, false, 0.7567f, 0.7249f)
                arcToRelative(7.0176f, 7.0176f, 0.0f, false, false, 0.1275f, 1.5413f)
                arcToRelative(12.0358f, 12.0358f, 0.0f, false, false, 0.5616f, 2.0113f)
                arcToRelative(0.8762f, 0.8762f, 0.0f, false, false, 0.8244f, 0.5616f)
                arcToRelative(0.8961f, 0.8961f, 0.0f, false, false, 0.3027f, -0.0518f)
                arcToRelative(0.92f, 0.92f, 0.0f, false, false, 0.3186f, -0.2071f)
                arcToRelative(0.8762f, 0.8762f, 0.0f, false, false, 0.2071f, -0.924f)
                curveToRelative(-0.0757f, -0.2151f, -0.1474f, -0.3983f, -0.2071f, -0.6133f)
                curveToRelative(-0.0876f, -0.2828f, -0.1593f, -0.5456f, -0.2151f, -0.7965f)
                arcToRelative(6.6034f, 6.6034f, 0.0f, false, true, -0.1434f, -0.8722f)
                horizontalLineTo(12.0f)
                arcToRelative(3.7278f, 3.7278f, 0.0f, false, false, 0.5616f, -0.0398f)
                arcToRelative(9.7139f, 9.7139f, 0.0f, false, false, 2.31f, 1.9635f)
                arcToRelative(0.8817f, 0.8817f, 0.0f, true, false, 0.9439f, -1.4895f)
                arcToRelative(8.8974f, 8.8974f, 0.0f, false, true, -1.5493f, -1.2147f)
                arcToRelative(3.7358f, 3.7358f, 0.0f, false, false, 0.7249f, -0.7567f)
                horizontalLineToRelative(0.2031f)
                arcToRelative(9.9569f, 9.9569f, 0.0f, false, false, 3.3495f, -0.689f)
                arcToRelative(0.8842f, 0.8842f, 0.0f, false, false, -0.6014f, -1.6608f)
                close()
                moveTo(13.9595f, 12.0f)
                verticalLineToRelative(0.1593f)
                arcToRelative(1.9515f, 1.9515f, 0.0f, false, true, -0.693f, 1.3501f)
                arcToRelative(1.7962f, 1.7962f, 0.0f, false, true, -0.2429f, 0.1752f)
                arcToRelative(1.9914f, 1.9914f, 0.0f, false, true, -1.0315f, 0.2907f)
                horizontalLineToRelative(-0.1593f)
                arcToRelative(1.9515f, 1.9515f, 0.0f, false, true, -1.3462f, -0.689f)
                arcToRelative(2.306f, 2.306f, 0.0f, false, true, -0.1792f, -0.2469f)
                arcToRelative(1.9914f, 1.9914f, 0.0f, false, true, -0.2907f, -1.0315f)
                verticalLineToRelative(-0.1593f)
                arcToRelative(1.8679f, 1.8679f, 0.0f, false, true, 0.0478f, -0.2987f)
                arcToRelative(1.9914f, 1.9914f, 0.0f, false, true, 0.6412f, -1.0475f)
                arcToRelative(2.7879f, 2.7879f, 0.0f, false, true, 0.2469f, -0.1792f)
                arcToRelative(1.9914f, 1.9914f, 0.0f, false, true, 1.0315f, -0.2907f)
                horizontalLineToRelative(0.1593f)
                arcToRelative(1.9157f, 1.9157f, 0.0f, false, true, 0.3027f, 0.0478f)
                arcToRelative(1.9914f, 1.9914f, 0.0f, false, true, 1.0475f, 0.6452f)
                arcToRelative(1.7962f, 1.7962f, 0.0f, false, true, 0.1752f, 0.2429f)
                arcTo(1.9914f, 1.9914f, 0.0f, false, true, 13.9754f, 12.0f)
                close()
            }
        }
        .build()
        return _turbo!!
    }

private var _turbo: ImageVector? = null
