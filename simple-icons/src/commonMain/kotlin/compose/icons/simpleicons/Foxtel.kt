package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Foxtel: ImageVector
    get() {
        if (_foxtel != null) {
            return _foxtel!!
        }
        _foxtel = Builder(name = "Foxtel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.867f, 10.631f)
                lineToRelative(0.341f, -1.024f)
                lineTo(0.0f, 9.607f)
                verticalLineToRelative(4.779f)
                horizontalLineToRelative(1.16f)
                verticalLineToRelative(-1.72f)
                horizontalLineToRelative(1.434f)
                lineToRelative(0.341f, -1.024f)
                lineTo(1.16f, 11.642f)
                verticalLineToRelative(-1.01f)
                close()
                moveTo(5.897f, 9.546f)
                arcToRelative(2.454f, 2.454f, 0.0f, true, false, -0.006f, 4.908f)
                arcToRelative(2.454f, 2.454f, 0.0f, false, false, 0.007f, -4.908f)
                close()
                moveTo(5.897f, 13.286f)
                arcToRelative(1.287f, 1.287f, 0.0f, true, true, -0.007f, -2.574f)
                arcToRelative(1.287f, 1.287f, 0.0f, false, true, 0.008f, 2.575f)
                close()
                moveTo(12.403f, 9.607f)
                horizontalLineToRelative(-1.297f)
                lineToRelative(-0.812f, 1.304f)
                lineToRelative(-0.82f, -1.304f)
                lineTo(8.177f, 9.607f)
                lineToRelative(1.468f, 2.335f)
                lineToRelative(-1.536f, 2.444f)
                horizontalLineToRelative(1.297f)
                lineToRelative(0.888f, -1.405f)
                lineToRelative(0.88f, 1.405f)
                horizontalLineToRelative(1.297f)
                lineToRelative(-1.529f, -2.444f)
                close()
                moveTo(12.505f, 10.631f)
                horizontalLineToRelative(1.413f)
                verticalLineToRelative(3.755f)
                horizontalLineToRelative(1.16f)
                lineTo(15.078f, 10.63f)
                horizontalLineToRelative(1.23f)
                lineTo(16.308f, 9.607f)
                horizontalLineToRelative(-3.16f)
                close()
                moveTo(19.809f, 10.631f)
                lineToRelative(0.341f, -1.024f)
                horizontalLineToRelative(-3.208f)
                verticalLineToRelative(4.779f)
                horizontalLineToRelative(2.867f)
                lineToRelative(0.341f, -1.024f)
                horizontalLineToRelative(-2.046f)
                verticalLineToRelative(-0.915f)
                horizontalLineToRelative(1.432f)
                lineToRelative(0.341f, -1.024f)
                horizontalLineToRelative(-1.773f)
                verticalLineToRelative(-0.792f)
                close()
                moveTo(21.952f, 13.361f)
                lineTo(21.952f, 9.608f)
                horizontalLineToRelative(-1.16f)
                verticalLineToRelative(4.779f)
                horizontalLineToRelative(2.867f)
                lineTo(24.0f, 13.362f)
                close()
            }
        }
        .build()
        return _foxtel!!
    }

private var _foxtel: ImageVector? = null
