package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.PuzzlePiece: ImageVector
    get() {
        if (_puzzlePiece != null) {
            return _puzzlePiece!!
        }
        _puzzlePiece = Builder(name = "PuzzlePiece", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 170.3f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(175.8f)
                lineToRelative(-4.0f, 0.2f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, -72.0f)
                lineToRelative(4.0f, 0.2f)
                verticalLineTo(72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 64.0f, 56.0f)
                horizontalLineToRelative(36.2f)
                curveToRelative(-0.1f, -1.3f, -0.2f, -2.7f, -0.2f, -4.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 72.0f, 0.0f)
                curveToRelative(0.0f, 1.3f, -0.1f, 2.7f, -0.2f, 4.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(37.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -3.6f, 6.6f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, -7.5f, 0.7f)
                arcToRelative(24.3f, 24.3f, 0.0f, false, false, -8.9f, -1.7f)
                curveToRelative(-13.2f, 0.0f, -24.0f, 11.1f, -24.0f, 24.7f)
                reflectiveCurveToRelative(10.8f, 24.7f, 24.0f, 24.7f)
                arcToRelative(24.3f, 24.3f, 0.0f, false, false, 8.9f, -1.7f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, 7.5f, 0.7f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 224.0f, 170.3f)
                close()
            }
        }
        .build()
        return _puzzlePiece!!
    }

private var _puzzlePiece: ImageVector? = null
