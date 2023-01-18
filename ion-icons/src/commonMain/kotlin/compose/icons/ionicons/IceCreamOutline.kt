package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.IceCreamOutline: ImageVector
    get() {
        if (_iceCreamOutline != null) {
            return _iceCreamOutline!!
        }
        _iceCreamOutline = Builder(name = "IceCreamOutline", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(352.0f, 256.0f)
                lineToRelative(-96.0f, 224.0f)
                lineToRelative(-62.0f, -145.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(299.42f, 223.48f)
                curveTo(291.74f, 239.75f, 275.18f, 252.0f, 256.0f, 252.0f)
                curveToRelative(-13.1f, 0.0f, -27.0f, -5.0f, -33.63f, -9.76f)
                curveTo(216.27f, 237.87f, 208.0f, 240.0f, 208.0f, 250.0f)
                verticalLineToRelative(62.0f)
                arcToRelative(24.07f, 24.07f, 0.0f, false, true, -24.0f, 24.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(24.07f, 24.07f, 0.0f, false, true, -24.0f, -24.0f)
                verticalLineTo(256.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-35.35f, 0.0f, -62.0f, -28.65f, -62.0f, -64.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 64.0f, -64.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 176.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 0.0f, 128.0f)
                curveToRelative(-21.78f, 0.0f, -42.0f, -13.0f, -52.59f, -32.51f)
                close()
            }
        }
        .build()
        return _iceCreamOutline!!
    }

private var _iceCreamOutline: ImageVector? = null
