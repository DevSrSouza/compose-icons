package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.FunctionFilled: ImageVector
    get() {
        if (_functionFilled != null) {
            return _functionFilled!!
        }
        _functionFilled = Builder(name = "FunctionFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.333f, 3.0f)
                arcToRelative(3.667f, 3.667f, 0.0f, false, true, 3.667f, 3.667f)
                verticalLineToRelative(10.666f)
                arcToRelative(3.667f, 3.667f, 0.0f, false, true, -3.667f, 3.667f)
                horizontalLineToRelative(-10.666f)
                arcToRelative(3.667f, 3.667f, 0.0f, false, true, -3.667f, -3.667f)
                verticalLineToRelative(-10.666f)
                arcToRelative(3.667f, 3.667f, 0.0f, false, true, 3.667f, -3.667f)
                close()
                moveTo(13.75f, 6.0f)
                arcToRelative(2.38f, 2.38f, 0.0f, false, false, -2.37f, 2.145f)
                lineToRelative(-0.285f, 2.855f)
                horizontalLineToRelative(-2.095f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.117f, 1.993f)
                horizontalLineToRelative(1.894f)
                lineToRelative(-0.265f, 2.656f)
                lineToRelative(-0.014f, 0.071f)
                arcToRelative(0.38f, 0.38f, 0.0f, false, true, -0.365f, 0.273f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-0.25f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.993f, 0.117f)
                verticalLineToRelative(0.25f)
                lineToRelative(0.005f, 0.154f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 2.245f, 2.096f)
                arcToRelative(2.38f, 2.38f, 0.0f, false, false, 2.37f, -2.145f)
                lineToRelative(0.284f, -2.855f)
                horizontalLineToRelative(2.096f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.117f, -1.993f)
                horizontalLineToRelative(-1.895f)
                lineToRelative(0.266f, -2.656f)
                lineToRelative(0.014f, -0.071f)
                arcToRelative(0.381f, 0.381f, 0.0f, false, true, 0.365f, -0.273f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(0.25f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.993f, -0.117f)
                verticalLineToRelative(-0.25f)
                lineToRelative(-0.005f, -0.154f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -2.245f, -2.096f)
                close()
            }
        }
        .build()
        return _functionFilled!!
    }

private var _functionFilled: ImageVector? = null
