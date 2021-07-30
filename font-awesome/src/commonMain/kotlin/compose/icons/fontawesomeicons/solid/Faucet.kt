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

public val SolidGroup.Faucet: ImageVector
    get() {
        if (_faucet != null) {
            return _faucet!!
        }
        _faucet = Builder(name = "Faucet", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 256.0f)
                horizontalLineTo(313.39f)
                curveToRelative(-15.71f, -13.44f, -35.46f, -23.07f, -57.39f, -28.0f)
                verticalLineTo(180.44f)
                lineToRelative(-32.0f, -3.38f)
                lineToRelative(-32.0f, 3.38f)
                verticalLineTo(228.0f)
                curveToRelative(-21.93f, 5.0f, -41.68f, 14.6f, -57.39f, 28.0f)
                horizontalLineTo(16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 0.0f, 272.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(92.79f)
                curveTo(129.38f, 421.73f, 173.0f, 448.0f, 224.0f, 448.0f)
                reflectiveCurveToRelative(94.62f, -26.27f, 115.21f, -64.0f)
                horizontalLineTo(352.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                arcTo(160.0f, 160.0f, 0.0f, false, false, 352.0f, 256.0f)
                close()
                moveTo(81.59f, 159.91f)
                lineToRelative(142.41f, -15.0f)
                lineToRelative(142.41f, 15.0f)
                curveToRelative(9.42f, 1.0f, 17.59f, -6.81f, 17.59f, -16.8f)
                verticalLineTo(112.89f)
                curveToRelative(0.0f, -10.0f, -8.17f, -17.8f, -17.59f, -16.81f)
                lineTo(256.0f, 107.74f)
                verticalLineTo(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(27.74f)
                lineTo(81.59f, 96.08f)
                curveTo(72.17f, 95.09f, 64.0f, 102.9f, 64.0f, 112.89f)
                verticalLineToRelative(30.22f)
                curveTo(64.0f, 153.1f, 72.17f, 160.91f, 81.59f, 159.91f)
                close()
            }
        }
        .build()
        return _faucet!!
    }

private var _faucet: ImageVector? = null
