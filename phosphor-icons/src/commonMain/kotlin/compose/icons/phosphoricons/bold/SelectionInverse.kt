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

public val BoldGroup.SelectionInverse: ImageVector
    get() {
        if (_selectionInverse != null) {
            return _selectionInverse!!
        }
        _selectionInverse = Builder(name = "SelectionInverse", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(112.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 156.0f, 216.0f)
                close()
                moveTo(40.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(52.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 40.0f, 156.0f)
                close()
                moveTo(72.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(72.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(228.0f, 208.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, -5.0f, 13.2f)
                lineToRelative(-0.9f, 0.9f)
                lineToRelative(-0.9f, 0.9f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, -13.2f, 5.0f)
                lineTo(184.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(3.0f)
                lineTo(52.0f, 69.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(28.0f, 48.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, 5.0f, -13.2f)
                lineToRelative(0.9f, -0.9f)
                lineToRelative(0.9f, -0.9f)
                arcTo(19.8f, 19.8f, 0.0f, false, true, 48.0f, 28.0f)
                lineTo(208.0f, 28.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, 20.0f)
                close()
                moveTo(204.0f, 52.0f)
                lineTo(69.0f, 52.0f)
                lineTo(204.0f, 187.0f)
                close()
            }
        }
        .build()
        return _selectionInverse!!
    }

private var _selectionInverse: ImageVector? = null
