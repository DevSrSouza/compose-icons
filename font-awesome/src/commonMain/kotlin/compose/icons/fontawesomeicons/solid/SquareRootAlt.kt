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

public val SolidGroup.SquareRootAlt: ImageVector
    get() {
        if (_squareRootAlt != null) {
            return _squareRootAlt!!
        }
        _squareRootAlt = Builder(name = "SquareRootAlt", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(571.31f, 251.31f)
                lineToRelative(-22.62f, -22.62f)
                curveToRelative(-6.25f, -6.25f, -16.38f, -6.25f, -22.63f, 0.0f)
                lineTo(480.0f, 274.75f)
                lineToRelative(-46.06f, -46.06f)
                curveToRelative(-6.25f, -6.25f, -16.38f, -6.25f, -22.63f, 0.0f)
                lineToRelative(-22.62f, 22.62f)
                curveToRelative(-6.25f, 6.25f, -6.25f, 16.38f, 0.0f, 22.63f)
                lineTo(434.75f, 320.0f)
                lineToRelative(-46.06f, 46.06f)
                curveToRelative(-6.25f, 6.25f, -6.25f, 16.38f, 0.0f, 22.63f)
                lineToRelative(22.62f, 22.62f)
                curveToRelative(6.25f, 6.25f, 16.38f, 6.25f, 22.63f, 0.0f)
                lineTo(480.0f, 365.25f)
                lineToRelative(46.06f, 46.06f)
                curveToRelative(6.25f, 6.25f, 16.38f, 6.25f, 22.63f, 0.0f)
                lineToRelative(22.62f, -22.62f)
                curveToRelative(6.25f, -6.25f, 6.25f, -16.38f, 0.0f, -22.63f)
                lineTo(525.25f, 320.0f)
                lineToRelative(46.06f, -46.06f)
                curveToRelative(6.25f, -6.25f, 6.25f, -16.38f, 0.0f, -22.63f)
                close()
                moveTo(552.0f, 0.0f)
                horizontalLineTo(307.65f)
                curveToRelative(-14.54f, 0.0f, -27.26f, 9.8f, -30.95f, 23.87f)
                lineToRelative(-84.79f, 322.8f)
                lineToRelative(-58.41f, -106.1f)
                arcTo(32.008f, 32.008f, 0.0f, false, false, 105.47f, 224.0f)
                horizontalLineTo(24.0f)
                curveToRelative(-13.25f, 0.0f, -24.0f, 10.74f, -24.0f, 24.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 13.25f, 10.75f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(43.62f)
                lineToRelative(88.88f, 163.73f)
                curveTo(168.99f, 503.5f, 186.3f, 512.0f, 204.94f, 512.0f)
                curveToRelative(17.27f, 0.0f, 44.44f, -9.0f, 54.28f, -41.48f)
                lineTo(357.03f, 96.0f)
                horizontalLineTo(552.0f)
                curveToRelative(13.25f, 0.0f, 24.0f, -10.75f, 24.0f, -24.0f)
                verticalLineTo(24.0f)
                curveToRelative(0.0f, -13.26f, -10.75f, -24.0f, -24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _squareRootAlt!!
    }

private var _squareRootAlt: ImageVector? = null
