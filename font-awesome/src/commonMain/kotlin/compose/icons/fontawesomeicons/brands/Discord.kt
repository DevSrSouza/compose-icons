package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Discord: ImageVector
    get() {
        if (_discord != null) {
            return _discord!!
        }
        _discord = Builder(name = "Discord", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(297.216f, 243.2f)
                curveToRelative(0.0f, 15.616f, -11.52f, 28.416f, -26.112f, 28.416f)
                curveToRelative(-14.336f, 0.0f, -26.112f, -12.8f, -26.112f, -28.416f)
                reflectiveCurveToRelative(11.52f, -28.416f, 26.112f, -28.416f)
                curveToRelative(14.592f, 0.0f, 26.112f, 12.8f, 26.112f, 28.416f)
                close()
                moveTo(177.664f, 214.784f)
                curveToRelative(-14.592f, 0.0f, -26.112f, 12.8f, -26.112f, 28.416f)
                reflectiveCurveToRelative(11.776f, 28.416f, 26.112f, 28.416f)
                curveToRelative(14.592f, 0.0f, 26.112f, -12.8f, 26.112f, -28.416f)
                curveToRelative(0.256f, -15.616f, -11.52f, -28.416f, -26.112f, -28.416f)
                close()
                moveTo(448.0f, 52.736f)
                lineTo(448.0f, 512.0f)
                curveToRelative(-64.494f, -56.994f, -43.868f, -38.128f, -118.784f, -107.776f)
                lineToRelative(13.568f, 47.36f)
                lineTo(52.48f, 451.584f)
                curveTo(23.552f, 451.584f, 0.0f, 428.032f, 0.0f, 398.848f)
                lineTo(0.0f, 52.736f)
                curveTo(0.0f, 23.552f, 23.552f, 0.0f, 52.48f, 0.0f)
                horizontalLineToRelative(343.04f)
                curveTo(424.448f, 0.0f, 448.0f, 23.552f, 448.0f, 52.736f)
                close()
                moveTo(375.04f, 295.424f)
                curveToRelative(0.0f, -82.432f, -36.864f, -149.248f, -36.864f, -149.248f)
                curveToRelative(-36.864f, -27.648f, -71.936f, -26.88f, -71.936f, -26.88f)
                lineToRelative(-3.584f, 4.096f)
                curveToRelative(43.52f, 13.312f, 63.744f, 32.512f, 63.744f, 32.512f)
                curveToRelative(-60.811f, -33.329f, -132.244f, -33.335f, -191.232f, -7.424f)
                curveToRelative(-9.472f, 4.352f, -15.104f, 7.424f, -15.104f, 7.424f)
                reflectiveCurveToRelative(21.248f, -20.224f, 67.328f, -33.536f)
                lineToRelative(-2.56f, -3.072f)
                reflectiveCurveToRelative(-35.072f, -0.768f, -71.936f, 26.88f)
                curveToRelative(0.0f, 0.0f, -36.864f, 66.816f, -36.864f, 149.248f)
                curveToRelative(0.0f, 0.0f, 21.504f, 37.12f, 78.08f, 38.912f)
                curveToRelative(0.0f, 0.0f, 9.472f, -11.52f, 17.152f, -21.248f)
                curveToRelative(-32.512f, -9.728f, -44.8f, -30.208f, -44.8f, -30.208f)
                curveToRelative(3.766f, 2.636f, 9.976f, 6.053f, 10.496f, 6.4f)
                curveToRelative(43.21f, 24.198f, 104.588f, 32.126f, 159.744f, 8.96f)
                curveToRelative(8.96f, -3.328f, 18.944f, -8.192f, 29.44f, -15.104f)
                curveToRelative(0.0f, 0.0f, -12.8f, 20.992f, -46.336f, 30.464f)
                curveToRelative(7.68f, 9.728f, 16.896f, 20.736f, 16.896f, 20.736f)
                curveToRelative(56.576f, -1.792f, 78.336f, -38.912f, 78.336f, -38.912f)
                close()
            }
        }
        .build()
        return _discord!!
    }

private var _discord: ImageVector? = null
