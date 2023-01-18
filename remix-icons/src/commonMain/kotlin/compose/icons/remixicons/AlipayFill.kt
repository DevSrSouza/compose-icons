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

public val RemixIcons.AlipayFill: ImageVector
    get() {
        if (_alipayFill != null) {
            return _alipayFill!!
        }
        _alipayFill = Builder(name = "AlipayFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.422f, 15.358f)
                curveToRelative(-3.83f, -1.153f, -6.055f, -1.84f, -6.678f, -2.062f)
                arcToRelative(12.41f, 12.41f, 0.0f, false, false, 1.32f, -3.32f)
                lineTo(12.8f, 9.976f)
                lineTo(12.8f, 8.872f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-0.68f)
                horizontalLineToRelative(-4.0f)
                lineTo(12.8f, 6.344f)
                horizontalLineToRelative(-1.536f)
                curveToRelative(-0.28f, 0.0f, -0.312f, 0.248f, -0.312f, 0.248f)
                verticalLineToRelative(1.592f)
                lineTo(7.2f, 8.184f)
                verticalLineToRelative(0.68f)
                horizontalLineToRelative(3.752f)
                verticalLineToRelative(1.104f)
                lineTo(7.88f, 9.968f)
                verticalLineToRelative(0.616f)
                horizontalLineToRelative(6.224f)
                arcToRelative(10.972f, 10.972f, 0.0f, false, true, -0.888f, 2.176f)
                curveToRelative(-1.408f, -0.464f, -2.192f, -0.784f, -3.912f, -0.944f)
                curveToRelative(-3.256f, -0.312f, -4.008f, 1.48f, -4.128f, 2.576f)
                curveTo(5.0f, 16.064f, 6.48f, 17.424f, 8.688f, 17.424f)
                reflectiveCurveToRelative(3.68f, -1.024f, 5.08f, -2.72f)
                curveToRelative(1.167f, 0.558f, 3.338f, 1.525f, 6.514f, 2.902f)
                arcTo(9.99f, 9.99f, 0.0f, false, true, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                arcToRelative(9.983f, 9.983f, 0.0f, false, true, -0.578f, 3.358f)
                close()
                moveTo(8.432f, 16.368f)
                curveToRelative(-2.336f, 0.0f, -2.704f, -1.48f, -2.584f, -2.096f)
                curveToRelative(0.12f, -0.616f, 0.8f, -1.416f, 2.104f, -1.416f)
                curveToRelative(1.496f, 0.0f, 2.832f, 0.384f, 4.44f, 1.16f)
                curveToRelative(-1.136f, 1.48f, -2.52f, 2.352f, -3.96f, 2.352f)
                close()
            }
        }
        .build()
        return _alipayFill!!
    }

private var _alipayFill: ImageVector? = null
