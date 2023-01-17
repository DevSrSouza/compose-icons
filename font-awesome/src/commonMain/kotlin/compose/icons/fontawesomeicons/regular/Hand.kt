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

public val RegularGroup.Hand: ImageVector
    get() {
        if (_hand != null) {
            return _hand!!
        }
        _hand = Builder(name = "Hand", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(408.0f, 80.0f)
                curveToRelative(-3.994f, 0.0f, -7.91f, 0.326f, -11.73f, 0.955f)
                curveToRelative(-9.586f, -28.51f, -36.57f, -49.11f, -68.27f, -49.11f)
                curveToRelative(-6.457f, 0.0f, -12.72f, 0.855f, -18.68f, 2.457f)
                curveTo(296.6f, 13.73f, 273.9f, 0.0f, 248.0f, 0.0f)
                curveTo(222.1f, 0.0f, 199.3f, 13.79f, 186.6f, 34.44f)
                curveTo(180.7f, 32.85f, 174.5f, 32.0f, 168.1f, 32.0f)
                curveTo(128.4f, 32.0f, 96.01f, 64.3f, 96.01f, 104.0f)
                verticalLineToRelative(121.6f)
                curveTo(90.77f, 224.6f, 85.41f, 224.0f, 80.01f, 224.0f)
                curveToRelative(-0.003f, 0.0f, 0.003f, 0.0f, 0.0f, 0.0f)
                curveTo(36.43f, 224.0f, 0.0f, 259.2f, 0.0f, 304.1f)
                curveToRelative(0.0f, 20.29f, 7.558f, 39.52f, 21.46f, 54.45f)
                lineToRelative(81.25f, 87.24f)
                curveTo(141.9f, 487.9f, 197.4f, 512.0f, 254.9f, 512.0f)
                horizontalLineToRelative(33.08f)
                curveTo(393.9f, 512.0f, 480.0f, 425.9f, 480.0f, 320.0f)
                verticalLineTo(152.0f)
                curveTo(480.0f, 112.3f, 447.7f, 80.0f, 408.0f, 80.0f)
                close()
                moveTo(432.0f, 320.0f)
                curveToRelative(0.0f, 79.41f, -64.59f, 144.0f, -143.1f, 144.0f)
                horizontalLineTo(254.9f)
                curveToRelative(-44.41f, 0.0f, -86.83f, -18.46f, -117.1f, -50.96f)
                lineToRelative(-79.76f, -85.63f)
                curveToRelative(-6.202f, -6.659f, -9.406f, -15.4f, -9.406f, -23.1f)
                curveToRelative(0.0f, -22.16f, 18.53f, -31.4f, 31.35f, -31.4f)
                curveToRelative(8.56f, 0.0f, 17.1f, 3.416f, 23.42f, 10.18f)
                lineToRelative(26.72f, 28.69f)
                curveTo(131.8f, 312.7f, 133.9f, 313.4f, 135.9f, 313.4f)
                curveToRelative(4.106f, 0.0f, 8.064f, -3.172f, 8.064f, -8.016f)
                verticalLineTo(104.0f)
                curveToRelative(0.0f, -13.25f, 10.75f, -24.0f, 23.1f, -24.0f)
                curveToRelative(13.25f, 0.0f, 23.1f, 10.75f, 23.1f, 24.0f)
                verticalLineToRelative(152.0f)
                curveTo(192.0f, 264.8f, 199.2f, 272.0f, 208.0f, 272.0f)
                reflectiveCurveToRelative(15.1f, -7.163f, 15.1f, -15.1f)
                lineTo(224.0f, 72.0f)
                curveToRelative(0.0f, -13.25f, 10.75f, -24.0f, 23.1f, -24.0f)
                curveToRelative(13.25f, 0.0f, 23.1f, 10.75f, 23.1f, 24.0f)
                verticalLineToRelative(184.0f)
                curveTo(272.0f, 264.8f, 279.2f, 272.0f, 288.0f, 272.0f)
                reflectiveCurveToRelative(15.99f, -7.164f, 15.99f, -15.1f)
                lineToRelative(0.008f, -152.2f)
                curveToRelative(0.0f, -13.25f, 10.75f, -24.0f, 23.1f, -24.0f)
                curveToRelative(13.25f, 0.0f, 23.1f, 10.75f, 23.1f, 24.0f)
                verticalLineToRelative(152.2f)
                curveTo(352.0f, 264.8f, 359.2f, 272.0f, 368.0f, 272.0f)
                reflectiveCurveToRelative(15.1f, -7.163f, 15.1f, -15.1f)
                verticalLineTo(152.0f)
                curveToRelative(0.0f, -13.25f, 10.75f, -24.0f, 23.1f, -24.0f)
                curveToRelative(13.25f, 0.0f, 23.1f, 10.75f, 23.1f, 24.0f)
                verticalLineTo(320.0f)
                close()
            }
        }
        .build()
        return _hand!!
    }

private var _hand: ImageVector? = null
