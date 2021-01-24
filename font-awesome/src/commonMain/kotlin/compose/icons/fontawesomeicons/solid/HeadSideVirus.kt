package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.HeadSideVirus: ImageVector
    get() {
        if (_headSideVirus != null) {
            return _headSideVirus!!
        }
        _headSideVirus = Builder(name = "HeadSideVirus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.0f, 240.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 272.0f, 240.0f)
                close()
                moveTo(208.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 176.0f)
                close()
                moveTo(509.2f, 275.0f)
                curveToRelative(-20.93f, -47.12f, -48.43f, -151.73f, -73.07f, -186.75f)
                arcTo(207.9f, 207.9f, 0.0f, false, false, 266.09f, 0.0f)
                lineTo(192.0f, 0.0f)
                curveTo(86.0f, 0.0f, 0.0f, 86.0f, 0.0f, 192.0f)
                arcTo(191.23f, 191.23f, 0.0f, false, false, 64.0f, 334.81f)
                lineTo(64.0f, 512.0f)
                lineTo(320.0f, 512.0f)
                lineTo(320.0f, 448.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, -64.0f)
                lineTo(448.0f, 320.0f)
                lineTo(480.0f, 320.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 509.2f, 275.0f)
                close()
                moveTo(368.0f, 240.0f)
                lineTo(355.88f, 240.0f)
                curveToRelative(-28.51f, 0.0f, -42.79f, 34.47f, -22.63f, 54.63f)
                lineToRelative(8.58f, 8.57f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -22.63f, 22.63f)
                lineToRelative(-8.57f, -8.58f)
                curveTo(290.47f, 297.09f, 256.0f, 311.37f, 256.0f, 339.88f)
                lineTo(256.0f, 352.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                lineTo(224.0f, 339.88f)
                curveToRelative(0.0f, -28.51f, -34.47f, -42.79f, -54.63f, -22.63f)
                lineToRelative(-8.57f, 8.58f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.63f, -22.63f)
                lineToRelative(8.58f, -8.57f)
                curveToRelative(20.16f, -20.16f, 5.88f, -54.63f, -22.63f, -54.63f)
                lineTo(112.0f, 240.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -32.0f)
                horizontalLineToRelative(12.12f)
                curveToRelative(28.51f, 0.0f, 42.79f, -34.47f, 22.63f, -54.63f)
                lineToRelative(-8.58f, -8.57f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, -22.63f)
                lineToRelative(8.57f, 8.58f)
                curveToRelative(20.16f, 20.16f, 54.63f, 5.88f, 54.63f, -22.63f)
                lineTo(224.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(12.12f)
                curveToRelative(0.0f, 28.51f, 34.47f, 42.79f, 54.63f, 22.63f)
                lineToRelative(8.57f, -8.58f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, 22.63f)
                lineToRelative(-8.58f, 8.57f)
                curveTo(313.09f, 173.53f, 327.37f, 208.0f, 355.88f, 208.0f)
                lineTo(368.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f)
                close()
            }
        }
        .build()
        return _headSideVirus!!
    }

private var _headSideVirus: ImageVector? = null
