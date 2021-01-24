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

public val SolidGroup.PuzzlePiece: ImageVector
    get() {
        if (_puzzlePiece != null) {
            return _puzzlePiece!!
        }
        _puzzlePiece = Builder(name = "PuzzlePiece", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(519.442f, 288.651f)
                curveToRelative(-41.519f, 0.0f, -59.5f, 31.593f, -82.058f, 31.593f)
                curveTo(377.409f, 320.244f, 432.0f, 144.0f, 432.0f, 144.0f)
                reflectiveCurveToRelative(-196.288f, 80.0f, -196.288f, -3.297f)
                curveToRelative(0.0f, -35.827f, 36.288f, -46.25f, 36.288f, -85.985f)
                curveTo(272.0f, 19.216f, 243.885f, 0.0f, 210.539f, 0.0f)
                curveToRelative(-34.654f, 0.0f, -66.366f, 18.891f, -66.366f, 56.346f)
                curveToRelative(0.0f, 41.364f, 31.711f, 59.277f, 31.711f, 81.75f)
                curveTo(175.885f, 207.719f, 0.0f, 166.758f, 0.0f, 166.758f)
                verticalLineToRelative(333.237f)
                reflectiveCurveToRelative(178.635f, 41.047f, 178.635f, -28.662f)
                curveToRelative(0.0f, -22.473f, -40.0f, -40.107f, -40.0f, -81.471f)
                curveToRelative(0.0f, -37.456f, 29.25f, -56.346f, 63.577f, -56.346f)
                curveToRelative(33.673f, 0.0f, 61.788f, 19.216f, 61.788f, 54.717f)
                curveToRelative(0.0f, 39.735f, -36.288f, 50.158f, -36.288f, 85.985f)
                curveToRelative(0.0f, 60.803f, 129.675f, 25.73f, 181.23f, 25.73f)
                curveToRelative(0.0f, 0.0f, -34.725f, -120.101f, 25.827f, -120.101f)
                curveToRelative(35.962f, 0.0f, 46.423f, 36.152f, 86.308f, 36.152f)
                curveTo(556.712f, 416.0f, 576.0f, 387.99f, 576.0f, 354.443f)
                curveToRelative(0.0f, -34.199f, -18.962f, -65.792f, -56.558f, -65.792f)
                close()
            }
        }
        .build()
        return _puzzlePiece!!
    }

private var _puzzlePiece: ImageVector? = null
