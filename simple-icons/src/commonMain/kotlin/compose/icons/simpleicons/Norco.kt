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

public val SimpleIcons.Norco: ImageVector
    get() {
        if (_norco != null) {
            return _norco!!
        }
        _norco = Builder(name = "Norco", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.055f, 2.707f)
                arcToRelative(0.971f, 0.971f, 0.0f, false, false, -0.688f, 0.387f)
                lineTo(0.0f, 16.78f)
                horizontalLineToRelative(4.049f)
                lineToRelative(7.27f, -9.597f)
                lineToRelative(1.927f, 5.74f)
                lineToRelative(1.42f, -1.875f)
                lineToRelative(-2.578f, -7.676f)
                arcToRelative(0.983f, 0.983f, 0.0f, false, false, -1.033f, -0.666f)
                close()
                moveTo(19.95f, 7.22f)
                lineToRelative(-7.27f, 9.597f)
                lineToRelative(-1.927f, -5.74f)
                lineToRelative(-1.42f, 1.875f)
                lineToRelative(2.578f, 7.676f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, false, 1.72f, 0.28f)
                lineTo(24.0f, 7.218f)
                close()
            }
        }
        .build()
        return _norco!!
    }

private var _norco: ImageVector? = null
