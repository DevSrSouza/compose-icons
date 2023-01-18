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

public val BoldGroup.SelectionBackground: ImageVector
    get() {
        if (_selectionBackground != null) {
            return _selectionBackground!!
        }
        _selectionBackground = Builder(name = "SelectionBackground", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.2f, 80.0f)
                lineTo(47.7f, 80.0f)
                arcTo(19.8f, 19.8f, 0.0f, false, false, 28.0f, 99.7f)
                lineTo(28.0f, 208.2f)
                arcTo(19.8f, 19.8f, 0.0f, false, false, 47.7f, 228.0f)
                lineTo(156.2f, 228.0f)
                arcTo(19.8f, 19.8f, 0.0f, false, false, 176.0f, 208.2f)
                lineTo(176.0f, 99.7f)
                arcTo(19.8f, 19.8f, 0.0f, false, false, 156.2f, 80.0f)
                close()
                moveTo(152.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 104.0f)
                lineTo(152.0f, 104.0f)
                close()
                moveTo(132.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(144.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 132.0f, 40.0f)
                close()
                moveTo(228.0f, 48.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(204.0f, 52.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(8.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 228.0f, 48.0f)
                close()
                moveTo(228.0f, 96.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(204.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(228.0f, 152.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(76.0f, 56.0f)
                lineTo(76.0f, 48.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 96.0f, 28.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _selectionBackground!!
    }

private var _selectionBackground: ImageVector? = null
