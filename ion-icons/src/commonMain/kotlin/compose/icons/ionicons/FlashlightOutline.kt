package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.FlashlightOutline: ImageVector
    get() {
        if (_flashlightOutline != null) {
            return _flashlightOutline!!
        }
        _flashlightOutline = Builder(name = "FlashlightOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(456.64f, 162.86f)
                lineTo(349.12f, 55.36f)
                curveToRelative(-13.15f, -13.14f, -28.68f, -7.17f, -41.82f, 6.0f)
                lineToRelative(-11.95f, 12.0f)
                curveToRelative(-26.13f, 26.13f, -27.62f, 58.38f, -29.42f, 83.31f)
                curveToRelative(-0.89f, 12.24f, -9.78f, 27.55f, -18.51f, 36.28f)
                lineTo(58.58f, 381.67f)
                curveTo(42.23f, 398.0f, 45.89f, 421.09f, 62.31f, 437.51f)
                lineToRelative(12.17f, 12.17f)
                curveToRelative(16.36f, 16.35f, 39.43f, 20.16f, 55.86f, 3.74f)
                lineToRelative(188.83f, -188.8f)
                curveToRelative(8.74f, -8.74f, 24.0f, -17.55f, 36.29f, -18.52f)
                curveToRelative(24.87f, -1.86f, 58.62f, -4.85f, 83.26f, -29.49f)
                lineToRelative(11.94f, -11.94f)
                curveTo(463.81f, 191.53f, 469.78f, 176.0f, 456.64f, 162.86f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.68f, 287.28f)
                moveToRelative(-20.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 40.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -40.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(289.0f, 81.0f)
                lineTo(431.0f, 223.0f)
            }
        }
        .build()
        return _flashlightOutline!!
    }

private var _flashlightOutline: ImageVector? = null
