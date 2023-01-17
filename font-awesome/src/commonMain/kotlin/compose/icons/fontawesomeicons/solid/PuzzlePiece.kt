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

public val SolidGroup.PuzzlePiece: ImageVector
    get() {
        if (_puzzlePiece != null) {
            return _puzzlePiece!!
        }
        _puzzlePiece = Builder(name = "PuzzlePiece", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 104.8f)
                curveToRelative(0.0f, -9.2f, -5.8f, -17.3f, -13.2f, -22.8f)
                curveTo(167.2f, 73.3f, 160.0f, 61.3f, 160.0f, 48.0f)
                curveToRelative(0.0f, -26.5f, 28.7f, -48.0f, 64.0f, -48.0f)
                reflectiveCurveToRelative(64.0f, 21.5f, 64.0f, 48.0f)
                curveToRelative(0.0f, 13.3f, -7.2f, 25.3f, -18.8f, 34.0f)
                curveToRelative(-7.4f, 5.5f, -13.2f, 13.6f, -13.2f, 22.8f)
                curveToRelative(0.0f, 12.8f, 10.4f, 23.2f, 23.2f, 23.2f)
                horizontalLineTo(336.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                verticalLineToRelative(56.8f)
                curveToRelative(0.0f, 12.8f, 10.4f, 23.2f, 23.2f, 23.2f)
                curveToRelative(9.2f, 0.0f, 17.3f, -5.8f, 22.8f, -13.2f)
                curveToRelative(8.7f, -11.6f, 20.7f, -18.8f, 34.0f, -18.8f)
                curveToRelative(26.5f, 0.0f, 48.0f, 28.7f, 48.0f, 64.0f)
                reflectiveCurveToRelative(-21.5f, 64.0f, -48.0f, 64.0f)
                curveToRelative(-13.3f, 0.0f, -25.3f, -7.2f, -34.0f, -18.8f)
                curveToRelative(-5.5f, -7.4f, -13.6f, -13.2f, -22.8f, -13.2f)
                curveToRelative(-12.8f, 0.0f, -23.2f, 10.4f, -23.2f, 23.2f)
                verticalLineTo(464.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                horizontalLineTo(279.2f)
                curveToRelative(-12.8f, 0.0f, -23.2f, -10.4f, -23.2f, -23.2f)
                curveToRelative(0.0f, -9.2f, 5.8f, -17.3f, 13.2f, -22.8f)
                curveToRelative(11.6f, -8.7f, 18.8f, -20.7f, 18.8f, -34.0f)
                curveToRelative(0.0f, -26.5f, -28.7f, -48.0f, -64.0f, -48.0f)
                reflectiveCurveToRelative(-64.0f, 21.5f, -64.0f, 48.0f)
                curveToRelative(0.0f, 13.3f, 7.2f, 25.3f, 18.8f, 34.0f)
                curveToRelative(7.4f, 5.5f, 13.2f, 13.6f, 13.2f, 22.8f)
                curveToRelative(0.0f, 12.8f, -10.4f, 23.2f, -23.2f, 23.2f)
                horizontalLineTo(48.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                verticalLineTo(343.2f)
                curveTo(0.0f, 330.4f, 10.4f, 320.0f, 23.2f, 320.0f)
                curveToRelative(9.2f, 0.0f, 17.3f, 5.8f, 22.8f, 13.2f)
                curveTo(54.7f, 344.8f, 66.7f, 352.0f, 80.0f, 352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -28.7f, 48.0f, -64.0f)
                reflectiveCurveToRelative(-21.5f, -64.0f, -48.0f, -64.0f)
                curveToRelative(-13.3f, 0.0f, -25.3f, 7.2f, -34.0f, 18.8f)
                curveTo(40.5f, 250.2f, 32.4f, 256.0f, 23.2f, 256.0f)
                curveTo(10.4f, 256.0f, 0.0f, 245.6f, 0.0f, 232.8f)
                verticalLineTo(176.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                horizontalLineTo(168.8f)
                curveToRelative(12.8f, 0.0f, 23.2f, -10.4f, 23.2f, -23.2f)
                close()
            }
        }
        .build()
        return _puzzlePiece!!
    }

private var _puzzlePiece: ImageVector? = null
