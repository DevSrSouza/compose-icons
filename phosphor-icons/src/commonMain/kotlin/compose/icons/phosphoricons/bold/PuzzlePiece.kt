package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.PuzzlePiece: ImageVector
    get() {
        if (_puzzlePiece != null) {
            return _puzzlePiece!!
        }
        _puzzlePiece = Builder(name = "PuzzlePiece", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.4f, 155.2f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -11.5f, -0.7f)
                arcTo(16.5f, 16.5f, 0.0f, false, true, 204.0f, 156.0f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, true, -11.7f, -5.1f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 18.6f, -25.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 228.0f, 114.7f)
                verticalLineTo(72.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineTo(176.0f)
                arcToRelative(40.4f, 40.4f, 0.0f, false, false, -12.6f, -29.2f)
                arcTo(40.1f, 40.1f, 0.0f, false, false, 96.1f, 49.1f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 96.0f, 52.0f)
                horizontalLineTo(64.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 44.0f, 72.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(40.4f, 40.4f, 0.0f, false, false, -29.2f, 12.6f)
                arcToRelative(40.1f, 40.1f, 0.0f, false, false, 26.3f, 67.3f)
                horizontalLineTo(44.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(165.3f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 222.4f, 155.2f)
                close()
                moveTo(204.0f, 204.0f)
                horizontalLineTo(68.0f)
                verticalLineTo(165.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.1f, -10.8f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -18.6f, -25.4f)
                arcTo(15.8f, 15.8f, 0.0f, false, true, 44.0f, 124.0f)
                arcToRelative(16.5f, 16.5f, 0.0f, false, true, 6.9f, 1.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 114.7f)
                verticalLineTo(76.0f)
                horizontalLineToRelative(42.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.8f, -17.1f)
                arcTo(16.1f, 16.1f, 0.0f, false, true, 134.9f, 36.0f)
                arcTo(16.1f, 16.1f, 0.0f, false, true, 152.0f, 52.0f)
                arcToRelative(16.5f, 16.5f, 0.0f, false, true, -1.5f, 6.9f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 161.3f, 76.0f)
                horizontalLineTo(204.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-2.9f)
                arcToRelative(40.1f, 40.1f, 0.0f, false, false, -26.3f, 67.3f)
                arcTo(40.4f, 40.4f, 0.0f, false, false, 204.0f, 180.0f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _puzzlePiece!!
    }

private var _puzzlePiece: ImageVector? = null
