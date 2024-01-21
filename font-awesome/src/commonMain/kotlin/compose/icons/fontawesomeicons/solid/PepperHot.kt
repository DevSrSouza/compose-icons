package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.PepperHot: ImageVector
    get() {
        if (_pepperHot != null) {
            return _pepperHot!!
        }
        _pepperHot = Builder(name = "PepperHot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(428.3f, 3.0f)
                curveToRelative(11.6f, -6.4f, 26.2f, -2.3f, 32.6f, 9.3f)
                lineToRelative(4.8f, 8.7f)
                curveToRelative(19.3f, 34.7f, 19.8f, 75.7f, 3.4f, 110.0f)
                curveTo(495.8f, 159.6f, 512.0f, 197.9f, 512.0f, 240.0f)
                curveToRelative(0.0f, 18.5f, -3.1f, 36.3f, -8.9f, 52.8f)
                curveToRelative(-6.1f, 17.3f, -28.5f, 16.3f, -36.8f, -0.1f)
                lineToRelative(-11.7f, -23.4f)
                curveToRelative(-4.1f, -8.1f, -12.4f, -13.3f, -21.5f, -13.3f)
                horizontalLineTo(360.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                verticalLineTo(152.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-17.1f, 0.0f)
                curveToRelative(-21.3f, 0.0f, -30.0f, -23.9f, -10.8f, -32.9f)
                curveTo(304.7f, 85.4f, 327.7f, 80.0f, 352.0f, 80.0f)
                curveToRelative(28.3f, 0.0f, 54.8f, 7.3f, 77.8f, 20.2f)
                curveToRelative(5.5f, -18.2f, 3.7f, -38.4f, -6.0f, -55.8f)
                lineTo(419.0f, 35.7f)
                curveToRelative(-6.4f, -11.6f, -2.3f, -26.2f, 9.3f, -32.6f)
                close()
                moveTo(171.2f, 345.5f)
                lineTo(264.0f, 160.0f)
                lineToRelative(40.0f, 0.0f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(76.2f)
                lineToRelative(23.9f, 47.8f)
                curveTo(372.3f, 443.9f, 244.3f, 512.0f, 103.2f, 512.0f)
                horizontalLineTo(44.4f)
                curveTo(19.9f, 512.0f, 0.0f, 492.1f, 0.0f, 467.6f)
                curveToRelative(0.0f, -20.8f, 14.5f, -38.8f, 34.8f, -43.3f)
                lineToRelative(49.8f, -11.1f)
                curveToRelative(37.6f, -8.4f, 69.5f, -33.2f, 86.7f, -67.7f)
                close()
            }
        }
        .build()
        return _pepperHot!!
    }

private var _pepperHot: ImageVector? = null
