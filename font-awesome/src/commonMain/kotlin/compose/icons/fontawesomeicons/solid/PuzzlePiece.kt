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
        _puzzlePiece = Builder(name = "PuzzlePiece", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(519.44f, 288.65f)
                curveToRelative(-41.52f, 0.0f, -59.5f, 31.59f, -82.06f, 31.59f)
                curveTo(377.41f, 320.24f, 432.0f, 144.0f, 432.0f, 144.0f)
                reflectiveCurveToRelative(-196.29f, 80.0f, -196.29f, -3.3f)
                curveToRelative(0.0f, -35.83f, 36.29f, -46.25f, 36.29f, -85.99f)
                curveTo(272.0f, 19.22f, 243.88f, 0.0f, 210.54f, 0.0f)
                curveToRelative(-34.65f, 0.0f, -66.37f, 18.89f, -66.37f, 56.35f)
                curveToRelative(0.0f, 41.36f, 31.71f, 59.28f, 31.71f, 81.75f)
                curveTo(175.88f, 207.72f, 0.0f, 166.76f, 0.0f, 166.76f)
                verticalLineToRelative(333.24f)
                reflectiveCurveToRelative(178.63f, 41.05f, 178.63f, -28.66f)
                curveToRelative(0.0f, -22.47f, -40.0f, -40.11f, -40.0f, -81.47f)
                curveToRelative(0.0f, -37.46f, 29.25f, -56.35f, 63.58f, -56.35f)
                curveToRelative(33.67f, 0.0f, 61.79f, 19.22f, 61.79f, 54.72f)
                curveToRelative(0.0f, 39.74f, -36.29f, 50.16f, -36.29f, 85.99f)
                curveToRelative(0.0f, 60.8f, 129.68f, 25.73f, 181.23f, 25.73f)
                curveToRelative(0.0f, 0.0f, -34.72f, -120.1f, 25.83f, -120.1f)
                curveToRelative(35.96f, 0.0f, 46.42f, 36.15f, 86.31f, 36.15f)
                curveTo(556.71f, 416.0f, 576.0f, 387.99f, 576.0f, 354.44f)
                curveToRelative(0.0f, -34.2f, -18.96f, -65.79f, -56.56f, -65.79f)
                close()
            }
        }
        .build()
        return _puzzlePiece!!
    }

private var _puzzlePiece: ImageVector? = null
