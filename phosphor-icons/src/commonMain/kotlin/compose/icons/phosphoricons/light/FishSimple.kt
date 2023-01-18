package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.FishSimple: ImageVector
    get() {
        if (_fishSimple != null) {
            return _fishSimple!!
        }
        _fishSimple = Builder(name = "FishSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.0f, 76.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 166.0f, 76.0f)
                close()
                moveTo(196.8f, 166.6f)
                curveToRelative(-26.5f, 26.3f, -68.7f, 37.1f, -126.0f, 32.1f)
                curveToRelative(1.6f, 12.6f, 4.0f, 25.9f, 7.1f, 40.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -4.6f, 7.2f)
                lineTo(72.0f, 245.9f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -5.9f, -4.7f)
                curveToRelative(-3.3f, -15.5f, -5.9f, -30.1f, -7.5f, -43.9f)
                curveToRelative(-13.8f, -1.7f, -28.5f, -4.2f, -43.9f, -7.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 2.6f, -11.7f)
                curveToRelative(14.0f, 3.1f, 27.4f, 5.4f, 40.0f, 7.1f)
                curveToRelative(-5.0f, -57.3f, 5.8f, -99.5f, 32.1f, -126.0f)
                arcTo(93.8f, 93.8f, 0.0f, false, true, 100.2f, 50.0f)
                lineToRelative(0.6f, -0.4f)
                curveToRelative(40.0f, -29.0f, 94.5f, -20.3f, 111.5f, -16.7f)
                arcToRelative(14.2f, 14.2f, 0.0f, false, true, 10.8f, 10.8f)
                curveTo(227.1f, 62.3f, 237.1f, 126.3f, 196.8f, 166.6f)
                close()
                moveTo(188.3f, 158.1f)
                lineTo(188.9f, 157.4f)
                arcToRelative(101.0f, 101.0f, 0.0f, false, true, -61.0f, -29.3f)
                arcToRelative(101.0f, 101.0f, 0.0f, false, true, -29.3f, -61.0f)
                lineToRelative(-0.7f, 0.6f)
                curveTo(73.8f, 91.9f, 64.2f, 131.8f, 69.4f, 186.5f)
                curveTo(124.2f, 191.7f, 164.1f, 182.2f, 188.3f, 158.1f)
                close()
                moveTo(211.3f, 46.2f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -1.5f, -1.5f)
                curveToRelative(-15.4f, -3.3f, -63.9f, -11.1f, -99.8f, 13.1f)
                arcToRelative(89.2f, 89.2f, 0.0f, false, false, 26.4f, 61.8f)
                arcTo(88.7f, 88.7f, 0.0f, false, false, 198.2f, 146.0f)
                curveTo(222.4f, 110.1f, 214.6f, 61.6f, 211.3f, 46.2f)
                close()
            }
        }
        .build()
        return _fishSimple!!
    }

private var _fishSimple: ImageVector? = null
