package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.SquaresFour: ImageVector
    get() {
        if (_squaresFour != null) {
            return _squaresFour!!
        }
        _squaresFour = Builder(name = "SquaresFour", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 44.0f)
                lineTo(48.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(116.0f, 48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 112.0f, 44.0f)
                close()
                moveTo(108.0f, 108.0f)
                lineTo(52.0f, 108.0f)
                lineTo(52.0f, 52.0f)
                horizontalLineToRelative(56.0f)
                close()
                moveTo(208.0f, 44.0f)
                lineTo(144.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(212.0f, 48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 208.0f, 44.0f)
                close()
                moveTo(204.0f, 108.0f)
                lineTo(148.0f, 108.0f)
                lineTo(148.0f, 52.0f)
                horizontalLineToRelative(56.0f)
                close()
                moveTo(112.0f, 140.0f)
                lineTo(48.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(116.0f, 144.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 112.0f, 140.0f)
                close()
                moveTo(108.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 148.0f)
                horizontalLineToRelative(56.0f)
                close()
                moveTo(208.0f, 140.0f)
                lineTo(144.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(212.0f, 144.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 208.0f, 140.0f)
                close()
                moveTo(204.0f, 204.0f)
                lineTo(148.0f, 204.0f)
                lineTo(148.0f, 148.0f)
                horizontalLineToRelative(56.0f)
                close()
            }
        }
        .build()
        return _squaresFour!!
    }

private var _squaresFour: ImageVector? = null
