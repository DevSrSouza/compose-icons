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

public val SolidGroup.ShieldVirus: ImageVector
    get() {
        if (_shieldVirus != null) {
            return _shieldVirus!!
        }
        _shieldVirus = Builder(name = "ShieldVirus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 224.0f, 192.0f)
                close()
                moveTo(466.5f, 83.68f)
                lineToRelative(-192.0f, -80.0f)
                arcTo(57.4f, 57.4f, 0.0f, false, false, 256.05f, 0.0f)
                arcToRelative(57.4f, 57.4f, 0.0f, false, false, -18.46f, 3.67f)
                lineToRelative(-192.0f, 80.0f)
                arcTo(47.93f, 47.93f, 0.0f, false, false, 16.0f, 128.0f)
                curveTo(16.0f, 326.5f, 130.5f, 463.72f, 237.5f, 508.32f)
                arcToRelative(48.09f, 48.09f, 0.0f, false, false, 36.91f, 0.0f)
                curveTo(360.09f, 472.61f, 496.0f, 349.3f, 496.0f, 128.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 466.5f, 83.68f)
                close()
                moveTo(384.0f, 256.0f)
                lineTo(371.88f, 256.0f)
                curveToRelative(-28.51f, 0.0f, -42.79f, 34.47f, -22.63f, 54.63f)
                lineToRelative(8.58f, 8.57f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -22.63f, 22.63f)
                lineToRelative(-8.57f, -8.58f)
                curveTo(306.47f, 313.09f, 272.0f, 327.37f, 272.0f, 355.88f)
                lineTo(272.0f, 368.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                lineTo(240.0f, 355.88f)
                curveToRelative(0.0f, -28.51f, -34.47f, -42.79f, -54.63f, -22.63f)
                lineToRelative(-8.57f, 8.58f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.63f, -22.63f)
                lineToRelative(8.58f, -8.57f)
                curveToRelative(20.16f, -20.16f, 5.88f, -54.63f, -22.63f, -54.63f)
                lineTo(128.0f, 256.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -32.0f)
                horizontalLineToRelative(12.12f)
                curveToRelative(28.51f, 0.0f, 42.79f, -34.47f, 22.63f, -54.63f)
                lineToRelative(-8.58f, -8.57f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, -22.63f)
                lineToRelative(8.57f, 8.58f)
                curveToRelative(20.16f, 20.16f, 54.63f, 5.88f, 54.63f, -22.63f)
                lineTo(240.0f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(12.12f)
                curveToRelative(0.0f, 28.51f, 34.47f, 42.79f, 54.63f, 22.63f)
                lineToRelative(8.57f, -8.58f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, 22.63f)
                lineToRelative(-8.58f, 8.57f)
                curveTo(329.09f, 189.53f, 343.37f, 224.0f, 371.88f, 224.0f)
                lineTo(384.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f)
                close()
                moveTo(288.0f, 256.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 288.0f, 256.0f)
                close()
            }
        }
        .build()
        return _shieldVirus!!
    }

private var _shieldVirus: ImageVector? = null
